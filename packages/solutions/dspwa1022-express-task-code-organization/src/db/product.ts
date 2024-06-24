import { CreateProductDto, Product } from "../model/product";
import { query } from "./pool";

export async function getProducts(): Promise<Product[]> {
    const products = await query<Product>('select * from dspwa1022.product');
    return products.rows;
}

export async function getProduct(id: string): Promise<Product | null> {
    const products = await query<Product>('select * from dspwa1022.product where id = $1', [id]);
    return products.rows[0];
}

export async function createProduct(dto: CreateProductDto): Promise<Product> {
    const products = await query<Product>(`
        insert into dspwa1022.product
            (name, price)
        values
            ($1, $2)
        returning *
    `, [
        dto.name,
        dto.price
    ]);
    return products.rows[0];
}
