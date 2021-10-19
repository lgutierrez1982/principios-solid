package com.solid.principles.design.app.isp.good;

public class Rana implements IMandarAJugar{

    public Rana() {
        System.out.println("Rana");
        System.out.println("-----");
    }

    @Override
    public void jugar() {
        System.out.println("La Rana esta jugando");
    }
}
