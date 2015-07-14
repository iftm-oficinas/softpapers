package br.com.resources.views;

import br.com.models.bo.FornecedorBO;
import br.com.models.vo.Fornecedor;
import br.com.models.vo.Pessoafisica;
import br.com.models.vo.Pessoajuridica;
import java.awt.Cursor;
import java.text.SimpleDateFormat;

/**
 * @see Classe visual. JDialog que tem como objetivo cadastrar um novo
 * fornecedor.
 * @author Bruna Danieli Ribeiro Gonçalves, Márlon Ândrel Coelho Freitas
 */
public class ViewFornecedor extends javax.swing.JDialog {

    /**
     * @see Construtor padrão.
     * @param viewPainelControle
     * @param parent
     * @param modal
     */
    public ViewFornecedor(java.awt.Frame parent, boolean modal, ViewPainelControle viewPainelControle) {
        //Inicialização dos componentes padrões do JDialog.
        super(parent, modal);
        initComponents();
        rbPessoaJuridica.doClick();
        this.viewPainelControle = viewPainelControle;
        this.fornecedorBO = new FornecedorBO();
        btnAlterar.setVisible(false);
    }

    /**
     * @see Construtor usado para visualizar ou alterar um Fornecedor.
     * @param fornecedor
     * @param alterar
     * @param viewPainelControle
     * @param parent
     * @param modal
     */
    public ViewFornecedor(java.awt.Frame parent, boolean modal, ViewPainelControle viewPainelControle, Fornecedor fornecedor, Boolean alterar) {
        //Inicialização dos componentes padrões do JDialog.
        super(parent, modal);
        initComponents();
        this.viewPainelControle = viewPainelControle;
        this.fornecedorBO = new FornecedorBO();
        this.fornecedorVO = fornecedor;
        btnCadastrar.setVisible(false);
        lbTitulo.setText("Alterar Fornecedor");
        rbPessoaFisica.setVisible(false);
        rbPessoaJuridica.setVisible(false);

        //Definindo os atributos.
        tfNomeFornecedor.setText(fornecedor.getNomeFornecedor());
        tfNomeContato.setText(fornecedor.getContato().getNomeContato());
        tfEmail.setText(fornecedor.getContato().getEmailContato());
        tfTelefone.setText(fornecedor.getContato().getTelefoneContato());
        tfCelular.setText(fornecedor.getContato().getCelularContato());
        tfEndereco.setText(fornecedor.getEndereco().getEnderecoEndereco());
        tfCep.setText(fornecedor.getEndereco().getCepEndereco());
        tfComplemento.setText(fornecedor.getEndereco().getComplementoEndereco());
        tfNumero.setText(fornecedor.getEndereco().getNumeroEndereco());
        tfBairro.setText(fornecedor.getEndereco().getBairroEndereco());
        tfCidade.setText(fornecedor.getEndereco().getCidadeEndereco());
        tfEstado.setText(fornecedor.getEndereco().getEstadoEndereco());
        if ("Fisica".equals(fornecedor.getPessoa().getTipoPessoa())) {
            rbPessoaFisica.doClick();
            Pessoafisica pessoaFisica = fornecedorBO.buscarPessoaFisica(fornecedor.getPessoa().getIdPessoa());
            tfCpf.setText(pessoaFisica.getCpfPessoaFisica());
            tfRg.setText(pessoaFisica.getRgPessoaFisica());
            tfNascimento.setText(new SimpleDateFormat("dd/MM/yyyy").format(pessoaFisica.getNascimentoPessoaFisica()));
        } else {
            rbPessoaJuridica.doClick();
            Pessoajuridica pessoaJuridica = fornecedorBO.buscarPessoaJuridica(fornecedor.getPessoa().getIdPessoa());
            tfRazao.setText(pessoaJuridica.getRazaoSocialPessoaJuridica());
            tfNomeFantasia.setText(pessoaJuridica.getNomeFantasiaPessoaJuridica());
            tfCnpj.setText(pessoaJuridica.getCnpjPessoaJuridica());
            tfEstadual.setText(pessoaJuridica.getEstadualPessoaJuridica());
            tfMunicipal.setText(pessoaJuridica.getMunicipalPessoaJuridica());
            tfSuframa.setText(pessoaJuridica.getSuframaPessoaJuridica());
            if (pessoaJuridica.getTributoSimplesPessoaJuridica()) {
                rbSimples.doClick();
            }
            if (pessoaJuridica.getImportacaoPessoaJuridica()) {
                rbTaxas.doClick();
            }
            if (pessoaJuridica.getIcmsPessoaJuridica()) {
                rbIcms.doClick();
            }
            tfFundacao.setText(new SimpleDateFormat("dd/MM/yyyy").format(pessoaJuridica.getFundacaoPessoaJuridica()));
        }

        //Definindo como não editável
        if (!alterar) {
            lbTitulo.setText("Cliente");
            btnAlterar.setVisible(false);
            tfNomeFornecedor.setEditable(false);
            tfNomeContato.setEditable(false);
            tfEmail.setEditable(false);
            tfTelefone.setEditable(false);
            tfCelular.setEditable(false);
            tfEndereco.setEditable(false);
            tfCep.setEditable(false);
            tfComplemento.setEditable(false);
            tfNumero.setEditable(false);
            tfBairro.setEditable(false);
            tfCidade.setEditable(false);
            tfEstado.setEditable(false);
            rbPessoaFisica.setEnabled(false);
            rbPessoaJuridica.setEnabled(false);
            tfRg.setEditable(false);
            tfCpf.setEditable(false);
            tfNascimento.setEditable(false);
            tfRazao.setEditable(false);
            tfNomeFantasia.setEditable(false);
            tfCnpj.setEditable(false);
            tfEstadual.setEditable(false);
            tfMunicipal.setEditable(false);
            tfSuframa.setEditable(false);
            rbSimples.setEnabled(false);
            rbTaxas.setEnabled(false);
            rbIcms.setEnabled(false);
            tfFundacao.setEditable(false);
        }
    }

