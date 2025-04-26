package com.nadaly.boutique.service;

import com.nadaly.boutique.model.outfit.Prenda;
import com.nadaly.boutique.model.factory.boutiqueFactory;
import com.nadaly.boutique.model.factory.casualFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class boutiqueService {
    private boutiqueFactory factory;

    public boutiqueService() {
        this.factory = new casualFactory();
    }

    public void setFactory(boutiqueFactory factory) {
        this.factory = factory;
    }

    public List<Prenda> getCatalogo(){
        List<Prenda> catalogo = new ArrayList<>();
        catalogo.add(factory.crearTop());
        catalogo.add(factory.crearBottom());
        catalogo.add(factory.crearAccesorio());
        return catalogo;
    }
    public Prenda obtenerAccesorioBase(){
        return factory.crearAccesorio();
    }
}
