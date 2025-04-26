package com.nadaly.boutique.controller;

import com.nadaly.boutique.model.outfit.Prenda;
import com.nadaly.boutique.model.factory.*;
import com.nadaly.boutique.service.boutiqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/boutique")
public class BoutiqueController {

    @Autowired
    private boutiqueService boutiqueService;

    @PostMapping("/setEstilo")
    public String setEstilo(@RequestParam String estilo) {
        switch (estilo) {
            case "cute" -> boutiqueService.setFactory(new cuteFactory());
            case "casual" -> boutiqueService.setFactory(new casualFactory());
            case "dark" -> boutiqueService.setFactory(new darkFactory());
            case "summer" -> boutiqueService.setFactory(new summerFactory());
        }
        return "redirect:/outfit";
    }
}
