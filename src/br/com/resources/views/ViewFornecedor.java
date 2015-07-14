package br.com.resources.views;

import br.com.models.vo.Fornecedor;

/**
 *
 * @see Classe visual. JDialog que tem como objetivo cadastrar um novo
 * fornecedor.
 *
 * @author Bruna Danieli Ribeiro Gonçalves, Márlon Ândrel Coelho Freitas
 */
public class ViewFornecedor extends javax.swing.JDialog {

    /**
     *
     * @see Construtor padrão.
     *
     * @param parent
     * @param modal
     * @param pai
     */
    public ViewFornecedor(java.awt.Frame parent, boolean modal, ViewPainelControle pai) {
        //Inicialização dos componentes padrões do JDialog.
        super(parent, modal);
        initComponents();
        pnPessoaJuridica.setVisible(false);
        viewPainelControle = pai;
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
        lbEmpresa = new javax.swing.JLabel();
        tfEmpresa = new javax.swing.JTextField();
        lbContato = new javax.swing.JLabel();
        lbOpcional1 = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        lbTelefone = new javax.swing.JLabel();
        tfTelefone = new javax.swing.JTextField();
        lbCelular = new javax.swing.JLabel();
        tfCelular = new javax.swing.JTextField();
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
        setTitle("Fornecedor");
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

        lbNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbNome.setForeground(new java.awt.Color(102, 102, 102));
        lbNome.setText("Nome do contato");

        tfNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfNome.setForeground(new java.awt.Color(102, 102, 102));

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
                .addGap(0, 0, 0)
                .addComponent(lbNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lbEmpresa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbEmpresa.setForeground(new java.awt.Color(102, 102, 102));
        lbEmpresa.setText("Empresa");

        tfEmpresa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfEmpresa.setForeground(new java.awt.Color(102, 102, 102));

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

        lbTelefone.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbTelefone.setForeground(new java.awt.Color(102, 102, 102));
        lbTelefone.setText("Telefone comercial");

        tfTelefone.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfTelefone.setForeground(new java.awt.Color(102, 102, 102));

        lbCelular.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbCelular.setForeground(new java.awt.Color(102, 102, 102));
        lbCelular.setText("Telefone celular");

        tfCelular.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfCelular.setForeground(new java.awt.Color(102, 102, 102));

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

        lbCidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbCidade.setForeground(new java.awt.Color(102, 102, 102));
        lbCidade.setText("Cidade");

        tfCidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfCidade.setForeground(new java.awt.Color(102, 102, 102));

        lbEstado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbEstado.setForeground(new java.awt.Color(102, 102, 102));
        lbEstado.setText("Estado");

        tfEstado.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfEstado.setForeground(new java.awt.Color(102, 102, 102));

        sprDireita.setForeground(new java.awt.Color(204, 204, 204));
        sprDireita.setOrientation(javax.swing.SwingConstants.VERTICAL);

        rbPessoaFisica.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbPessoaFisica);
        rbPessoaFisica.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rbPessoaFisica.setForeground(new java.awt.Color(102, 102, 102));
        rbPessoaFisica.setText("Pessoa Física");
        rbPessoaFisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPessoaFisicaActionPerformed(evt);
            }
        });

        rbPessoaJuridica.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbPessoaJuridica);
        rbPessoaJuridica.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rbPessoaJuridica.setForeground(new java.awt.Color(102, 102, 102));
        rbPessoaJuridica.setSelected(true);
        rbPessoaJuridica.setText("Pessoa Jurídica ");
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

        lbRgRazaoSocial.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbRgRazaoSocial.setForeground(new java.awt.Color(102, 102, 102));
        lbRgRazaoSocial.setText("RG");

        tfRgRazaoSocial.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfRgRazaoSocial.setForeground(new java.awt.Color(102, 102, 102));

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

        lbMunicipal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbMunicipal.setForeground(new java.awt.Color(102, 102, 102));
        lbMunicipal.setText("Inscrição Municipal");

        tfMunicipal.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfMunicipal.setForeground(new java.awt.Color(102, 102, 102));

        lbSuframa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbSuframa.setForeground(new java.awt.Color(102, 102, 102));
        lbSuframa.setText("Inscrição SUFRAMA");

        tfSuframa.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfSuframa.setForeground(new java.awt.Color(102, 102, 102));

        rbIcms.setBackground(new java.awt.Color(255, 255, 255));
        rbIcms.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rbIcms.setForeground(new java.awt.Color(102, 102, 102));
        rbIcms.setText("Isento ICMS");

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
                .addComponent(pnPessoaJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnPessoaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPessoaLayout.createSequentialGroup()
                        .addComponent(tfNascimentoFundacao)
                        .addContainerGap())
                    .addGroup(pnPessoaLayout.createSequentialGroup()
                        .addGroup(pnPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCpfCnpj)
                            .addGroup(pnPessoaLayout.createSequentialGroup()
                                .addComponent(lbPessoaFisica)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbOpcional4))
                            .addComponent(lbRgRazaoSocial)
                            .addComponent(lbNascimentoFundacao))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPessoaLayout.createSequentialGroup()
                        .addGroup(pnPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfRgRazaoSocial, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfCpfCnpj, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap())))
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
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnCorpoLayout = new javax.swing.GroupLayout(pnCorpo);
        pnCorpo.setLayout(pnCorpoLayout);
        pnCorpoLayout.setHorizontalGroup(
            pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCorpoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCorpoLayout.createSequentialGroup()
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnCorpoLayout.createSequentialGroup()
                                .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfEstado))
                            .addGroup(pnCorpoLayout.createSequentialGroup()
                                .addComponent(lbContato)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbOpcional1))
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
                                    .addComponent(tfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnCorpoLayout.createSequentialGroup()
                                .addComponent(lbMaisEndereco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbOpcional3))
                            .addComponent(lbEndereco)
                            .addGroup(pnCorpoLayout.createSequentialGroup()
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
                                    .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnCorpoLayout.createSequentialGroup()
                                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbEmpresa)
                                    .addComponent(tfEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnObrigatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfEndereco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sprDireita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnCorpoLayout.createSequentialGroup()
                                .addComponent(rbPessoaFisica)
                                .addGap(0, 0, 0)
                                .addComponent(rbPessoaJuridica))
                            .addComponent(pnPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnCadastrar)))
            .addComponent(sprRodape)
        );
        pnCorpoLayout.setVerticalGroup(
            pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCorpoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCorpoLayout.createSequentialGroup()
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnObrigatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnCorpoLayout.createSequentialGroup()
                                .addComponent(lbEmpresa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbContato)
                            .addComponent(lbOpcional1))
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbEmail)
                            .addComponent(lbTelefone)
                            .addComponent(lbCelular))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
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
                            .addComponent(tfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(sprDireita)
                    .addGroup(pnCorpoLayout.createSequentialGroup()
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbPessoaFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbPessoaJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void tfNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNumeroKeyTyped
        String caracteres = "(12)3456-7890";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_tfNumeroKeyTyped

    private void tfCepKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCepKeyTyped
        String caracteres = "12345-67890";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_tfCepKeyTyped

    private void tfNascimentoFundacaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNascimentoFundacaoKeyTyped
        String caracteres = "1234567890.";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_tfNascimentoFundacaoKeyTyped

    //Declaração de variáveis(View).
    private final ViewPainelControle viewPainelControle;

    //Declaração de variáveis(Business Object).
    

    //Declaração de variáveis(Value Object).
    private Fornecedor fornecedorVO;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel lbBairro;
    private javax.swing.JLabel lbCelular;
    private javax.swing.JLabel lbCep;
    private javax.swing.JLabel lbCidade;
    private javax.swing.JLabel lbComplemento;
    private javax.swing.JLabel lbContato;
    private javax.swing.JLabel lbCpfCnpj;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEmpresa;
    private javax.swing.JLabel lbEndereco;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbEstadual;
    private javax.swing.JLabel lbMaisEndereco;
    private javax.swing.JLabel lbMunicipal;
    private javax.swing.JLabel lbNascimentoFundacao;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNumero;
    private javax.swing.JLabel lbOpcional1;
    private javax.swing.JLabel lbOpcional3;
    private javax.swing.JLabel lbOpcional4;
    private javax.swing.JLabel lbPessoaFisica;
    private javax.swing.JLabel lbRgRazaoSocial;
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
    private javax.swing.JSeparator sprDireita;
    private javax.swing.JSeparator sprRodape;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JTextField tfCelular;
    private javax.swing.JTextField tfCep;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JTextField tfComplemento;
    private javax.swing.JTextField tfCpfCnpj;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfEmpresa;
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
