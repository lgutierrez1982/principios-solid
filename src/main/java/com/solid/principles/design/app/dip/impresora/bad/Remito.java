package com.solid.principles.design.app.dip.impresora.bad;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
@AllArgsConstructor
public class Remito {

    private Integer numero;
    private LocalDate fecha;
    private Integer cantBultos;

}
