package com.nadaly.boutique.model.factory;

import com.nadaly.boutique.model.outfit.Prenda;
import com.nadaly.boutique.model.outfit.Accesorio;
import com.nadaly.boutique.model.outfit.Bottom;
import com.nadaly.boutique.model.outfit.Top;

public class casualFactory implements  boutiqueFactory {
    @Override
    public Prenda crearTop() {
        return new Top("Sweater gris","Sweater gris de manga larga");
    }
    @Override
    public Prenda crearBottom() {
        return new Bottom("Jeans","Jeans rectos de mezclilla");
    }
    @Override
    public Prenda crearAccesorio(){
        return new Accesorio("Diadema gris","Diadema de tela gris");
    }
}
