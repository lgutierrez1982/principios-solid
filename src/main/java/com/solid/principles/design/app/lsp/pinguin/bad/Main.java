package com.solid.principles.design.app.lsp.pinguin.bad;

public class Main {

    public static void main(String[] args) {

        Ave ave = new Ave();
        ave.setLocation("123123,52", "8455,65");
        ave.setFlyLocationWinter("Norte");
        ave.setFlyLocationSummer("Sur");
        ave.setmaxAltitude(5000.0);

        //Lo siguiente terminará en error ya que pinguino no implementa todos los metodos de su padre
        Pinguin pinguin = new Pinguin();
        pinguin.setLocation("123123,52", "8455,65");
        pinguin.setFlyLocationWinter("Norte");
        pinguin.setFlyLocationSummer("Sur");
        pinguin.setmaxAltitude(5000.0);


    }
}
