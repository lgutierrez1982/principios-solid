package com.solid.principles.design.app.srp.bad;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product(1, "producto 1", 20.0),
                new Product(2, "producto 2", 30.0));

        CoffeShop coffeShop = new CoffeShop();

        coffeShop.addProducts(products);

        coffeShop.viewMenu();
    }
}
