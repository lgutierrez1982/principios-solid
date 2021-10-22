package com.solid.principles.design.app.lsp.pinguin.bad;

public interface IBird {

    public void setLocation(String longitude, String latitude);
    public void setFlyLocationWinter(String flyLocationWinter);
    public void setFlyLocationSummer(String flyLocationSummer);
    public void setmaxAltitude(Double maxAltitude);
}
