package br.com.schmersal.remuneracao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.schmersal.remuneracao.model.perfilUsuario.PerfilUsuario;

public interface PerfilUsuarioRepository extends JpaRepository<PerfilUsuario, Integer>{
    
}
