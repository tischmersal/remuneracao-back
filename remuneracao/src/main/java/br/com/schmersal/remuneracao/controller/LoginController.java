package br.com.schmersal.remuneracao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.schmersal.remuneracao.model.login.Login;
import br.com.schmersal.remuneracao.model.login.LoginCadastroDTO;
import br.com.schmersal.remuneracao.model.perfilUsuario.PerfilUsuario;
import br.com.schmersal.remuneracao.model.permissao.Permissao;
import br.com.schmersal.remuneracao.model.permissao.PermissaoBuscaDTO;
import br.com.schmersal.remuneracao.model.usuarioPermissao.UsuarioPermissao;
import br.com.schmersal.remuneracao.model.usuarioPermissao.UsuarioPermissaoCadastroDTO;
import br.com.schmersal.remuneracao.repository.LoginRepository;
import br.com.schmersal.remuneracao.repository.PerfilUsuarioRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginRepository loginRepository;

     @Autowired
    private PerfilUsuarioRepository perfilUsuarioRepository;

    @GetMapping
    public String listaPermissoes(@RequestBody PermissaoBuscaDTO body){
        return "login";
    }

    @PostMapping("/cadastro")
    @Transactional
    public void inserirPerfilUsuarioPermissao(@RequestBody @Valid LoginCadastroDTO body){

        PerfilUsuario perfilUsuario = perfilUsuarioRepository.findById(body.idPerfilUsuario()).get();

        Login login = new Login(perfilUsuario, body);
        loginRepository.save(login);
    }
    
}
