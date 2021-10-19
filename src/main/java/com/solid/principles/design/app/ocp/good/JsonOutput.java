package com.solid.principles.design.app.ocp.good;

import com.google.gson.Gson;

import java.util.List;

public class JsonOutput implements IMenuOutput{
    @Override
    public void output(List<Producto> productos) {
        System.out.println("json");
        Gson gson = new Gson();
        productos.forEach(x -> System.out.println(gson.toJson(x)));
    }
}
