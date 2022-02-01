package br.gov.to.ssp.servidorapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.to.ssp.servidorapi.entity.Servidor;

public interface ServidorRepository extends JpaRepository<Servidor, Long>{
    
}
