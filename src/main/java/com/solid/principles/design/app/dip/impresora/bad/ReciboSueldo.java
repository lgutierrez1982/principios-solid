package com.solid.principles.design.app.dip.impresora.bad;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
public class ReciboSueldo {

    private Double total;
    private Integer lagajo;
}
