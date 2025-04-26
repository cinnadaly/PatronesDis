package com.nadaly.boutique.model.decorator;

import com.nadaly.boutique.model.outfit.Prenda;

public class conBagNegra extends PrendaDecorada{
    public conBagNegra(Prenda prendaBase) {
        super(prendaBase);
    }
    @Override
    public String getNombre(){
        return prendaBase.getNombre() + " con bolsa negra";
    }
    @Override
    public String getDescripcion() {
        return prendaBase.getDescripcion() + " con bolsa negra";
    }
}
