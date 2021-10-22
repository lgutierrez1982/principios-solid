package com.solid.principles.design.app.srp.bad;

import java.util.List;

//esta clase rompe el principio tiene mas 1 responsabilidad
//en este caso las responsabilidades que tiene son: productos, carrito de compra y menu
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

    public void addProductToCart(Integer id, Double quantity){
        //Logica para agregar producto al carrito
    }

    public void getCartTotal(){
        //Logica para generar el total a pagar del carrito
    }

    public void viewMenu(){

        products.forEach(System.out::println);
    }
}
