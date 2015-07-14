package br.com.resources.views;

import br.com.models.bo.FuncionarioBO;
import br.com.models.vo.Funcionario;
import br.com.models.vo.Pessoafisica;
import java.awt.Cursor;
import java.text.SimpleDateFormat;

/**
 *
 * @see Classe visual. JDialog que tem como objetivo cadastrar um novo usuário.
 *
 * @author Bruna Danieli Ribeiro Gonçalves, Márlon Ândrel Coelho Freitas
 */
public class ViewFuncionario extends javax.swing.JDialog {

    /**
     * @see Construtor padrão.
     *
     * @param parent
     * @param modal
     * @param viewPainelControle
     */
    public ViewFuncionario(java.awt.Frame parent, boolean modal, ViewPainelControle viewPainelControle) {
        //Inicialização dos componentes padrões do JDialog.
        super(parent, modal);
        initComponents();
        this.viewPainelControle = viewPainelControle;
        btnAlterar.setVisible(false);
    }

    /**
     * @see Construtor usado para visualizar ou alterar um Funcionario.
     * @param parent
     * @param modal
     * @param viewPainelControle
     * @param funcionario
     * @param alterar
     */
    public ViewFuncionario(java.awt.Frame parent, boolean modal, ViewPainelControle viewPainelControle, Funcionario funcionario, Boolean alterar) {
        //Inicialização dos componentes padrões do JDialog.
        super(parent, modal);
        initComponents();
        this.viewPainelControle = viewPainelControle;
        this.funcionarioVO = funcionario;
        this.funcionarioBO = new FuncionarioBO();
        this.pessoaFisicaVO = funcionarioBO.buscarPessoaFisica(funcionarioVO.getPessoa().getIdPessoa());
        btnCadastrar.setVisible(false);
        lbTitulo.setText("Alterar Funcionário");

        //Definindo os atributos.
        tfNomeFuncionario.setText(funcionario.getNomeFuncionario());
        tfNomeContato.setText(funcionario.getContato().getNomeContato());
        tfEmail.setText(funcionario.getContato().getEmailContato());
        tfTelefone.setText(funcionario.getContato().getTelefoneContato());
        tfCelular.setText(funcionario.getContato().getCelularContato());
        tfCargo.setText(funcionario.getCargoFuncionario());
        tfUsuario.setText(funcionario.getUsuarioFuncionario());
        tfSenha.setText(funcionario.getSenhaFuncionario());
        tfCpf.setText(pessoaFisicaVO.getCpfPessoaFisica());
        tfRg.setText(pessoaFisicaVO.getRgPessoaFisica());
        tfNascimento.setText(new SimpleDateFormat("dd/MM/yyyy").format(pessoaFisicaVO.getNascimentoPessoaFisica()));
        tfEndereco.setText(funcionario.getEndereco().getEnderecoEndereco());
        tfCep.setText(funcionario.getEndereco().getCepEndereco());
        tfComplemento.setText(funcionario.getEndereco().getComplementoEndereco());
        tfNumero.setText(funcionario.getEndereco().getNumeroEndereco());
        tfBairro.setText(funcionario.getEndereco().getBairroEndereco());
        tfCidade.setText(funcionario.getEndereco().getCidadeEndereco());
        tfEstado.setText(funcionario.getEndereco().getEstadoEndereco());
        if (!alterar) {
            lbTitulo.setText("Funcionário");
            btnAlterar.setVisible(false);
            tfNomeFuncionario.setEditable(false);
            tfNomeContato.setEditable(false);
            tfEmail.setEditable(false);
            tfTelefone.setEditable(false);
            tfCelular.setEditable(false);
            tfCargo.setEditable(false);
            tfUsuario.setEditable(false);
            tfSenha.setEditable(false);
            tfCpf.setEditable(false);
            tfRg.setEditable(false);
            tfNascimento.setEditable(false);
            tfEndereco.setEditable(false);
            tfCep.setEditable(false);
            tfComplemento.setEditable(false);
            tfNumero.setEditable(false);
            tfBairro.setEditable(false);
            tfCidade.setEditable(false);
            tfEstado.setEditable(false);
        }
    }

