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

/**
 *
 * @see Classe de objetos de negócios. Métodos: validarCampos(),
 * validarAcesso().
 *
 * @author Bruna Danieli Ribeiro Gonçalves, Márlon Ândrel Coelho Freitas
 */
public class AcessoBO {

    //Declaração de variáveis(Value Object).
    private Usuario usuarioVO;

    //Declaração de variáveis(Data Access Object).
    private GenericDAO<Usuario> usuarioDAO;

    /**
     *
     * @see Método que chama uma consulta ao banco de dados atravéz da classe
     * usuarioDAO.
     *
     * @param email
     * @param senha
     * @return Usuario caso ele encontre.
     */
    public Usuario validarAcesso(String email, String senha) {
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
     * @see Método que verifica se os elementos do JPanel são diferentes de
     * null, usado para verificar se os campos estão preenchidos pelo usuário.
     *
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
            if (c instanceof JPasswordField) {
                if (((JPasswordField) c).isEnabled()) {
                    if (((JPasswordField) c).getText().trim().equals("")) {
                        ((JPasswordField) c).setBorder(new LineBorder(Color.RED));
                        erro = false;
                    }  else {
                        ((JPasswordField) c).setBorder(new LineBorder(Color.LIGHT_GRAY));
                    }
                } else {
                    ((JPasswordField) c).setBorder(new LineBorder(Color.LIGHT_GRAY));
                }
            }
        }
        return erro;
    }
}
