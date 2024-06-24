package org.iu.dspwa1022.store.repositories;

import java.util.UUID;

import org.iu.dspwa1022.store.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, UUID> {

}
