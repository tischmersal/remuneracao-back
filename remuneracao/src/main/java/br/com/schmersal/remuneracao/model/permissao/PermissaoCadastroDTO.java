package br.com.schmersal.remuneracao.model.permissao;

import jakarta.validation.constraints.NotBlank;

public record PermissaoCadastroDTO(

    @NotBlank
    String chave, 
    
    @NotBlank
    String descricao
) {
    
}
