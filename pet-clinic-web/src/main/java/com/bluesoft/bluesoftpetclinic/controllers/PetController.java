package com.bluesoft.bluesoftpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class PetController {

    @GetMapping("/pets")
    String index(){
        return "pets/index";
    }
}
