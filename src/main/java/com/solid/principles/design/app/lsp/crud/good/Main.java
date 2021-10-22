package com.solid.principles.design.app.lsp.crud.good;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<IAdd> cruds = new ArrayList<>();

        UserCrud userCrud = new UserCrud();
        CarCrud carCrud = new CarCrud();

        cruds.add(userCrud);
        cruds.add(carCrud);

        cruds.forEach(IAdd::add);

    }
}
