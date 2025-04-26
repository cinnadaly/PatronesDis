package com.nadaly.boutique.controller;

import com.nadaly.boutique.model.outfit.Top;
import com.nadaly.boutique.model.outfit.Bottom;
import com.nadaly.boutique.model.outfit.Accesorio;
import com.nadaly.boutique.model.outfit.Prenda;
import com.nadaly.boutique.model.command.addPrenda;
import com.nadaly.boutique.model.command.commandManager;
import com.nadaly.boutique.model.decorator.conBagRosa;
import com.nadaly.boutique.model.decorator.conBagNegra;
import com.nadaly.boutique.model.decorator.conBagBlanca;
import com.nadaly.boutique.service.boutiqueService;
import com.nadaly.boutique.service.carritoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/carrito")
public class CarritoController {

    @Autowired
    carritoService carrito;

    @PostMapping("/deshacer")
    public String deshacer() {
        carrito.quitarUltima();
        return "redirect:/outfit";
    }

    @PostMapping("/limpiar")
    public String limpiar() {
        carrito.limpiar();
        return "redirect:/outfit";
    }
}
