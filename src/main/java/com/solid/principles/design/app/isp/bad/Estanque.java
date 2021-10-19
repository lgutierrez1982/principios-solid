package com.solid.principles.design.app.isp.bad;

public class Estanque {

    public void mandarAJugar(IPato pato){

        pato.flotar();
        pato.cuack();
    }
    //si quisieramos que un pato de madera juegue en el estanque no podria ya que solo recibe por parametro un Pato
    //para ello creamos una interfaz IPato que tiene el comportamiento de flotar y cuack



}
