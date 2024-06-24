import { Customer } from "./customer";
import { OrderItem } from "./order-item";

export class Order {
    id: string;
    customer: Customer;
    items: OrderItem[];

    constructor(id: string, customer: Customer, items: OrderItem[]) {
        this.id = id;
        this.customer = customer;
        this.items = items;
    }
}
