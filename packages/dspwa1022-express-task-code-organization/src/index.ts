import 'reflect-metadata';
import express from "express";
import { Pool, QueryResult, QueryResultRow } from "pg";
import { IsString, IsNumber, validateOrReject } from 'class-validator';
import { plainToInstance } from 'class-transformer';

const pool = new Pool({
    host: process.env.DB_HOST,
    user: process.env.DB_USER,
    password: process.env.DB_PASSWORD,
    database: process.env.DB_DATABASE,
    ssl: true
});

/**
 * Use this function to send queries to the database
 */
async function query<T extends QueryResultRow>(text: string, params: any[] = []): Promise<QueryResult<T>> {
    return await pool.query<T>(text, params);
}

const app = express();
const port = 3000;

app.use(express.json());

interface Customer {
    id: string;
    created_at: Date;
    name: string;
    email: string;
    orders?: Order[];
}

app.get('/customers', async (req, res) => {
    const customers = await query<Customer>('select * from dspwa1022.customer');
    res.json(customers.rows);
});

app.get('/customers/:id', async (req, res) => {
    const { id } = req.params;
    const customer = await getCustomer(id);

    if (!customer) {
        res.status(404).json({ message: 'Customer not found' });
        return;
    }

    const orders = await query<Order>('select * from dspwa1022.order where customer = $1', [id]);
    customer.orders = orders.rows;

    res.json(customer);
});

async function getCustomer(id: string): Promise<Customer> {
    const customers = await query<Customer>('select * from dspwa1022.customer where id = $1', [id]);
    return customers.rows[0];
}

app.get('/orders', async (req, res) => {
    const orders = await query<Order>('select * from dspwa1022.order');
    res.json(orders.rows);
});

app.get('/orders/:id', async (req, res) => {
    const { id } = req.params;
    const orders = await query<Order>('select * from dspwa1022.order where id = $1', [id]);
    const order = orders.rows[0];

    if (!order) {
        res.status(404).json({ message: 'Order not found' });
        return;
    }

    const customer = await getCustomer(order.customer as string);
    order.customer = customer;

    const orderItems = await getOrderItems(id);
    order.items = orderItems;

    order.total = calculateOrderTotal(orderItems);

    res.json(order);
});

app.get('/products', async (req, res) => {
    const products = await query<Product>('select * from dspwa1022.product');
    res.json(products.rows);
});

app.get('/products/:id', async (req, res) => {
    const { id } = req.params;
    const products = await query<Product>('select * from dspwa1022.product where id = $1', [id]);
    const product = products.rows[0];

    if (!product) {
        res.status(404).json({ message: 'Product not found' });
        return;
    }

    res.json(product);
});

class CreateProductDto {
    @IsString()
    name: string;

    @IsNumber()
    price: number;
}

app.post('/products', async (req, res) => {
    const dto = req.body;
    const dtoInstance = plainToInstance(CreateProductDto, dto);

    try {
        await validateOrReject(dtoInstance);
    } catch (errors) {
        res.status(400).json(errors);
        return;
    }
    
    const products = await query<Product>('insert into dspwa1022.product (name, price) values ($1, $2) returning *', [
        dto.name,
        dto.price
    ]);
    res.json(products.rows[0]);
});

app.listen(port, () => {
    console.log(`Server is running on http://localhost:${port}`);
});

interface Product {
    id: string;
    created_at: Date;
    name: string;
    price: number;
}

interface Order {
    id: string;
    created_at: Date;
    customer: string | Customer;
    total?: number;
    items?: OrderItem[];
}

interface OrderItem {
    id: string;
    created_at: Date;
    order: string;
    product: string;
    quantity: number;
    product_name: string;
    product_price: number;
}

async function getOrderItems(order: string): Promise<OrderItem[]> {
    const orderItems = await query<OrderItem>(`
        select
            oi.*,
            p.name as product_name,
            p.price as product_price
        from dspwa1022.order_item oi
        join dspwa1022.product p on p.id = oi.product
        where oi."order" = $1
    `, [order]);
    return orderItems.rows;
}

function calculateOrderTotal(items: OrderItem[]): number {
    return items.reduce((total, item) => total + item.product_price * item.quantity, 0);
}
