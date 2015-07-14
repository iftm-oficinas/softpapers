package br.com.models.bo;

import br.com.models.dao.GenericDAO;
import br.com.models.vo.Contato;
import br.com.models.vo.Endereco;
import br.com.models.vo.Fornecedor;
import br.com.models.vo.Pessoa;
import br.com.models.vo.Pessoafisica;
import br.com.models.vo.Pessoajuridica;
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
 * @see Classe de objetos de negócios. Métodos: inserirFornecedor(),
 * buscarPessoaFisica(), validarCampos().
 *
 * @author Bruna Danieli Ribeiro Gonçalves, Márlon Ândrel Coelho Freitas
 */
public class FornecedorBO {

    /**
     * @see Método que inseri um objeto no banco de dados por meio da
     * GenericDAO.
     * @param fornecedor
     * @param nome
     * @param email
     * @param telefone
     * @param celular
     * @param endereco
     * @param cep
     * @param complemento
     * @param numero
     * @param bairro
     * @param cidade
     * @param estado
     * @param pessoa
     * @param cpfCnpj
     * @param rgRazao
     * @param nascimento
     * @param estadual
     * @param municipal
     * @param suframa
     * @param icms
     * @return true/false
     */
    public Boolean inserirFornecedor(String fornecedor, String nome, String email, String telefone, String celular, String endereco, String cep, String complemento, String numero, String bairro, String cidade, String estado, Boolean pessoa, String cpfCnpj, String rgRazao, String nascimento, String estadual, String municipal, String suframa, Boolean icms) {
        try {
            GenericDAO<Fornecedor> fornecedorDAO = new GenericDAO<>();
            Fornecedor fornecedorVO = new Fornecedor();
            fornecedorVO.setNomeFornecedor(fornecedor);
            fornecedorVO.setCriacaoFornecedor(new Date());
            fornecedorVO.setAtualizacaoFornecedor(new Date());

            if (pessoa) {
                GenericDAO<Pessoa> pessoaDAO = new GenericDAO<>();
                Pessoa pessoaVO = new Pessoa();
                pessoaVO.setTipoPessoa("Fisica");
                if (pessoaDAO.inserir(pessoaVO)) {
                    fornecedorVO.setPessoa(pessoaDAO.consultar("idPessoa", pessoaVO.getIdPessoa(), pessoaVO));
                }
                Pessoafisica pessoaFisicaVO = new Pessoafisica();
                GenericDAO<Pessoafisica> pessoaFisicaDAO = new GenericDAO<>();
                pessoaFisicaVO.setCpfPessoaFisica(cpfCnpj);
                pessoaFisicaVO.setRgPessoaFisica(rgRazao);
                pessoaFisicaVO.setNascimentoPessoaFisica(new SimpleDateFormat("yyyy/MM/dd").parse(nascimento));
                pessoaFisicaVO.setPessoa(pessoaDAO.consultar("idPessoa", pessoaVO.getIdPessoa(), pessoaVO));
                pessoaFisicaDAO.inserir(pessoaFisicaVO);
            } else {
                GenericDAO<Pessoa> pessoaDAO = new GenericDAO<>();
                Pessoa pessoaVO = new Pessoa();
                pessoaVO.setTipoPessoa("Juridica");
                if (pessoaDAO.inserir(pessoaVO)) {
                    fornecedorVO.setPessoa(pessoaDAO.consultar("idPessoa", pessoaVO.getIdPessoa(), pessoaVO));
                }
                Pessoajuridica pessoaJuridicaVO = new Pessoajuridica();
                GenericDAO<Pessoajuridica> pessoaJuridicaDAO = new GenericDAO<>();
                pessoaJuridicaVO.setCnpjPessoaJuridica(cpfCnpj);
                pessoaJuridicaVO.setRazaoSocialPessoaJuridica(rgRazao);
                pessoaJuridicaVO.setFundacaoPessoaJuridica(new SimpleDateFormat("yyyy/MM/dd").parse(nascimento));
                pessoaJuridicaVO.setEstadualPessoaJuridica(estadual);
                pessoaJuridicaVO.setMunicipalPessoaJuridica(municipal);
                pessoaJuridicaVO.setSuframaPessoaJuridica(suframa);
                pessoaJuridicaVO.setIcmsPessoaJuridica(icms);
                pessoaJuridicaVO.setPessoa(pessoaDAO.consultar("idPessoa", pessoaVO.getIdPessoa(), pessoaVO));
                pessoaJuridicaDAO.inserir(pessoaJuridicaVO);
            }

            GenericDAO<Contato> contatoDAO = new GenericDAO<>();
            Contato contatoVO = new Contato();
            contatoVO.setNomeContato(nome);
            contatoVO.setEmailContato(email);
            contatoVO.setTelefoneContato(telefone);
            contatoVO.setCelularContato(celular);
            if (contatoDAO.inserir(contatoVO)) {
                fornecedorVO.setContato(contatoDAO.consultar("idContato", contatoVO.getIdContato(), contatoVO));
            }

            GenericDAO<Endereco> enderecoDAO = new GenericDAO<>();
            Endereco enderecoVO = new Endereco();
            enderecoVO.setEnderecoEndereco(endereco);
            enderecoVO.setCepEndereco(cep);
            enderecoVO.setComplementoEndereco(complemento);
            enderecoVO.setNumeroEndereco(numero);
            enderecoVO.setCidadeEndereco(cidade);
            enderecoVO.setBairroEndereco(bairro);
            enderecoVO.setEstadoEndereco(estado);
            if (enderecoDAO.inserir(enderecoVO)) {
                fornecedorVO.setEndereco(enderecoDAO.consultar("idEndereco", enderecoVO.getIdEndereco(), enderecoVO));
            }

            if (fornecedorDAO.inserir(fornecedorVO)) {
                JOptionPane.showMessageDialog(null, "Fornecedor inserido com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                return true;
            } else {
                return false;
            }
        } catch (ParseException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public Boolean alterarFornecedor(Long idFornecedor, String fornecedor, String nome, String email, String telefone, String celular, String endereco, String cep, String complemento, String numero, String bairro, String cidade, String estado, Boolean pessoa, String cpfCnpj, String rgRazao, String nascimento, String estadual, String municipal, String suframa, Boolean icms) {
        try {
            GenericDAO<Fornecedor> fornecedorDAO = new GenericDAO<>();
            Fornecedor fornecedorVO = fornecedorDAO.consultar("idFornecedor", idFornecedor, new Fornecedor());
            fornecedorVO.setNomeFornecedor(fornecedor);
            fornecedorVO.setAtualizacaoFornecedor(new Date());

            if (pessoa) {
                GenericDAO<Pessoafisica> pessoaFisicaDAO = new GenericDAO<>();
                Pessoafisica pessoaFisicaVO = buscarPessoaFisica(fornecedorVO.getPessoa().getIdPessoa());
                pessoaFisicaVO.setCpfPessoaFisica(cpfCnpj);
                pessoaFisicaVO.setRgPessoaFisica(rgRazao);
                pessoaFisicaVO.setNascimentoPessoaFisica(new SimpleDateFormat("yyyy/MM/dd").parse(nascimento));
                pessoaFisicaDAO.atualizar(pessoaFisicaVO);
            } else {
                GenericDAO<Pessoajuridica> pessoaJuridicaDAO = new GenericDAO<>();
                Pessoajuridica pessoaJuridicaVO = buscarPessoaJuridica(fornecedorVO.getPessoa().getIdPessoa());
                pessoaJuridicaVO.setCnpjPessoaJuridica(cpfCnpj);
                pessoaJuridicaVO.setRazaoSocialPessoaJuridica(rgRazao);
                pessoaJuridicaVO.setFundacaoPessoaJuridica(new SimpleDateFormat("yyyy/MM/dd").parse(nascimento));
                pessoaJuridicaVO.setEstadualPessoaJuridica(estadual);
                pessoaJuridicaVO.setMunicipalPessoaJuridica(municipal);
                pessoaJuridicaVO.setSuframaPessoaJuridica(suframa);
                pessoaJuridicaVO.setIcmsPessoaJuridica(icms);
                pessoaJuridicaDAO.atualizar(pessoaJuridicaVO);
            }

            GenericDAO<Contato> contatoDAO = new GenericDAO<>();
            Contato contatoVO = contatoDAO.consultar("idContato", fornecedorVO.getContato().getIdContato(), new Contato());
            contatoVO.setNomeContato(nome);
            contatoVO.setEmailContato(email);
            contatoVO.setTelefoneContato(telefone);
            contatoVO.setCelularContato(celular);
            if (contatoDAO.atualizar(contatoVO)) {
                fornecedorVO.setContato(contatoDAO.consultar("idContato", contatoVO.getIdContato(), contatoVO));
            }

            GenericDAO<Endereco> enderecoDAO = new GenericDAO<>();
            Endereco enderecoVO = enderecoDAO.consultar("idEndereco", fornecedorVO.getEndereco().getIdEndereco(), new Endereco());
            enderecoVO.setEnderecoEndereco(endereco);
            enderecoVO.setCepEndereco(cep);
            enderecoVO.setComplementoEndereco(complemento);
            enderecoVO.setNumeroEndereco(numero);
            enderecoVO.setCidadeEndereco(cidade);
            enderecoVO.setBairroEndereco(bairro);
            enderecoVO.setEstadoEndereco(estado);
            if (enderecoDAO.atualizar(enderecoVO)) {
                fornecedorVO.setEndereco(enderecoDAO.consultar("idEndereco", enderecoVO.getIdEndereco(), enderecoVO));
            }

            if (fornecedorDAO.atualizar(fornecedorVO)) {
                JOptionPane.showMessageDialog(null, "Fornecedor inserido com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                return true;
            } else {
                return false;
            }
        } catch (ParseException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e, "Error", JOptionPane.ERROR_MESSAGE);
            return false;
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
     * @see Método que retorna PessoaJuridica que possua o atributo Pessoa
     * passado como parâmetro.
     * @param idPessoa
     * @return Pessoafisica/null.
     */
    public Pessoajuridica buscarPessoaJuridica(Long idPessoa) {
        GenericDAO<Pessoajuridica> pessoaJuridicaDAO = new GenericDAO<>();
        List<Pessoajuridica> pessoaJuridicaVO = pessoaJuridicaDAO.consultar(new Pessoajuridica());
        for (Pessoajuridica pessoaJuridicaVO1 : pessoaJuridicaVO) {
            if (Objects.equals(pessoaJuridicaVO1.getPessoa().getIdPessoa(), idPessoa)) {
                return pessoaJuridicaVO1;
            }
        }
        return null;
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
