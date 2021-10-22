package com.solid.principles.design.app.lsp.crud.bad;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class CarCrud implements ICrud{

    //Aca rompemos el principio Liskov Subtitution, ya que estaos quitanto comportamiento
    //El principio dice si tenemos un clase padre la cual hereda a una clase hija, esta no debe
    //alterar al funcionamiento del padre
    //Al eliminar los metodos no utilizados nos lanzará error ya que deben implementarse
    @Override
    public void get() {
        throw new NotImplementedException();
    }

    @Override
    public void add() {
        System.out.println("Ingresar Automovil");
    }

    @Override
    public void update() {
        throw new NotImplementedException();
    }

    @Override
    public void delete() {
        System.out.println("Eliminar Automovil");
    }
}
