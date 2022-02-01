package br.gov.to.ssp.servidorapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/servidor")
public class ServidorController {

    @GetMapping
    public String getServidor(){
        return "Ok, teste";
    }

    
}
