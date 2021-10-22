package com.solid.principles.design.app.dip.impresora.good;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
//al implementar la interfaz
//las clases de alto nivel depende de una abstraccion
public abstract class Impuesto implements IImprimible{

    private Double importe;

    @Override
    public abstract void imprimir();
}
