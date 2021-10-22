package com.solid.principles.design.app.srp.good;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@AllArgsConstructor
@ToString
public class Product {

    private Integer id;
    private String name;
    private Double precio;

}
