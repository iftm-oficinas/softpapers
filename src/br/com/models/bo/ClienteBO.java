package br.com.models.bo;

import br.com.models.dao.GenericDAO;
import br.com.models.vo.Cliente;
import java.awt.Color;
import java.awt.Component;
import java.awt.HeadlessException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @see Classe de objetos de negócios. Métodos: inserirCliente(),
 * validarCampos().
 *
 * @author Bruna Danieli Ribeiro Gonçalves, Márlon Ândrel Coelho Freitas
 */
public class ClienteBO {

    /**
     *
     * @see Método que inseri um objeto no banco de dados por meio da
     * GenericDAO.
     *
     * @param nome
     * @param email
     * @param telefone
     * @param celular
     * @param salario
     * @param limite
     * @param desconto
     * @param endereco
     * @param cep
     * @param complemento
     * @param numero
     * @param cidade
     * @param bairro
     * @param estado
     * @param pessoa
     * @param cpf
     * @param rg
     * @param nascimento
     * @param estadual
     * @param municipal
     * @param suframa
     * @param icms
     * @param publicidade
     *
     * @return Cliente inserido.
     */
    public Cliente inserirCliente(String nome, String email, String telefone, String celular, String salario, String limite, String desconto, String endereco, String cep, String complemento, String numero, String cidade, String bairro, String estado, String pessoa, String cpf, String rg, String nascimento, String estadual, String municipal, String suframa, String icms, Boolean publicidade) {
        try {
            GenericDAO<Cliente> clienteDAO = new GenericDAO<>();
            Cliente clienteVO = new Cliente();

            clienteVO.setNomeCliente(nome);
            clienteVO.setEmailCliente(email);
            clienteVO.setTelefoneCliente(telefone);
            clienteVO.setCelularCliente(celular);
            clienteVO.setSalarioCliente(new BigDecimal(salario));
            clienteVO.setLimiteCliente(new BigDecimal(limite));
            clienteVO.setDescontoCliente(new BigDecimal(desconto));
            clienteVO.setEnderecoCliente(endereco);
            clienteVO.setCepCliente(cep);
            clienteVO.setComplementoCliente(complemento);
            clienteVO.setNumeroCliente(numero);
            clienteVO.setCidadeCliente(cidade);
            clienteVO.setBairroCliente(bairro);
            clienteVO.setEstadoCliente(estado);
            clienteVO.setPessoaCliente(pessoa);
            clienteVO.setCpfCnpjCliente(cpf);
            clienteVO.setRgRazaoCliente(rg);
            clienteVO.setNascimentoCliente(new SimpleDateFormat("dd/MM/yyyy").parse(nascimento));
            clienteVO.setEstadualCliente(estadual);
            clienteVO.setMunicipalCliente(municipal);
            clienteVO.setSuframaCliente(suframa);
            clienteVO.setIcmsCliente(icms);
            clienteVO.setPublicidadeCliente(publicidade);
            clienteVO.setCriacaoCliente(new Date());
            clienteVO.setAtualizacaoCliente(new Date());

            clienteVO = clienteDAO.inserir(clienteVO);

            if (clienteVO != null) {
                JOptionPane.showMessageDialog(null, "Funcionário inserido com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                return clienteVO;
            } else {
                return null;
            }
        } catch (ParseException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    /**
     *
     * @see Método que inseri um objeto no banco de dados por meio da
     * GenericDAO.
     *
     * @param idCliente
     * @param nome
     * @param email
     * @param telefone
     * @param celular
     * @param salario
     * @param limite
     * @param desconto
     * @param endereco
     * @param cep
     * @param complemento
     * @param numero
     * @param cidade
     * @param bairro
     * @param estado
     * @param pessoa
     * @param cpf
     * @param rg
     * @param nascimento
     * @param estadual
     * @param municipal
     * @param suframa
     * @param icms
     * @param publicidade
     *
     * @return Cliente inserido.
     */
    public Cliente alterarCliente(Long idCliente, String nome, String email, String telefone, String celular, String salario, String limite, String desconto, String endereco, String cep, String complemento, String numero, String cidade, String bairro, String estado, String pessoa, String cpf, String rg, String nascimento, String estadual, String municipal, String suframa, String icms, Boolean publicidade) {
        try {
            GenericDAO<Cliente> clienteDAO = new GenericDAO<>();
            Cliente clienteVO = new Cliente();

            clienteVO = clienteDAO.consultar("idCliente", idCliente, clienteVO);

            clienteVO.setNomeCliente(nome);
            clienteVO.setEmailCliente(email);
            clienteVO.setTelefoneCliente(telefone);
            clienteVO.setCelularCliente(celular);
            clienteVO.setSalarioCliente(new BigDecimal(salario));
            clienteVO.setLimiteCliente(new BigDecimal(limite));
            clienteVO.setDescontoCliente(new BigDecimal(desconto));
            clienteVO.setEnderecoCliente(endereco);
            clienteVO.setCepCliente(cep);
            clienteVO.setComplementoCliente(complemento);
            clienteVO.setNumeroCliente(numero);
            clienteVO.setCidadeCliente(cidade);
            clienteVO.setBairroCliente(bairro);
            clienteVO.setEstadoCliente(estado);
            clienteVO.setPessoaCliente(pessoa);
            clienteVO.setCpfCnpjCliente(cpf);
            clienteVO.setRgRazaoCliente(rg);
            clienteVO.setNascimentoCliente(new SimpleDateFormat("dd/MM/yyyy").parse(nascimento));
            clienteVO.setEstadualCliente(estadual);
            clienteVO.setMunicipalCliente(municipal);
            clienteVO.setSuframaCliente(suframa);
            clienteVO.setIcmsCliente(icms);
            clienteVO.setPublicidadeCliente(publicidade);
            clienteVO.setCriacaoCliente(new Date());
            clienteVO.setAtualizacaoCliente(new Date());

            clienteVO = clienteDAO.atualizar(clienteVO);

            if (clienteVO != null) {
                JOptionPane.showMessageDialog(null, "Funcionário inserido com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                return clienteVO;
            } else {
                return null;
            }
        } catch (ParseException | HeadlessException e) {
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
     *
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
