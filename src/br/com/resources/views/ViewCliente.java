package br.com.resources.views;

import java.awt.event.KeyEvent;

/**
 *
 * @see Classe visual. JDialog que tem como objetivo cadastrar um novo cliente.
 *
 * @author Bruna Danieli Ribeiro Gonçalves, Márlon Ândrel Coelho Freitas
 */
public class ViewCliente extends javax.swing.JDialog {

    /**
     * @see Construtor padrão.
     *
     * @param parent
     * @param modal
     */
    public ViewCliente(java.awt.Frame parent, boolean modal) {
        //Inicialização dos componentes padrões do JDialog.
        super(parent, modal);
        initComponents();
        pnPessoaJuridica.setVisible(false);
    }

    //Componentes padrões do JFrame.
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnTitulo = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        pnCorpo = new javax.swing.JPanel();
        pnObrigatorio = new javax.swing.JPanel();
        lbNome = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        rbPublicidade = new javax.swing.JRadioButton();
        lbContato = new javax.swing.JLabel();
        lbOpcional1 = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        lbTelefone = new javax.swing.JLabel();
        tfTelefone = new javax.swing.JTextField();
        lbCelular = new javax.swing.JLabel();
        tfCelular = new javax.swing.JTextField();
        lbCliente = new javax.swing.JLabel();
        lbOpcional2 = new javax.swing.JLabel();
        lbSalario = new javax.swing.JLabel();
        ftfSalario = new javax.swing.JFormattedTextField();
        lbLimite = new javax.swing.JLabel();
        ftfLimite = new javax.swing.JFormattedTextField();
        lbDesconto = new javax.swing.JLabel();
        ftfDesconto = new javax.swing.JFormattedTextField();
        lbMaisEndereco = new javax.swing.JLabel();
        lbOpcional3 = new javax.swing.JLabel();
        lbEndereco = new javax.swing.JLabel();
        tfEndereco = new javax.swing.JTextField();
        lbCep = new javax.swing.JLabel();
        tfCep = new javax.swing.JTextField();
        lbComplemento = new javax.swing.JLabel();
        tfComplemento = new javax.swing.JTextField();
        lbNumero = new javax.swing.JLabel();
        tfNumero = new javax.swing.JTextField();
        lbBairro = new javax.swing.JLabel();
        tfBairro = new javax.swing.JTextField();
        lbCidade = new javax.swing.JLabel();
        tfCidade = new javax.swing.JTextField();
        lbEstado = new javax.swing.JLabel();
        tfEstado = new javax.swing.JTextField();
        sprDireita = new javax.swing.JSeparator();
        rbPessoaFisica = new javax.swing.JRadioButton();
        rbPessoaJuridica = new javax.swing.JRadioButton();
        pnPessoa = new javax.swing.JPanel();
        lbPessoaFisica = new javax.swing.JLabel();
        lbOpcional4 = new javax.swing.JLabel();
        lbCpfCnpj = new javax.swing.JLabel();
        tfCpfCnpj = new javax.swing.JTextField();
        lbRgRazaoSocial = new javax.swing.JLabel();
        tfRgRazaoSocial = new javax.swing.JTextField();
        lbNascimentoFundacao = new javax.swing.JLabel();
        tfNascimentoFundacao = new javax.swing.JTextField();
        pnPessoaJuridica = new javax.swing.JPanel();
        lbEstadual = new javax.swing.JLabel();
        tfEstadual = new javax.swing.JTextField();
        lbMunicipal = new javax.swing.JLabel();
        tfMunicipal = new javax.swing.JTextField();
        lbSuframa = new javax.swing.JLabel();
        tfSuframa = new javax.swing.JTextField();
        rbIcms = new javax.swing.JRadioButton();
        sprRodape = new javax.swing.JSeparator();
        btnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cliente");
        setResizable(false);

        pnTitulo.setBackground(new java.awt.Color(51, 51, 51));

        lbTitulo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo.setText("Novo Cliente");

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

        lbNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbNome.setForeground(new java.awt.Color(102, 102, 102));
        lbNome.setText("Nome");

        tfNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfNome.setForeground(new java.awt.Color(102, 102, 102));
        tfNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNomeKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout pnObrigatorioLayout = new javax.swing.GroupLayout(pnObrigatorio);
        pnObrigatorio.setLayout(pnObrigatorioLayout);
        pnObrigatorioLayout.setHorizontalGroup(
            pnObrigatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnObrigatorioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnObrigatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNome))
                .addGap(3, 3, 3))
        );
        pnObrigatorioLayout.setVerticalGroup(
            pnObrigatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnObrigatorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        rbPublicidade.setBackground(new java.awt.Color(255, 255, 255));
        rbPublicidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rbPublicidade.setForeground(new java.awt.Color(102, 102, 102));
        rbPublicidade.setText("Receber publicidade por email");
        rbPublicidade.setFocusable(false);

        lbContato.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbContato.setForeground(new java.awt.Color(0, 102, 205));
        lbContato.setText("contato");

        lbOpcional1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbOpcional1.setForeground(new java.awt.Color(102, 102, 102));
        lbOpcional1.setText("(Opcional)");

        lbEmail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbEmail.setForeground(new java.awt.Color(102, 102, 102));
        lbEmail.setText("E-mail");

        tfEmail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfEmail.setForeground(new java.awt.Color(102, 102, 102));
        tfEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfEmailKeyTyped(evt);
            }
        });

        lbTelefone.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbTelefone.setForeground(new java.awt.Color(102, 102, 102));
        lbTelefone.setText("Telefone comercial");

        tfTelefone.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfTelefone.setForeground(new java.awt.Color(102, 102, 102));
        tfTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfTelefoneKeyTyped(evt);
            }
        });

        lbCelular.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbCelular.setForeground(new java.awt.Color(102, 102, 102));
        lbCelular.setText("Telefone celular");

        tfCelular.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfCelular.setForeground(new java.awt.Color(102, 102, 102));
        tfCelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCelularKeyTyped(evt);
            }
        });

        lbCliente.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbCliente.setForeground(new java.awt.Color(0, 102, 205));
        lbCliente.setText("cliente");

        lbOpcional2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbOpcional2.setForeground(new java.awt.Color(102, 102, 102));
        lbOpcional2.setText("(Opcional)");

        lbSalario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbSalario.setForeground(new java.awt.Color(102, 102, 102));
        lbSalario.setText("Faixa salarial");

        ftfSalario.setForeground(new java.awt.Color(102, 102, 102));
        ftfSalario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0.00"))));
        ftfSalario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ftfSalario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ftfSalarioKeyTyped(evt);
            }
        });

        lbLimite.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbLimite.setForeground(new java.awt.Color(102, 102, 102));
        lbLimite.setText("Limite");

        ftfLimite.setForeground(new java.awt.Color(102, 102, 102));
        ftfLimite.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("###0.00"))));
        ftfLimite.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ftfLimite.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ftfLimiteKeyTyped(evt);
            }
        });

        lbDesconto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbDesconto.setForeground(new java.awt.Color(102, 102, 102));
        lbDesconto.setText("Desconto");

        ftfDesconto.setForeground(new java.awt.Color(102, 102, 102));
        ftfDesconto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        ftfDesconto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ftfDescontoKeyTyped(evt);
            }
        });

        lbMaisEndereco.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbMaisEndereco.setForeground(new java.awt.Color(0, 102, 205));
        lbMaisEndereco.setText("endereço");

        lbOpcional3.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbOpcional3.setForeground(new java.awt.Color(102, 102, 102));
        lbOpcional3.setText("(Opcional)");

        lbEndereco.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbEndereco.setForeground(new java.awt.Color(102, 102, 102));
        lbEndereco.setText("Endereço");

        tfEndereco.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfEndereco.setForeground(new java.awt.Color(102, 102, 102));
        tfEndereco.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfEnderecoKeyTyped(evt);
            }
        });

        lbCep.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbCep.setForeground(new java.awt.Color(102, 102, 102));
        lbCep.setText("CEP");

        tfCep.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfCep.setForeground(new java.awt.Color(102, 102, 102));
        tfCep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCepKeyTyped(evt);
            }
        });

        lbComplemento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbComplemento.setForeground(new java.awt.Color(102, 102, 102));
        lbComplemento.setText("Complemento");

        tfComplemento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfComplemento.setForeground(new java.awt.Color(102, 102, 102));
        tfComplemento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfComplementoKeyTyped(evt);
            }
        });

        lbNumero.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbNumero.setForeground(new java.awt.Color(102, 102, 102));
        lbNumero.setText("Número");

        tfNumero.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfNumero.setForeground(new java.awt.Color(102, 102, 102));
        tfNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNumeroKeyTyped(evt);
            }
        });

        lbBairro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbBairro.setForeground(new java.awt.Color(102, 102, 102));
        lbBairro.setText("Bairro");

        tfBairro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfBairro.setForeground(new java.awt.Color(102, 102, 102));
        tfBairro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfBairroKeyTyped(evt);
            }
        });

        lbCidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbCidade.setForeground(new java.awt.Color(102, 102, 102));
        lbCidade.setText("Cidade");

        tfCidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfCidade.setForeground(new java.awt.Color(102, 102, 102));
        tfCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCidadeKeyTyped(evt);
            }
        });

        lbEstado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbEstado.setForeground(new java.awt.Color(102, 102, 102));
        lbEstado.setText("Estado");

        tfEstado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfEstado.setForeground(new java.awt.Color(102, 102, 102));
        tfEstado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfEstadoKeyTyped(evt);
            }
        });

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
        rbPessoaJuridica.setText("Pessoa Jurídica ");
        rbPessoaJuridica.setFocusable(false);
        rbPessoaJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPessoaJuridicaActionPerformed(evt);
            }
        });

        pnPessoa.setBackground(new java.awt.Color(255, 255, 255));

        lbPessoaFisica.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbPessoaFisica.setForeground(new java.awt.Color(0, 102, 205));
        lbPessoaFisica.setText("pessoa física");

        lbOpcional4.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbOpcional4.setForeground(new java.awt.Color(102, 102, 102));
        lbOpcional4.setText("(Opcional)");

        lbCpfCnpj.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbCpfCnpj.setForeground(new java.awt.Color(102, 102, 102));
        lbCpfCnpj.setText("CPF");

        tfCpfCnpj.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfCpfCnpj.setForeground(new java.awt.Color(102, 102, 102));
        tfCpfCnpj.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCpfCnpjKeyTyped(evt);
            }
        });

        lbRgRazaoSocial.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbRgRazaoSocial.setForeground(new java.awt.Color(102, 102, 102));
        lbRgRazaoSocial.setText("RG");

        tfRgRazaoSocial.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfRgRazaoSocial.setForeground(new java.awt.Color(102, 102, 102));
        tfRgRazaoSocial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfRgRazaoSocialKeyTyped(evt);
            }
        });

        lbNascimentoFundacao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbNascimentoFundacao.setForeground(new java.awt.Color(102, 102, 102));
        lbNascimentoFundacao.setText("Nascimento");

        tfNascimentoFundacao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfNascimentoFundacao.setForeground(new java.awt.Color(102, 102, 102));
        tfNascimentoFundacao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNascimentoFundacaoKeyTyped(evt);
            }
        });

        pnPessoaJuridica.setBackground(new java.awt.Color(255, 255, 255));

        lbEstadual.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbEstadual.setForeground(new java.awt.Color(102, 102, 102));
        lbEstadual.setText("Iscrição Estadual");

        tfEstadual.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfEstadual.setForeground(new java.awt.Color(102, 102, 102));
        tfEstadual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfEstadualKeyTyped(evt);
            }
        });

        lbMunicipal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbMunicipal.setForeground(new java.awt.Color(102, 102, 102));
        lbMunicipal.setText("Inscrição Municipal");

        tfMunicipal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfMunicipal.setForeground(new java.awt.Color(102, 102, 102));
        tfMunicipal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfMunicipalKeyTyped(evt);
            }
        });

        lbSuframa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbSuframa.setForeground(new java.awt.Color(102, 102, 102));
        lbSuframa.setText("Inscrição SUFRAMA");

        tfSuframa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfSuframa.setForeground(new java.awt.Color(102, 102, 102));
        tfSuframa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfSuframaKeyTyped(evt);
            }
        });

        rbIcms.setBackground(new java.awt.Color(255, 255, 255));
        rbIcms.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rbIcms.setForeground(new java.awt.Color(102, 102, 102));
        rbIcms.setText("Isento ICMS");
        rbIcms.setFocusable(false);

        javax.swing.GroupLayout pnPessoaJuridicaLayout = new javax.swing.GroupLayout(pnPessoaJuridica);
        pnPessoaJuridica.setLayout(pnPessoaJuridicaLayout);
        pnPessoaJuridicaLayout.setHorizontalGroup(
            pnPessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPessoaJuridicaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbIcms)
                    .addGroup(pnPessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbEstadual)
                        .addComponent(lbSuframa)
                        .addComponent(lbMunicipal)
                        .addComponent(tfSuframa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(tfMunicipal, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tfEstadual)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnPessoaJuridicaLayout.setVerticalGroup(
            pnPessoaJuridicaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPessoaJuridicaLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lbEstadual)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbMunicipal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfMunicipal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbSuframa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfSuframa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbIcms, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnPessoaLayout = new javax.swing.GroupLayout(pnPessoa);
        pnPessoa.setLayout(pnPessoaLayout);
        pnPessoaLayout.setHorizontalGroup(
            pnPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPessoaLayout.createSequentialGroup()
                .addGroup(pnPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPessoaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbCpfCnpj)
                            .addGroup(pnPessoaLayout.createSequentialGroup()
                                .addComponent(lbPessoaFisica)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbOpcional4))
                            .addComponent(lbNascimentoFundacao)
                            .addComponent(lbRgRazaoSocial)
                            .addComponent(tfNascimentoFundacao, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(tfRgRazaoSocial, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfCpfCnpj)))
                    .addComponent(pnPessoaJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnPessoaLayout.setVerticalGroup(
            pnPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPessoaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPessoaFisica)
                    .addComponent(lbOpcional4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbCpfCnpj)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfCpfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbRgRazaoSocial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfRgRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNascimentoFundacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNascimentoFundacao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnPessoaJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        sprRodape.setForeground(new java.awt.Color(204, 204, 204));

        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnCadastrarUP.png"))); // NOI18N
        btnCadastrar.setBorder(null);
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnCadastrarDOWN.png"))); // NOI18N
        btnCadastrar.setFocusable(false);
        btnCadastrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnCadastrarDOWN.png"))); // NOI18N
        btnCadastrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnCadastrarDOWN.png"))); // NOI18N

        javax.swing.GroupLayout pnCorpoLayout = new javax.swing.GroupLayout(pnCorpo);
        pnCorpo.setLayout(pnCorpoLayout);
        pnCorpoLayout.setHorizontalGroup(
            pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCorpoLayout.createSequentialGroup()
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCorpoLayout.createSequentialGroup()
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(pnCorpoLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(pnCorpoLayout.createSequentialGroup()
                                            .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lbSalario)
                                                .addComponent(ftfSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lbLimite)
                                                .addGroup(pnCorpoLayout.createSequentialGroup()
                                                    .addComponent(ftfLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(ftfDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(pnCorpoLayout.createSequentialGroup()
                                            .addComponent(lbContato)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lbOpcional1))
                                        .addGroup(pnCorpoLayout.createSequentialGroup()
                                            .addComponent(lbCliente)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lbOpcional2))
                                        .addGroup(pnCorpoLayout.createSequentialGroup()
                                            .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lbEmail)
                                                .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lbTelefone))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lbCelular)
                                                .addComponent(tfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCorpoLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(tfEndereco, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnCorpoLayout.createSequentialGroup()
                                            .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tfEstado))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnCorpoLayout.createSequentialGroup()
                                            .addComponent(lbMaisEndereco)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(lbOpcional3))
                                        .addComponent(lbEndereco, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnCorpoLayout.createSequentialGroup()
                                            .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tfCep, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lbCep)
                                                .addComponent(lbBairro))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tfComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lbComplemento)
                                                .addComponent(lbCidade))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lbEstado)
                                                .addComponent(lbNumero)
                                                .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(pnCorpoLayout.createSequentialGroup()
                                    .addGap(422, 422, 422)
                                    .addComponent(lbDesconto)))
                            .addGroup(pnCorpoLayout.createSequentialGroup()
                                .addComponent(pnObrigatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbPublicidade)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sprDireita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnCorpoLayout.createSequentialGroup()
                                .addComponent(rbPessoaFisica)
                                .addGap(0, 0, 0)
                                .addComponent(rbPessoaJuridica))
                            .addComponent(pnPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnCorpoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCadastrar)))
                .addGap(0, 6, Short.MAX_VALUE))
            .addComponent(sprRodape)
        );
        pnCorpoLayout.setVerticalGroup(
            pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCorpoLayout.createSequentialGroup()
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCorpoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sprDireita)
                            .addGroup(pnCorpoLayout.createSequentialGroup()
                                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(rbPessoaFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rbPessoaJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(pnCorpoLayout.createSequentialGroup()
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnObrigatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnCorpoLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(rbPublicidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbContato)
                            .addComponent(lbOpcional1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbEmail)
                            .addComponent(lbTelefone)
                            .addComponent(lbCelular))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCliente)
                            .addComponent(lbOpcional2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbLimite)
                            .addComponent(lbSalario)
                            .addComponent(lbDesconto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ftfDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ftfLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ftfSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbMaisEndereco)
                            .addComponent(lbOpcional3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbEndereco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCep)
                            .addComponent(lbComplemento)
                            .addComponent(lbNumero))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfCep, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbBairro)
                            .addComponent(lbCidade)
                            .addComponent(lbEstado))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sprRodape, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCadastrar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnCorpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(pnCorpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rbPessoaFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPessoaFisicaActionPerformed
        if (rbPessoaFisica.isSelected()) {
            pnPessoaJuridica.setVisible(false);
            lbPessoaFisica.setText("pessoa física");
            lbCpfCnpj.setText("CPF");
            lbRgRazaoSocial.setText("RG");
            lbNascimentoFundacao.setText("Nascimento");
        }
    }//GEN-LAST:event_rbPessoaFisicaActionPerformed

    private void rbPessoaJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPessoaJuridicaActionPerformed
        if (rbPessoaJuridica.isSelected()) {
            pnPessoaJuridica.setVisible(true);
            lbPessoaFisica.setText("pessoa jurídica");
            lbCpfCnpj.setText("CNPJ");
            lbRgRazaoSocial.setText("Razão Social");
            lbNascimentoFundacao.setText("Fundação");
        }
    }//GEN-LAST:event_rbPessoaJuridicaActionPerformed

    private void tfNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNomeKeyTyped
        if (evt.getKeyChar() != KeyEvent.VK_BACK_SPACE) {
            String caracteres = " aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZçÇáÁàÀãÃâÂéÉèÈêÊíÍìÌîÎóÓòÒõÕôÔúÚùÙûÛ";
            if (!caracteres.contains(evt.getKeyChar() + "") || tfNome.getText().length() > 49) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_tfNomeKeyTyped

    private void tfEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfEmailKeyTyped
        if (tfEmail.getText().length() > 49) {
            evt.consume();
        }
    }//GEN-LAST:event_tfEmailKeyTyped

    private void tfTelefoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTelefoneKeyTyped
        if (evt.getKeyChar() != KeyEvent.VK_BACK_SPACE) {
            String caracteres = "1234567890";
            if (!caracteres.contains(evt.getKeyChar() + "") || tfTelefone.getText().length() > 12) {
                evt.consume();
            }
            if (tfTelefone.getText().length() == 0) {
                tfTelefone.setText(tfTelefone.getText() + "(");
            }
            if (tfTelefone.getText().length() == 3) {
                tfTelefone.setText(tfTelefone.getText() + ")");
            }
            if (tfTelefone.getText().length() == 8) {
                tfTelefone.setText(tfTelefone.getText() + "-");
            }
        }
    }//GEN-LAST:event_tfTelefoneKeyTyped

    private void tfCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCelularKeyTyped
        if (evt.getKeyChar() != KeyEvent.VK_BACK_SPACE) {
            String caracteres = "1234567890";
            if (!caracteres.contains(evt.getKeyChar() + "") || tfCelular.getText().length() > 12) {
                evt.consume();
            }
            if (tfCelular.getText().length() == 0) {
                tfCelular.setText(tfCelular.getText() + "(");
            }
            if (tfCelular.getText().length() == 3) {
                tfCelular.setText(tfCelular.getText() + ")");
            }
            if (tfCelular.getText().length() == 8) {
                tfCelular.setText(tfCelular.getText() + "-");
            }
        }
    }//GEN-LAST:event_tfCelularKeyTyped

    private void tfEnderecoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfEnderecoKeyTyped
        if (tfEndereco.getText().length() > 49) {
            evt.consume();
        }
    }//GEN-LAST:event_tfEnderecoKeyTyped

    private void tfCepKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCepKeyTyped
        if (evt.getKeyChar() != KeyEvent.VK_BACK_SPACE) {
            String caracteres = "1234567890";
            if (!caracteres.contains(evt.getKeyChar() + "") || tfCep.getText().length() > 8) {
                evt.consume();
            }
            if (tfCep.getText().length() == 5) {
                tfCep.setText(tfCep.getText() + "-");
            }
        }
    }//GEN-LAST:event_tfCepKeyTyped

    private void tfComplementoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfComplementoKeyTyped
        if (tfComplemento.getText().length() > 19) {
            evt.consume();
        }
    }//GEN-LAST:event_tfComplementoKeyTyped

    private void tfNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNumeroKeyTyped
        String caracteres = "1234567890";
        if (!caracteres.contains(evt.getKeyChar() + "") || tfNumero.getText().length() > 9) {
            evt.consume();
        }
    }//GEN-LAST:event_tfNumeroKeyTyped

    private void tfBairroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBairroKeyTyped
        if (tfBairro.getText().length() > 19) {
            evt.consume();
        }
    }//GEN-LAST:event_tfBairroKeyTyped

    private void tfCidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCidadeKeyTyped
        if (tfCidade.getText().length() > 19) {
            evt.consume();
        }
    }//GEN-LAST:event_tfCidadeKeyTyped

    private void tfEstadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfEstadoKeyTyped
        if (tfEstado.getText().length() > 19) {
            evt.consume();
        }
    }//GEN-LAST:event_tfEstadoKeyTyped

    private void tfCpfCnpjKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCpfCnpjKeyTyped
        if (evt.getKeyChar() != KeyEvent.VK_BACK_SPACE) {
            String caracteres = "12345678900";
            if (!caracteres.contains(evt.getKeyChar() + "") || tfCpfCnpj.getText().length() > 13) {
                evt.consume();
            }
            if (tfCpfCnpj.getText().length() == 3 || tfCpfCnpj.getText().length() == 7) {
                tfCpfCnpj.setText(tfCpfCnpj.getText() + ".");
            }
            if (tfCpfCnpj.getText().length() == 11) {
                tfCpfCnpj.setText(tfCpfCnpj.getText() + "-");
            }
        }
    }//GEN-LAST:event_tfCpfCnpjKeyTyped

    private void tfRgRazaoSocialKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfRgRazaoSocialKeyTyped
        if (tfRgRazaoSocial.getText().length() > 19) {
            evt.consume();
        }
    }//GEN-LAST:event_tfRgRazaoSocialKeyTyped

    private void tfNascimentoFundacaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNascimentoFundacaoKeyTyped
        if (evt.getKeyChar() != KeyEvent.VK_BACK_SPACE) {
            String caracteres = "1234567890";
            if (!caracteres.contains(evt.getKeyChar() + "") || tfNascimentoFundacao.getText().length() > 9) {
                evt.consume();
            }
            if (tfNascimentoFundacao.getText().length() == 2 || tfNascimentoFundacao.getText().length() == 5) {
                tfNascimentoFundacao.setText(tfNascimentoFundacao.getText() + "/");
            }
        }
    }//GEN-LAST:event_tfNascimentoFundacaoKeyTyped

    private void tfEstadualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfEstadualKeyTyped
        String caracteres = "1234567890";
        if (!caracteres.contains(evt.getKeyChar() + "") || tfEstadual.getText().length() > 49) {
            evt.consume();
        }
    }//GEN-LAST:event_tfEstadualKeyTyped

    private void tfMunicipalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMunicipalKeyTyped
        String caracteres = "1234567890";
        if (!caracteres.contains(evt.getKeyChar() + "") || tfMunicipal.getText().length() > 49) {
            evt.consume();
        }
    }//GEN-LAST:event_tfMunicipalKeyTyped

    private void tfSuframaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSuframaKeyTyped
        String caracteres = "1234567890";
        if (!caracteres.contains(evt.getKeyChar() + "") || tfSuframa.getText().length() > 49) {
            evt.consume();
        }
    }//GEN-LAST:event_tfSuframaKeyTyped

    private void ftfSalarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ftfSalarioKeyTyped
        String caracteres = ",1234567890";
        if (!caracteres.contains(evt.getKeyChar() + "") || ftfSalario.getText().length() > 49) {
            evt.consume();
        }
    }//GEN-LAST:event_ftfSalarioKeyTyped

    private void ftfLimiteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ftfLimiteKeyTyped
        String caracteres = ",1234567890";
        if (!caracteres.contains(evt.getKeyChar() + "") || ftfLimite.getText().length() > 49) {
            evt.consume();
        }
    }//GEN-LAST:event_ftfLimiteKeyTyped

    private void ftfDescontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ftfDescontoKeyTyped
        String caracteres = ",1234567890";
        if (!caracteres.contains(evt.getKeyChar() + "") || ftfDesconto.getText().length() > 49) {
            evt.consume();
        }
    }//GEN-LAST:event_ftfDescontoKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFormattedTextField ftfDesconto;
    private javax.swing.JFormattedTextField ftfLimite;
    private javax.swing.JFormattedTextField ftfSalario;
    private javax.swing.JLabel lbBairro;
    private javax.swing.JLabel lbCelular;
    private javax.swing.JLabel lbCep;
    private javax.swing.JLabel lbCidade;
    private javax.swing.JLabel lbCliente;
    private javax.swing.JLabel lbComplemento;
    private javax.swing.JLabel lbContato;
    private javax.swing.JLabel lbCpfCnpj;
    private javax.swing.JLabel lbDesconto;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEndereco;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbEstadual;
    private javax.swing.JLabel lbLimite;
    private javax.swing.JLabel lbMaisEndereco;
    private javax.swing.JLabel lbMunicipal;
    private javax.swing.JLabel lbNascimentoFundacao;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNumero;
    private javax.swing.JLabel lbOpcional1;
    private javax.swing.JLabel lbOpcional2;
    private javax.swing.JLabel lbOpcional3;
    private javax.swing.JLabel lbOpcional4;
    private javax.swing.JLabel lbPessoaFisica;
    private javax.swing.JLabel lbRgRazaoSocial;
    private javax.swing.JLabel lbSalario;
    private javax.swing.JLabel lbSuframa;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel pnCorpo;
    private javax.swing.JPanel pnObrigatorio;
    private javax.swing.JPanel pnPessoa;
    private javax.swing.JPanel pnPessoaJuridica;
    private javax.swing.JPanel pnTitulo;
    private javax.swing.JRadioButton rbIcms;
    private javax.swing.JRadioButton rbPessoaFisica;
    private javax.swing.JRadioButton rbPessoaJuridica;
    private javax.swing.JRadioButton rbPublicidade;
    private javax.swing.JSeparator sprDireita;
    private javax.swing.JSeparator sprRodape;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JTextField tfCelular;
    private javax.swing.JTextField tfCep;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JTextField tfComplemento;
    private javax.swing.JTextField tfCpfCnpj;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfEstado;
    private javax.swing.JTextField tfEstadual;
    private javax.swing.JTextField tfMunicipal;
    private javax.swing.JTextField tfNascimentoFundacao;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfRgRazaoSocial;
    private javax.swing.JTextField tfSuframa;
    private javax.swing.JTextField tfTelefone;
    // End of variables declaration//GEN-END:variables
}
