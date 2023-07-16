package br.com.schmersal.remuneracao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.schmersal.remuneracao.model.login.Login;

public interface LoginRepository extends JpaRepository<Login, Integer>{
    
}
