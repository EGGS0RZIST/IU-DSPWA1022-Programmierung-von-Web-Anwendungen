package org.iu.dspwa1022.store.controllers;

import java.util.List;
import java.util.UUID;

import org.iu.dspwa1022.store.model.Product;
import org.iu.dspwa1022.store.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository repo;

    @RequestMapping
    public List<Product> findAll() {
        return repo.findAll();
    }

    @RequestMapping("/{id}")
    public Product findById(@PathVariable UUID id) {
        return repo.findById(id).orElse(null);
    }

}
