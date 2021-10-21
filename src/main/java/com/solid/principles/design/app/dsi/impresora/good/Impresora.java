package com.solid.principles.design.app.dsi.impresora.good;

public class Impresora {

    //ahora depende de una abstraccion
    public void imprimir(IImprimible imprimible){
        imprimible.imprimir();
    }

}
