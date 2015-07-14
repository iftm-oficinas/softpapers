package br.com.models.bo;

import br.com.models.dao.GenericDAO;
import br.com.models.vo.Contato;
import br.com.models.vo.Endereco;
import br.com.models.vo.Funcionario;
import br.com.models.vo.Pessoa;
import br.com.models.vo.Pessoafisica;
import java.awt.Color;
import java.awt.Component;
import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @see Classe de objetos de negócios. Métodos: inserirFuncionario(),
 * validarCampos().
 *
 * @author Bruna Danieli Ribeiro Gonçalves, Márlon Ândrel Coelho Freitas
 */
public class FuncionarioBO {

    /**
     * @see Método que inseri um objeto no banco de dados por meio da
     * GenericDAO.
     * @param funcionario
     * @param nome
     * @param email
     * @param telefone
     * @param celular
     * @param cargo
     * @param usuario
     * @param senha
     * @param cpf
     * @param rg
     * @param nascimento
     * @param endereco
     * @param cep
     * @param complemento
     * @param numero
     * @param bairro
     * @param cidade
     * @param estado
     * @return true/false.
     */
    public Boolean inserirFuncionario(String funcionario, String nome, String email, String telefone, String celular, String cargo, String usuario, String senha, String cpf, String rg, String nascimento, String endereco, String cep, String complemento, String numero, String bairro, String cidade, String estado) {
        try {
            GenericDAO<Funcionario> funcionarioDAO = new GenericDAO<>();
            GenericDAO<Pessoa> pessoaDAO = new GenericDAO<>();
            GenericDAO<Contato> contatoDAO = new GenericDAO<>();
            GenericDAO<Endereco> enderecoDAO = new GenericDAO<>();
            GenericDAO<Pessoafisica> pessoaFisicaDAO = new GenericDAO<>();
            Funcionario funcionarioVO = new Funcionario();
            Pessoa pessoaVO = new Pessoa();
            Contato contatoVO = new Contato();
            Endereco enderecoVO = new Endereco();
            Pessoafisica pessoaFisicaVO = new Pessoafisica();

            funcionarioVO.setNomeFuncionario(funcionario);
            funcionarioVO.setCargoFuncionario(cargo);
            funcionarioVO.setUsuarioFuncionario(usuario);
            funcionarioVO.setSenhaFuncionario(senha);
            funcionarioVO.setCriacaoFuncionario(new Date());
            funcionarioVO.setAtualizacaoFuncionario(new Date());

            pessoaVO.setTipoPessoa("Fisica");
            if (pessoaDAO.inserir(pessoaVO)) {
                funcionarioVO.setPessoa(pessoaDAO.consultar("idPessoa", pessoaVO.getIdPessoa(), pessoaVO));
            }

            pessoaFisicaVO.setCpfPessoaFisica(cpf);
            pessoaFisicaVO.setRgPessoaFisica(rg);
            pessoaFisicaVO.setNascimentoPessoaFisica(new SimpleDateFormat("yyyy/MM/dd").parse(nascimento));
            pessoaFisicaVO.setPessoa(pessoaDAO.consultar("idPessoa", pessoaVO.getIdPessoa(), pessoaVO));
            pessoaFisicaDAO.inserir(pessoaFisicaVO);

            contatoVO.setNomeContato(nome);
            contatoVO.setEmailContato(email);
            contatoVO.setTelefoneContato(telefone);
            contatoVO.setCelularContato(celular);
            if (contatoDAO.inserir(contatoVO)) {
                funcionarioVO.setContato(contatoDAO.consultar("idContato", contatoVO.getIdContato(), contatoVO));
            }

            enderecoVO.setEnderecoEndereco(endereco);
            enderecoVO.setCepEndereco(cep);
            enderecoVO.setComplementoEndereco(complemento);
            enderecoVO.setNumeroEndereco(numero);
            enderecoVO.setCidadeEndereco(cidade);
            enderecoVO.setBairroEndereco(bairro);
            enderecoVO.setEstadoEndereco(estado);
            if (enderecoDAO.inserir(enderecoVO)) {
                funcionarioVO.setEndereco(enderecoDAO.consultar("idEndereco", enderecoVO.getIdEndereco(), enderecoVO));
            }

            if (funcionarioDAO.inserir(funcionarioVO)) {
                JOptionPane.showMessageDialog(null, "Funcionário inserido com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                return true;
            } else {
                return false;
            }
        } catch (ParseException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    /**
     * @see Método que inseri um objeto no banco de dados por meio da
     * GenericDAO.
     * @param idFuncionario
     * @param idContato
     * @param idEndereco
     * @param idPessoa
     * @param funcionario
     * @param nome
     * @param email
     * @param telefone
     * @param celular
     * @param cargo
     * @param usuario
     * @param senha
     * @param cpf
     * @param rg
     * @param nascimento
     * @param endereco
     * @param cep
     * @param complemento
     * @param numero
     * @param bairro
     * @param cidade
     * @param estado
     * @return true/false.
     */
    public Boolean alterarFuncionario(Long idFuncionario, Long idPessoa, Long idContato, Long idEndereco, String funcionario, String nome, String email, String telefone, String celular, String cargo, String usuario, String senha, String cpf, String rg, String nascimento, String endereco, String cep, String complemento, String numero, String bairro, String cidade, String estado) {
        try {
            GenericDAO<Funcionario> funcionarioDAO = new GenericDAO<>();
            GenericDAO<Contato> contatoDAO = new GenericDAO<>();
            GenericDAO<Endereco> enderecoDAO = new GenericDAO<>();
            GenericDAO<Pessoafisica> pessoaFisicaDAO = new GenericDAO<>();
            Funcionario funcionarioVO = new Funcionario();
            Contato contatoVO = new Contato();
            Endereco enderecoVO = new Endereco();

            Pessoafisica pessoaFisicaVO = buscarPessoaFisica(idPessoa);
            pessoaFisicaVO.setCpfPessoaFisica(cpf);
            pessoaFisicaVO.setRgPessoaFisica(rg);
            pessoaFisicaVO.setNascimentoPessoaFisica(new SimpleDateFormat("dd/MM/yyyy").parse(nascimento));
            pessoaFisicaDAO.atualizar(pessoaFisicaVO);

            funcionarioVO = funcionarioDAO.consultar("idFuncionario", idFuncionario, funcionarioVO);
            funcionarioVO.setNomeFuncionario(funcionario);
            funcionarioVO.setCargoFuncionario(cargo);
            funcionarioVO.setUsuarioFuncionario(usuario);
            funcionarioVO.setSenhaFuncionario(senha);
            funcionarioVO.setAtualizacaoFuncionario(new Date());

            contatoVO = contatoDAO.consultar("idContato", idContato, contatoVO);
            contatoVO.setNomeContato(nome);
            contatoVO.setEmailContato(email);
            contatoVO.setTelefoneContato(telefone);
            contatoVO.setCelularContato(celular);
            if (contatoDAO.atualizar(contatoVO)) {
                funcionarioVO.setContato(contatoVO);
            }

            enderecoVO = enderecoDAO.consultar("idEndereco", idEndereco, enderecoVO);
            enderecoVO.setEnderecoEndereco(endereco);
            enderecoVO.setCepEndereco(cep);
            enderecoVO.setComplementoEndereco(complemento);
            enderecoVO.setNumeroEndereco(numero);
            enderecoVO.setCidadeEndereco(cidade);
            enderecoVO.setBairroEndereco(bairro);
            enderecoVO.setEstadoEndereco(estado);
            if (enderecoDAO.atualizar(enderecoVO)) {
                funcionarioVO.setEndereco(enderecoVO);
            }

            if (funcionarioDAO.atualizar(funcionarioVO)) {
                JOptionPane.showMessageDialog(null, "Funcionário alterado com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                return true;
            } else {
                return false;
            }
        } catch (ParseException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    /**
     * @see Método que retorna PessoaFisica que possua o atributo Pessoa passado
     * como parâmetro.
     * @param idPessoa
     * @return Pessoafisica/null.
     */
    public Pessoafisica buscarPessoaFisica(Long idPessoa) {
        GenericDAO<Pessoafisica> pessoaFisicaDAO = new GenericDAO<>();
        List<Pessoafisica> pessoaFisicaVO = pessoaFisicaDAO.consultar(new Pessoafisica());
        for (Pessoafisica pessoaFisicaVO1 : pessoaFisicaVO) {
            if (Objects.equals(pessoaFisicaVO1.getPessoa().getIdPessoa(), idPessoa)) {
                return pessoaFisicaVO1;
            }
        }
        return null;
    }

    /**
     *
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
