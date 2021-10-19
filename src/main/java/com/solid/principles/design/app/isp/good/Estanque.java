package com.solid.principles.design.app.isp.good;

public class Estanque {

    //ya no se usa la interfaz pato fue segregada
    /*public void mandarAJugar(IPato pato){

        pato.flotar();
        pato.cuack();

        //el principio nos dice que debemos dividiir las interfaces
        //para eso creamos 2 interfaces IHacerCuack IFlotar

    }*/

    /*public void mandarAJugar(IFlotar pato){

        pato.flotar();

        //con esto se rompe el principo open-closed
        //la que dice diseñar la clase para que no sea modificada mas bien extendida
        if(pato instanceof PatoMadera){
            pato.cuack();
        }
    }*/

    //para solucionar open-closed, se crea la interfaz IPuedoJugar
    public void mandarAJugar(IMandarAJugar iMandarAJugar) {

        iMandarAJugar.jugar();
    }
}
