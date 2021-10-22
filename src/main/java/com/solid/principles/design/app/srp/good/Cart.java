package com.solid.principles.design.app.srp.good;

//solo responsabilidad en base a carrito de compra
public class Cart {

    public void addProduct(Integer id, Double quantity){
        //Logica para agregar producto al carrito
    }

    public void getTotal(){
        //Logica para generar el total a pagar del carrito
    }
}