    //Componentes padrões do JFrame.
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnTitulo = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        pnCorpo = new javax.swing.JPanel();
        pnObrigatorio = new javax.swing.JPanel();
        lbNomeFuncionario = new javax.swing.JLabel();
        tfNomeFuncionario = new javax.swing.JFormattedTextField();
        lbContato = new javax.swing.JLabel();
        lbOpcional1 = new javax.swing.JLabel();
        pnContato = new javax.swing.JPanel();
        lbNomeContato = new javax.swing.JLabel();
        tfNomeContato = new javax.swing.JFormattedTextField();
        lbEmail = new javax.swing.JLabel();
        tfEmail = new javax.swing.JFormattedTextField();
        lbTelefone = new javax.swing.JLabel();
        tfTelefone = new javax.swing.JFormattedTextField();
        lbCelular = new javax.swing.JLabel();
        tfCelular = new javax.swing.JFormattedTextField();
        lbEndereco = new javax.swing.JLabel();
        lbOpcional2 = new javax.swing.JLabel();
        pnEndereco = new javax.swing.JPanel();
        lbEndereco2 = new javax.swing.JLabel();
        tfEndereco = new javax.swing.JFormattedTextField();
        lbCep = new javax.swing.JLabel();
        tfCep = new javax.swing.JFormattedTextField();
        lbComplemento = new javax.swing.JLabel();
        tfComplemento = new javax.swing.JFormattedTextField();
        lbBairro = new javax.swing.JLabel();
        tfBairro = new javax.swing.JFormattedTextField();
        lbNumero = new javax.swing.JLabel();
        tfNumero = new javax.swing.JFormattedTextField();
        lbCidade = new javax.swing.JLabel();
        tfCidade = new javax.swing.JFormattedTextField();
        lbEstado = new javax.swing.JLabel();
        tfEstado = new javax.swing.JFormattedTextField();
        sprDireita = new javax.swing.JSeparator();
        lbFuncionario = new javax.swing.JLabel();
        lbOpcional3 = new javax.swing.JLabel();
        pnFuncionario = new javax.swing.JPanel();
        lbCargo = new javax.swing.JLabel();
        tfCargo = new javax.swing.JFormattedTextField();
        lbUsuario = new javax.swing.JLabel();
        tfUsuario = new javax.swing.JFormattedTextField();
        lbSenha = new javax.swing.JLabel();
        tfSenha = new javax.swing.JFormattedTextField();
        lbPessoa = new javax.swing.JLabel();
        lbOpcional4 = new javax.swing.JLabel();
        pnPessoa = new javax.swing.JPanel();
        lbRg = new javax.swing.JLabel();
        tfRg = new javax.swing.JFormattedTextField();
        lbCpf = new javax.swing.JLabel();
        tfCpf = new javax.swing.JFormattedTextField();
        lbNascimento = new javax.swing.JLabel();
        tfNascimento = new javax.swing.JFormattedTextField();
        sprRodape = new javax.swing.JSeparator();
        btnCadastrar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Funcionário");
        setResizable(false);

        pnTitulo.setBackground(new java.awt.Color(51, 51, 51));

        lbTitulo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo.setText("Novo Funcionário");

