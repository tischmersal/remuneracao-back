package br.com.schmersal.remuneracao.model.perfilUsuario;

public record PerfilUsuarioListagemDTO(Integer id, String nome, String descricao) {

    public PerfilUsuarioListagemDTO(PerfilUsuario perfilUsuario){
        this(perfilUsuario.getId(), perfilUsuario.getNome(), perfilUsuario.getDescricao());
    }
    
}
