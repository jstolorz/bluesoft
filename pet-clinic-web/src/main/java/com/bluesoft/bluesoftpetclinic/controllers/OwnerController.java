package com.bluesoft.bluesoftpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners")
class OwnerController {

    @GetMapping
    String index(){
        return "owners/index";
    }
}
