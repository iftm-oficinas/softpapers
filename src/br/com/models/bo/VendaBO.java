package br.com.models.bo;

import br.com.models.dao.GenericDAO;
import br.com.models.vo.Cliente;
import br.com.models.vo.Venda;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * @see Classe de objetos de negócios. Métodos:
 * @author Bruna Danieli Ribeiro Gonçalves, Márlon Ândrel Coelho Freitas
 */
public class VendaBO {

    /**
     * @param idCliente
     * @see Método que realiza consulta ao banco de dados por todos os Clientes.
     * @return Lista de Categorias composta por todas as linhas da tabela
     * categoria do banco de dados.
     */
    public Cliente buscarCliente(Integer idCliente) {
        GenericDAO<Cliente> clienteDAO = new GenericDAO<>();
        ArrayList<Cliente> clientesVO = new ArrayList<>(clienteDAO.consultar(new Cliente()));
        return clientesVO.get(idCliente);
    }

    /**
     * @see Método que realiza consulta ao banco de dados por todos as
     * Categorias.
     * @return Lista de Categorias composta por todas as linhas da tabela
     * categoria do banco de dados.
     */
    public String[] buscarNomeClientes() {
        GenericDAO<Cliente> clienteDAO = new GenericDAO<>();
        ArrayList<Cliente> clientesVO = new ArrayList<>(clienteDAO.consultar(new Cliente()));
        ArrayList<String> array = new ArrayList<>();
        array.add("CLIENTE");
        clientesVO.stream().forEach((categoriasVO1) -> {
            array.add(categoriasVO1.getNomeCliente());
        });
        String[] Arr = new String[array.size()];
        Arr = array.toArray(Arr);
        return Arr;
    }

    /**
     * @see Método que realiza consulta ao banco de dados por todos as
     * Categorias.
     * @return Lista de Categorias composta por todas as linhas da tabela
     * categoria do banco de dados.
     */
    public List<Venda> buscarVendas() {
        GenericDAO<Venda> vendaDAO = new GenericDAO<>();
        ArrayList<Venda> vendasVO = new ArrayList<>(vendaDAO.consultar(new Venda()));
        return vendasVO;
    }

    /**
     * @see Método que exclui um objeto no banco de dados por meio da
     * GenericDAO.
     * @param idVenda
     * @return true/false.
     */
    public Boolean excluirVenda(Long idVenda) {
        try {
            if (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir esta Venda?", "Alerta", JOptionPane.YES_NO_OPTION) == 0) {
                try {
                    GenericDAO<Venda> vendaDAO = new GenericDAO<>();
                    Venda vendaVO = vendaDAO.consultar("idVenda", idVenda, new Venda());
                    vendaDAO.apagar(vendaVO);
                    JOptionPane.showMessageDialog(null, "Venda excluida com sucesso.", "Secesso", JOptionPane.INFORMATION_MESSAGE);
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
