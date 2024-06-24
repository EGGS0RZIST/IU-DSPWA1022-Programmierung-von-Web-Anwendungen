import 'reflect-metadata';

import express from "express";
import customerRoutes from './routes/customer';
import orderRoutes from './routes/order';
import productRoutes from './routes/product';

const app = express();
const port = 3000;

app.use(express.json());

const router = express.Router();

router.use(customerRoutes);
router.use(orderRoutes);
router.use(productRoutes);

app.use(router);

app.listen(port, () => {
    console.log(`Server is running on http://localhost:${port}`);
});


