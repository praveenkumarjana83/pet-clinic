package com.jpk.controller;

import com.jpk.petclinic.services.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class VetsController {

    private final VetService vetService;

    public VetsController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping(name = "vetsMapping", path="/vets", method = RequestMethod.GET)
    public String vets(Model model) {

        model.addAttribute("vets", vetService.findAll());
        return "vets/index.html";
    }
}
