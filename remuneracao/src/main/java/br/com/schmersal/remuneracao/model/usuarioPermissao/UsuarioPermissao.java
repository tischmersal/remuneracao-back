package br.com.schmersal.remuneracao.model.usuarioPermissao;

import br.com.schmersal.remuneracao.model.perfilUsuario.PerfilUsuario;
import br.com.schmersal.remuneracao.model.permissao.Permissao;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name="usuario_permissao")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@IdClass(UsuarioPermissaoId.class)
public class UsuarioPermissao {

    @Id
    @MapsId
    @JoinColumn(name = "id_perfil_usuario", referencedColumnName = "id")
    private PerfilUsuario perfilUsuario;

    @Id
    @MapsId
    @JoinColumn(name = "id_permissao", referencedColumnName = "id")
    private Permissao permissao;

    private boolean permitido;
    
}
