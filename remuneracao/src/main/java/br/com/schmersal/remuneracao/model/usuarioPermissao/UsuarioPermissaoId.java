package br.com.schmersal.remuneracao.model.usuarioPermissao;

import java.io.Serializable;

import br.com.schmersal.remuneracao.model.perfilUsuario.PerfilUsuario;
import br.com.schmersal.remuneracao.model.permissao.Permissao;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;

public class UsuarioPermissaoId implements Serializable{

    @OneToOne(cascade = CascadeType.ALL)
    @MapsId
    @JoinColumn(name = "id_perfil_usuario", referencedColumnName = "id")
    @Embedded
    private PerfilUsuario perfilUsuario;

    @OneToOne(cascade = CascadeType.ALL)
    @MapsId
    @JoinColumn(name = "id_permissao", referencedColumnName = "id")
    @Embedded
    private Permissao permissao;
}
