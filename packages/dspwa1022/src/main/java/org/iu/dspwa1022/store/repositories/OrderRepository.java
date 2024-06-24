package org.iu.dspwa1022.store.repositories;

import java.util.UUID;

import org.iu.dspwa1022.store.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, UUID> {

}
