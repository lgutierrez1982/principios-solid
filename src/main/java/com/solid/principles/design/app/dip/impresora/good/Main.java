package com.solid.principles.design.app.dip.impresora.good;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Impresora impresora = new Impresora();

        Factura factura = new Factura(1, LocalDate.now(), 25.5);
        NotaCredito notaCredito = new NotaCredito(344, LocalDate.now(), 400.0);
        Remito remito = new Remito(5551, LocalDate.now(), 5);
        FacturaLuz facturaLuz = new FacturaLuz(441.0, "444545");
        Municipal municipal = new Municipal(1221.0, "5555555662");


        impresora.imprimir(factura);
        impresora.imprimir(notaCredito);
        impresora.imprimir(remito);
        impresora.imprimir(facturaLuz);
        impresora.imprimir(municipal);
    }
}
