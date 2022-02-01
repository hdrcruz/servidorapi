package br.gov.to.ssp.servidorapi.dto.request;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import br.gov.to.ssp.servidorapi.enums.TipoSetor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SetorDTO {
    
    private Long id;

    @NotEmpty
    private String descricao;

    @Enumerated(EnumType.STRING)
    private TipoSetor tipo;
    
}
