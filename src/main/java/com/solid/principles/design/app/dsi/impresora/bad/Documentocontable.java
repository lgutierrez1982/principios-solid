package com.solid.principles.design.app.dsi.impresora.bad;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public abstract class Documentocontable {

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


}
