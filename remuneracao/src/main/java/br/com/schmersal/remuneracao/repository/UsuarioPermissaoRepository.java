package br.com.schmersal.remuneracao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.schmersal.remuneracao.model.usuarioPermissao.UsuarioPermissao;
import br.com.schmersal.remuneracao.model.usuarioPermissao.UsuarioPermissaoId;

public interface UsuarioPermissaoRepository extends JpaRepository<UsuarioPermissao, UsuarioPermissaoId> {
    
}
