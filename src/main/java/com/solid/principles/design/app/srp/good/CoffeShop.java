package com.solid.principles.design.app.srp.good;

import java.util.List;

//los metodos que permanecen solo tienen relacion con la clase cofeeShop
public class CoffeShop {

    private List<Product> products;

    public void addProducts(List<Product> products){
        this.products = products;
    }

    public List<Product> getProducts(){
        return this.products;
    }

    public void removeProducts(){
        //Logica para remover productos
    }

}
