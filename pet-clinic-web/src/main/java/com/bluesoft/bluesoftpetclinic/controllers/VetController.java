package com.bluesoft.bluesoftpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vets")
class VetController {

    @GetMapping
    String index(){
        return "vets/index";
    }

}
