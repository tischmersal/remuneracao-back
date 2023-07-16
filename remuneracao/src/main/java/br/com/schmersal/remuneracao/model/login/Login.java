package br.com.schmersal.remuneracao.model.login;

import br.com.schmersal.remuneracao.model.perfilUsuario.PerfilUsuario;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name="login")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Login {

    public Login(PerfilUsuario perfilUsuario, LoginCadastroDTO dados){
        this.email = dados.email();
        this.usuario = dados.usuario();
        this.senha = dados.senha();
        this.perfilUsuario = perfilUsuario;
        this.ativo = dados.ativo();
    }

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String email;
    private String usuario;
    private String senha;
    private boolean ativo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_perfil_usuario", referencedColumnName = "id")
    @Embedded
    private PerfilUsuario perfilUsuario;


    
    
}
