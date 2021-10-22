package com.solid.principles.design.app.lsp.pinguin.good;

import com.solid.principles.design.app.lsp.pinguin.good.Ave;
import com.solid.principles.design.app.lsp.pinguin.good.Pinguin;

public class Main {

    public static void main(String[] args) {

        Ave ave = new Ave();
        ave.setLocation("123123,52", "8455,65");
        ave.setFlyLocationWinter("Norte");
        ave.setFlyLocationSummer("Sur");
        ave.setmaxAltitude(5000.0);

        //Pinguino solo implementa la interfaz IBird
        //en este caso si cumple con todas las funcionalidades del padre
        Pinguin pinguin = new Pinguin();
        pinguin.setLocation("123123,52", "8455,65");

    }
}
