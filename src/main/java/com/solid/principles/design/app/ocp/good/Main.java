package com.solid.principles.design.app.ocp.good;

import com.solid.principles.design.app.ocp.good.Menu;
import com.solid.principles.design.app.ocp.good.Producto;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Producto> productoList = Arrays.asList(
                new Producto(1, "producto 1", 20.0),
                new Producto(2, "producto 2", 30.0));

        Menu menu = new Menu();

        menu.view(productoList, new JsonOutput());

        //cada vez que se requiera agregar un nuevo formato solo se debe extender la funcionalidad
        //sin modificar el codigo original
        menu.view(productoList, new ToStringOutput());
    }
}
