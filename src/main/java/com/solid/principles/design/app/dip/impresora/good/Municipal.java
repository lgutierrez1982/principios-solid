package com.solid.principles.design.app.dip.impresora.good;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Municipal extends Impuesto {

    private String partida;

    public Municipal(Double importe, String partida) {
        super(importe);
        this.partida = partida;
    }


    @Override
    public void imprimir() {
        System.out.println("Imprimiendo municipal de luz partida "
                .concat(getPartida().toString())
                .concat(" por el monto de ")
                .concat(getImporte().toString()));
    }
}
