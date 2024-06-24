import { Order } from "../model/order";
import { OrderItem } from "../model/order-item";
import customers from "./customers";
import products from "./products";

export default [
    new Order("o-1", customers[0], [
        new OrderItem("oi-1", products[0], 1),
        new OrderItem("oi-2", products[1], 2),
    ]),
    new Order("o-2", customers[1], [
        new OrderItem("oi-3", products[2], 3),
        new OrderItem("oi-4", products[3], 4),
    
    ]),
    new Order("o-3", customers[0], [
        new OrderItem("oi-5", products[0], 5),
        new OrderItem("oi-6", products[1], 6),
    ]),
];
