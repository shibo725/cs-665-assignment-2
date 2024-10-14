package org.example;

public class TaxiDriver implements Driver {
    private String name;

    public TaxiDriver(String name) {
        this.name = name;
    }

    @Override
    public void update(DeliveryRequest request) {
        System.out.println("TaxiDriver " + name + " notified of delivery: " + request.getProduct() + " to " + request.getAddress());
    }
}
