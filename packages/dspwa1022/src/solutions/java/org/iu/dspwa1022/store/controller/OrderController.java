package org.iu.dspwa1022.store.controllers;

import java.util.List;
import java.util.UUID;

import org.iu.dspwa1022.store.dto.CreateOrderRequest;
import org.iu.dspwa1022.store.model.Customer;
import org.iu.dspwa1022.store.model.Order;
import org.iu.dspwa1022.store.repositories.CustomerRepository;
import org.iu.dspwa1022.store.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderRepository repo;

    @Autowired
    private CustomerRepository customerRepo;

    @RequestMapping
    public List<Order> findAll() {
        return repo.findAll();
    }

    @RequestMapping("/{id}")
    public Order findById(@PathVariable UUID id) {
        return repo.findById(id).orElse(null);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Order createOrder(@RequestBody CreateOrderRequest dto) {
        UUID customerId = dto.getCustomer();
        Customer customer = customerRepo.findById(customerId)
                .orElseThrow(() -> new RuntimeException("Customer not found"));

        Order order = new Order();
        order.setCustomer(customer);

        return repo.save(order);
    }

}
