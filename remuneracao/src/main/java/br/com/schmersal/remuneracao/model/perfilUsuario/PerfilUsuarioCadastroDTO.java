package br.com.schmersal.remuneracao.model.perfilUsuario;

import jakarta.validation.constraints.NotBlank;

public record PerfilUsuarioCadastroDTO(

    @NotBlank
    String nome, 
    
    String descricao

    ) {
    
}
