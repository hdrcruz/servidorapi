package br.gov.to.ssp.servidorapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.to.ssp.servidorapi.dto.response.MessageResponseDTO;
import br.gov.to.ssp.servidorapi.entity.Servidor;
import br.gov.to.ssp.servidorapi.repository.ServidorRepository;

@Service
public class ServidorService {

    private ServidorRepository servidorRepository;

    @Autowired
    public ServidorService(ServidorRepository servidorRepository){
        this.servidorRepository = servidorRepository;
    }

    public MessageResponseDTO criarServidor(Servidor servidor){
        Servidor novoServidor = servidorRepository.save(servidor);
        return MessageResponseDTO.builder().message("Servidor criado com ID " + novoServidor.getId()).build();
    }
    
}
