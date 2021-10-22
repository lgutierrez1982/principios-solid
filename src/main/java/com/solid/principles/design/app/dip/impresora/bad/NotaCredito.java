package com.solid.principles.design.app.dip.impresora.bad;

import java.time.LocalDate;

public class NotaCredito extends Documentocontable{

    public NotaCredito(Integer numero, LocalDate fecha, Double importe) {
        super(numero, fecha, importe);
        this.sigla = "NotaCredito";
    }

    @Override
    public Double total() {
        return importe * 1.21 * -1;
    }
}
