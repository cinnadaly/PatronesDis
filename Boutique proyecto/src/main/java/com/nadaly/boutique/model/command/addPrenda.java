package com.nadaly.boutique.model.command;

import com.nadaly.boutique.model.outfit.Prenda;
import com.nadaly.boutique.service.carritoService;

public class addPrenda implements command {

    private final carritoService carrito;
    private final Prenda prenda;


    public addPrenda(carritoService carrito, Prenda prenda) {
        this.carrito = carrito;
        this.prenda = prenda;
    }
    @Override
    public void ejecutar() {
        carrito.agregar(prenda);
    }
    @Override
    public void deshacer(){
        carrito.quitarUltima();
    }

}
