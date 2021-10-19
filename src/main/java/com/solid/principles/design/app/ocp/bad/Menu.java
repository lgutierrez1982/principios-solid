package com.solid.principles.design.app.ocp.bad;

import com.google.gson.Gson;

import java.util.List;

public class Menu {

    public void view(List<Producto> productos, boolean json){

        if(json){
            System.out.println("json");
            Gson gson = new Gson();
            productos.forEach(x -> System.out.println(gson.toJson(x)));
        }else{
            System.out.println("toString");
            productos.forEach(System.out::println);
        }
        //el problema con esta solucion, es si quisieramos agregar mas tipo de impresiones distintas
        //tendriamos que agregar nuevas condiciones if else para los nuevos formatos
        //al agregar nuevas condiciones violamos el principio
        //ya que se debe extender y no modificar



    }

}
