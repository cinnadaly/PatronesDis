package com.nadaly.boutique.model.factory;
import com.nadaly.boutique.model.outfit.Prenda;
import com.nadaly.boutique.model.outfit.Top;
import com.nadaly.boutique.model.outfit.Bottom;
import com.nadaly.boutique.model.outfit.Accesorio;

public class cuteFactory implements boutiqueFactory {
    @Override
    public Prenda crearTop() {
    return new Top("Sweater cute","Sweater rosa esponjoso");
    }
    @Override
    public Prenda crearBottom() {
    return new Bottom("Falda plisada","Falda plisada blanca");
    }
    @Override
    public Prenda crearAccesorio(){
    return new Accesorio("Diadema negra","Diadema negra de tela suave");
    }
}
