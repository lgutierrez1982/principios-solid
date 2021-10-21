package com.solid.principles.design.app.dsi.impresora.bad;

import java.time.LocalDate;

public class Factura extends Documentocontable{

    public Factura(Integer numero, LocalDate fecha, Double importe) {
        super(numero, fecha, importe);
        this.sigla = "Factura";
    }

    @Override
    public Double total() {
        return importe * 1.21;
    }
}
