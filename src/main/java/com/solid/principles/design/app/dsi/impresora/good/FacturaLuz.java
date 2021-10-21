package com.solid.principles.design.app.dsi.impresora.good;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class FacturaLuz extends Impuesto {

    private String codigoPago;

    public FacturaLuz(Double importe, String codigoPago) {
        super(importe);
        this.codigoPago = codigoPago;
    }


    @Override
    public void imprimir() {
        System.out.println("Imprimiendo factura de luz codigo "
                .concat(getCodigoPago().toString())
                .concat(" por el monto de ")
                .concat(getImporte().toString()));
    }
}
