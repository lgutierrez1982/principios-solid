package com.solid.principles.design.app.isp.bad;

public class Main {
    public static void main(String[] args) {

        Estanque estanque = new Estanque();

        estanque.mandarAJugar(new Pato());

        estanque.mandarAJugar(new PatoMadera());
        //al pasar el pato de madera estamos rompiendo el principcio segregacion de interfaces
        //ya que el pato de madera implementa un metodo el cual no necesita implementar
        //el principio nos indica que debemos dividiar las interfaces
    }
}
