package org.example;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Driver> drivers = new ArrayList<>();

    // Add a driver to the notification list
    public void registerDriver(Driver driver) {
        drivers.add(driver);
    }

    // Remove a driver from the notification list
    public void removeDriver(Driver driver) {
        drivers.remove(driver);
    }

    // Notify all drivers of a new delivery request
    public void notifyDrivers(DeliveryRequest request) {
        for (Driver driver : drivers) {
            driver.update(request);
        }
    }

    // Generate a new delivery request and notify drivers
    public void createDeliveryRequest(String product, String address) {
        DeliveryRequest request = new DeliveryRequest(product, address);
        notifyDrivers(request);
    }
    public int getDriverCount() {
        return drivers.size();
    }
}
