package org.iu.dspwa1022.store.dto;

import java.util.UUID;

public class CreateOrderRequest {
    private UUID customer;

    public UUID getCustomer() {
        return customer;
    }

    public void setCustomer(UUID customer) {
        this.customer = customer;
    }
}
