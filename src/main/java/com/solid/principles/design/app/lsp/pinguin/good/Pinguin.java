package com.solid.principles.design.app.lsp.pinguin.good;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Pinguin implements IBird {

    //Con esto garantizamos que un pinguino cumpla con todas las funcionalidades del padre IBird
    @Override
    public void setLocation(String longitude, String latitude) {
        System.out.println("Su unicacion es longitud "
                .concat(longitude)
                .concat(" and latitude")
                .concat(latitude));
    }

}
