package com.solid.principles.design.app.srp.good;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Product> products = Arrays.asList(
                new Product(1, "producto 1", 20.0),
                new Product(2, "producto 2", 30.0));

        CoffeShop coffeShop = new CoffeShop();

        coffeShop.addProducts(products);

        //Si en un futuro solicitan cambiar el menu, solo se modifica en esa clase sin afectar las otras
        Menu menu = new Menu();
        menu.viewMenu(products);
    }
}