    //Componentes padrões do JFrame.
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnTitulo = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        pnCorpo = new javax.swing.JPanel();
        pnObrigatorio = new javax.swing.JPanel();
        lbNomeFornecedor = new javax.swing.JLabel();
        tfNomeFornecedor = new javax.swing.JFormattedTextField();
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
        lbMaisEndereco = new javax.swing.JLabel();
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
        rbPessoaFisica = new javax.swing.JRadioButton();
        rbPessoaJuridica = new javax.swing.JRadioButton();
        lbPessoa = new javax.swing.JLabel();
        lbOpcional3 = new javax.swing.JLabel();
        pnPessoaJuridica = new javax.swing.JPanel();
        lbRazao = new javax.swing.JLabel();
        tfRazao = new javax.swing.JFormattedTextField();
        lbNomeFantasia = new javax.swing.JLabel();
        tfNomeFantasia = new javax.swing.JFormattedTextField();
        lbSuframa = new javax.swing.JLabel();
        tfSuframa = new javax.swing.JFormattedTextField();
        lbMunicipal = new javax.swing.JLabel();
        tfMunicipal = new javax.swing.JFormattedTextField();
        lbEstadual = new javax.swing.JLabel();
        tfEstadual = new javax.swing.JFormattedTextField();
        lbCnpj = new javax.swing.JLabel();
        tfCnpj = new javax.swing.JFormattedTextField();
        lbFundacao = new javax.swing.JLabel();
        tfFundacao = new javax.swing.JFormattedTextField();
        rbSimples = new javax.swing.JRadioButton();
        rbTaxas = new javax.swing.JRadioButton();
        rbIcms = new javax.swing.JRadioButton();
        sprRodape = new javax.swing.JSeparator();
        btnCadastrar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        pnPessoaFisica = new javax.swing.JPanel();
        lbRg = new javax.swing.JLabel();
        tfRg = new javax.swing.JFormattedTextField();
        lbCpf = new javax.swing.JLabel();
        tfCpf = new javax.swing.JFormattedTextField();
        tfNascimento = new javax.swing.JFormattedTextField();
        lbNascimento = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Forecedor");
        setResizable(false);

        pnTitulo.setBackground(new java.awt.Color(51, 51, 51));

        lbTitulo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo.setText("Novo Fornecedor");

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

        lbNomeFornecedor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbNomeFornecedor.setForeground(new java.awt.Color(102, 102, 102));
        lbNomeFornecedor.setText("Nome do Fornecedor");

