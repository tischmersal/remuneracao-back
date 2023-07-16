package br.com.schmersal.remuneracao.model.permissao;

import jakarta.validation.constraints.NotBlank;

public record PermissaoBuscaDTO(
    @NotBlank
    Integer id
) {
    
}
