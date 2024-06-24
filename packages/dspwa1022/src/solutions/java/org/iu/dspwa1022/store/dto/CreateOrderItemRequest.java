package org.iu.dspwa1022.store.dto;

import java.util.UUID;

public class CreateOrderItemRequest {
    private UUID product;
    private float quantity;

    public UUID getProduct() {
        return product;
    }

    public void setProduct(UUID product) {
        this.product = product;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }
}
