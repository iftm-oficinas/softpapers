package br.com.models.bo;

import br.com.models.dao.GenericDAO;
import br.com.models.vo.Categoria;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @see Classe de objetos de negócios. Métodos: inserirCategoria(),
 * validarCampos().
 *
 * @author Bruna Danieli Ribeiro Gonçalves, Márlon Ândrel Coelho Freitas
 */
public class CategoriaBO {

    /**
     *
     * @see Método que persiste um objeto no banco de dados por meio da
     * GenericDAO.
     * @param descricao
     * @return true/false.
     */
    public Boolean inserirCategoria(String descricao) {
        try {
            GenericDAO<Categoria> categoriaDAO = new GenericDAO();
            Categoria categoriaVO = new Categoria();
            categoriaVO.setDescricaoCategoria(descricao);
            categoriaVO.setCriacaoCategoria(new Date());
            categoriaVO.setAtualizacaoCategoria(new Date());
            if (categoriaDAO.inserir(categoriaVO)) {
                JOptionPane.showMessageDialog(null, "Categoria inserida com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            }
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    /**
     * @see Método que persiste um objeto no banco de dados por meio da
     * GenericDAO.
     * @param idCategoria
     * @param descricao
     * @return true/false.
     */
    public Boolean alterarCategoria(Long idCategoria, String descricao) {
        try {
            GenericDAO<Categoria> categoriaDAO = new GenericDAO();
            Categoria categoriaVO = categoriaDAO.consultar("idCategoria", idCategoria, new Categoria());
            categoriaVO.setDescricaoCategoria(descricao);
            categoriaVO.setAtualizacaoCategoria(new Date());
            if (categoriaDAO.atualizar(categoriaVO)) {
                JOptionPane.showMessageDialog(null, "Categoria alterada com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            }
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
