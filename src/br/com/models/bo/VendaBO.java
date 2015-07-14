package br.com.models.bo;

import br.com.models.dao.GenericDAO;
import br.com.models.vo.Cliente;
import br.com.models.vo.Funcionario;
import br.com.models.vo.Itemvenda;
import br.com.models.vo.Recebimento;
import br.com.models.vo.Venda;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
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
                    ArrayList<Itemvenda> itens = buscarItens(idVenda);
                    GenericDAO<Itemvenda> itemDAO = new GenericDAO<>();
                    itens.stream().forEach((iten) -> {
                        itemDAO.apagar(iten);
                    });
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

    public Boolean finalizarVenda(Long idFuncionario, Integer idCliente, String valor, Integer parcelas, String vencimento, ArrayList<Itemvenda> itens) {
        try {
            GenericDAO<Venda> vendaDAO = new GenericDAO<>();
            Venda vendaVO = new Venda();

            GenericDAO<Funcionario> funcionarioDAO = new GenericDAO<>();
            vendaVO.setFuncionario(funcionarioDAO.consultar("idFuncionario", idFuncionario, new Funcionario()));
            if (idCliente > 0) {
                vendaVO.setCliente(buscarCliente(idCliente - 1));
            }
            vendaVO.setValorVenda(new BigDecimal(valor));
            vendaVO.setParcelasVenda(parcelas);
            try {
                vendaVO.setVencimentoVenda(new SimpleDateFormat("yyyy/MM/dd").parse(vencimento));
            } catch (Exception e) {
                vendaVO.setVencimentoVenda(new Date());
            }
            vendaVO.setCriacaoVenda(new Date());
            vendaVO.setAtualizacaoVenda(new Date());
            vendaDAO.inserir(vendaVO);

            GenericDAO<Itemvenda> itemDAO = new GenericDAO<>();
            itens.stream().forEach((iten) -> {
                iten.setVenda(vendaVO);
                itemDAO.inserir(iten);
            });
            JOptionPane.showMessageDialog(null, "Venda finalizada com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public void excluirVenda(Long idVenda, ArrayList<Itemvenda> itens) {
        try {
            GenericDAO<Venda> vendaDAO = new GenericDAO<>();
            vendaDAO.apagar(vendaDAO.consultar("idVenda", idVenda, new Venda()));
            GenericDAO<Itemvenda> itemDAO = new GenericDAO<>();
            itens.stream().forEach((iten) -> {
                itemDAO.apagar(itemDAO.consultar("idItem", iten.getIdItemVenda(), new Itemvenda()));
            });
        } catch (Exception e) {

        }
    }

    public ArrayList<Itemvenda> buscarItens(Long idVenda) {
        GenericDAO<Itemvenda> itemDAO = new GenericDAO<>();
        List<Itemvenda> itens = itemDAO.consultar(new Itemvenda());
        ArrayList<Itemvenda> itensVenda = new ArrayList<>();
        itens.stream().filter((iten) -> (Objects.equals(iten.getVenda().getIdVenda(), idVenda))).forEach((iten) -> {
            itensVenda.add(iten);
        });
        return itensVenda;
    }
}
