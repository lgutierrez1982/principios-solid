package com.solid.principles.design.app.lsp.pinguin.bad;

import lombok.AllArgsConstructor;

public class Ave implements IBird{

    private String longitude;
    private String latitude;
    private String flyLocationWinter;
    private String flyLocationSummer;
    private Double maxAltitude;

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
