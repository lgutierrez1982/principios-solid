package com.solid.principles.design.app.lsp.crud.bad;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<ICrud> cruds = new ArrayList<>();

        UserCrud userCrud = new UserCrud();
        CarCrud carCrud = new CarCrud();

        cruds.add(userCrud);
        cruds.add(carCrud);

        //Nos lanzaria un error ya que el metodo update en car no esta implementado
        //Rompemos el principio ya que la clase hija no cumple con la funcionalidad de la clase padre
        cruds.forEach(ICrud::update);

    }
}
