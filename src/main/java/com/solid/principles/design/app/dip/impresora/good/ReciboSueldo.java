package com.solid.principles.design.app.dip.impresora.good;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
//al implementar la interfaz
//las clases de alto nivel depende de una abstraccion
public class ReciboSueldo implements IImprimible{

    private Double total;
    private Integer lagajo;

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo recibo sueldo letajo "
                .concat(getLagajo().toString())
                .concat(" por el monto de ")
                .concat(getTotal().toString()));
    }
}
