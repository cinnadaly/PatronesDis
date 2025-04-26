package com.nadaly.boutique.model.outfit;

public class Accesorio implements Prenda {
    private String nombre;
    private String descripcion;

    public Accesorio(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    @Override
    public String getNombre() {
        return nombre;
    }
    @Override
    public String getDescripcion() {
        return descripcion;
    }
}
