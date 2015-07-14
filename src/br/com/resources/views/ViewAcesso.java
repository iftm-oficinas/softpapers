package br.com.resources.views;

import br.com.models.bo.AcessoBO;
import br.com.models.vo.Usuario;
import java.awt.Cursor;

/**
 *
 * @see Classe visual. JInternalFrame que tem como objetivo restringir e validar
 * o acesso do Usuario ao programa e disponibilizar atalhos para a viewAjuda.
 *
 * @author Bruna Danieli Ribeiro Gonçalves, Márlon Ândrel Coelho Freitas
 */
public class ViewAcesso extends javax.swing.JInternalFrame {

    /**
     *
     * @see Construtor padrão.
     */
    public ViewAcesso() {
        //Inicialização dos componentes padrões do JFrame.
        initComponents();
    }

    /**
     *
     * @see Construtor usado quando classe é instanciada na ViewPrincipal,
     * recebe a viewPrincipal como pai e organiza esse JInternalFrame dentro do
     * JFrame principal.
     *
     * @param viewPrincipal
     */
    public ViewAcesso(ViewPrincipal viewPrincipal) {
        //Esconde barra de título padrão do JInternalFrama.
        setRootPaneCheckingEnabled(false);
        javax.swing.plaf.InternalFrameUI frame = this.getUI();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) frame).setNorthPane(null);

        //Inicialização dos componentes padrões do JFrame.
        initComponents();
        this.viewPrincipal = viewPrincipal;

        //Define o JButton (btnEntrar) como botão padrão, para interagir com tecla Enter.
        getRootPane().setDefaultButton(btnEntrar);
    }

    //Componentes padrões do JFrame
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spnCorpo = new javax.swing.JScrollPane();
        pnCorpo = new javax.swing.JPanel();
        lbLogo = new javax.swing.JLabel();
        pnAcesso = new javax.swing.JPanel();
        lbAcesso1 = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        lbSenha = new javax.swing.JLabel();
        pfSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        lbAcesso2 = new javax.swing.JLabel();
        lbAcesso3 = new javax.swing.JLabel();
        lbAcesso4 = new javax.swing.JLabel();
        pnVendas = new javax.swing.JPanel();
        lbTituloVendas = new javax.swing.JLabel();
        sprVendas = new javax.swing.JSeparator();
        lbImagemVendas = new javax.swing.JLabel();
        lbTextoVendas1 = new javax.swing.JLabel();
        lbTextoVendas2 = new javax.swing.JLabel();
        lbTextoVendas3 = new javax.swing.JLabel();
        lbTextoVendas4 = new javax.swing.JLabel();
        lbTextoVendas5 = new javax.swing.JLabel();
        pnEstoque = new javax.swing.JPanel();
        lbTituloEstoque = new javax.swing.JLabel();
        sprEstoque = new javax.swing.JSeparator();
        lbImagemEstoque = new javax.swing.JLabel();
        lbTextoEstoque1 = new javax.swing.JLabel();
        lbTextoEstoque2 = new javax.swing.JLabel();
        lbTextoEstoque3 = new javax.swing.JLabel();
        lbTextoEstoque4 = new javax.swing.JLabel();
        pnUsuarios = new javax.swing.JPanel();
        lbTituloUsuarios = new javax.swing.JLabel();
        sprUsuarios = new javax.swing.JSeparator();
        lbImagemUsuarios = new javax.swing.JLabel();
        lbTextoUsuairos1 = new javax.swing.JLabel();
        lbTextoUsuairos2 = new javax.swing.JLabel();
        lbTextoUsuairos3 = new javax.swing.JLabel();
        lbTextoUsuairos4 = new javax.swing.JLabel();
        pnFinanceiro = new javax.swing.JPanel();
        lbTituloFinanceiro = new javax.swing.JLabel();
        sprFinanceiro = new javax.swing.JSeparator();
        lbImagemFinanceiro = new javax.swing.JLabel();
        lbTextoFinanceiro1 = new javax.swing.JLabel();
        lbTextoFinanceiro2 = new javax.swing.JLabel();
        lbTextoFinanceiro3 = new javax.swing.JLabel();
        lbTextoFinanceiro4 = new javax.swing.JLabel();
        lbTextoFinanceiro5 = new javax.swing.JLabel();
        lbTextoFinanceiro6 = new javax.swing.JLabel();
        pnRelatorios = new javax.swing.JPanel();
        lbTituloRelatorios = new javax.swing.JLabel();
        sprRelatorios = new javax.swing.JSeparator();
        lbImagemRelatorios = new javax.swing.JLabel();
        lbTextoRelatorios1 = new javax.swing.JLabel();
        lbTextoRelatorios2 = new javax.swing.JLabel();
        lbTextoRelatorios3 = new javax.swing.JLabel();
        lbTextoRelatorios4 = new javax.swing.JLabel();
        lbTextoRelatorios5 = new javax.swing.JLabel();
        pnControle = new javax.swing.JPanel();
        lbTituloControle = new javax.swing.JLabel();
        sprControle = new javax.swing.JSeparator();
        lbImagemControle = new javax.swing.JLabel();
        lbTextoControle1 = new javax.swing.JLabel();
        lbTextoControle2 = new javax.swing.JLabel();
        lbTextoControle3 = new javax.swing.JLabel();
        lbTextoControle4 = new javax.swing.JLabel();
        lbTextoControle5 = new javax.swing.JLabel();
        lbTextoControle6 = new javax.swing.JLabel();
        pnRodape = new javax.swing.JPanel();
        sprRodape = new javax.swing.JSeparator();
        lbRodape = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setResizable(true);
        setTitle("Acesso");
        setFrameIcon(null);

        pnCorpo.setBackground(new java.awt.Color(255, 255, 255));

        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/logo.png"))); // NOI18N

        pnAcesso.setBackground(new java.awt.Color(255, 255, 255));

        lbAcesso1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lbAcesso1.setForeground(new java.awt.Color(153, 204, 0));
        lbAcesso1.setText("ACESSO");

        lbEmail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbEmail.setForeground(new java.awt.Color(102, 102, 102));
        lbEmail.setText("Email");

        tfEmail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfEmail.setForeground(new java.awt.Color(102, 102, 102));
        tfEmail.setText("marlonmacf@gmail.com");

        lbSenha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbSenha.setForeground(new java.awt.Color(102, 102, 102));
        lbSenha.setText("Senha");

        pfSenha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        pfSenha.setForeground(new java.awt.Color(102, 102, 102));
        pfSenha.setText("1");

        btnEntrar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(102, 102, 102));
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        lbAcesso2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbAcesso2.setForeground(new java.awt.Color(153, 153, 153));
        lbAcesso2.setText("Ainda não é um associado?");

        lbAcesso3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbAcesso3.setForeground(new java.awt.Color(153, 153, 153));
        lbAcesso3.setText("Mais informações");

        lbAcesso4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbAcesso4.setForeground(new java.awt.Color(0, 102, 255));
        lbAcesso4.setText("Adquira uma ID");

        javax.swing.GroupLayout pnAcessoLayout = new javax.swing.GroupLayout(pnAcesso);
        pnAcesso.setLayout(pnAcessoLayout);
        pnAcessoLayout.setHorizontalGroup(
            pnAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAcessoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfEmail)
                    .addComponent(btnEntrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pfSenha)
                    .addGroup(pnAcessoLayout.createSequentialGroup()
                        .addGroup(pnAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbEmail)
                            .addComponent(lbSenha)
                            .addComponent(lbAcesso3)
                            .addGroup(pnAcessoLayout.createSequentialGroup()
                                .addComponent(lbAcesso2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbAcesso4))
                            .addGroup(pnAcessoLayout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(lbAcesso1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnAcessoLayout.setVerticalGroup(
            pnAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAcessoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbAcesso1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAcesso2)
                    .addComponent(lbAcesso4))
                .addGap(0, 0, 0)
                .addComponent(lbAcesso3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnVendas.setBackground(new java.awt.Color(255, 255, 255));

        lbTituloVendas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbTituloVendas.setForeground(new java.awt.Color(102, 102, 102));
        lbTituloVendas.setText("POUPE TEMPO NAS VENDAS");

        lbImagemVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/vendas.png"))); // NOI18N

        lbTextoVendas1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbTextoVendas1.setText("Módulo de Frente de Caixa rápido");

        lbTextoVendas2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbTextoVendas2.setText("e intuitivo. Com o ponto de venda");

        lbTextoVendas3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbTextoVendas3.setText("você economiza tempo no ");

        lbTextoVendas4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbTextoVendas4.setText("atendimento e aumenta suas");

        lbTextoVendas5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbTextoVendas5.setText("vendas.");

        javax.swing.GroupLayout pnVendasLayout = new javax.swing.GroupLayout(pnVendas);
        pnVendas.setLayout(pnVendasLayout);
        pnVendasLayout.setHorizontalGroup(
            pnVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnVendasLayout.createSequentialGroup()
                        .addComponent(lbImagemVendas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTextoVendas1)
                            .addComponent(lbTextoVendas2)
                            .addComponent(lbTextoVendas3)
                            .addComponent(lbTextoVendas4)
                            .addComponent(lbTextoVendas5)))
                    .addComponent(sprVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnVendasLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(lbTituloVendas)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnVendasLayout.setVerticalGroup(
            pnVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTituloVendas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sprVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnVendasLayout.createSequentialGroup()
                        .addComponent(lbTextoVendas1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTextoVendas2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTextoVendas3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTextoVendas4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTextoVendas5))
                    .addComponent(lbImagemVendas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnEstoque.setBackground(new java.awt.Color(255, 255, 255));

        lbTituloEstoque.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbTituloEstoque.setForeground(new java.awt.Color(102, 102, 102));
        lbTituloEstoque.setText("ESTOQUE SOB CONTROLE");

        lbImagemEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/estoque.png"))); // NOI18N

        lbTextoEstoque1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbTextoEstoque1.setText("Esqueça as planilhas confusas e");

        lbTextoEstoque2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbTextoEstoque2.setText("abra espaço para uma gestão de");

        lbTextoEstoque3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbTextoEstoque3.setText("estoque eficaz, integrada e sem ");

        lbTextoEstoque4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbTextoEstoque4.setText("dor de cabeça.");

        javax.swing.GroupLayout pnEstoqueLayout = new javax.swing.GroupLayout(pnEstoque);
        pnEstoque.setLayout(pnEstoqueLayout);
        pnEstoqueLayout.setHorizontalGroup(
            pnEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEstoqueLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnEstoqueLayout.createSequentialGroup()
                        .addComponent(lbImagemEstoque)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTextoEstoque1)
                            .addComponent(lbTextoEstoque2)
                            .addComponent(lbTextoEstoque3)
                            .addComponent(lbTextoEstoque4)))
                    .addComponent(sprEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnEstoqueLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(lbTituloEstoque)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnEstoqueLayout.setVerticalGroup(
            pnEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnEstoqueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTituloEstoque)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sprEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnEstoqueLayout.createSequentialGroup()
                        .addComponent(lbTextoEstoque1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTextoEstoque2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTextoEstoque3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTextoEstoque4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbImagemEstoque))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnUsuarios.setBackground(new java.awt.Color(255, 255, 255));

        lbTituloUsuarios.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbTituloUsuarios.setForeground(new java.awt.Color(102, 102, 102));
        lbTituloUsuarios.setText("PERFIS DE USUÁRIOS");

        lbImagemUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/perfis.png"))); // NOI18N

        lbTextoUsuairos1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbTextoUsuairos1.setText("Libere acesso aos seus");

        lbTextoUsuairos2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbTextoUsuairos2.setText("funcionários e limite informações.");

        lbTextoUsuairos3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbTextoUsuairos3.setText("São diversos perfis para facilitar");

        lbTextoUsuairos4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbTextoUsuairos4.setText("seu controle interno.");

        javax.swing.GroupLayout pnUsuariosLayout = new javax.swing.GroupLayout(pnUsuarios);
        pnUsuarios.setLayout(pnUsuariosLayout);
        pnUsuariosLayout.setHorizontalGroup(
            pnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnUsuariosLayout.createSequentialGroup()
                        .addGroup(pnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTextoUsuairos2)
                            .addComponent(lbTextoUsuairos1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbTextoUsuairos3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbTextoUsuairos4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbImagemUsuarios))
                    .addComponent(sprUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnUsuariosLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(lbTituloUsuarios)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnUsuariosLayout.setVerticalGroup(
            pnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTituloUsuarios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sprUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnUsuariosLayout.createSequentialGroup()
                        .addComponent(lbTextoUsuairos1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTextoUsuairos2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTextoUsuairos3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTextoUsuairos4))
                    .addComponent(lbImagemUsuarios))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnFinanceiro.setBackground(new java.awt.Color(255, 255, 255));

        lbTituloFinanceiro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbTituloFinanceiro.setForeground(new java.awt.Color(102, 102, 102));
        lbTituloFinanceiro.setText("FACILIDADE NA GESTÃO FINANCEIRA");

        lbImagemFinanceiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/financeiro.png"))); // NOI18N

        lbTextoFinanceiro1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbTextoFinanceiro1.setText("Veja em tempo real a saúde");

        lbTextoFinanceiro2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbTextoFinanceiro2.setText("financeira da sua empresa,");

        lbTextoFinanceiro3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbTextoFinanceiro3.setText("acompanhe diariamente todas");

        lbTextoFinanceiro4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbTextoFinanceiro4.setText("atualizações e saiba quando suas");

        lbTextoFinanceiro5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbTextoFinanceiro5.setText("contas estão proximas do");

        lbTextoFinanceiro6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbTextoFinanceiro6.setText("vencimento.");

        javax.swing.GroupLayout pnFinanceiroLayout = new javax.swing.GroupLayout(pnFinanceiro);
        pnFinanceiro.setLayout(pnFinanceiroLayout);
        pnFinanceiroLayout.setHorizontalGroup(
            pnFinanceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFinanceiroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnFinanceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sprFinanceiro, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnFinanceiroLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(pnFinanceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTextoFinanceiro3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbTextoFinanceiro1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbTextoFinanceiro2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbTextoFinanceiro4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbTextoFinanceiro5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbTextoFinanceiro6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbImagemFinanceiro))
                    .addGroup(pnFinanceiroLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(lbTituloFinanceiro)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnFinanceiroLayout.setVerticalGroup(
            pnFinanceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFinanceiroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTituloFinanceiro, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sprFinanceiro, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnFinanceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFinanceiroLayout.createSequentialGroup()
                        .addComponent(lbTextoFinanceiro1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTextoFinanceiro2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTextoFinanceiro3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTextoFinanceiro4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTextoFinanceiro5))
                    .addComponent(lbImagemFinanceiro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTextoFinanceiro6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnRelatorios.setBackground(new java.awt.Color(255, 255, 255));

        lbTituloRelatorios.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbTituloRelatorios.setForeground(new java.awt.Color(102, 102, 102));
        lbTituloRelatorios.setText("RELATÓRIOS");

        lbImagemRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/relatorios.png"))); // NOI18N

        lbTextoRelatorios1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbTextoRelatorios1.setText("Tome decisões inteligentes com");

        lbTextoRelatorios2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbTextoRelatorios2.setText("base em números. Os relatórios");

        lbTextoRelatorios3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbTextoRelatorios3.setText("do sistema auxiliam a tomar as ");

        lbTextoRelatorios4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbTextoRelatorios4.setText("melhores decisões para seu");

        lbTextoRelatorios5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbTextoRelatorios5.setText("negócio.");

        javax.swing.GroupLayout pnRelatoriosLayout = new javax.swing.GroupLayout(pnRelatorios);
        pnRelatorios.setLayout(pnRelatoriosLayout);
        pnRelatoriosLayout.setHorizontalGroup(
            pnRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRelatoriosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sprRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnRelatoriosLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(pnRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbTextoRelatorios1)
                            .addComponent(lbTextoRelatorios2)
                            .addComponent(lbTextoRelatorios3)
                            .addComponent(lbTextoRelatorios4)
                            .addComponent(lbTextoRelatorios5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbImagemRelatorios))
                    .addGroup(pnRelatoriosLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(lbTituloRelatorios)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnRelatoriosLayout.setVerticalGroup(
            pnRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRelatoriosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTituloRelatorios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sprRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnRelatoriosLayout.createSequentialGroup()
                        .addComponent(lbTextoRelatorios1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTextoRelatorios2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTextoRelatorios3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTextoRelatorios4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTextoRelatorios5))
                    .addComponent(lbImagemRelatorios))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnControle.setBackground(new java.awt.Color(255, 255, 255));

        lbTituloControle.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbTituloControle.setForeground(new java.awt.Color(102, 102, 102));
        lbTituloControle.setText("PAINEL DE CONTROLE");

        lbImagemControle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/painelControle.png"))); // NOI18N

        lbTextoControle1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbTextoControle1.setText("Visualize as principais informações");

        lbTextoControle2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbTextoControle2.setText("do seu negócio de forma rápida.");

        lbTextoControle3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbTextoControle3.setText("Com o painel de controle você tem");

        lbTextoControle4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbTextoControle4.setText("sempre a mão informações");

        lbTextoControle5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbTextoControle5.setText("importantes para a tomada de");

        lbTextoControle6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbTextoControle6.setText("decisão na sua empresa.");

        javax.swing.GroupLayout pnControleLayout = new javax.swing.GroupLayout(pnControle);
        pnControle.setLayout(pnControleLayout);
        pnControleLayout.setHorizontalGroup(
            pnControleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnControleLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnControleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnControleLayout.createSequentialGroup()
                        .addComponent(lbImagemControle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnControleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTextoControle1)
                            .addComponent(lbTextoControle2)
                            .addComponent(lbTextoControle3)
                            .addGroup(pnControleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbTextoControle5, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbTextoControle4)
                                .addComponent(lbTextoControle6)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnControleLayout.createSequentialGroup()
                        .addGroup(pnControleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sprControle, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnControleLayout.createSequentialGroup()
                                .addComponent(lbTituloControle)
                                .addGap(81, 81, 81)))
                        .addContainerGap(11, Short.MAX_VALUE))))
        );
        pnControleLayout.setVerticalGroup(
            pnControleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnControleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTituloControle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sprControle, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnControleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnControleLayout.createSequentialGroup()
                        .addComponent(lbTextoControle1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTextoControle2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTextoControle3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbTextoControle4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTextoControle5))
                    .addComponent(lbImagemControle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTextoControle6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnRodape.setBackground(new java.awt.Color(255, 255, 255));

        sprRodape.setForeground(new java.awt.Color(204, 204, 204));

        lbRodape.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbRodape.setForeground(new java.awt.Color(204, 204, 204));
        lbRodape.setText("SOFTPAPERS @2015 - Versão: 0.0000.00.00 Alfa - Todos direitos reservados.");

        javax.swing.GroupLayout pnRodapeLayout = new javax.swing.GroupLayout(pnRodape);
        pnRodape.setLayout(pnRodapeLayout);
        pnRodapeLayout.setHorizontalGroup(
            pnRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sprRodape, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnRodapeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbRodape)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnRodapeLayout.setVerticalGroup(
            pnRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRodapeLayout.createSequentialGroup()
                .addComponent(sprRodape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbRodape)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnCorpoLayout = new javax.swing.GroupLayout(pnCorpo);
        pnCorpo.setLayout(pnCorpoLayout);
        pnCorpoLayout.setHorizontalGroup(
            pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCorpoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pnEstoque, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnVendas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(pnControle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnAcesso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnFinanceiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pnRodape, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnCorpoLayout.setVerticalGroup(
            pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCorpoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCorpoLayout.createSequentialGroup()
                        .addComponent(pnRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnFinanceiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnCorpoLayout.createSequentialGroup()
                        .addComponent(pnVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnControle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnCorpoLayout.createSequentialGroup()
                        .addComponent(lbLogo)
                        .addGap(18, 18, 18)
                        .addComponent(pnAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnRodape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        spnCorpo.setViewportView(pnCorpo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spnCorpo)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(spnCorpo)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @see Método que responde ao clique do JButton(btnEntrar), chama a função
     * de validarAcesso da classe AcessoBO passando como parâmetros os valores
     * do JTextFild(tfEmail) e JPasswordFild(pfSenha).
     *
     * @param evt
     */
    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        btnEntrar.setEnabled(false);
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        acessoBO = new AcessoBO();
        if (acessoBO.validarCampos(pnAcesso)) {
            usuarioVO = acessoBO.validarAcesso(tfEmail.getText(), new String(pfSenha.getPassword()));
            if (usuarioVO != null) {
                viewPrincipal.mostrarMenu();
            }
        }
        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        btnEntrar.setEnabled(true);
    }//GEN-LAST:event_btnEntrarActionPerformed

    //Declaração de variáveis(View).
    private ViewPrincipal viewPrincipal;

    //Declaração de variáveis(Business Object).
    private AcessoBO acessoBO;

    //Declaração de variáveis(Value Object).
    private Usuario usuarioVO;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel lbAcesso1;
    private javax.swing.JLabel lbAcesso2;
    private javax.swing.JLabel lbAcesso3;
    private javax.swing.JLabel lbAcesso4;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbImagemControle;
    private javax.swing.JLabel lbImagemEstoque;
    private javax.swing.JLabel lbImagemFinanceiro;
    private javax.swing.JLabel lbImagemRelatorios;
    private javax.swing.JLabel lbImagemUsuarios;
    private javax.swing.JLabel lbImagemVendas;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbRodape;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JLabel lbTextoControle1;
    private javax.swing.JLabel lbTextoControle2;
    private javax.swing.JLabel lbTextoControle3;
    private javax.swing.JLabel lbTextoControle4;
    private javax.swing.JLabel lbTextoControle5;
    private javax.swing.JLabel lbTextoControle6;
    private javax.swing.JLabel lbTextoEstoque1;
    private javax.swing.JLabel lbTextoEstoque2;
    private javax.swing.JLabel lbTextoEstoque3;
    private javax.swing.JLabel lbTextoEstoque4;
    private javax.swing.JLabel lbTextoFinanceiro1;
    private javax.swing.JLabel lbTextoFinanceiro2;
    private javax.swing.JLabel lbTextoFinanceiro3;
    private javax.swing.JLabel lbTextoFinanceiro4;
    private javax.swing.JLabel lbTextoFinanceiro5;
    private javax.swing.JLabel lbTextoFinanceiro6;
    private javax.swing.JLabel lbTextoRelatorios1;
    private javax.swing.JLabel lbTextoRelatorios2;
    private javax.swing.JLabel lbTextoRelatorios3;
    private javax.swing.JLabel lbTextoRelatorios4;
    private javax.swing.JLabel lbTextoRelatorios5;
    private javax.swing.JLabel lbTextoUsuairos1;
    private javax.swing.JLabel lbTextoUsuairos2;
    private javax.swing.JLabel lbTextoUsuairos3;
    private javax.swing.JLabel lbTextoUsuairos4;
    private javax.swing.JLabel lbTextoVendas1;
    private javax.swing.JLabel lbTextoVendas2;
    private javax.swing.JLabel lbTextoVendas3;
    private javax.swing.JLabel lbTextoVendas4;
    private javax.swing.JLabel lbTextoVendas5;
    private javax.swing.JLabel lbTituloControle;
    private javax.swing.JLabel lbTituloEstoque;
    private javax.swing.JLabel lbTituloFinanceiro;
    private javax.swing.JLabel lbTituloRelatorios;
    private javax.swing.JLabel lbTituloUsuarios;
    private javax.swing.JLabel lbTituloVendas;
    private javax.swing.JPasswordField pfSenha;
    private javax.swing.JPanel pnAcesso;
    private javax.swing.JPanel pnControle;
    private javax.swing.JPanel pnCorpo;
    private javax.swing.JPanel pnEstoque;
    private javax.swing.JPanel pnFinanceiro;
    private javax.swing.JPanel pnRelatorios;
    private javax.swing.JPanel pnRodape;
    private javax.swing.JPanel pnUsuarios;
    private javax.swing.JPanel pnVendas;
    private javax.swing.JScrollPane spnCorpo;
    private javax.swing.JSeparator sprControle;
    private javax.swing.JSeparator sprEstoque;
    private javax.swing.JSeparator sprFinanceiro;
    private javax.swing.JSeparator sprRelatorios;
    private javax.swing.JSeparator sprRodape;
    private javax.swing.JSeparator sprUsuarios;
    private javax.swing.JSeparator sprVendas;
    private javax.swing.JTextField tfEmail;
    // End of variables declaration//GEN-END:variables
}
