package br.gov.to.ssp.servidorapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;

import br.gov.to.ssp.servidorapi.entity.Lotacao;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ServidorDTO {
  
    private Long id;
    
    @NotEmpty
    @Size(min = 8, max = 8)
    private String matricula;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String nome;

    @NotEmpty
    @Size(min = 2, max = 100)
    private String sobrenome;

    @NotEmpty
    @CPF
    private String cpf;

    @Valid
    @NotEmpty
    private List<Lotacao> historicoLotacao;
    
}
