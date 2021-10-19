package com.solid.principles.design.app.isp.good;

public class Main {
    public static void main(String[] args) {

        Estanque estanque = new Estanque();

        estanque.mandarAJugar(new Pato());
        estanque.mandarAJugar(new PatoMadera());

        //mandar a jugar a una rana
        estanque.mandarAJugar(new Rana());
    }

}
