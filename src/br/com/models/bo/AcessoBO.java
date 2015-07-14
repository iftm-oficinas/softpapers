package br.com.models.bo;

import br.com.models.dao.GenericDAO;
import br.com.models.vo.Funcionario;
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
    private Funcionario funcionarioVO;

    //Declaração de variáveis(Data Access Object).
    private GenericDAO<Funcionario> funcionarioDAO;

    /**
     *
     * @see Método que chama uma consulta ao banco de dados atravéz da
     * referência usuarioDAO.
     *
     * @param usuario
     * @param senha
     * @return Usuario caso ele encontre.
     */
    public Funcionario validarAcesso(String usuario, String senha) {
        funcionarioDAO = new GenericDAO();
        funcionarioVO = new Funcionario();
        funcionarioVO = (Funcionario) funcionarioDAO.consultar("usuarioFuncionario", usuario, "senhaFuncionario", senha, funcionarioVO);
        if (funcionarioVO == null) {
            JOptionPane.showMessageDialog(null, "Usuário ou senha invalidos", "Acesso Negado", JOptionPane.ERROR_MESSAGE);
            return null;
        } else {
            return funcionarioVO;
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
                    } else {
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
