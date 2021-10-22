package com.solid.principles.design.app.dip.impresora.good;

public interface IImprimible {

    //se crea una interfaz para representar la asbstraccion
    //para que ambas dependan de una abstraccion entre impresora y los tipos de docs a imprimir
    public void imprimir();
}
