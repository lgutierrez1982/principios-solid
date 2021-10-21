package com.solid.principles.design.app.dsi.impresora.good;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
@AllArgsConstructor
//al implementar la interfaz
//las clases de alto nivel depende de una abstraccion
public class Remito implements IImprimible{

    private Integer numero;
    private LocalDate fecha;
    private Integer cantBultos;

    @Override
    public void imprimir() {
        System.out.println("Imprimiendo remito numero "
                .concat(getNumero().toString())
                .concat(" del ")
                .concat(getFecha().toString())
                .concat(" con una cantidad de bultos ")
                .concat(getCantBultos().toString()));
    }
}
