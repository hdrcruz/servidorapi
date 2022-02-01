package br.gov.to.ssp.servidorapi.enums;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@AllArgsConstructor
public enum TipoSetor {

    INTERNO("Interno"),
    EXTERNO("Externo");

    private final String descricao;

    private TipoSetor(String descricao) {
        this.descricao = descricao;
    }
}
