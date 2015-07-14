package br.com.models.bo;

import br.com.models.dao.GenericDAO;
import br.com.models.vo.Categoria;
import br.com.models.vo.Cliente;
import br.com.models.vo.Contato;
import br.com.models.vo.Endereco;
import br.com.models.vo.Fornecedor;
import br.com.models.vo.Funcionario;
import br.com.models.vo.Pessoa;
import br.com.models.vo.Pessoafisica;
import br.com.models.vo.Pessoajuridica;
import br.com.models.vo.Produto;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @see Classe de objetos de negócios. Métodos:
 *
 * @author Bruna Danieli Ribeiro Gonçalves, Márlon Ândrel Coelho Freitas
 */
public class PainelControleBO {

    /**
     *
     * @see Método que realiza consulta ao banco de dados por todos os Usuarios.
     *
     * @return Lista de Usuarios composta por todas as linhas da tabela usuario
     * do banco de dados.
     */
    public List<Funcionario> buscarFuncionarios() {
        GenericDAO<Funcionario> funcionarioDAO = new GenericDAO();
        ArrayList<Funcionario> funcionariosVO = new ArrayList<>(funcionarioDAO.consultar(new Funcionario()));
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
        GenericDAO<Cliente> clienteDAO = new GenericDAO();
        ArrayList<Cliente> clientesVO = new ArrayList<>(clienteDAO.consultar(new Cliente()));
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
        GenericDAO<Fornecedor> fornecedorDAO = new GenericDAO<>();
        ArrayList<Fornecedor> fornecedoresVO = new ArrayList<>(fornecedorDAO.consultar(new Fornecedor()));
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
        GenericDAO<Categoria> categoriaDAO = new GenericDAO<>();
        ArrayList<Categoria> categoriasVO = new ArrayList<>(categoriaDAO.consultar(new Categoria()));
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
        GenericDAO<Produto> produtoDAO = new GenericDAO<>();
        ArrayList<Produto> produtosVO = new ArrayList<>(produtoDAO.consultar(new Produto()));
        return produtosVO;
    }

    /**
     * @see Método que retorna PessoaFisica que possua o atributo Pessoa passado
     * como parâmetro.
     * @param idPessoa
     * @return Pessoafisica/null.
     */
    public Pessoafisica buscarPessoaFisica(Long idPessoa) {
        GenericDAO<Pessoafisica> pessoaFisicaDAO = new GenericDAO<>();
        List<Pessoafisica> pessoaFisicaVO = pessoaFisicaDAO.consultar(new Pessoafisica());
        for (Pessoafisica pessoaFisicaVO1 : pessoaFisicaVO) {
            if (Objects.equals(pessoaFisicaVO1.getPessoa().getIdPessoa(), idPessoa)) {
                return pessoaFisicaVO1;
            }
        }
        return null;
    }

