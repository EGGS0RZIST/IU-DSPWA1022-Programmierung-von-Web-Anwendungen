import { OrderItem } from "../model/order-item";
import { query } from "./pool";

export async function getOrderItems(order: string): Promise<OrderItem[]> {
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
