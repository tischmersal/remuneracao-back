package br.com.schmersal.remuneracao.model.perfilUsuario;

import jakarta.validation.constraints.NotNull;

public record PerfilUsuarioAtualizacaoDTO(

    @NotNull
    Integer id,

    String nome, 

    String descricao

    ) {
    
}
