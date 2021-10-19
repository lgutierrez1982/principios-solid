package com.solid.principles.design.app.ocp.good;

import com.google.gson.Gson;


import java.util.List;

public class Menu {

    public void view(List<Producto> productos, IMenuOutput iMenuOutput){

        iMenuOutput.output(productos);
        //se invierten las dependencias



    }
}
