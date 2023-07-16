package br.com.schmersal.remuneracao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.schmersal.remuneracao.model.permissao.Permissao;

public interface PermissaoRepository extends JpaRepository<Permissao, Integer>{
    
}
