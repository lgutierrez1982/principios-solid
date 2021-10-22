package com.solid.principles.design.app.lsp.pinguin.bad;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Pinguin implements IBird{

    //Para la clase Pinguino rompemos el principio de Liskov Subtitution
    //El motivo es que el pinguino no tienes las mismas funcionalidades del padre
    //S es un subtitpo de T, T puede ser reemplazada con objetos del tipo S, sin alterar
    //el comportamiento esperado del programa.
    @Override
    public void setLocation(String longitude, String latitude) {
        System.out.println("Su unicacion es longitud "
                .concat(longitude)
                .concat(" and latitude")
                .concat(latitude));
    }

    @Override
    public void setFlyLocationWinter(String flyLocationWinter) {
        throw new NotImplementedException();
    }

    @Override
    public void setFlyLocationSummer(String flyLocationSummer) {
        throw new NotImplementedException();
    }

    @Override
    public void setmaxAltitude(Double maxAltitude) {
        throw new NotImplementedException();
    }
}
