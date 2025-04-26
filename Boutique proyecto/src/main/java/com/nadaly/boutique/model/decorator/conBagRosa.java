package com.nadaly.boutique.model.decorator;

import com.nadaly.boutique.model.outfit.Prenda;

public class conBagRosa extends PrendaDecorada{
    public conBagRosa(Prenda prendaBase) {
        super(prendaBase);
    }
    @Override
    public String getNombre(){
        return prendaBase.getNombre() + " con bolsa rosa";
    }
    @Override
    public String getDescripcion() {
        return prendaBase.getDescripcion() + " con bolsa rosa";
    }
}

