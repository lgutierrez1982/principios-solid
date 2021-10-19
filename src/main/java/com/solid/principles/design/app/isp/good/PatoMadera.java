package com.solid.principles.design.app.isp.good;

public class PatoMadera implements IFlotar, IMandarAJugar {

    public PatoMadera() {
        System.out.println("Pato Madera");
        System.out.println("-------");
    }

    @Override
    public void flotar() {

        System.out.println("El pato de madera esta flotando");
        System.out.println("");
    }


    //ya no es necesario implementar el metodo ahcer cuack ya que se segregaron las interfaces
    //public void cuack()


    //para resolver principio open-closed
    @Override
    public void jugar() {
        this.flotar();
    }




}
