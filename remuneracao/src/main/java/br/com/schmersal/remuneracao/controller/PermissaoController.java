package br.com.schmersal.remuneracao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.schmersal.remuneracao.model.permissao.Permissao;
import br.com.schmersal.remuneracao.model.permissao.PermissaoCadastroDTO;
import br.com.schmersal.remuneracao.repository.PermissaoRepository;
import jakarta.transaction.Transactional;

@RestController
@RequestMapping("permissao")
public class PermissaoController {

    @Autowired
    private PermissaoRepository permissaoRepository;

    @PostMapping
    @Transactional
    public void inserirPermissao(@RequestBody PermissaoCadastroDTO body){
        permissaoRepository.save(new Permissao(body));
    }

    
}