        tfNomeFornecedor.setForeground(new java.awt.Color(102, 102, 102));
        try {
            tfNomeFornecedor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("**************************************************")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfNomeFornecedor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfNomeFornecedor.setNextFocusableComponent(tfNomeContato);

        javax.swing.GroupLayout pnObrigatorioLayout = new javax.swing.GroupLayout(pnObrigatorio);
        pnObrigatorio.setLayout(pnObrigatorioLayout);
        pnObrigatorioLayout.setHorizontalGroup(
            pnObrigatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnObrigatorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnObrigatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnObrigatorioLayout.createSequentialGroup()
                        .addComponent(lbNomeFornecedor)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tfNomeFornecedor))
                .addContainerGap())
        );
        pnObrigatorioLayout.setVerticalGroup(
            pnObrigatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnObrigatorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNomeFornecedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNomeFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        lbMaisEndereco.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbMaisEndereco.setForeground(new java.awt.Color(0, 102, 205));
        lbMaisEndereco.setText("endereço");

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
        tfNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("########.##"))));
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
        tfEstado.setNextFocusableComponent(tfRg);

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

        rbPessoaFisica.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbPessoaFisica);
        rbPessoaFisica.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rbPessoaFisica.setForeground(new java.awt.Color(102, 102, 102));
        rbPessoaFisica.setSelected(true);
        rbPessoaFisica.setText("Pessoa Física");
        rbPessoaFisica.setFocusable(false);
        rbPessoaFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPessoaFisicaActionPerformed(evt);
            }
        });

        rbPessoaJuridica.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbPessoaJuridica);
        rbPessoaJuridica.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rbPessoaJuridica.setForeground(new java.awt.Color(102, 102, 102));
        rbPessoaJuridica.setText("Pessoa Jurídica");
        rbPessoaJuridica.setFocusable(false);
        rbPessoaJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPessoaJuridicaActionPerformed(evt);
            }
        });

        lbPessoa.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbPessoa.setForeground(new java.awt.Color(0, 102, 205));
        lbPessoa.setText("pessoa física");

        lbOpcional3.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbOpcional3.setForeground(new java.awt.Color(102, 102, 102));
        lbOpcional3.setText("(Opcional)");

        pnPessoaJuridica.setBackground(new java.awt.Color(255, 255, 255));

        lbRazao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbRazao.setForeground(new java.awt.Color(102, 102, 102));
        lbRazao.setText("Razão Social");

        tfRazao.setForeground(new java.awt.Color(102, 102, 102));
        try {
            tfRazao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("**************************************************")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfRazao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lbNomeFantasia.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbNomeFantasia.setForeground(new java.awt.Color(102, 102, 102));
        lbNomeFantasia.setText("Nome Fantasia");

        tfNomeFantasia.setForeground(new java.awt.Color(102, 102, 102));
        try {
            tfNomeFantasia.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("**************************************************")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfNomeFantasia.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lbSuframa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbSuframa.setForeground(new java.awt.Color(102, 102, 102));
        lbSuframa.setText("SUFRAMA");

        tfSuframa.setForeground(new java.awt.Color(102, 102, 102));
        try {
            tfSuframa.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfSuframa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lbMunicipal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbMunicipal.setForeground(new java.awt.Color(102, 102, 102));
        lbMunicipal.setText("Inscrição Municipal");

        tfMunicipal.setForeground(new java.awt.Color(102, 102, 102));
        try {
            tfMunicipal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfMunicipal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lbEstadual.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbEstadual.setForeground(new java.awt.Color(102, 102, 102));
        lbEstadual.setText("Inscrição Estadual");

        tfEstadual.setForeground(new java.awt.Color(102, 102, 102));
        try {
            tfEstadual.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###.###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfEstadual.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lbCnpj.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbCnpj.setForeground(new java.awt.Color(102, 102, 102));
        lbCnpj.setText("CNPJ");

        tfCnpj.setForeground(new java.awt.Color(102, 102, 102));
        try {
            tfCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfCnpj.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lbFundacao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbFundacao.setForeground(new java.awt.Color(102, 102, 102));
        lbFundacao.setText("Fundação");

        tfFundacao.setForeground(new java.awt.Color(102, 102, 102));
        try {
            tfFundacao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfFundacao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfFundacao.setNextFocusableComponent(tfNomeFornecedor);

        rbSimples.setBackground(new java.awt.Color(255, 255, 255));
        rbSimples.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rbSimples.setForeground(new java.awt.Color(153, 153, 153));
        rbSimples.setText("A empresa opta pelo SIMPLES.");
        rbSimples.setFocusable(false);

        rbTaxas.setBackground(new java.awt.Color(255, 255, 255));
        rbTaxas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rbTaxas.setForeground(new java.awt.Color(153, 153, 153));
        rbTaxas.setText("Possui taxas de Importação.");
        rbTaxas.setFocusable(false);

        rbIcms.setBackground(new java.awt.Color(255, 255, 255));
        rbIcms.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rbIcms.setForeground(new java.awt.Color(153, 153, 153));
        rbIcms.setText("Insento do ICMS.");
        rbIcms.setFocusable(false);

        javax.swing.GroupLayout pnPessoaJuridicaLayout = new javax.swing.GroupLayout(pnPessoaJuridica);
        pnPessoaJuridica.setLayout(pnPessoaJuridicaLayout);
        pnPessoaJuridicaLayout.setHorizontalGroup(
            pnPessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPessoaJuridicaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPessoaJuridicaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnPessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbRazao)
                            .addComponent(lbNomeFantasia))
                        .addGap(481, 481, 481))
                    .addGroup(pnPessoaJuridicaLayout.createSequentialGroup()
                        .addGroup(pnPessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnPessoaJuridicaLayout.createSequentialGroup()
                                .addComponent(tfSuframa, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfMunicipal, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfFundacao))
                            .addGroup(pnPessoaJuridicaLayout.createSequentialGroup()
                                .addGroup(pnPessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnPessoaJuridicaLayout.createSequentialGroup()
                                        .addComponent(lbSuframa)
                                        .addGap(40, 40, 40)
                                        .addComponent(lbMunicipal)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbEstadual)
                                        .addGap(23, 23, 23)
                                        .addComponent(lbCnpj)
                                        .addGap(91, 91, 91)
                                        .addComponent(lbFundacao))
                                    .addGroup(pnPessoaJuridicaLayout.createSequentialGroup()
                                        .addComponent(rbSimples)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbTaxas)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbIcms))
                                    .addComponent(tfRazao, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                                    .addComponent(tfNomeFantasia))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        pnPessoaJuridicaLayout.setVerticalGroup(
            pnPessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPessoaJuridicaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbRazao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfRazao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNomeFantasia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSuframa)
                    .addComponent(lbMunicipal)
                    .addComponent(lbEstadual)
                    .addComponent(lbCnpj)
                    .addComponent(lbFundacao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfSuframa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfMunicipal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfFundacao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnPessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbSimples, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbTaxas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbIcms, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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

        pnPessoaFisica.setBackground(new java.awt.Color(255, 255, 255));

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

        tfNascimento.setForeground(new java.awt.Color(102, 102, 102));
        try {
            tfNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfNascimento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lbNascimento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbNascimento.setForeground(new java.awt.Color(102, 102, 102));
        lbNascimento.setText("Nascimento");

        javax.swing.GroupLayout pnPessoaFisicaLayout = new javax.swing.GroupLayout(pnPessoaFisica);
        pnPessoaFisica.setLayout(pnPessoaFisicaLayout);
        pnPessoaFisicaLayout.setHorizontalGroup(
            pnPessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPessoaFisicaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbRg)
                    .addComponent(tfRg, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPessoaFisicaLayout.createSequentialGroup()
                        .addComponent(lbCpf)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tfCpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNascimento))
                .addContainerGap())
        );
        pnPessoaFisicaLayout.setVerticalGroup(
            pnPessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPessoaFisicaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRg)
                    .addComponent(lbCpf)
                    .addComponent(lbNascimento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPessoaFisicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfRg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout pnCorpoLayout = new javax.swing.GroupLayout(pnCorpo);
        pnCorpo.setLayout(pnCorpoLayout);
        pnCorpoLayout.setHorizontalGroup(
            pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sprRodape)
            .addGroup(pnCorpoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnCorpoLayout.createSequentialGroup()
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pnObrigatorio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnEndereco, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnContato, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnCorpoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnCorpoLayout.createSequentialGroup()
                                .addComponent(lbContato)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbOpcional1))
                            .addGroup(pnCorpoLayout.createSequentialGroup()
                                .addComponent(lbMaisEndereco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbOpcional2)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sprDireita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCorpoLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnCorpoLayout.createSequentialGroup()
                                .addComponent(lbPessoa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbOpcional3))
                            .addGroup(pnCorpoLayout.createSequentialGroup()
                                .addComponent(rbPessoaFisica)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rbPessoaJuridica)))
                        .addContainerGap())
                    .addComponent(pnPessoaJuridica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnPessoaFisica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnCorpoLayout.setVerticalGroup(
            pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCorpoLayout.createSequentialGroup()
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCorpoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbPessoaFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbPessoaJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbPessoa)
                            .addComponent(lbOpcional3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnPessoaFisica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(pnPessoaJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sprDireita)
                    .addGroup(pnCorpoLayout.createSequentialGroup()
                        .addComponent(pnObrigatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbContato)
                            .addComponent(lbOpcional1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbMaisEndereco)
                            .addComponent(lbOpcional2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0)
                .addComponent(sprRodape, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadastrar)
                    .addComponent(btnAlterar))
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

    /**
     * @see Método que responde ao clique do JRadioButton e altera os atributos
     * para o padrão da Pessoa Fisíca.
     * @param evt
     */
    private void rbPessoaFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPessoaFisicaActionPerformed
        if (rbPessoaFisica.isSelected()) {
            lbPessoa.setText("pessoa física");
            pnPessoaFisica.setVisible(true);
            pnPessoaJuridica.setVisible(false);
        }
    }//GEN-LAST:event_rbPessoaFisicaActionPerformed

    /**
     * @see Método que responde ao clique do JRadioButton e altera os atributos
     * para o padrão da Pessoa Jurídica.
     * @param evt
     */
    private void rbPessoaJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPessoaJuridicaActionPerformed
        if (rbPessoaJuridica.isSelected()) {
            lbPessoa.setText("pessoa jurídica");
            pnPessoaJuridica.setVisible(true);
            pnPessoaFisica.setVisible(false);
        }
    }//GEN-LAST:event_rbPessoaJuridicaActionPerformed

    /**
     * @see Método que responde ao clique do JButton e verifica se os campos
     * estão preenchidos para inserir um novo Fornecedor.
     * @param evt
     */
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        btnCadastrar.setEnabled(false);
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        if (fornecedorBO.validarCampos(pnObrigatorio)) {
            if (fornecedorBO.inserirFornecedor(tfNomeFornecedor.getText(), tfNomeContato.getText(), tfEmail.getText(), tfTelefone.getText(), tfCelular.getText(), tfEndereco.getText(), tfCep.getText(), tfComplemento.getText(), tfNumero.getText(), tfBairro.getText(), tfCidade.getText(), tfEstado.getText(), rbPessoaFisica.isSelected(), tfCpf.getText(), tfRg.getText(), tfNascimento.getText(), tfRazao.getText(), tfNomeFantasia.getText(), tfCnpj.getText(), tfEstadual.getText(), tfMunicipal.getText(), tfSuframa.getText(), rbSimples.isSelected(), rbTaxas.isSelected(), rbIcms.isSelected(), tfFundacao.getText())) {
                viewPainelControle.atualizarTabelas();
                this.dispose();
            }
        }
        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        btnCadastrar.setEnabled(true);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    /**
     * @see Método que responde ao clique do JButton e verifica se os campos
     * estão preenchidos para alterar um novo Fornecedor.
     * @param evt
     */
    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        btnAlterar.setEnabled(false);
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        if (fornecedorBO.validarCampos(pnObrigatorio)) {
            if (fornecedorBO.alterarFornecedor(fornecedorVO.getIdFornecedor(), tfNomeFornecedor.getText(), tfNomeContato.getText(), tfEmail.getText(), tfTelefone.getText(), tfCelular.getText(), tfEndereco.getText(), tfCep.getText(), tfComplemento.getText(), tfNumero.getText(), tfBairro.getText(), tfCidade.getText(), tfEstado.getText(), rbPessoaFisica.isSelected(), tfCpf.getText(), tfRg.getText(), tfNascimento.getText(), tfRazao.getText(), tfNomeFantasia.getText(), tfCnpj.getText(), tfEstadual.getText(), tfMunicipal.getText(), tfSuframa.getText(), rbSimples.isSelected(), rbTaxas.isSelected(), rbIcms.isSelected(), tfFundacao.getText())) {
                viewPainelControle.atualizarTabelas();
                this.dispose();
            }
        }
        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        btnAlterar.setEnabled(true);
    }//GEN-LAST:event_btnAlterarActionPerformed

    //Declaração de variáveis(View).
    private final ViewPainelControle viewPainelControle;

    //Declaração de variáveis(Business Object).
    private final FornecedorBO fornecedorBO;

    //Declaração de variáveis(Value Object).
    private Fornecedor fornecedorVO;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel lbBairro;
    private javax.swing.JLabel lbCelular;
    private javax.swing.JLabel lbCep;
    private javax.swing.JLabel lbCidade;
    private javax.swing.JLabel lbCnpj;
    private javax.swing.JLabel lbComplemento;
    private javax.swing.JLabel lbContato;
    private javax.swing.JLabel lbCpf;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEndereco2;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbEstadual;
    private javax.swing.JLabel lbFundacao;
    private javax.swing.JLabel lbMaisEndereco;
    private javax.swing.JLabel lbMunicipal;
    private javax.swing.JLabel lbNascimento;
    private javax.swing.JLabel lbNomeContato;
    private javax.swing.JLabel lbNomeFantasia;
    private javax.swing.JLabel lbNomeFornecedor;
    private javax.swing.JLabel lbNumero;
    private javax.swing.JLabel lbOpcional1;
    private javax.swing.JLabel lbOpcional2;
    private javax.swing.JLabel lbOpcional3;
    private javax.swing.JLabel lbPessoa;
    private javax.swing.JLabel lbRazao;
    private javax.swing.JLabel lbRg;
    private javax.swing.JLabel lbSuframa;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel pnContato;
    private javax.swing.JPanel pnCorpo;
    private javax.swing.JPanel pnEndereco;
    private javax.swing.JPanel pnObrigatorio;
    private javax.swing.JPanel pnPessoaFisica;
    private javax.swing.JPanel pnPessoaJuridica;
    private javax.swing.JPanel pnTitulo;
    private javax.swing.JRadioButton rbIcms;
    private javax.swing.JRadioButton rbPessoaFisica;
    private javax.swing.JRadioButton rbPessoaJuridica;
    private javax.swing.JRadioButton rbSimples;
    private javax.swing.JRadioButton rbTaxas;
    private javax.swing.JSeparator sprDireita;
    private javax.swing.JSeparator sprRodape;
    private javax.swing.JFormattedTextField tfBairro;
    private javax.swing.JFormattedTextField tfCelular;
    private javax.swing.JFormattedTextField tfCep;
    private javax.swing.JFormattedTextField tfCidade;
    private javax.swing.JFormattedTextField tfCnpj;
    private javax.swing.JFormattedTextField tfComplemento;
    private javax.swing.JFormattedTextField tfCpf;
    private javax.swing.JFormattedTextField tfEmail;
    private javax.swing.JFormattedTextField tfEndereco;
    private javax.swing.JFormattedTextField tfEstado;
    private javax.swing.JFormattedTextField tfEstadual;
    private javax.swing.JFormattedTextField tfFundacao;
    private javax.swing.JFormattedTextField tfMunicipal;
    private javax.swing.JFormattedTextField tfNascimento;
    private javax.swing.JFormattedTextField tfNomeContato;
    private javax.swing.JFormattedTextField tfNomeFantasia;
    private javax.swing.JFormattedTextField tfNomeFornecedor;
    private javax.swing.JFormattedTextField tfNumero;
    private javax.swing.JFormattedTextField tfRazao;
    private javax.swing.JFormattedTextField tfRg;
    private javax.swing.JFormattedTextField tfSuframa;
    private javax.swing.JFormattedTextField tfTelefone;
    // End of variables declaration//GEN-END:variables
}
