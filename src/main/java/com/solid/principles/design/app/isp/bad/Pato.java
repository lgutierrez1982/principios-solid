package com.solid.principles.design.app.isp.bad;

public class Pato implements IPato{

    public Pato() {
        System.out.println("Pato");
        System.out.println("-----------");
    }

    @Override
    public void flotar() {

        System.out.println("El pato esta flotando");
    }

    @Override
    public void cuack() {

        System.out.println("El pato hace cuack");
        System.out.println("");
    }

}
