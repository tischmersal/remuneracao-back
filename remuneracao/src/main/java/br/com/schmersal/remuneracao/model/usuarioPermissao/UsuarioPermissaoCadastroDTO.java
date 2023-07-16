package br.com.schmersal.remuneracao.model.usuarioPermissao;

import jakarta.validation.constraints.NotNull;

public record UsuarioPermissaoCadastroDTO(

    @NotNull
    Integer idPerfilUsuario, 
    
    @NotNull
    Integer idPermissao, 

    @NotNull
    boolean permitido
) {
    
}
