import { Product } from "./product";

export class OrderItem {
    id: string;
    product: Product;
    quantity: number;

    constructor(id: string, product: Product, quantity: number) {
        this.id = id;
        this.product = product;
        this.quantity = quantity;
    }
}
