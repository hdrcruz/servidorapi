package br.gov.to.ssp.servidorapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.to.ssp.servidorapi.dto.response.MessageResponseDTO;
import br.gov.to.ssp.servidorapi.entity.Servidor;
import br.gov.to.ssp.servidorapi.repository.ServidorRepository;

@RestController
@RequestMapping("api/v1/servidor")
public class ServidorController {

    private ServidorRepository servidorRepository;

    @Autowired
    public ServidorController(ServidorRepository servidorRepository){
        this.servidorRepository = servidorRepository;
    }

    @PostMapping
    public MessageResponseDTO criarServidor(@RequestBody Servidor servidor){
        Servidor novoServidor = servidorRepository.save(servidor);
        return MessageResponseDTO.builder().message("Servidor criado com ID " + novoServidor.getId()).build();
    }

    
}
