package com.rourke.sfgpetclinic.controllers;

/* Jim created on 12/27/2021 
inside the package - com.rourke.sfgpetclinic.controllers */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listVets() {
        return "owners/index";
    }


}
