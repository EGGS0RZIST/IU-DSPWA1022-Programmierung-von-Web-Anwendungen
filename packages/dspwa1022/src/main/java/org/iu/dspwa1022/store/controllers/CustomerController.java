package org.iu.dspwa1022.store.controllers;

import java.util.List;
import java.util.UUID;

import org.iu.dspwa1022.store.model.Customer;
import org.iu.dspwa1022.store.repositories.CustomerRepository;
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
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerRepository repo;

    @RequestMapping
    public List<Customer> findAll() {
        return repo.findAll();
    }

    @RequestMapping("/{id}")
    public Customer findById(@PathVariable UUID id) {
        return repo.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Customer save(@RequestBody Customer customer) {
        return repo.save(customer);
    }

    @PatchMapping("/{id}")
    public Customer update(@PathVariable UUID id, @RequestBody Customer customer) {
        final Customer existingCustomer = repo.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        if (customer.getName() != null) {
            existingCustomer.setName(customer.getName());
        }
        if (customer.getEmail() != null) {
            existingCustomer.setEmail(customer.getEmail());
        }

        return repo.save(existingCustomer);
    }

}
