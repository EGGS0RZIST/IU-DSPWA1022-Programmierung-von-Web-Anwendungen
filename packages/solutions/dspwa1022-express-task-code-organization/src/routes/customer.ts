import express from 'express';
import { getCustomer, getCustomers } from '../db/customer';
import { getOrdersByCustomer } from '../db/order';

const router = express.Router();

router.get('/customers', async (req, res) => {
    const customers = await getCustomers();
    res.json(customers);
});

router.get('/customers/:id', async (req, res) => {
    const { id } = req.params;
    const customer = await getCustomer(id);

    if (!customer) {
        res.status(404).json({ message: 'Customer not found' });
        return;
    }

    customer.orders = await getOrdersByCustomer(id)

    res.json(customer);
});

export default router;
