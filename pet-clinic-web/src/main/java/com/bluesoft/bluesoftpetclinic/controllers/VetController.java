package com.bluesoft.bluesoftpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class VetController {

    @GetMapping("/vets")
    String index(){
        return "vets/index";
    }

}
