package com.solid.principles.design.app.isp.good;

public class Pato implements IFlotar, IHacerCuack, IMandarAJugar {

    public Pato() {
        System.out.println("Pato");
        System.out.println("-------");
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

    @Override
    public void jugar() {
        this.flotar();
        this.cuack();
    }
}
