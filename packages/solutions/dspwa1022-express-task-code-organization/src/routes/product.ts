import { plainToInstance } from 'class-transformer';
import { validateOrReject } from 'class-validator';
import express from 'express';
import { createProduct, getProduct, getProducts } from '../db/product';
import { CreateProductDto } from '../model/product';

const router = express.Router();

router.get('/products', async (req, res) => {
    const products = await getProducts();
    res.json(products);
});

router.get('/products/:id', async (req, res) => {
    const { id } = req.params;
    const product = await getProduct(id);

    if (!product) {
        res.status(404).json({ message: 'Product not found' });
        return;
    }

    res.json(product);
});

router.post('/products', async (req, res) => {
    const dto = req.body;
    const dtoInstance = plainToInstance(CreateProductDto, dto);

    try {
        await validateOrReject(dtoInstance);
    } catch (errors) {
        res.status(400).json(errors);
        return;
    }
    
    const product = await createProduct(dtoInstance);
    res.json(product);
});

export default router;
