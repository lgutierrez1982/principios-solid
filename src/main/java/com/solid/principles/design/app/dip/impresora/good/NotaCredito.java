package com.solid.principles.design.app.dip.impresora.good;

import java.time.LocalDate;

public class NotaCredito extends Documentocontable {

    public NotaCredito(Integer numero, LocalDate fecha, Double importe) {
        super(numero, fecha, importe);
        this.sigla = "NotaCredito";
    }

    @Override
    public Double total() {
        return importe * 1.21 * -1;
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo nota de credito numero "
                .concat(getNumero().toString())
                .concat(" del ")
                .concat(getFecha().toString())
                .concat(" por el monto de ")
                .concat(getImporte().toString()));
    }


}
