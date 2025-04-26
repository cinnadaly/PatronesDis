package com.nadaly.boutique.model.factory;
import com.nadaly.boutique.model.outfit.Prenda;

public interface boutiqueFactory {
    Prenda crearTop();
    Prenda crearBottom();
    Prenda crearAccesorio();
}
