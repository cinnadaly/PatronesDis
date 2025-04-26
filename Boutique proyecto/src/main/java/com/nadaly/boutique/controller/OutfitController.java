package com.nadaly.boutique.controller;

import com.nadaly.boutique.model.decorator.conBagBlanca;
import com.nadaly.boutique.model.decorator.conBagNegra;
import com.nadaly.boutique.model.decorator.conBagRosa;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.nadaly.boutique.model.outfit.*;
import com.nadaly.boutique.service.boutiqueService;
import com.nadaly.boutique.service.carritoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class OutfitController {
    @Autowired
    private boutiqueService boutiqueService;

    @Autowired
    private carritoService carritoService;

    // Vista principal
    @GetMapping("/outfit")
    public String mostrarOutfit(Model model) {
        model.addAttribute("carrito", carritoService.getCarrito());
        model.addAttribute("catalogo", boutiqueService.getCatalogo());
        return "outfit";
    }

    // Agregar top/bottom/accesorio
    @PostMapping("/outfit/agregar")
    public String agregar(@RequestParam String tipo) {
        Prenda prenda = switch (tipo) {
            case "top" -> boutiqueService.getCatalogo().get(0);
            case "bottom" -> boutiqueService.getCatalogo().get(1);
            default -> null;
        };
        if (prenda != null) carritoService.agregar(prenda);
        return "redirect:/outfit";
    }

    // Agregar accesorio decorado
    @PostMapping("/outfit/accesorio")
    public String accesorio(@RequestParam String bolsa) {
        Prenda base = boutiqueService.obtenerAccesorioBase();
        Prenda decorada = switch (bolsa) {
            case "rosa" -> new conBagRosa(base);
            case "negra" -> new conBagNegra(base);
            case "blanca" -> new conBagBlanca(base);
            default -> base;
        };
        carritoService.agregar(decorada);
        return "redirect:/outfit";
    }

    // Vista final
    @GetMapping("/outfit/final")
    public String verFinal(Model model) {
        model.addAttribute("carrito", carritoService.getCarrito());
        return "outfit-final";
    }
}
