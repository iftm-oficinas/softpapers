package br.com.models.bo;

import br.com.models.dao.GenericDAO;
import br.com.models.vo.Compra;
import br.com.models.vo.Produto;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CompraBO {
    
    /**
     * @see Método que realiza consulta ao banco de dados por todo o Inventario.
     * @return Lista de Produtos
     */
    public List<Produto> buscarInventario() {
        GenericDAO<Produto> produtoDAO = new GenericDAO<>();
        ArrayList<Produto> produtosVO = new ArrayList<>(produtoDAO.consultar(new Produto()));
        return produtosVO;
    }
    
    /**
     * @see Método que realiza consulta ao banco de dados por todo o Inventario.
     * @return Lista de Compras
     */
    public List<Compra> buscarCompras() {
        GenericDAO<Compra> compraDAO = new GenericDAO<>();
        ArrayList<Compra> comprasVO = new ArrayList<>(compraDAO.consultar(new Compra()));
        return comprasVO;
    }
    
    /**
     * @see Método que exclui um objeto no banco de dados por meio da
     * GenericDAO.
     * @param idCompra
     * @return true/false.
     */
    public Boolean excluirCompra(Long idCompra) {
        try {
            if (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir esta Compra?", "Alerta", JOptionPane.YES_NO_OPTION) == 0) {
                try {
                    GenericDAO<Compra> compraDAO = new GenericDAO<>();
                    Compra compraVO = compraDAO.consultar("idCompra", idCompra, new Compra());
                    compraDAO.apagar(compraVO);
                    JOptionPane.showMessageDialog(null, "Compra excluida com sucesso.", "Secesso", JOptionPane.INFORMATION_MESSAGE);
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
