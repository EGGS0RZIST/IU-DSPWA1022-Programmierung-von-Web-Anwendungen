import express from 'express';
import { getCustomer } from '../db/customer';
import { getOrder, getOrders } from '../db/order';
import { getOrderItems } from '../db/order-item';
import { calculateOrderTotal } from '../utils/order-calculation';

const router = express.Router();

router.get('/orders', async (req, res) => {
    const orders = await getOrders();
    res.json(orders);
});

router.get('/orders/:id', async (req, res) => {
    const { id } = req.params;
    const order = await getOrder(id);

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

export default router;
