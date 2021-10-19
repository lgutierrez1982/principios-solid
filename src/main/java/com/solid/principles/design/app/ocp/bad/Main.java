package com.solid.principles.design.app.ocp.bad;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Producto> productoList = Arrays.asList(
                new Producto(1, "producto 1", 20.0),
                new Producto(2, "producto 2", 30.0));

        Menu menu = new Menu();

        menu.view(productoList, true);
    }
}
