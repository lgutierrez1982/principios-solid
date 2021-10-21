package com.solid.principles.design.app.dsi.impresora.bad;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Municipal extends Impuesto{

    private String partida;

    public Municipal(Double importe, String partida) {
        super(importe);
        this.partida = partida;    }
}
