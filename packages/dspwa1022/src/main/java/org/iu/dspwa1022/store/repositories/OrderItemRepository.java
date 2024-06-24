package org.iu.dspwa1022.store.repositories;

import java.util.UUID;

import org.iu.dspwa1022.store.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, UUID> {

}
