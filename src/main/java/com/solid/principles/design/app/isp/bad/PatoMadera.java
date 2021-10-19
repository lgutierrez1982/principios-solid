package com.solid.principles.design.app.isp.bad;

public class PatoMadera implements IPato{

    public PatoMadera() {
        System.out.println("Pato Madera");
        System.out.println("-----------");
    }

    @Override
    public void flotar() {
        System.out.println("El pato de madera esta flotando");
    }

    @Override
    public void cuack() {
        //El Pato de madera no hace cuack
        //No se debe implementar este metodo
        System.out.println("No hace cuack");
    }
}
