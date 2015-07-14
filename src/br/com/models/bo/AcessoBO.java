package br.com.models.bo;

import br.com.models.dao.GenericDAO;
import br.com.models.vo.Usuario;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class AcessoBO {

    private Usuario usuarioVO;
    private GenericDAO<Usuario> usuarioDAO;

    /**
     *
     * @see Método que chama uma consulta ao banco de dados atravéz da classe
     * usuarioDAO.
     *
     * @param email
     * @param senha
     * @return
     */
    public Usuario verificarUsuario(String email, String senha) {
        usuarioDAO = new GenericDAO();
        usuarioVO = new Usuario();
        usuarioVO = (Usuario) usuarioDAO.consultar("emailUsuario", email, "senhaUsuario", senha, usuarioVO);
        if (usuarioVO == null) {
            JOptionPane.showMessageDialog(null, "Email ou senha invalidos", "Acesso Negado", JOptionPane.ERROR_MESSAGE);
            return null;
        } else {
            return usuarioVO;
        }
    }

    /**
     *
     * @see Método que verifica se os elentos do JPanel são diferentes de null,
     * usado para verificar se os campos estão preenchidos.
     *
     * @param panel
     * @return
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
                    }
                } else {
                    ((JTextField) c).setBorder(new LineBorder(Color.LIGHT_GRAY));
                }
            }
            if (c instanceof JPasswordField) {
                if (((JPasswordField) c).isEnabled()) {
                    if (((JPasswordField) c).getText().trim().equals("")) {
                        ((JPasswordField) c).setBorder(new LineBorder(Color.RED));
                        erro = false;
                    }
                } else {
                    ((JPasswordField) c).setBorder(new LineBorder(Color.LIGHT_GRAY));
                }
            }
        }
        return erro;
    }
}
