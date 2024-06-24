package org.iu.dspwa1022.store.controllers;

import java.util.List;
import java.util.UUID;

import org.iu.dspwa1022.store.dto.CreateOrderItemRequest;
import org.iu.dspwa1022.store.model.Order;
import org.iu.dspwa1022.store.model.OrderItem;
import org.iu.dspwa1022.store.model.Product;
import org.iu.dspwa1022.store.repositories.OrderItemRepository;
import org.iu.dspwa1022.store.repositories.OrderRepository;
import org.iu.dspwa1022.store.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderRepository repo;

    @Autowired
    private ProductRepository productRepo;

    @Autowired
    private OrderItemRepository orderItemRepo;

    @RequestMapping
    public List<Order> findAll() {
        return repo.findAll();
    }

    @RequestMapping("/{id}")
    public Order findById(@PathVariable UUID id) {
        return repo.findById(id).orElse(null);
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public Order save(@RequestBody Order order) {
        return repo.save(order);
    }

    @PostMapping("/{id}/items")
    public OrderItem addItem(@PathVariable UUID id, @RequestBody CreateOrderItemRequest dto) {
        Order order = repo.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        Product product = productRepo.findById(dto.getProduct())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        OrderItem item = new OrderItem();
        item.setOrder(order);
        item.setProduct(product);
        return orderItemRepo.save(item);
    }

}
