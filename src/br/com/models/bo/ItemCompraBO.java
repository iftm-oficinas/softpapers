package br.com.models.bo;

import br.com.models.dao.GenericDAO;
import br.com.models.vo.Compra;
import br.com.models.vo.Itemcompra;
import br.com.models.vo.Produto;
import java.awt.Color;
import java.awt.Component;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class ItemCompraBO {

    /**
     * @param idProduto
     * @see Método que realiza consulta ao banco de dados por todos os Clientes.
     * @return Lista de Categorias composta por todas as linhas da tabela
     * categoria do banco de dados.
     */
    public Produto buscarProduto(Integer idProduto) {
        GenericDAO<Produto> produtoDAO = new GenericDAO<>();
        ArrayList<Produto> produtosVO = new ArrayList<>(produtoDAO.consultar(new Produto()));
        return produtosVO.get(idProduto);
    }

    /**
     * @see Método que realiza consulta ao banco de dados por todos as
     * Categorias.
     * @return Lista de Categorias composta por todas as linhas da tabela
     * categoria do banco de dados.
     */
    public String[] buscarNomeProdutos() {
        GenericDAO<Produto> produtoDAO = new GenericDAO<>();
        ArrayList<Produto> produtosVO = new ArrayList<>(produtoDAO.consultar(new Produto()));
        ArrayList<String> array = new ArrayList<>();
        array.add("PRODUTO");
        produtosVO.stream().forEach((aux) -> {
            array.add(aux.getDescricaoProduto());
        });
        String[] Arr = new String[array.size()];
        Arr = array.toArray(Arr);
        return Arr;
    }

    /**
     * @param compra
     * @param produto
     * @param quantidade
     * @param valor
     * @return
     */
    public Itemcompra inserirItem(Compra compra, Produto produto, String quantidade, String valor) {
        try {
            GenericDAO<Itemcompra> itemDAO = new GenericDAO<>();
            Itemcompra itemVO = new Itemcompra();

            itemVO.setCompra(compra);
            itemVO.setProduto(produto);
            try {
                itemVO.setQuantidadeItemCompra(new Integer(quantidade));
            } catch (Exception e) {
                itemVO.setQuantidadeItemCompra(1);
            }
            try {
                itemVO.setValorItemCompra(new BigDecimal(valor));
            } catch (Exception e) {
                itemVO.setValorItemCompra(produto.getVendaProduto().multiply(new BigDecimal(itemVO.getQuantidadeItemCompra())));
            }
            itemVO.setCriacaoItemCompra(new Date());
            itemVO.setAtualizacaoItemCompra(new Date());

            return itemVO;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    /**
     *
     * @param itemVO
     * @param quantidade
     * @param valor
     * @return
     */
    public Boolean alterarItem(Itemcompra itemVO, String quantidade, String valor) {
        try {
            try {
                itemVO.setQuantidadeItemCompra(new Integer(quantidade));
            } catch (Exception e) {
                itemVO.setQuantidadeItemCompra(1);
            }
            try {
                itemVO.setValorItemCompra(new BigDecimal(valor));
            } catch (Exception e) {
                itemVO.setValorItemCompra(itemVO.getProduto().getVendaProduto().multiply(new BigDecimal(itemVO.getQuantidadeItemCompra())));
            }
            itemVO.setAtualizacaoItemCompra(new Date());
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    /**
     * @see Método que verifica se os elementos do JPanel são diferentes de
     * null, usado para verificar se os campos estão preenchidos pelo usuário.
     * @param panel
     * @return false caso pelo menos um componente possuir getText() == null.
     */
    public boolean validarCampos(JPanel panel) {
        Component componentes[] = panel.getComponents();
        boolean erro = true;
        for (Component c : componentes) {
            if (c instanceof JTextField) {
                if (((JTextField) c).isEnabled()) {
                    if (((JTextField) c).getText().trim().equals("")) {
                        ((JTextField) c).setBorder(new LineBorder(Color.RED));
                        erro = false;
                    } else {
                        ((JTextField) c).setBorder(new LineBorder(Color.LIGHT_GRAY));
                    }
                } else {
                    ((JTextField) c).setBorder(new LineBorder(Color.LIGHT_GRAY));
                }
            }
        }
        return erro;
    }
}
