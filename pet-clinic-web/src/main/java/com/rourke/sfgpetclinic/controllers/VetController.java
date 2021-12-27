package com.rourke.sfgpetclinic.controllers;

/* Jim created on 12/27/2021 
inside the package - com.rourke.sfgpetclinic.controllers */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
    public String listVets() {
        return "vets/index";
    }


}
