package br.gov.to.ssp.servidorapi.dto.request;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;

import br.gov.to.ssp.servidorapi.entity.Setor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LotacaoDTO {

    private Long id;

    @NotEmpty
    private Setor setor;

    @NotEmpty
    private LocalDate dataInicio;

    private LocalDate dataFim;
    
}
