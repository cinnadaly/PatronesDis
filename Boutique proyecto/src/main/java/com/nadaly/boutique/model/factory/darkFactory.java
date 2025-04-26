package com.nadaly.boutique.model.factory;

import com.nadaly.boutique.model.outfit.Prenda;
import com.nadaly.boutique.model.outfit.Accesorio;
import com.nadaly.boutique.model.outfit.Bottom;
import com.nadaly.boutique.model.outfit.Top;

public class darkFactory implements boutiqueFactory{
    @Override
    public Prenda crearTop() {
        return new Top("Sweater rayado","Sweater rojo");
    }
    @Override
    public Prenda crearBottom() {
        return new Bottom("Falda plisada Negra","Falda negra plisada");
    }
    @Override
    public Prenda crearAccesorio(){
        return new Accesorio("Choker","Choker de encaje negro");
    }
}
