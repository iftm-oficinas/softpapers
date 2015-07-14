package br.com.resources.views;

import br.com.models.bo.FuncionarioBO;
import br.com.models.vo.Funcionario;
import br.com.models.vo.Pessoafisica;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
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
        btnAlterarFuncionario.setVisible(false);
    }

    public ViewFuncionario(java.awt.Frame parent, boolean modal, ViewPainelControle viewPainelControle, Funcionario funcionario, Boolean alterar) {
        //Inicialização dos componentes padrões do JDialog.
        super(parent, modal);
        initComponents();
        this.viewPainelControle = viewPainelControle;
        this.funcionarioVO = funcionario;
        funcionarioBO = new FuncionarioBO();
        this.pessoaFisicaVO = funcionarioBO.buscarPessoaFisica(funcionarioVO.getPessoa().getIdPessoa());
        btnCadastrar.setVisible(false);
        lbTitulo.setText("Alterar Funcionário");
        tfNomeFuncionario.setText(funcionario.getNomeFuncionario());
        tfNomeContato.setText(funcionario.getContato().getNomeContato());
        tfEmail.setText(funcionario.getContato().getEmailContato());
        tfTelefone.setText(funcionario.getContato().getTelefoneContato());
        tfCelular.setText(funcionario.getContato().getCelularContato());
        tfCargo.setText(funcionario.getCargoFuncionario());
        tfUsuario.setText(funcionario.getUsuarioFuncionario());
        pfSenha.setText(funcionario.getSenhaFuncionario());
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
            btnAlterarFuncionario.setVisible(false);
            tfNomeFuncionario.setEditable(false);
            tfNomeContato.setEditable(false);
            tfEmail.setEditable(false);
            tfTelefone.setEditable(false);
            tfCelular.setEditable(false);
            tfCargo.setEditable(false);
            tfUsuario.setEditable(false);
            pfSenha.setEditable(false);
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
        lbNomeFuncionario = new javax.swing.JLabel();
        tfNomeFuncionario = new javax.swing.JTextField();
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
        lbFuncionario = new javax.swing.JLabel();
        lbOpcional2 = new javax.swing.JLabel();
        lbCargo = new javax.swing.JLabel();
        tfCargo = new javax.swing.JTextField();
        lbUsuario = new javax.swing.JLabel();
        tfUsuario = new javax.swing.JTextField();
        lbSenha = new javax.swing.JLabel();
        pfSenha = new javax.swing.JPasswordField();
        lbPessoaFisica = new javax.swing.JLabel();
        lbOpcional3 = new javax.swing.JLabel();
        lbCpf = new javax.swing.JLabel();
        tfCpf = new javax.swing.JTextField();
        lbRg = new javax.swing.JLabel();
        tfRg = new javax.swing.JTextField();
        lbNascimento = new javax.swing.JLabel();
        tfNascimento = new javax.swing.JFormattedTextField();
        lbMaisEndereco = new javax.swing.JLabel();
        lbOpcional4 = new javax.swing.JLabel();
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
        sprRodape = new javax.swing.JSeparator();
        btnCadastrar = new javax.swing.JButton();
        btnAlterarFuncionario = new javax.swing.JButton();

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

        lbNomeFuncionario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbNomeFuncionario.setForeground(new java.awt.Color(102, 102, 102));
        lbNomeFuncionario.setText("Nome do funcionario");

        tfNomeFuncionario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfNomeFuncionario.setForeground(new java.awt.Color(102, 102, 102));
        tfNomeFuncionario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfNomeFuncionarioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNomeFuncionarioKeyTyped(evt);
            }
        });

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

        lbFuncionario.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbFuncionario.setForeground(new java.awt.Color(0, 102, 205));
        lbFuncionario.setText("funcionário");

        lbOpcional2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbOpcional2.setForeground(new java.awt.Color(102, 102, 102));
        lbOpcional2.setText("(Opcional)");

        lbCargo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbCargo.setForeground(new java.awt.Color(102, 102, 102));
        lbCargo.setText("Cargo");

        tfCargo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfCargo.setForeground(new java.awt.Color(102, 102, 102));
        tfCargo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCargoKeyTyped(evt);
            }
        });

        lbUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbUsuario.setForeground(new java.awt.Color(102, 102, 102));
        lbUsuario.setText("Usuário");

        tfUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfUsuario.setForeground(new java.awt.Color(102, 102, 102));
        tfUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfUsuarioKeyTyped(evt);
            }
        });

        lbSenha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbSenha.setForeground(new java.awt.Color(102, 102, 102));
        lbSenha.setText("Senha");

        pfSenha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        pfSenha.setForeground(new java.awt.Color(102, 102, 102));
        pfSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pfSenhaKeyTyped(evt);
            }
        });

        lbPessoaFisica.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbPessoaFisica.setForeground(new java.awt.Color(0, 102, 205));
        lbPessoaFisica.setText("pessoa física");

        lbOpcional3.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbOpcional3.setForeground(new java.awt.Color(102, 102, 102));
        lbOpcional3.setText("(Opcional)");

        lbCpf.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbCpf.setForeground(new java.awt.Color(102, 102, 102));
        lbCpf.setText("CPF");

        tfCpf.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfCpf.setForeground(new java.awt.Color(102, 102, 102));
        tfCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfCpfKeyTyped(evt);
            }
        });

        lbRg.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbRg.setForeground(new java.awt.Color(102, 102, 102));
        lbRg.setText("RG");

        tfRg.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfRg.setForeground(new java.awt.Color(102, 102, 102));
        tfRg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfRgKeyTyped(evt);
            }
        });

        lbNascimento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbNascimento.setForeground(new java.awt.Color(102, 102, 102));
        lbNascimento.setText("Nascimento");

        tfNascimento.setForeground(new java.awt.Color(102, 102, 102));
        tfNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));
        tfNascimento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfNascimento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNascimentoKeyTyped(evt);
            }
        });

        lbMaisEndereco.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbMaisEndereco.setForeground(new java.awt.Color(0, 102, 205));
        lbMaisEndereco.setText("endereço");

        lbOpcional4.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbOpcional4.setForeground(new java.awt.Color(102, 102, 102));
        lbOpcional4.setText("(Opcional)");

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

        btnAlterarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarUP.png"))); // NOI18N
        btnAlterarFuncionario.setBorder(null);
        btnAlterarFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterarFuncionario.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N
        btnAlterarFuncionario.setFocusable(false);
        btnAlterarFuncionario.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N
        btnAlterarFuncionario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N
        btnAlterarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnCorpoLayout = new javax.swing.GroupLayout(pnCorpo);
        pnCorpo.setLayout(pnCorpoLayout);
        pnCorpoLayout.setHorizontalGroup(
            pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sprRodape)
            .addGroup(pnCorpoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCorpoLayout.createSequentialGroup()
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnCorpoLayout.createSequentialGroup()
                                .addComponent(btnCadastrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAlterarFuncionario))
                            .addGroup(pnCorpoLayout.createSequentialGroup()
                                .addComponent(lbMaisEndereco)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbOpcional4))
                            .addComponent(lbCpf)
                            .addGroup(pnCorpoLayout.createSequentialGroup()
                                .addComponent(lbPessoaFisica)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbOpcional3)))
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnCorpoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbRg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCorpoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfRg, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)))
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnCorpoLayout.createSequentialGroup()
                                .addComponent(lbNascimento)
                                .addGap(133, 133, 133))
                            .addComponent(tfNascimento)))
                    .addGroup(pnCorpoLayout.createSequentialGroup()
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfCargo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCargo, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbUsuario))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnCorpoLayout.createSequentialGroup()
                                .addComponent(lbSenha)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(pfSenha)))
                    .addComponent(tfEndereco)
                    .addGroup(pnCorpoLayout.createSequentialGroup()
                        .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tfNomeContato)
                    .addComponent(tfNomeFuncionario)
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
                            .addComponent(tfNumero)
                            .addGroup(pnCorpoLayout.createSequentialGroup()
                                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbNumero)
                                    .addComponent(lbEstado))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(pnCorpoLayout.createSequentialGroup()
                        .addComponent(lbFuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbOpcional2))
                    .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCorpoLayout.createSequentialGroup()
                            .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbEmail))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbTelefone))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbCelular)
                                .addComponent(tfCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(pnCorpoLayout.createSequentialGroup()
                            .addComponent(lbContato)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lbOpcional1)))
                    .addComponent(lbNomeContato)
                    .addComponent(lbNomeFuncionario))
                .addContainerGap())
        );
        pnCorpoLayout.setVerticalGroup(
            pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCorpoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNomeFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFuncionario)
                    .addComponent(lbOpcional2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUsuario)
                    .addComponent(lbSenha)
                    .addComponent(lbCargo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPessoaFisica)
                    .addComponent(lbOpcional3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCpf)
                    .addComponent(lbRg)
                    .addComponent(lbNascimento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfRg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMaisEndereco)
                    .addComponent(lbOpcional4))
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
                    .addComponent(tfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sprRodape, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadastrar)
                    .addComponent(btnAlterarFuncionario))
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
     * @see Conjunto de Métodos que recebem o evento KeyTyped do teclado para
     * validar a entrada de valores nos campos de texto.
     *
     * @param evt
     */
    private void tfNomeContatoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNomeContatoKeyTyped
        if (evt.getKeyChar() != KeyEvent.VK_BACK_SPACE) {
            String caracteres = " aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZçÇáÁàÀãÃâÂéÉèÈêÊíÍìÌîÎóÓòÒõÕôÔúÚùÙûÛ";
            if (caracteres.contains(evt.getKeyChar() + "") && tfNomeContato.getText().length() <= 49) {
            } else {
                evt.consume();
            }
        }
    }//GEN-LAST:event_tfNomeContatoKeyTyped

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

    private void tfCargoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCargoKeyTyped
        if (tfCargo.getText().length() > 19) {
            evt.consume();
        }
    }//GEN-LAST:event_tfCargoKeyTyped

    private void tfUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfUsuarioKeyTyped
        if (tfUsuario.getText().length() > 29) {
            evt.consume();
        }
    }//GEN-LAST:event_tfUsuarioKeyTyped

    private void pfSenhaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pfSenhaKeyTyped
        if (new String(pfSenha.getPassword()).length() > 29) {
            evt.consume();
        }
    }//GEN-LAST:event_pfSenhaKeyTyped

    private void tfCpfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCpfKeyTyped
        if (evt.getKeyChar() != KeyEvent.VK_BACK_SPACE) {
            String caracteres = "12345678900";
            if (!caracteres.contains(evt.getKeyChar() + "") || tfCpf.getText().length() > 13) {
                evt.consume();
            }
            if (tfCpf.getText().length() == 3 || tfCpf.getText().length() == 7) {
                tfCpf.setText(tfCpf.getText() + ".");
            }
            if (tfCpf.getText().length() == 11) {
                tfCpf.setText(tfCpf.getText() + "-");
            }
        }
    }//GEN-LAST:event_tfCpfKeyTyped

    private void tfRgKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfRgKeyTyped
        if (tfRg.getText().length() > 19) {
            evt.consume();
        }
    }//GEN-LAST:event_tfRgKeyTyped

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

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        btnCadastrar.setEnabled(false);
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        funcionarioBO = new FuncionarioBO();
        if (funcionarioBO.validarCampos(pnCorpo)) {
            if (funcionarioBO.inserirFuncionario(tfNomeFuncionario.getText(), tfNomeContato.getText(), tfEmail.getText(), tfTelefone.getText(), tfCelular.getText(), tfCargo.getText(), tfUsuario.getText(), new String(pfSenha.getPassword()), tfCpf.getText(), tfRg.getText(), tfNascimento.getText(), tfEndereco.getText(), tfCep.getText(), tfComplemento.getText(), tfNumero.getText(), tfBairro.getText(), tfCidade.getText(), tfEstado.getText())) {
                viewPainelControle.atualizarTabelas();
                this.dispose();
            }
        }
        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        btnCadastrar.setEnabled(true);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnAlterarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarFuncionarioActionPerformed
        btnAlterarFuncionario.setEnabled(false);
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        funcionarioBO = new FuncionarioBO();
        if (funcionarioBO.validarCampos(pnCorpo)) {
            if (funcionarioBO.alterarFuncionario(funcionarioVO.getIdFuncionario(), funcionarioVO.getPessoa().getIdPessoa(), funcionarioVO.getContato().getIdContato(), funcionarioVO.getEndereco().getIdEndereco(), tfNomeFuncionario.getText(), tfNomeContato.getText(), tfEmail.getText(), tfTelefone.getText(), tfCelular.getText(), tfCargo.getText(), tfUsuario.getText(), new String(pfSenha.getPassword()), tfCpf.getText(), tfRg.getText(), tfNascimento.getText(), tfEndereco.getText(), tfCep.getText(), tfComplemento.getText(), tfNumero.getText(), tfBairro.getText(), tfCidade.getText(), tfEstado.getText())) {
                viewPainelControle.atualizarTabelas();
                this.dispose();
            }
        }
        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        btnAlterarFuncionario.setEnabled(true);
    }//GEN-LAST:event_btnAlterarFuncionarioActionPerformed

    private void tfNomeFuncionarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNomeFuncionarioKeyTyped
        if (evt.getKeyChar() != KeyEvent.VK_BACK_SPACE) {
            String caracteres = " aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZçÇáÁàÀãÃâÂéÉèÈêÊíÍìÌîÎóÓòÒõÕôÔúÚùÙûÛ";
            if (!caracteres.contains(evt.getKeyChar() + "") || tfNomeFuncionario.getText().length() > 49) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_tfNomeFuncionarioKeyTyped

    private void tfNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNumeroKeyTyped
        String caracteres = "1234567890";
        if (!caracteres.contains(evt.getKeyChar() + "") || tfNumero.getText().length() > 9) {
            evt.consume();
        }
    }//GEN-LAST:event_tfNumeroKeyTyped

    private void tfNascimentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNascimentoKeyTyped
        if (evt.getKeyChar() != KeyEvent.VK_BACK_SPACE) {
            String caracteres = "1234567890";
            if (!caracteres.contains(evt.getKeyChar() + "") || tfNascimento.getText().length() > 9) {
                evt.consume();
            }
            if (tfNascimento.getText().length() == 2 || tfNascimento.getText().length() == 5) {
                tfNascimento.setText(tfNascimento.getText() + "/");
            }
        }
    }//GEN-LAST:event_tfNascimentoKeyTyped

    private void tfNomeFuncionarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNomeFuncionarioKeyPressed
        if (evt.getKeyChar() != KeyEvent.VK_BACK_SPACE) {
            String caracteres = " aAbBcCdDeEfFgGhHiIjJkKlLmMnNoOpPqQrRsStTuUvVwWxXyYzZçÇáÁàÀãÃâÂéÉèÈêÊíÍìÌîÎóÓòÒõÕôÔúÚùÙûÛ";
            if (caracteres.contains(evt.getKeyChar() + "") && tfNomeFuncionario.getText().length() <= 49) {
            } else {
                evt.consume();
            }
        }
    }//GEN-LAST:event_tfNomeFuncionarioKeyPressed

    //Declaração de variáveis(View).
    private final ViewPainelControle viewPainelControle;

    //Declaração de variáveis(Value Object).
    private Funcionario funcionarioVO;
    private Pessoafisica pessoaFisicaVO;

    //Declaração de variáveis(Business Object).
    private FuncionarioBO funcionarioBO;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarFuncionario;
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
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbFuncionario;
    private javax.swing.JLabel lbMaisEndereco;
    private javax.swing.JLabel lbNascimento;
    private javax.swing.JLabel lbNomeContato;
    private javax.swing.JLabel lbNomeFuncionario;
    private javax.swing.JLabel lbNumero;
    private javax.swing.JLabel lbOpcional1;
    private javax.swing.JLabel lbOpcional2;
    private javax.swing.JLabel lbOpcional3;
    private javax.swing.JLabel lbOpcional4;
    private javax.swing.JLabel lbPessoaFisica;
    private javax.swing.JLabel lbRg;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbUsuario;
    private javax.swing.JPasswordField pfSenha;
    private javax.swing.JPanel pnCorpo;
    private javax.swing.JPanel pnTitulo;
    private javax.swing.JSeparator sprRodape;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JTextField tfCargo;
    private javax.swing.JTextField tfCelular;
    private javax.swing.JTextField tfCep;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JTextField tfComplemento;
    private javax.swing.JTextField tfCpf;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfEndereco;
    private javax.swing.JTextField tfEstado;
    private javax.swing.JFormattedTextField tfNascimento;
    private javax.swing.JTextField tfNomeContato;
    private javax.swing.JTextField tfNomeFuncionario;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfRg;
    private javax.swing.JTextField tfTelefone;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}