    /**
     * @see Método que retorna PessoaJuridica que possua o atributo Pessoa
     * passado como parâmetro.
     * @param idPessoa
     * @return Pessoafisica/null.
     */
    public Pessoajuridica buscarPessoaJuridica(Long idPessoa) {
        GenericDAO<Pessoajuridica> pessoaJuridicaDAO = new GenericDAO<>();
        List<Pessoajuridica> pessoaJuridicaVO = pessoaJuridicaDAO.consultar(new Pessoajuridica());
        for (Pessoajuridica pessoaJuridicaVO1 : pessoaJuridicaVO) {
            if (Objects.equals(pessoaJuridicaVO1.getPessoa().getIdPessoa(), idPessoa)) {
                return pessoaJuridicaVO1;
            }
        }
        return null;
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
            GenericDAO<Funcionario> funcionarioDAO = new GenericDAO<>();
            GenericDAO<Pessoa> pessoaDAO = new GenericDAO<>();
            GenericDAO<Pessoafisica> pessoaFisicaDAO = new GenericDAO<>();
            GenericDAO<Contato> contatoDAO = new GenericDAO<>();
            GenericDAO<Endereco> enderecoDAO = new GenericDAO<>();
            Funcionario funcionarioVO = new Funcionario();
            Pessoa pessoaVO = new Pessoa();
            Pessoafisica pessoaFisicaVO = new Pessoafisica();
            Contato contatoVO = new Contato();
            Endereco enderecoVO = new Endereco();

            funcionarioVO = funcionarioDAO.consultar("idFuncionario", idFuncionario, funcionarioVO);
            pessoaVO = pessoaDAO.consultar("idPessoa", funcionarioVO.getPessoa().getIdPessoa(), pessoaVO);
            pessoaFisicaVO = buscarPessoaFisica(pessoaVO.getIdPessoa());
            contatoVO = contatoDAO.consultar("idContato", funcionarioVO.getContato().getIdContato(), contatoVO);
            enderecoVO = enderecoDAO.consultar("idEndereco", funcionarioVO.getEndereco().getIdEndereco(), enderecoVO);

            if (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir este Funcionário?", "Alerta", JOptionPane.YES_NO_OPTION) == 0) {
                try {
                    funcionarioDAO.apagar(funcionarioVO);
                    pessoaFisicaDAO.apagar(pessoaFisicaVO);
                    pessoaDAO.apagar(pessoaVO);
                    contatoDAO.apagar(contatoVO);
                    enderecoDAO.apagar(enderecoVO);
                    JOptionPane.showMessageDialog(null, "Funcionário excluido com sucesso.", "Secesso", JOptionPane.INFORMATION_MESSAGE);
                    return true;
                } catch (Exception e) {
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

    /**
     *
     * @see Método que exclui um objeto no banco de dados por meio da
     * GenericDAO.
     *
     * @param idCliente
     *
     * @return
     */
    public Boolean excluirCliente(Long idCliente) {
        try {
            GenericDAO<Cliente> clienteDAO = new GenericDAO<>();
            GenericDAO<Pessoa> pessoaDAO = new GenericDAO<>();
            GenericDAO<Pessoafisica> pessoaFisicaDAO = new GenericDAO<>();
            GenericDAO<Pessoajuridica> pessoaJuridicaDAO = new GenericDAO<>();
            GenericDAO<Contato> contatoDAO = new GenericDAO<>();
            GenericDAO<Endereco> enderecoDAO = new GenericDAO<>();

            if (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir este Cliente?", "Alerta", JOptionPane.YES_NO_OPTION) == 0) {
                try {
                    Cliente clienteVO = clienteDAO.consultar("idCliente", idCliente, new Cliente());
                    Pessoa pessoaVO = pessoaDAO.consultar("idPessoa", clienteVO.getPessoa().getIdPessoa(), new Pessoa());
                    Contato contatoVO = contatoDAO.consultar("idContato", clienteVO.getContato().getIdContato(), new Contato());
                    Endereco enderecoVO = enderecoDAO.consultar("idEndereco", clienteVO.getEndereco().getIdEndereco(), new Endereco());

                    if ("Fisica".equals(pessoaVO.getTipoPessoa())) {
                        Pessoafisica pessoaFisicaVO = buscarPessoaFisica(clienteVO.getPessoa().getIdPessoa());
                        pessoaFisicaDAO.apagar(pessoaFisicaVO);
                    } else {
                        Pessoajuridica pessoaJuridicaVO = buscarPessoaJuridica(clienteVO.getPessoa().getIdPessoa());
                        pessoaJuridicaDAO.apagar(pessoaJuridicaVO);
                    }

                    clienteDAO.apagar(clienteVO);
                    pessoaDAO.apagar(pessoaVO);
                    contatoDAO.apagar(contatoVO);
                    enderecoDAO.apagar(enderecoVO);
                    JOptionPane.showMessageDialog(null, "Cliente excluido com sucesso.", "Secesso", JOptionPane.INFORMATION_MESSAGE);
                    return true;
                } catch (Exception e) {
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

    /**
     *
     * @see Método que exclui um objeto no banco de dados por meio da
     * GenericDAO.
     *
     * @param idFornecedor
     *
     * @return
     */
    public Boolean excluirFornecedor(Long idFornecedor) {
        try {
            if (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir este Fornecedor?", "Alerta", JOptionPane.YES_NO_OPTION) == 0) {
                try {
                    GenericDAO<Fornecedor> fornecedorDAO = new GenericDAO<>();
                    GenericDAO<Pessoa> pessoaDAO = new GenericDAO<>();
                    GenericDAO<Pessoafisica> pessoaFisicaDAO = new GenericDAO<>();
                    GenericDAO<Pessoajuridica> pessoaJuridicaDAO = new GenericDAO<>();
                    GenericDAO<Contato> contatoDAO = new GenericDAO<>();
                    GenericDAO<Endereco> enderecoDAO = new GenericDAO<>();
                    Fornecedor fornecedorVO = fornecedorDAO.consultar("idFornecedor", idFornecedor, new Fornecedor());
                    Pessoa pessoaVO = pessoaDAO.consultar("idPessoa", fornecedorVO.getPessoa().getIdPessoa(), new Pessoa());
                    Contato contatoVO = contatoDAO.consultar("idContato", fornecedorVO.getContato().getIdContato(), new Contato());
                    Endereco enderecoVO = enderecoDAO.consultar("idEndereco", fornecedorVO.getEndereco().getIdEndereco(), new Endereco());

                    if ("Fisica".equals(pessoaVO.getTipoPessoa())) {
                        Pessoafisica pessoaFisicaVO = buscarPessoaFisica(fornecedorVO.getPessoa().getIdPessoa());
                        pessoaFisicaDAO.apagar(pessoaFisicaVO);
                    } else {
                        Pessoajuridica pessoaJuridicaVO = buscarPessoaJuridica(fornecedorVO.getPessoa().getIdPessoa());
                        pessoaJuridicaDAO.apagar(pessoaJuridicaVO);
                    }

                    fornecedorDAO.apagar(fornecedorVO);
                    pessoaDAO.apagar(pessoaVO);
                    contatoDAO.apagar(contatoVO);
                    enderecoDAO.apagar(enderecoVO);
                    JOptionPane.showMessageDialog(null, "Fornecedor excluido com sucesso.", "Secesso", JOptionPane.INFORMATION_MESSAGE);
                    return true;
                } catch (Exception e) {
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
