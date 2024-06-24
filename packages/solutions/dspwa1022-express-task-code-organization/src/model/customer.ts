import { Order } from './order';

export interface Customer {
    id: string;
    created_at: Date;
    name: string;
    email: string;
    orders?: Order[];
}
