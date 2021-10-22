package com.solid.principles.design.app.lsp.crud.good;

public class UserCrud implements ICrud {
    @Override
    public void get() {
        System.out.println("Obtener usuarios");
    }

    @Override
    public void add() {
        System.out.println("Agregar usuario");
    }

    @Override
    public void update() {
        System.out.println("Editar usuario");
    }

    @Override
    public void delete() {
        System.out.println("Eliminar usuario");
    }
}
