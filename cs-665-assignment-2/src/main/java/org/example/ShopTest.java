package org.example;

import org.junit.Test;

public class ShopTest {

    @Test
    public void testDeliveryNotification() {
        Shop shop = new Shop();
        Driver driver1 = new TaxiDriver("Dixi");
        Driver driver2 = new TaxiDriver("Lala");
        Driver driver3 = new TaxiDriver("Popo");
        Driver driver4 = new TaxiDriver("xxxx");
        Driver driver5 = new TaxiDriver("wuxi");

        // Register drivers
        shop.registerDriver(driver1);
        shop.registerDriver(driver2);
        shop.registerDriver(driver3);
        shop.registerDriver(driver4);
        shop.registerDriver(driver5);

        // Create a new delivery request
        shop.createDeliveryRequest("Somethings", "9 Gardner St");

        // Test to ensure drivers are notified (you can verify the console output)
    }
}
