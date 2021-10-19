package com.solid.principles.design.app.ocp.bad;

public class Producto {
    private Integer id;
    private String name;
    private Double precio;

    public Producto(Integer id, String name, Double precio) {
        this.id = id;
        this.name = name;
        this.precio = precio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", precio=" + precio +
                '}';
    }
}
