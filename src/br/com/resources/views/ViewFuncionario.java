package br.com.resources.views;

import br.com.models.bo.FuncionarioBO;
import br.com.models.vo.Funcionario;
import java.awt.Cursor;

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
    }

    //Componentes padrões do JFrame.
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnTitulo = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        pnCorpo = new javax.swing.JPanel();
        lbFuncionario = new javax.swing.JLabel();
        lbCargo = new javax.swing.JLabel();
        tfCargo = new javax.swing.JTextField();
        lbUsuario = new javax.swing.JLabel();
        tfUsuario = new javax.swing.JTextField();
        lbSenha = new javax.swing.JLabel();
        pfSenha = new javax.swing.JPasswordField();
        lbContato = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        lbTelefone = new javax.swing.JLabel();
        tfTelefone = new javax.swing.JTextField();
        lbCelular = new javax.swing.JLabel();
        tfCelular = new javax.swing.JTextField();
        lbPessoaFisica = new javax.swing.JLabel();
        lbCpf = new javax.swing.JLabel();
        tfCpf = new javax.swing.JTextField();
        lbRg = new javax.swing.JLabel();
        tfRg = new javax.swing.JTextField();
        lbNascimento = new javax.swing.JLabel();
        tfNascimento = new javax.swing.JTextField();
        lbMaisEndereco = new javax.swing.JLabel();
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
        lbNome = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();

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

        lbFuncionario.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbFuncionario.setForeground(new java.awt.Color(0, 102, 205));
        lbFuncionario.setText("funcionário");

        lbCargo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbCargo.setForeground(new java.awt.Color(102, 102, 102));
        lbCargo.setText("Cargo");

        tfCargo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfCargo.setForeground(new java.awt.Color(102, 102, 102));

        lbUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbUsuario.setForeground(new java.awt.Color(102, 102, 102));
        lbUsuario.setText("Usuário");

        tfUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfUsuario.setForeground(new java.awt.Color(102, 102, 102));

        lbSenha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbSenha.setForeground(new java.awt.Color(102, 102, 102));
        lbSenha.setText("Senha");

        pfSenha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        pfSenha.setForeground(new java.awt.Color(102, 102, 102));

        lbContato.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbContato.setForeground(new java.awt.Color(0, 102, 205));
        lbContato.setText("contato");

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

        lbPessoaFisica.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbPessoaFisica.setForeground(new java.awt.Color(0, 102, 205));
        lbPessoaFisica.setText("pessoa física");

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

        lbNascimento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbNascimento.setForeground(new java.awt.Color(102, 102, 102));
        lbNascimento.setText("Nascimento");

        tfNascimento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfNascimento.setForeground(new java.awt.Color(102, 102, 102));
        tfNascimento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfNascimentoKeyTyped(evt);
            }
        });

        lbMaisEndereco.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbMaisEndereco.setForeground(new java.awt.Color(0, 102, 205));
        lbMaisEndereco.setText("endereço");

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

        lbNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbNome.setForeground(new java.awt.Color(102, 102, 102));
        lbNome.setText("Nome");

        tfNome.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfNome.setForeground(new java.awt.Color(102, 102, 102));

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
                            .addComponent(btnCadastrar)
                            .addComponent(lbMaisEndereco)
                            .addComponent(lbCpf)
                            .addComponent(lbPessoaFisica))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfRg, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbRg))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNascimento)))
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
                    .addComponent(tfNome)
                    .addGroup(pnCorpoLayout.createSequentialGroup()
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addComponent(lbFuncionario)
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
                                .addComponent(lbContato))
                            .addComponent(lbNome))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnCorpoLayout.setVerticalGroup(
            pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCorpoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbContato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addGap(18, 18, 18)
                .addComponent(lbFuncionario)
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
                .addGap(18, 18, 18)
                .addComponent(lbPessoaFisica)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCpf)
                    .addComponent(lbRg)
                    .addComponent(lbNascimento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfRg, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbMaisEndereco)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sprRodape, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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

    private void tfTelefoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTelefoneKeyTyped
        String caracteres = "(12)3456-7890";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_tfTelefoneKeyTyped

    private void tfCelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCelularKeyTyped
        String caracteres = "(12)3456-7890";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_tfCelularKeyTyped

    private void tfCpfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCpfKeyTyped
        String caracteres = "123.456.789-00";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_tfCpfKeyTyped

    private void tfNascimentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNascimentoKeyTyped
        String caracteres = "12.34.5678.90";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_tfNascimentoKeyTyped

    private void tfCepKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCepKeyTyped
        String caracteres = "12345-67890";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_tfCepKeyTyped

    private void tfNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfNumeroKeyTyped
        String caracteres = "1234567890";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }//GEN-LAST:event_tfNumeroKeyTyped

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        btnCadastrar.setEnabled(false);
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        funcionarioBO = new FuncionarioBO();
        if (funcionarioBO.validarCampos(pnCorpo)) {
            funcionarioVO = funcionarioBO.inserirFuncionario(tfNome.getText(), tfCargo.getText(), tfUsuario.getText(), new String(pfSenha.getPassword()), tfEmail.getText(), tfTelefone.getText(), tfCelular.getText(), tfCpf.getText(), tfRg.getText(), tfNascimento.getText(), tfEndereco.getText(), tfCep.getText(), tfComplemento.getText(), tfNumero.getText(), tfCidade.getText(), tfBairro.getText(), tfEstado.getText());
            if (funcionarioVO != null) {
                viewPainelControle.atualizarTabelas();
                this.dispose();
            }
        }
        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        btnCadastrar.setEnabled(true);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    //Declaração de variáveis(View).
    private final ViewPainelControle viewPainelControle;

    //Declaração de variáveis(Value Object).
    private Funcionario funcionarioVO;

    //Declaração de variáveis(Business Object).
    private FuncionarioBO funcionarioBO;

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNumero;
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
    private javax.swing.JTextField tfNascimento;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfRg;
    private javax.swing.JTextField tfTelefone;
    private javax.swing.JTextField tfUsuario;
    // End of variables declaration//GEN-END:variables
}
