package br.gov.to.ssp.servidorapi.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.gov.to.ssp.servidorapi.dto.request.ServidorDTO;
import br.gov.to.ssp.servidorapi.dto.response.MessageResponseDTO;
import br.gov.to.ssp.servidorapi.entity.Servidor;
import br.gov.to.ssp.servidorapi.repository.ServidorRepository;
import br.gov.to.ssp.servidorapi.service.ServidorService;

@RestController
@RequestMapping("api/v1/servidor")
public class ServidorController {

    private ServidorService servidorService;

    @Autowired
    public ServidorController(ServidorService servidorService){
        this.servidorService = servidorService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO criarServidor(@RequestBody @Valid ServidorDTO servidor){
        return servidorService.criarServidor(servidor);
    }

    
}
