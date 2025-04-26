package com.nadaly.boutique.model.factory;

import com.nadaly.boutique.model.outfit.Prenda;
import com.nadaly.boutique.model.outfit.Accesorio;
import com.nadaly.boutique.model.outfit.Bottom;
import com.nadaly.boutique.model.outfit.Top;

public class summerFactory implements boutiqueFactory{
    @Override
    public Prenda crearTop() {
        return new Top("Blusa gingham","Busa de gingham");
    }
    @Override
    public Prenda crearBottom() {
        return new Bottom("Shorts gingham","Shorts cortos de gingham");
    }
    @Override
    public Prenda crearAccesorio(){
        return new Accesorio("Diadema blanca","Diadema blanco");
    }
}
