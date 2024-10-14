package org.example;

public class DeliveryRequest {
    private String product;
    private String address;

    public DeliveryRequest(String product, String address) {
        this.product = product;
        this.address = address;
    }

    public String getProduct() {
        return product;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "DeliveryRequest for " + product + " to " + address;
    }
}
