package org.iu.dspwa1022.store.repositories;

import java.util.UUID;

import org.iu.dspwa1022.store.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, UUID> {

}
