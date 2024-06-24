import { OrderItem } from "../model/order-item";

export function calculateOrderTotal(items: OrderItem[]): number {
    return items.reduce((total, item) => total + item.product_price * item.quantity, 0);
}
