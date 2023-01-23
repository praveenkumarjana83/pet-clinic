package com.jpk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OwnersController {

    @RequestMapping(name="ownersMapping", path="/owners", method= RequestMethod.GET)
    public String owners() {
        return "owners/index";
    }
}
