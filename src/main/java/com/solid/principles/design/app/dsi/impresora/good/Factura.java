package com.solid.principles.design.app.dsi.impresora.good;

import java.time.LocalDate;

public class Factura extends Documentocontable {

    public Factura(Integer numero, LocalDate fecha, Double importe) {
        super(numero, fecha, importe);
        this.sigla = "Factura";
    }

    @Override
    public Double total() {
        return importe * 1.21;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo factura numero "
                .concat(getNumero().toString())
                .concat(" del ")
                .concat(getFecha().toString())
                .concat(" por el monto de ")
                .concat(getImporte().toString()));
    }
}
