package com.bluesoft.bluesoftpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/pets")
class PetController {

    @GetMapping
    String index(){
        return "pets/index";
    }
}
