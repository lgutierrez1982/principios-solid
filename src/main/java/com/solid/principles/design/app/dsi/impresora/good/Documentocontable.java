package com.solid.principles.design.app.dsi.impresora.good;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter

//al implementar la interfaz
//las clases de alto nivel depende de una abstraccion
public abstract class Documentocontable implements IImprimible{

    protected String sigla;
    public Integer numero;
    public LocalDate fecha;
    public Double importe;

    public Documentocontable(Integer numero, LocalDate fecha, Double importe) {
        this.numero = numero;
        this.fecha = fecha;
        this.importe = importe;
    }

    public abstract  Double total();

    public abstract void imprimir();

}
