package com.solid.principles.design.app.dsi.impresora.bad;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class FacturaLuz extends Impuesto{

    private String codigoPago;

    public FacturaLuz(Double importe, String codigoPago) {
        super(importe);
        this.codigoPago = codigoPago;
    }
}
