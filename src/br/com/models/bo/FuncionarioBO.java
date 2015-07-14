package br.com.models.bo;

import br.com.models.dao.GenericDAO;
import br.com.models.util.HibernateUtil;
import br.com.models.vo.Funcionario;
import java.awt.Color;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import org.hibernate.Session;

/**
 *
 * @see Classe de objetos de negócios. Métodos:
 *
 * @author Bruna Danieli Ribeiro Gonçalves, Márlon Ândrel Coelho Freitas
 */
public class FuncionarioBO {

    //Declaração da sessão de conexão ao banco de dados.
    private final Session session = (Session) HibernateUtil.getSession();

    /**
     *
     * @see Método que inseri um objeto no banco de dados por meio da
     * GenericDAO.
     *
     * @param nome
     * @param cargo
     * @param bairro
     * @param senha
     * @param email
     * @param usuario
     * @param telefone
     * @param cpf
     * @param complemento
     * @param nascimento
     * @param rg
     * @param celular
     * @param endereco
     * @param numero
     * @param cidade
     * @param cep
     * @param estado
     *
     * @return Funcionario inserido.
     */
    public Funcionario inserirFuncionario(String nome, String cargo, String usuario, String senha, String email, String telefone, String celular, String cpf, String rg, String nascimento, String endereco, String cep, String complemento, String numero, String cidade, String bairro, String estado) {
        GenericDAO<Funcionario> funcionarioDAO = new GenericDAO<>();
        Funcionario funcionarioVO = new Funcionario();
        try {
            session.beginTransaction();

            funcionarioVO.setNomeFuncionario(nome);
            funcionarioVO.setCargoFuncionario(cargo);
            funcionarioVO.setUsuarioFuncionario(usuario);
            funcionarioVO.setSenhaFuncionario(senha);
            funcionarioVO.setEmailFuncionario(email);
            funcionarioVO.setTelefoneFuncionario(telefone);
            funcionarioVO.setCelularFuncionario(celular);
            funcionarioVO.setCpfFuncionario(cpf);
            funcionarioVO.setRgFuncionario(rg);
            funcionarioVO.setNascimentoFuncionario(new Date());
            funcionarioVO.setEnderecoFuncionario(endereco);
            funcionarioVO.setCepFuncionario(cep);
            funcionarioVO.setComplementoFuncionario(complemento);
            funcionarioVO.setNumeroFuncionario(numero);
            funcionarioVO.setCidadeFuncionario(cidade);
            funcionarioVO.setBairroFuncionario(bairro);
            funcionarioVO.setEstadoFuncionario(estado);
            funcionarioVO.setCriacaoFuncionario(new Date());
            funcionarioVO.setAtualizacaoFuncionario(new Date());

            funcionarioDAO.inserir(funcionarioVO);
            
            session.getTransaction().commit();
            JOptionPane.showMessageDialog(null, "Funcionário inserido com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            return funcionarioVO;
        } catch (Exception e) {
            session.getTransaction().rollback();
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            return null;
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
