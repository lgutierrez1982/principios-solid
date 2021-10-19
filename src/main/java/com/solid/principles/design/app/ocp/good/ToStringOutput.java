package com.solid.principles.design.app.ocp.good;

import com.google.gson.Gson;

import java.util.List;

public class ToStringOutput implements IMenuOutput{

    @Override
    public void output(List<Producto> productos) {
        System.out.println("toString");
        productos.forEach(System.out::println);
    }
}
