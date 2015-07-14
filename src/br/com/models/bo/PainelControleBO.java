package br.com.models.bo;

import br.com.models.dao.GenericDAO;
import br.com.models.vo.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @see Classe de objetos de negócios. Métodos:
 *
 * @author Bruna Danieli Ribeiro Gonçalves, Márlon Ândrel Coelho Freitas
 */
public class PainelControleBO {

    //Declaração de variáveis(Value Object).
    private Usuario usuarioVO;
    private List<Usuario> usuariosVO;

    //Declaração de variáveis(Data Access Object).
    private GenericDAO<Usuario> usuarioDAO;

    /**
     *
     * @see Método que realiza consulta ao banco de dados por todos os Usuarios.
     *
     * @return Lista de Usuario composta por todas as linhas da tabela usuario
     * do banco de dados.
     */
    public List<Usuario> buscarUsuarios() {
        usuarioDAO = new GenericDAO();
        usuariosVO = new ArrayList<>(usuarioDAO.consultar(usuarioVO = new Usuario()));
        return usuariosVO;
    }
}