        javax.swing.GroupLayout pnTituloLayout = new javax.swing.GroupLayout(pnTitulo);
        pnTitulo.setLayout(pnTituloLayout);
        pnTituloLayout.setHorizontalGroup(
            pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnTituloLayout.setVerticalGroup(
            pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnCorpo.setBackground(new java.awt.Color(255, 255, 255));

        pnObrigatorio.setBackground(new java.awt.Color(255, 255, 255));

        lbNomeFuncionario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbNomeFuncionario.setForeground(new java.awt.Color(102, 102, 102));
        lbNomeFuncionario.setText("Nome do Funcionario");

        tfNomeFuncionario.setForeground(new java.awt.Color(102, 102, 102));
        try {
            tfNomeFuncionario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("**************************************************")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfNomeFuncionario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfNomeFuncionario.setNextFocusableComponent(tfNomeContato);

        javax.swing.GroupLayout pnObrigatorioLayout = new javax.swing.GroupLayout(pnObrigatorio);
        pnObrigatorio.setLayout(pnObrigatorioLayout);
        pnObrigatorioLayout.setHorizontalGroup(
            pnObrigatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnObrigatorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnObrigatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnObrigatorioLayout.createSequentialGroup()
                        .addComponent(lbNomeFuncionario)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnObrigatorioLayout.createSequentialGroup()
                        .addComponent(tfNomeFuncionario)
                        .addContainerGap())))
        );
        pnObrigatorioLayout.setVerticalGroup(
            pnObrigatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnObrigatorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNomeFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lbContato.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbContato.setForeground(new java.awt.Color(0, 102, 205));
        lbContato.setText("contato");

        lbOpcional1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbOpcional1.setForeground(new java.awt.Color(102, 102, 102));
        lbOpcional1.setText("(Opcional)");

        pnContato.setBackground(new java.awt.Color(255, 255, 255));

        lbNomeContato.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbNomeContato.setForeground(new java.awt.Color(102, 102, 102));
        lbNomeContato.setText("Nome do Contato");

        tfNomeContato.setForeground(new java.awt.Color(102, 102, 102));
        try {
            tfNomeContato.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("**************************************************")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfNomeContato.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lbEmail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbEmail.setForeground(new java.awt.Color(102, 102, 102));
        lbEmail.setText("E-mail");

        tfEmail.setForeground(new java.awt.Color(102, 102, 102));
        try {
            tfEmail.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("******************************")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfEmail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lbTelefone.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbTelefone.setForeground(new java.awt.Color(102, 102, 102));
        lbTelefone.setText("Telefone");

        tfTelefone.setForeground(new java.awt.Color(102, 102, 102));
        try {
            tfTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfTelefone.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lbCelular.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbCelular.setForeground(new java.awt.Color(102, 102, 102));
        lbCelular.setText("Celular");

        tfCelular.setForeground(new java.awt.Color(102, 102, 102));
        try {
            tfCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfCelular.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout pnContatoLayout = new javax.swing.GroupLayout(pnContato);
        pnContato.setLayout(pnContatoLayout);
        pnContatoLayout.setHorizontalGroup(
            pnContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContatoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNomeContato)
                    .addGroup(pnContatoLayout.createSequentialGroup()
                        .addGroup(pnContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(pnContatoLayout.createSequentialGroup()
                                .addComponent(lbNomeContato)
                                .addGap(459, 459, 459))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnContatoLayout.createSequentialGroup()
                                .addGroup(pnContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbEmail)
                                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnContatoLayout.createSequentialGroup()
                                        .addComponent(lbTelefone)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbCelular)
                                        .addGap(59, 59, 59))
                                    .addGroup(pnContatoLayout.createSequentialGroup()
                                        .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfCelular)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnContatoLayout.setVerticalGroup(
            pnContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContatoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNomeContato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNomeContato, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmail)
                    .addComponent(lbTelefone)
                    .addComponent(lbCelular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnContatoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        lbEndereco.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbEndereco.setForeground(new java.awt.Color(0, 102, 205));
        lbEndereco.setText("endereço");

        lbOpcional2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbOpcional2.setForeground(new java.awt.Color(102, 102, 102));
        lbOpcional2.setText("(Opcional)");

        pnEndereco.setBackground(new java.awt.Color(255, 255, 255));

        lbEndereco2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbEndereco2.setForeground(new java.awt.Color(102, 102, 102));
        lbEndereco2.setText("Endereço");

        tfEndereco.setForeground(new java.awt.Color(102, 102, 102));
        try {
            tfEndereco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("**************************************************")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfEndereco.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lbCep.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbCep.setForeground(new java.awt.Color(102, 102, 102));
        lbCep.setText("CEP");

        tfCep.setForeground(new java.awt.Color(102, 102, 102));
        try {
            tfCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfCep.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lbComplemento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbComplemento.setForeground(new java.awt.Color(102, 102, 102));
        lbComplemento.setText("Complemento");

        tfComplemento.setForeground(new java.awt.Color(102, 102, 102));
        try {
            tfComplemento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("********************")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfComplemento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lbBairro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbBairro.setForeground(new java.awt.Color(102, 102, 102));
        lbBairro.setText("Bairro");

        tfBairro.setForeground(new java.awt.Color(102, 102, 102));
        try {
            tfBairro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("********************")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfBairro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lbNumero.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbNumero.setForeground(new java.awt.Color(102, 102, 102));
        lbNumero.setText("Número");

        tfNumero.setForeground(new java.awt.Color(102, 102, 102));
        try {
            tfNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfNumero.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lbCidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbCidade.setForeground(new java.awt.Color(102, 102, 102));
        lbCidade.setText("Cidade");

        tfCidade.setForeground(new java.awt.Color(102, 102, 102));
        try {
            tfCidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("********************")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfCidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lbEstado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbEstado.setForeground(new java.awt.Color(102, 102, 102));
        lbEstado.setText("Estado");

        tfEstado.setForeground(new java.awt.Color(102, 102, 102));
        try {
            tfEstado.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("********************")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfEstado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfEstado.setNextFocusableComponent(tfCargo);

        javax.swing.GroupLayout pnEnderecoLayout = new javax.swing.GroupLayout(pnEndereco);
        pnEndereco.setLayout(pnEnderecoLayout);
        pnEnderecoLayout.setHorizontalGroup(
            pnEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfEndereco)
                    .addGroup(pnEnderecoLayout.createSequentialGroup()
                        .addGroup(pnEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCep, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCep))
                        .addGroup(pnEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnEnderecoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbComplemento)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnEnderecoLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(tfComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfBairro))))
                    .addGroup(pnEnderecoLayout.createSequentialGroup()
                        .addGroup(pnEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnEnderecoLayout.createSequentialGroup()
                                .addComponent(lbNumero)
                                .addGap(49, 49, 49))
                            .addGroup(pnEnderecoLayout.createSequentialGroup()
                                .addComponent(tfNumero)
                                .addGap(6, 6, 6)))
                        .addGroup(pnEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnEnderecoLayout.createSequentialGroup()
                                .addComponent(lbCidade)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnEnderecoLayout.createSequentialGroup()
                                .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfEstado))))
                    .addGroup(pnEnderecoLayout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addGroup(pnEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbBairro)
                            .addComponent(lbEstado)))
                    .addComponent(lbEndereco2))
                .addContainerGap())
        );
        pnEnderecoLayout.setVerticalGroup(
            pnEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEnderecoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbEndereco2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnEnderecoLayout.createSequentialGroup()
                        .addGroup(pnEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCep)
                            .addComponent(lbComplemento)
                            .addComponent(lbBairro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCep, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNumero)
                            .addComponent(lbEstado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnEnderecoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnEnderecoLayout.createSequentialGroup()
                        .addComponent(lbCidade)
                        .addGap(36, 36, 36)))
                .addContainerGap())
        );

        sprDireita.setForeground(new java.awt.Color(204, 204, 204));
        sprDireita.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lbFuncionario.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbFuncionario.setForeground(new java.awt.Color(0, 102, 205));
        lbFuncionario.setText("funcionário");

        lbOpcional3.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbOpcional3.setForeground(new java.awt.Color(102, 102, 102));
        lbOpcional3.setText("(Opcional)");

        pnFuncionario.setBackground(new java.awt.Color(255, 255, 255));

        lbCargo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbCargo.setForeground(new java.awt.Color(102, 102, 102));
        lbCargo.setText("Cargo");

        tfCargo.setForeground(new java.awt.Color(102, 102, 102));
        try {
            tfCargo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("********************")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfCargo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lbUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbUsuario.setForeground(new java.awt.Color(102, 102, 102));
        lbUsuario.setText("Usuário");

        tfUsuario.setForeground(new java.awt.Color(102, 102, 102));
        try {
            tfUsuario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("******************************")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lbSenha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbSenha.setForeground(new java.awt.Color(102, 102, 102));
        lbSenha.setText("Senha");

        tfSenha.setForeground(new java.awt.Color(102, 102, 102));
        try {
            tfSenha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("******************************")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfSenha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfSenha.setNextFocusableComponent(tfRg);

        javax.swing.GroupLayout pnFuncionarioLayout = new javax.swing.GroupLayout(pnFuncionario);
        pnFuncionario.setLayout(pnFuncionarioLayout);
        pnFuncionarioLayout.setHorizontalGroup(
            pnFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbCargo)
                    .addComponent(lbUsuario)
                    .addComponent(lbSenha)
                    .addComponent(tfCargo)
                    .addComponent(tfUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                    .addComponent(tfSenha))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnFuncionarioLayout.setVerticalGroup(
            pnFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCargo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lbPessoa.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbPessoa.setForeground(new java.awt.Color(0, 102, 205));
        lbPessoa.setText("pessoa física");

        lbOpcional4.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbOpcional4.setForeground(new java.awt.Color(102, 102, 102));
        lbOpcional4.setText("(Opcional)");

        pnPessoa.setBackground(new java.awt.Color(255, 255, 255));

        lbRg.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbRg.setForeground(new java.awt.Color(102, 102, 102));
        lbRg.setText("RG");

        tfRg.setForeground(new java.awt.Color(102, 102, 102));
        try {
            tfRg.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("********************")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfRg.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lbCpf.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbCpf.setForeground(new java.awt.Color(102, 102, 102));
        lbCpf.setText("CPF");

        tfCpf.setForeground(new java.awt.Color(102, 102, 102));
        try {
            tfCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfCpf.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lbNascimento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbNascimento.setForeground(new java.awt.Color(102, 102, 102));
        lbNascimento.setText("Nascimento");

        tfNascimento.setForeground(new java.awt.Color(102, 102, 102));
        try {
            tfNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfNascimento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout pnPessoaLayout = new javax.swing.GroupLayout(pnPessoa);
        pnPessoa.setLayout(pnPessoaLayout);
        pnPessoaLayout.setHorizontalGroup(
            pnPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPessoaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbRg)
                    .addComponent(tfRg, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCpf)
                    .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPessoaLayout.createSequentialGroup()
                        .addComponent(lbNascimento)
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addComponent(tfNascimento))
                .addContainerGap())
        );
        pnPessoaLayout.setVerticalGroup(
            pnPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPessoaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRg)
                    .addComponent(lbCpf)
                    .addComponent(lbNascimento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfRg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        sprRodape.setForeground(new java.awt.Color(204, 204, 204));

        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnCadastrarUP.png"))); // NOI18N
        btnCadastrar.setBorder(null);
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnCadastrarDOWN.png"))); // NOI18N
        btnCadastrar.setFocusable(false);
        btnCadastrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnCadastrarDOWN.png"))); // NOI18N
        btnCadastrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnCadastrarDOWN.png"))); // NOI18N
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarUP.png"))); // NOI18N
        btnAlterar.setBorder(null);
        btnAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterar.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N
        btnAlterar.setFocusable(false);
        btnAlterar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N
        btnAlterar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnCorpoLayout = new javax.swing.GroupLayout(pnCorpo);
        pnCorpo.setLayout(pnCorpoLayout);
        pnCorpoLayout.setHorizontalGroup(
            pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCorpoLayout.createSequentialGroup()
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCorpoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar))
                    .addGroup(pnCorpoLayout.createSequentialGroup()
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnCorpoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnCorpoLayout.createSequentialGroup()
                                        .addComponent(lbContato)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbOpcional1))
                                    .addGroup(pnCorpoLayout.createSequentialGroup()
                                        .addComponent(lbEndereco)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbOpcional2))))
                            .addComponent(pnObrigatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnContato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sprDireita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnCorpoLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(lbFuncionario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbOpcional3))
                            .addGroup(pnCorpoLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lbPessoa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbOpcional4))
                            .addComponent(pnFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(sprRodape)
        );
        pnCorpoLayout.setVerticalGroup(
            pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCorpoLayout.createSequentialGroup()
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCorpoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbFuncionario)
                            .addComponent(lbOpcional3))
                        .addGap(0, 0, 0)
                        .addComponent(pnFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbOpcional4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbPessoa))
                        .addGap(0, 0, 0)
                        .addComponent(pnPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnCorpoLayout.createSequentialGroup()
                        .addComponent(pnObrigatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbContato)
                            .addComponent(lbOpcional1))
                        .addGap(0, 0, 0)
                        .addComponent(pnContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbEndereco)
                            .addComponent(lbOpcional2))
                        .addGap(0, 0, 0)
                        .addComponent(pnEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(sprDireita))
                .addGap(0, 0, 0)
                .addComponent(sprRodape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnCorpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(pnCorpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        btnCadastrar.setEnabled(false);
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        funcionarioBO = new FuncionarioBO();
        if (funcionarioBO.validarCampos(pnObrigatorio)) {
            if (funcionarioBO.inserirFuncionario(tfNomeFuncionario.getText(), tfNomeContato.getText(), tfEmail.getText(), tfTelefone.getText(), tfCelular.getText(), tfCargo.getText(), tfUsuario.getText(), tfSenha.getText(), tfCpf.getText(), tfRg.getText(), tfNascimento.getText(), tfEndereco.getText(), tfCep.getText(), tfComplemento.getText(), tfNumero.getText(), tfBairro.getText(), tfCidade.getText(), tfEstado.getText())) {
                viewPainelControle.atualizarTabelas();
                this.dispose();
            }
        }
        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        btnCadastrar.setEnabled(true);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        btnAlterar.setEnabled(false);
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        funcionarioBO = new FuncionarioBO();
        if (funcionarioBO.validarCampos(pnObrigatorio)) {
            if (funcionarioBO.alterarFuncionario(funcionarioVO.getIdFuncionario(), funcionarioVO.getPessoa().getIdPessoa(), funcionarioVO.getContato().getIdContato(), funcionarioVO.getEndereco().getIdEndereco(), tfNomeFuncionario.getText(), tfNomeContato.getText(), tfEmail.getText(), tfTelefone.getText(), tfCelular.getText(), tfCargo.getText(), tfUsuario.getText(), tfSenha.getText(), tfCpf.getText(), tfRg.getText(), tfNascimento.getText(), tfEndereco.getText(), tfCep.getText(), tfComplemento.getText(), tfNumero.getText(), tfBairro.getText(), tfCidade.getText(), tfEstado.getText())) {
                viewPainelControle.atualizarTabelas();
                this.dispose();
            }
        }
        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        btnAlterar.setEnabled(true);
    }//GEN-LAST:event_btnAlterarActionPerformed

    //Declaração de variáveis(View).
    private final ViewPainelControle viewPainelControle;

    //Declaração de variáveis(Value Object).
    private Funcionario funcionarioVO;
    private Pessoafisica pessoaFisicaVO;

    //Declaração de variáveis(Business Object).
    private FuncionarioBO funcionarioBO;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JLabel lbBairro;
    private javax.swing.JLabel lbCargo;
    private javax.swing.JLabel lbCelular;
    private javax.swing.JLabel lbCep;
    private javax.swing.JLabel lbCidade;
    private javax.swing.JLabel lbComplemento;
    private javax.swing.JLabel lbContato;
    private javax.swing.JLabel lbCpf;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEndereco;
    private javax.swing.JLabel lbEndereco2;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbFuncionario;
    private javax.swing.JLabel lbNascimento;
    private javax.swing.JLabel lbNomeContato;
    private javax.swing.JLabel lbNomeFuncionario;
    private javax.swing.JLabel lbNumero;
    private javax.swing.JLabel lbOpcional1;
    private javax.swing.JLabel lbOpcional2;
    private javax.swing.JLabel lbOpcional3;
    private javax.swing.JLabel lbOpcional4;
    private javax.swing.JLabel lbPessoa;
    private javax.swing.JLabel lbRg;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JPanel pnContato;
    private javax.swing.JPanel pnCorpo;
    private javax.swing.JPanel pnEndereco;
    private javax.swing.JPanel pnFuncionario;
    private javax.swing.JPanel pnObrigatorio;
    private javax.swing.JPanel pnPessoa;
    private javax.swing.JPanel pnTitulo;
    private javax.swing.JSeparator sprDireita;
    private javax.swing.JSeparator sprRodape;
    private javax.swing.JFormattedTextField tfBairro;
    private javax.swing.JFormattedTextField tfCargo;
    private javax.swing.JFormattedTextField tfCelular;
    private javax.swing.JFormattedTextField tfCep;
    private javax.swing.JFormattedTextField tfCidade;
    private javax.swing.JFormattedTextField tfComplemento;
    private javax.swing.JFormattedTextField tfCpf;
    private javax.swing.JFormattedTextField tfEmail;
    private javax.swing.JFormattedTextField tfEndereco;
    private javax.swing.JFormattedTextField tfEstado;
    private javax.swing.JFormattedTextField tfNascimento;
    private javax.swing.JFormattedTextField tfNomeContato;
    private javax.swing.JFormattedTextField tfNomeFuncionario;
    private javax.swing.JFormattedTextField tfNumero;
    private javax.swing.JFormattedTextField tfRg;
    private javax.swing.JFormattedTextField tfSenha;
    private javax.swing.JFormattedTextField tfTelefone;
    private javax.swing.JFormattedTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}
