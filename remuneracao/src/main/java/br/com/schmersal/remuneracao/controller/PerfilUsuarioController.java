package br.com.schmersal.remuneracao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.schmersal.remuneracao.model.perfilUsuario.PerfilUsuario;
import br.com.schmersal.remuneracao.model.perfilUsuario.PerfilUsuarioAtualizacaoDTO;
import br.com.schmersal.remuneracao.model.perfilUsuario.PerfilUsuarioCadastroDTO;
import br.com.schmersal.remuneracao.model.perfilUsuario.PerfilUsuarioListagemDTO;
import br.com.schmersal.remuneracao.model.permissao.Permissao;
import br.com.schmersal.remuneracao.model.usuarioPermissao.UsuarioPermissao;
import br.com.schmersal.remuneracao.model.usuarioPermissao.UsuarioPermissaoCadastroDTO;
import br.com.schmersal.remuneracao.repository.PerfilUsuarioRepository;
import br.com.schmersal.remuneracao.repository.PermissaoRepository;
import br.com.schmersal.remuneracao.repository.UsuarioPermissaoRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/perfilusuario")
public class PerfilUsuarioController {

    @Autowired
    private PerfilUsuarioRepository perfilUsuarioRepository;

    @Autowired
    private PermissaoRepository permissaoRepository;

    @Autowired
    private UsuarioPermissaoRepository usuarioPermissaoRepository;

    //perfil usuario
    @PostMapping
    @Transactional
    public void inserirPerfilUsuario(@RequestBody @Valid PerfilUsuarioCadastroDTO body){
        perfilUsuarioRepository.save(new PerfilUsuario(body));
    }
    
    @GetMapping
    public List<PerfilUsuarioListagemDTO> listaPerfilUsuario(){
        return perfilUsuarioRepository.findAll().stream().map(PerfilUsuarioListagemDTO::new).toList();
    }

    @PutMapping
    @Transactional
    public List<PerfilUsuarioListagemDTO> atualizarPerfilUsuario(@RequestBody @Valid PerfilUsuarioAtualizacaoDTO body){

        
        return perfilUsuarioRepository.findAll().stream().map(PerfilUsuarioListagemDTO::new).toList();
    }


    //perfil usuario pemissao
    @PostMapping("/permissao")
    @Transactional
    public void inserirPerfilUsuarioPermissao(@RequestBody @Valid UsuarioPermissaoCadastroDTO body){

        PerfilUsuario perfilUsuario = perfilUsuarioRepository.findById(body.idPerfilUsuario()).get();
        Permissao permissao = permissaoRepository.findById(body.idPermissao()).get();

        UsuarioPermissao usuarioPermissao = new UsuarioPermissao(perfilUsuario, permissao, body.permitido());
        usuarioPermissaoRepository.save(usuarioPermissao);
    }


    
}
