package com.solid.principles.design.app.lsp.pinguin.good;

public interface IFlyingBird extends IBird{

    public void setFlyLocationWinter(String flyLocationWinter);
    public void setFlyLocationSummer(String flyLocationSummer);
    public void setmaxAltitude(Double maxAltitude);
}
