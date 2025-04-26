package com.nadaly.boutique.model.decorator;

import com.nadaly.boutique.model.outfit.Prenda;

public abstract class PrendaDecorada implements Prenda {

    protected Prenda prendaBase;

    public PrendaDecorada(Prenda prendaBase) {
        this.prendaBase = prendaBase;
    }

    @Override
    public String getNombre() {
        return prendaBase.getNombre();
    }

    @Override
    public String getDescripcion() {
        return prendaBase.getDescripcion();
    }
}
