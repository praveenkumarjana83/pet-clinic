package com.jpk.controller;

import com.jpk.petclinic.services.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OwnersController {

    private final OwnerService ownerService;

    public OwnersController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping(name="ownersMapping", path="/owners", method= RequestMethod.GET)
    public String owners(Model model) {
        model.addAttribute("owners", ownerService.findAll());
        return "owners/index";
    }
}
