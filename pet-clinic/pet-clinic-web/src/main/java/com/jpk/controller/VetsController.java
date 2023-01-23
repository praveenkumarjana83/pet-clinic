package com.jpk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class VetsController {

    @RequestMapping(name = "vetsMapping", path="/vets", method = RequestMethod.GET)
    public String vets() {
        return "vets/index.html";
    }
}
