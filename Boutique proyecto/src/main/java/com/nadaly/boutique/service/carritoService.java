package com.nadaly.boutique.service;

import com.nadaly.boutique.model.outfit.Prenda;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class carritoService {
    private final List<Prenda> carrito = new ArrayList<>();


    // agrega prenda a carrito
    public void agregar(Prenda prenda) {
        carrito.add(prenda);
    }


    // quita ultima prenda agregada para el undo
    public void quitarUltima() {
        if (!carrito.isEmpty()) {
            carrito.remove(carrito.size() - 1);
        }
    }


    // devuelve todas las prendas en carrito
    public List<Prenda> getCarrito() {
        return carrito;
    }


    // limpia carrito
    public void limpiar() {
        carrito.clear();
    }

}
