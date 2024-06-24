package org.iu.dspwa1022.store.controllers;

import java.util.List;
import java.util.UUID;

import org.iu.dspwa1022.store.model.Customer;
import org.iu.dspwa1022.store.model.Product;
import org.iu.dspwa1022.store.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

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

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Product save(@RequestBody Product product) {
        return repo.save(product);
    }

    @PatchMapping("/{id}")
    public Product update(@PathVariable UUID id, @RequestBody Product product) {
        final Product existing = repo.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        if (product.getName() != null) {
            existing.setName(product.getName());
        }
        if (product.getPrice() != null) {
            existing.setPrice(product.getPrice());
        }

        return repo.save(existing);
    }

}
