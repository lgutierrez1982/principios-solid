package com.solid.principles.design.app.lsp.crud.good;

public class CarCrud implements IAdd, IDelete {

    //Con esto garantizamos que la clase CarCrud se comporta de igual manera que su padre
    @Override
    public void add() {
        System.out.println("Ingresar Automovil");
    }

    @Override
    public void delete() {
        System.out.println("Eliminar Automovil");
    }
}
