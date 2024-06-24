import { Customer } from "./customer";
import { OrderItem } from "./order-item";

export interface Order {
    id: string;
    created_at: Date;
    customer: string | Customer;
    total?: number;
    items?: OrderItem[];
}
