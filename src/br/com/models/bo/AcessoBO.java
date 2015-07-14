package br.com.models.bo;

import br.com.models.dao.GenericDAO;
import br.com.models.vo.Usuario;

public class AcessoBO {
    private Usuario usuario;
    private GenericDAO usuarioDAO;

    public Usuario verificarUsuario(String email, String senha){
        usuario = (Usuario) usuarioDAO.consultar("emailUsuario", email, "senhaUsuario", senha, usuario);
        return usuario;
    }
}
