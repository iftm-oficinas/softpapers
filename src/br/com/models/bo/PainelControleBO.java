package br.com.models.bo;

import br.com.models.dao.GenericDAO;
import br.com.models.vo.Categoria;
import br.com.models.vo.Cliente;
import br.com.models.vo.Fornecedor;
import br.com.models.vo.Funcionario;
import br.com.models.vo.Produto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @see Classe de objetos de negócios. Métodos:
 *
 * @author Bruna Danieli Ribeiro Gonçalves, Márlon Ândrel Coelho Freitas
 */
public class PainelControleBO {

    //Declaração de variáveis(Value Object).
    private List<Funcionario> funcionariosVO;
    private List<Cliente> clientesVO;
    private List<Fornecedor> fornecedoresVO;
    private List<Categoria> categoriasVO;
    private List<Produto> produtosVO;

    //Declaração de variáveis(Data Access Object).
    private GenericDAO<Funcionario> funcionarioDAO;
    private GenericDAO<Cliente> clienteDAO;
    private GenericDAO<Fornecedor> fornecedorDAO;
    private GenericDAO<Categoria> categoriaDAO;
    private GenericDAO<Produto> produtoDAO;

    /**
     *
     * @see Método que realiza consulta ao banco de dados por todos os Usuarios.
     *
     * @return Lista de Usuarios composta por todas as linhas da tabela usuario
     * do banco de dados.
     */
    public List<Funcionario> buscarFuncionarios() {
        funcionarioDAO = new GenericDAO();
        funcionariosVO = new ArrayList<>(funcionarioDAO.consultar(new Funcionario()));
        return funcionariosVO;
    }

    /**
     *
     * @see Método que realiza consulta ao banco de dados por todos os Clientes.
     *
     * @return Lista de Clientes composta por todas as linhas da tabela cliente
     * do banco de dados.
     */
    public List<Cliente> buscarClientes() {
        clienteDAO = new GenericDAO();
        clientesVO = new ArrayList<>(clienteDAO.consultar(new Cliente()));
        return clientesVO;
    }

    /**
     *
     * @see Método que realiza consulta ao banco de dados por todos os
     * Fornecedores.
     *
     * @return Lista de Fornecedores composta por todas as linhas da tabela
     * fornecedor do banco de dados.
     */
    public List<Fornecedor> buscarFornecedores() {
        fornecedorDAO = new GenericDAO<>();
        fornecedoresVO = new ArrayList<>(fornecedorDAO.consultar(new Fornecedor()));
        return fornecedoresVO;
    }

    /**
     *
     * @see Método que realiza consulta ao banco de dados por todos as
     * Categorias.
     *
     * @return Lista de Categorias composta por todas as linhas da tabela
     * categoria do banco de dados.
     */
    public List<Categoria> buscarCategorias() {
        categoriaDAO = new GenericDAO<>();
        categoriasVO = new ArrayList<>(categoriaDAO.consultar(new Categoria()));
        return categoriasVO;
    }

    /**
     *
     * @see Método que realiza consulta ao banco de dados por todos os Produtos.
     *
     * @return Lista de Produtos composta por todas as linhas da tabela produto
     * do banco de dados.
     */
    public List<Produto> buscarProdutos() {
        produtoDAO = new GenericDAO<>();
        produtosVO = new ArrayList<>(produtoDAO.consultar(new Produto()));
        return produtosVO;
    }
    
    /**
     *
     * @see Método que exclui um objeto no banco de dados por meio da
     * GenericDAO.
     *
     * @param idFuncionario
     *
     * @return
     */
    public Boolean excluirFuncionario(Long idFuncionario) {
        try {
            funcionarioDAO = new GenericDAO<>();
            Funcionario funcionarioVO = new Funcionario();
            funcionarioVO = funcionarioDAO.consultar("idFuncionario", idFuncionario, funcionarioVO);
            if (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir este Funcionário?", "Alerta", JOptionPane.YES_NO_OPTION) == 0) {
                if (funcionarioDAO.apagar(funcionarioVO)) {
                    JOptionPane.showMessageDialog(null, "Funcionário excluido com sucesso.", "Secesso", JOptionPane.INFORMATION_MESSAGE);
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
