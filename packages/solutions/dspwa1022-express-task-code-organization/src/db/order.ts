import { Order } from "../model/order";
import { query } from "./pool";

export async function getOrders(): Promise<Order[]> {
    const orders = await query<Order>('select * from dspwa1022.order');
    return orders.rows;
}

export async function getOrdersByCustomer(customer: string): Promise<Order[]> {
    const orders = await query<Order>('select * from dspwa1022.order where customer = $1', [customer]);
    return orders.rows;
}

export async function getOrder(id: string): Promise<Order | null> {
    const orders = await query<Order>('select * from dspwa1022.order where id = $1', [id]);
    return orders.rows[0];
}
