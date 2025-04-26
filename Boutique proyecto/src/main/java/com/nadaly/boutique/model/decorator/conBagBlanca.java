package com.nadaly.boutique.model.decorator;

import com.nadaly.boutique.model.outfit.Prenda;

public class conBagBlanca extends PrendaDecorada{

    public conBagBlanca(Prenda prendaBase) {
        super(prendaBase);
    }
    @Override
    public String getNombre(){
        return prendaBase.getNombre() + " con bolsa blanca";
    }
    @Override
    public String getDescripcion() {
        return prendaBase.getDescripcion() + " con bolsa blanca";
    }
}
