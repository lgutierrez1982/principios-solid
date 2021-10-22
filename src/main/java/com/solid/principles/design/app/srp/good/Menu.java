package com.solid.principles.design.app.srp.good;

import java.util.List;

//solo responsabilidad en base a menu
public class Menu {

    public void viewMenu(List<Product> products){

        products.forEach(System.out::println);
    }
}
