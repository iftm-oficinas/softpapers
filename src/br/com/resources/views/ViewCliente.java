package br.com.resources.views;

import br.com.models.bo.ClienteBO;
import br.com.models.vo.Cliente;
import br.com.models.vo.Pessoafisica;
import br.com.models.vo.Pessoajuridica;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;

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
     * @param viewPainelControle
     */
    public ViewCliente(java.awt.Frame parent, boolean modal, ViewPainelControle viewPainelControle) {
        //Inicialização dos componentes padrões do JDialog.
        super(parent, modal);
        initComponents();
        rbPessoaFisica.doClick();
        this.viewPainelControle = viewPainelControle;
        btnAlterarCliente.setVisible(false);
    }

    public ViewCliente(java.awt.Frame parent, boolean modal, ViewPainelControle viewPainelControle, Cliente cliente, Boolean alterar) {
        //Inicialização dos componentes padrões do JDialog.
        super(parent, modal);
        initComponents();
        this.viewPainelControle = viewPainelControle;
        this.clienteVO = cliente;
        clienteBO = new ClienteBO();
        btnCadastrar.setVisible(false);
        lbTitulo.setText("Alterar Cliente");
        rbPessoaFisica.setVisible(false);
        rbPessoaJuridica.setVisible(false);

        //Definindo atributos do objeto para os campos
        tfNomeCliente.setText(cliente.getNomeCliente());
        tfNomeContato.setText(cliente.getContato().getNomeContato());
        tfEmail.setText(cliente.getContato().getEmailContato());
        tfTelefone.setText(cliente.getContato().getTelefoneContato());
        tfCelular.setText(cliente.getContato().getCelularContato());
        ftfSalario.setText(cliente.getSalarioCliente().toString());
        ftfLimite.setText(cliente.getLimiteCliente().toString());
        ftfDesconto.setText(cliente.getDescontoCliente().toString());
        tfEndereco.setText(cliente.getEndereco().getEnderecoEndereco());
        tfCep.setText(cliente.getEndereco().getCepEndereco());
        tfComplemento.setText(cliente.getEndereco().getComplementoEndereco());
        tfNumero.setText(cliente.getEndereco().getNumeroEndereco());
        tfBairro.setText(cliente.getEndereco().getBairroEndereco());
        tfCidade.setText(cliente.getEndereco().getCidadeEndereco());
        tfEstado.setText(cliente.getEndereco().getEstadoEndereco());
        if ("Fisica".equals(cliente.getPessoa().getTipoPessoa())) {
            rbPessoaFisica.doClick();
            Pessoafisica pessoaFisica = clienteBO.buscarPessoaFisica(cliente.getPessoa().getIdPessoa());
            tfCpfCnpj.setText(pessoaFisica.getCpfPessoaFisica());
            tfRgRazaoSocial.setText(pessoaFisica.getRgPessoaFisica());
            tfNascimentoFundacao.setText(new SimpleDateFormat("dd/MM/yyyy").format(pessoaFisica.getNascimentoPessoaFisica()));
        } else {
            rbPessoaJuridica.doClick();
            Pessoajuridica pessoaJuridica = clienteBO.buscarPessoaJuridica(cliente.getPessoa().getIdPessoa());
            tfCpfCnpj.setText(pessoaJuridica.getCnpjPessoaJuridica());
            tfRgRazaoSocial.setText(pessoaJuridica.getRazaoSocialPessoaJuridica());
            tfNascimentoFundacao.setText(new SimpleDateFormat("dd/MM/yyyy").format(pessoaJuridica.getFundacaoPessoaJuridica()));
            tfEstadual.setText(pessoaJuridica.getEstadualPessoaJuridica());
            tfMunicipal.setText(pessoaJuridica.getMunicipalPessoaJuridica());
            tfSuframa.setText(pessoaJuridica.getSuframaPessoaJuridica());
            if (pessoaJuridica.getIcmsPessoaJuridica()) {
                rbIcms.doClick();
            }
        }

        //Definindo como não editável
        if (!alterar) {
            lbTitulo.setText("Cliente");
            btnAlterarCliente.setVisible(false);
            tfNomeCliente.setEditable(false);
            tfNomeContato.setEditable(false);
            tfEmail.setEditable(false);
            tfTelefone.setEditable(false);
            tfCelular.setEditable(false);
            ftfSalario.setEditable(false);
            ftfLimite.setEditable(false);
            ftfDesconto.setEditable(false);
            tfEndereco.setEditable(false);
            tfCep.setEditable(false);
            tfComplemento.setEditable(false);
            tfNumero.setEditable(false);
            tfBairro.setEditable(false);
            tfCidade.setEditable(false);
            tfEstado.setEditable(false);
            rbIcms.setEnabled(false);
            rbPessoaFisica.setEnabled(false);
            rbPessoaJuridica.setEnabled(false);
            tfCpfCnpj.setEnabled(false);
            tfRgRazaoSocial.setEnabled(false);
            tfNascimentoFundacao.setEnabled(false);
            tfEstadual.setEnabled(false);
            tfMunicipal.setEnabled(false);
            tfSuframa.setEnabled(false);
        }
    }

    //Componentes padrões do JFrame.
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnTitulo = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        pnCorpo = new javax.swing.JPanel();
        lbContato = new javax.swing.JLabel();
        lbOpcional1 = new javax.swing.JLabel();
        lbNomeContato = new javax.swing.JLabel();
        tfNomeContato = new javax.swing.JTextField();
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
        sprRodape = new javax.swing.JSeparator();
        btnCadastrar = new javax.swing.JButton();
        btnAlterarCliente = new javax.swing.JButton();
        pnPessoa = new javax.swing.JPanel();
        tfMunicipal = new javax.swing.JTextField();
        lbSuframa = new javax.swing.JLabel();
        tfSuframa = new javax.swing.JTextField();
        rbIcms = new javax.swing.JRadioButton();
        lbEstadual = new javax.swing.JLabel();
        tfEstadual = new javax.swing.JTextField();
        lbMunicipal = new javax.swing.JLabel();
        lbNomeCliente = new javax.swing.JLabel();
        tfNomeCliente = new javax.swing.JTextField();
        rbPessoaFisica = new javax.swing.JRadioButton();
        rbPessoaJuridica = new javax.swing.JRadioButton();
        lbOpcional4 = new javax.swing.JLabel();
        lbCpfCnpj = new javax.swing.JLabel();
        tfCpfCnpj = new javax.swing.JTextField();
        lbRgRazaoSocial = new javax.swing.JLabel();
        tfRgRazaoSocial = new javax.swing.JTextField();
        lbNascimentoFundacao = new javax.swing.JLabel();
        tfNascimentoFundacao = new javax.swing.JTextField();
        lbPessoaFisica = new javax.swing.JLabel();

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

        lbContato.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbContato.setForeground(new java.awt.Color(0, 102, 205));
        lbContato.setText("contato");

        lbOpcional1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbOpcional1.setForeground(new java.awt.Color(102, 102, 102));
        lbOpcional1.setText("(Opcional)");

        lbNomeContato.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbNomeContato.setForeground(new java.awt.Color(102, 102, 102));
        lbNomeContato.setText("Nome do contato");

        tfNomeContato.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfNomeContato.setForeground(new java.awt.Color(102, 102, 102));
        tfNomeContato.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNomeContatoKeyTyped(evt);
            }
        });

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

        btnAlterarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarUP.png"))); // NOI18N
        btnAlterarCliente.setBorder(null);
        btnAlterarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterarCliente.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N
        btnAlterarCliente.setFocusable(false);
        btnAlterarCliente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N
        btnAlterarCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N
        btnAlterarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarClienteActionPerformed(evt);
            }
        });

        pnPessoa.setBackground(new java.awt.Color(255, 255, 255));

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

        javax.swing.GroupLayout pnPessoaLayout = new javax.swing.GroupLayout(pnPessoa);
        pnPessoa.setLayout(pnPessoaLayout);
        pnPessoaLayout.setHorizontalGroup(
            pnPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPessoaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPessoaLayout.createSequentialGroup()
                        .addGroup(pnPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbMunicipal)
                            .addComponent(lbEstadual)
                            .addComponent(rbIcms)
                            .addComponent(lbSuframa))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tfEstadual)
                    .addComponent(tfMunicipal)
                    .addComponent(tfSuframa))
                .addContainerGap())
        );
        pnPessoaLayout.setVerticalGroup(
            pnPessoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPessoaLayout.createSequentialGroup()
                .addContainerGap()
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
                .addComponent(rbIcms, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        lbNomeCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbNomeCliente.setForeground(new java.awt.Color(102, 102, 102));
        lbNomeCliente.setText("Nome do Cliente");

        tfNomeCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfNomeCliente.setForeground(new java.awt.Color(102, 102, 102));
        tfNomeCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNomeClienteKeyTyped(evt);
            }
        });

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
        rbPessoaJuridica.setText("Pessoa Jurídica     ");
        rbPessoaJuridica.setFocusable(false);
        rbPessoaJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbPessoaJuridicaActionPerformed(evt);
            }
        });

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

        lbPessoaFisica.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbPessoaFisica.setForeground(new java.awt.Color(0, 102, 205));
        lbPessoaFisica.setText("pessoa física");

        javax.swing.GroupLayout pnCorpoLayout = new javax.swing.GroupLayout(pnCorpo);
        pnCorpo.setLayout(pnCorpoLayout);
        pnCorpoLayout.setHorizontalGroup(
            pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCorpoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterarCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(sprRodape)
            .addGroup(pnCorpoLayout.createSequentialGroup()
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCorpoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                                    .addComponent(tfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                            .addComponent(tfNomeContato, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfNomeCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnCorpoLayout.createSequentialGroup()
                        .addGap(422, 422, 422)
                        .addComponent(lbDesconto))
                    .addGroup(pnCorpoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNomeContato)
                            .addComponent(lbNomeCliente)))
                    .addGroup(pnCorpoLayout.createSequentialGroup()
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
                                    .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sprDireita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnCorpoLayout.createSequentialGroup()
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnCorpoLayout.createSequentialGroup()
                                .addComponent(rbPessoaFisica)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbPessoaJuridica)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnCorpoLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfCpfCnpj, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tfRgRazaoSocial, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnCorpoLayout.createSequentialGroup()
                                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnCorpoLayout.createSequentialGroup()
                                                .addComponent(lbPessoaFisica)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbOpcional4))
                                            .addComponent(lbCpfCnpj)
                                            .addComponent(lbRgRazaoSocial)
                                            .addComponent(lbNascimentoFundacao))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(tfNascimentoFundacao))))
                        .addContainerGap())))
        );
        pnCorpoLayout.setVerticalGroup(
            pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCorpoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sprDireita)
                    .addGroup(pnCorpoLayout.createSequentialGroup()
                        .addComponent(lbNomeCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbContato)
                            .addComponent(lbOpcional1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbNomeContato)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNomeContato, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCliente)
                            .addComponent(lbOpcional2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbLimite)
                            .addComponent(lbSalario)
                            .addComponent(lbDesconto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ftfDesconto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ftfLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ftfSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                    .addGroup(pnCorpoLayout.createSequentialGroup()
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbPessoaFisica, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbPessoaJuridica, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                        .addGap(0, 0, 0)
                        .addComponent(pnPessoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sprRodape, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadastrar)
                    .addComponent(btnAlterarCliente))
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

    /**
     *
     * @see Métodos usados para controlar apresentação dos RadioButton
     * PessoaFisica e PessoaJuridica.
     *
     * @param evt
     */
    private void rbPessoaFisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPessoaFisicaActionPerformed
        if (rbPessoaFisica.isSelected()) {

            lbPessoaFisica.setText("pessoa física");
            lbCpfCnpj.setText("CPF");
            lbRgRazaoSocial.setText("RG");
            lbNascimentoFundacao.setText("Nascimento");
            lbEstadual.setVisible(false);
            tfEstadual.setVisible(false);
            lbMunicipal.setVisible(false);
            tfMunicipal.setVisible(false);
            lbSuframa.setVisible(false);
            tfSuframa.setVisible(false);
            rbIcms.setVisible(false);
        }
    }//GEN-LAST:event_rbPessoaFisicaActionPerformed

    private void rbPessoaJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbPessoaJuridicaActionPerformed
        if (rbPessoaJuridica.isSelected()) {
            lbPessoaFisica.setText("pessoa jurídica");
            lbCpfCnpj.setText("CNPJ");
            lbRgRazaoSocial.setText("Razão Social");
            lbNascimentoFundacao.setText("Fundação");
            lbEstadual.setVisible(true);
            tfEstadual.setVisible(true);
            lbMunicipal.setVisible(true);
            tfMunicipal.setVisible(true);
            lbSuframa.setVisible(true);
            tfSuframa.setVisible(true);
            rbIcms.setVisible(true);
        }
    }//GEN-LAST:event_rbPessoaJuridicaActionPerformed

    /**
     *
     * @see Conjunto de Métodos que recebem o evento KeyTyped do teclado para
     * validar a entrada de valores nos campos de texto.
     *
     * @param evt
     */
    private void tfNomeClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNomeClienteKeyTyped
        if (evt.getKeyChar() != KeyEvent.VK_BACK_SPACE) {
            String caracteres = " aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZçÇáÁàÀãÃâÂéÉèÈêÊíÍìÌîÎóÓòÒõÕôÔúÚùÙûÛ";
            if (!caracteres.contains(evt.getKeyChar() + "") || tfNomeCliente.getText().length() > 49) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_tfNomeClienteKeyTyped

    private void tfEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfEmailKeyTyped
        if (tfEmail.getText().length() > 29) {
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
        if (!caracteres.contains(evt.getKeyChar() + "") || tfEstadual.getText().length() > 44) {
            evt.consume();
        }
    }//GEN-LAST:event_tfEstadualKeyTyped

    private void tfMunicipalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfMunicipalKeyTyped
        String caracteres = "1234567890";
        if (!caracteres.contains(evt.getKeyChar() + "") || tfMunicipal.getText().length() > 44) {
            evt.consume();
        }
    }//GEN-LAST:event_tfMunicipalKeyTyped

    private void tfSuframaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSuframaKeyTyped
        String caracteres = "1234567890";
        if (!caracteres.contains(evt.getKeyChar() + "") || tfSuframa.getText().length() > 44) {
            evt.consume();
        }
    }//GEN-LAST:event_tfSuframaKeyTyped

    private void ftfSalarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ftfSalarioKeyTyped
        String caracteres = ".1234567890";
        if (!caracteres.contains(evt.getKeyChar() + "") || ftfSalario.getText().length() > 19) {
            evt.consume();
        }
    }//GEN-LAST:event_ftfSalarioKeyTyped

    private void ftfLimiteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ftfLimiteKeyTyped
        String caracteres = ".1234567890";
        if (!caracteres.contains(evt.getKeyChar() + "") || ftfLimite.getText().length() > 19) {
            evt.consume();
        }
    }//GEN-LAST:event_ftfLimiteKeyTyped

    private void ftfDescontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ftfDescontoKeyTyped
        String caracteres = ".1234567890";
        if (!caracteres.contains(evt.getKeyChar() + "") || ftfDesconto.getText().length() > 19) {
            evt.consume();
        }
    }//GEN-LAST:event_ftfDescontoKeyTyped

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        btnCadastrar.setEnabled(false);
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        clienteBO = new ClienteBO();
        if (clienteBO.validarCampos(pnCorpo)) {
            if (clienteBO.inserirCliente(tfNomeCliente.getText(), tfNomeContato.getText(), tfEmail.getText(), tfTelefone.getText(), tfCelular.getText(), ftfSalario.getText(), ftfLimite.getText(), ftfDesconto.getText(), tfEndereco.getText(), tfCep.getText(), tfComplemento.getText(), tfNumero.getText(), tfBairro.getText(), tfCidade.getText(), tfEstado.getText(), rbPessoaFisica.isSelected(), tfCpfCnpj.getText(), tfRgRazaoSocial.getText(), tfNascimentoFundacao.getText(), tfEstadual.getText(), tfMunicipal.getText(), tfSuframa.getText(), rbIcms.isSelected())) {
                viewPainelControle.atualizarTabelas();
                this.dispose();
            }
        }
        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        btnCadastrar.setEnabled(true);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnAlterarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarClienteActionPerformed
        btnAlterarCliente.setEnabled(false);
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        clienteBO = new ClienteBO();
        if (clienteBO.validarCampos(pnCorpo)) {
            if (clienteBO.alterarCliente(clienteVO.getIdCliente(), clienteVO.getPessoa().getIdPessoa(), clienteVO.getContato().getIdContato(), clienteVO.getEndereco().getIdEndereco(), tfNomeCliente.getText(), tfNomeContato.getText(), tfEmail.getText(), tfTelefone.getText(), tfCelular.getText(), ftfSalario.getText(), ftfLimite.getText(), ftfDesconto.getText(), tfEndereco.getText(), tfCep.getText(), tfComplemento.getText(), tfNumero.getText(), tfBairro.getText(), tfCidade.getText(), tfEstado.getText(), rbPessoaFisica.isSelected(), tfCpfCnpj.getText(), tfRgRazaoSocial.getText(), tfNascimentoFundacao.getText(), tfEstadual.getText(), tfMunicipal.getText(), tfSuframa.getText(), rbIcms.isSelected())) {
                viewPainelControle.atualizarTabelas();
                this.dispose();
            }
        }
        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        btnAlterarCliente.setEnabled(true);
    }//GEN-LAST:event_btnAlterarClienteActionPerformed

    private void tfNomeContatoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNomeContatoKeyTyped
        if (evt.getKeyChar() != KeyEvent.VK_BACK_SPACE) {
            String caracteres = " aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZçÇáÁàÀãÃâÂéÉèÈêÊíÍìÌîÎóÓòÒõÕôÔúÚùÙûÛ";
            if (!caracteres.contains(evt.getKeyChar() + "") || tfNomeContato.getText().length() > 49) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_tfNomeContatoKeyTyped

    //Declaração de variáveis(View).
    private final ViewPainelControle viewPainelControle;

    //Declaração de variáveis(Value Object).
    private Cliente clienteVO;

    //Declaração de variáveis(Business Object).
    private ClienteBO clienteBO;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarCliente;
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
    private javax.swing.JLabel lbNomeCliente;
    private javax.swing.JLabel lbNomeContato;
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
    private javax.swing.JPanel pnPessoa;
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
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfEstado;
    private javax.swing.JTextField tfEstadual;
    private javax.swing.JTextField tfMunicipal;
    private javax.swing.JTextField tfNascimentoFundacao;
    private javax.swing.JTextField tfNomeCliente;
    private javax.swing.JTextField tfNomeContato;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfRgRazaoSocial;
    private javax.swing.JTextField tfSuframa;
    private javax.swing.JTextField tfTelefone;
    // End of variables declaration//GEN-END:variables
}
