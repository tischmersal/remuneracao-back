package br.com.schmersal.remuneracao.model.login;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record LoginCadastroDTO(

    @NotBlank
    @Email
    String email,
    
    @NotBlank
    String usuario,
    
    @NotBlank
    String senha, 

    @NotNull
    Integer idPerfilUsuario, 

    @NotNull
    boolean ativo
    ) {
    
}
