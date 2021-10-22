package com.solid.principles.design.app.lsp.pinguin.good;

public class Ave implements IFlyingBird {

    @Override
    public void setLocation(String longitude, String latitude) {
        System.out.println("Su ubicacion es longitud "
                .concat(longitude)
                .concat(" and latitude")
                .concat(latitude));
    }

    @Override
    public void setFlyLocationWinter(String flyLocationWinter) {
        System.out.println("Vuela en invierno a "
                .concat(flyLocationWinter));
    }

    @Override
    public void setFlyLocationSummer(String flyLocationSummer) {
        System.out.println("Vuela en verano a "
                .concat(flyLocationSummer));
    }

    @Override
    public void setmaxAltitude(Double maxAltitude) {
        System.out.println("Su altitud maxima de vuelo es "
                .concat(maxAltitude.toString()));
    }
}
