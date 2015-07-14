package br.com.resources.views;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ViewPrincipal extends javax.swing.JFrame {

    /**
     * Construtor padrão que é carregado quando se executa o programa pela
     * primeira vez e é necessário a verificação de acesso.
     */
    public ViewPrincipal() {
        //Inicialização dos componentes padrões do JFrame.
        initComponents();

        //Define que a view sempre carregue como maximizada.
        setExtendedState(MAXIMIZED_BOTH);

        //Instanciando e adicionando todos os JInternalFrames no JDesktopPane(dpnCorpo) da viewPrincipal.
        dpnCorpo.add(viewAcesso = new ViewAcesso(this));
        dpnCorpo.add(viewHome = new ViewHome(this));
        dpnCorpo.add(viewCaixa = new ViewCaixa(this));
        dpnCorpo.add(viewClientes = new ViewClientes(this));
        dpnCorpo.add(viewFornecedores = new ViewFornecedores(this));
        dpnCorpo.add(viewEstoque = new ViewEstoque(this));
        dpnCorpo.add(viewFinanceiro = new ViewFinanceiro(this));
        dpnCorpo.add(viewRelatorios = new ViewRelatorios(this));
        dpnCorpo.add(viewPainelControle = new ViewPainelControle(this));

        /**
         * Define viewAcesso visivel para se verificar o acesso; Condição try
         * que tenta definir a viewAcesso com tamanho maximo.
         */
        LimparDesktop();
        viewAcesso.setVisible(true);
        try {
            viewAcesso.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(ViewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Define todos os menus como não visíveis para restringir o acesso antes do usuario logar.
        lbHome.setVisible(false);
        lbCaixa.setVisible(false);
        lbClientes.setVisible(false);
        lbClientes.setVisible(false);
        lbFornecedores.setVisible(false);
        lbEstoque.setVisible(false);
        lbFinanceiro.setVisible(false);
        lbRelatorios.setVisible(false);
        lbPainelControle.setVisible(false);
        lbSair.setVisible(false);
    }

    /**
     * Método que define como não visivel todos os JInternalFrames dessa view;
     * Utilizado sempre que uma nova view for definida como visível.
     */
    public final void LimparDesktop() {
        viewAcesso.setVisible(false);
        viewHome.setVisible(false);
        viewCaixa.setVisible(false);
        viewClientes.setVisible(false);
        viewFornecedores.setVisible(false);
        viewEstoque.setVisible(false);
        viewFinanceiro.setVisible(false);
        viewRelatorios.setVisible(false);
        viewPainelControle.setVisible(false);
        lbHome.setForeground(new java.awt.Color(255, 255, 255));
        lbCaixa.setForeground(new java.awt.Color(255, 255, 255));
        lbClientes.setForeground(new java.awt.Color(255, 255, 255));
        lbFornecedores.setForeground(new java.awt.Color(255, 255, 255));
        lbEstoque.setForeground(new java.awt.Color(255, 255, 255));
        lbFinanceiro.setForeground(new java.awt.Color(255, 255, 255));
        lbRelatorios.setForeground(new java.awt.Color(255, 255, 255));
        lbPainelControle.setForeground(new java.awt.Color(255, 255, 255));
        lbSair.setForeground(new java.awt.Color(255, 255, 255));
    }

    //Componentes padrões do JFrame
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnMenu = new javax.swing.JPanel();
        lbHome = new javax.swing.JLabel();
        lbCaixa = new javax.swing.JLabel();
        lbClientes = new javax.swing.JLabel();
        lbFornecedores = new javax.swing.JLabel();
        lbEstoque = new javax.swing.JLabel();
        lbFinanceiro = new javax.swing.JLabel();
        lbRelatorios = new javax.swing.JLabel();
        lbPainelControle = new javax.swing.JLabel();
        lbSair = new javax.swing.JLabel();
        lbNull = new javax.swing.JLabel();
        pnCorpo = new javax.swing.JPanel();
        lbFundoEsquerda = new javax.swing.JLabel();
        dpnCorpo = new javax.swing.JDesktopPane();
        lbFundoDireita = new javax.swing.JLabel();
        pnRodape = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pricipal");

        pnMenu.setBackground(new java.awt.Color(51, 51, 51));

        lbHome.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbHome.setForeground(new java.awt.Color(255, 255, 255));
        lbHome.setText("HOME");
        lbHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbHomeMouseExited(evt);
            }
        });

        lbCaixa.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbCaixa.setForeground(new java.awt.Color(255, 255, 255));
        lbCaixa.setText("CAIXA");
        lbCaixa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCaixaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbCaixaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbCaixaMouseExited(evt);
            }
        });

        lbClientes.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbClientes.setForeground(new java.awt.Color(255, 255, 255));
        lbClientes.setText("CLIENTES");
        lbClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbClientesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbClientesMouseExited(evt);
            }
        });

        lbFornecedores.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbFornecedores.setForeground(new java.awt.Color(255, 255, 255));
        lbFornecedores.setText("FORNECEDORES");
        lbFornecedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbFornecedoresMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbFornecedoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbFornecedoresMouseExited(evt);
            }
        });

        lbEstoque.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbEstoque.setForeground(new java.awt.Color(255, 255, 255));
        lbEstoque.setText("ESTOQUE");
        lbEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbEstoqueMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbEstoqueMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbEstoqueMouseExited(evt);
            }
        });

        lbFinanceiro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbFinanceiro.setForeground(new java.awt.Color(255, 255, 255));
        lbFinanceiro.setText("FINANCEIRO");
        lbFinanceiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbFinanceiroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbFinanceiroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbFinanceiroMouseExited(evt);
            }
        });

        lbRelatorios.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbRelatorios.setForeground(new java.awt.Color(255, 255, 255));
        lbRelatorios.setText("RELATÓRIOS");
        lbRelatorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbRelatoriosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbRelatoriosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbRelatoriosMouseExited(evt);
            }
        });

        lbPainelControle.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbPainelControle.setForeground(new java.awt.Color(255, 255, 255));
        lbPainelControle.setText("PAINEL DE CONTROLE");
        lbPainelControle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbPainelControleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbPainelControleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbPainelControleMouseExited(evt);
            }
        });

        lbSair.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbSair.setForeground(new java.awt.Color(255, 255, 255));
        lbSair.setText("SAIR");
        lbSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbSairMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbSairMouseExited(evt);
            }
        });

        lbNull.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbNull.setForeground(new java.awt.Color(51, 51, 51));
        lbNull.setText("NULL");

        javax.swing.GroupLayout pnMenuLayout = new javax.swing.GroupLayout(pnMenu);
        pnMenu.setLayout(pnMenuLayout);
        pnMenuLayout.setHorizontalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(lbHome)
                .addGap(18, 18, 18)
                .addComponent(lbCaixa)
                .addGap(18, 18, 18)
                .addComponent(lbClientes)
                .addGap(18, 18, 18)
                .addComponent(lbFornecedores)
                .addGap(18, 18, 18)
                .addComponent(lbEstoque)
                .addGap(18, 18, 18)
                .addComponent(lbFinanceiro)
                .addGap(18, 18, 18)
                .addComponent(lbRelatorios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbNull)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbPainelControle)
                .addGap(18, 18, 18)
                .addComponent(lbSair)
                .addGap(200, 200, 200))
        );
        pnMenuLayout.setVerticalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lbCaixa, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lbSair, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lbFornecedores, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lbEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lbFinanceiro, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lbRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lbPainelControle, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lbHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbNull, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnCorpo.setBackground(new java.awt.Color(153, 153, 153));
        pnCorpo.setPreferredSize(new java.awt.Dimension(0, 3));

        lbFundoEsquerda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/fundoDireita.png"))); // NOI18N

        dpnCorpo.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout dpnCorpoLayout = new javax.swing.GroupLayout(dpnCorpo);
        dpnCorpo.setLayout(dpnCorpoLayout);
        dpnCorpoLayout.setHorizontalGroup(
            dpnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        dpnCorpoLayout.setVerticalGroup(
            dpnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 243, Short.MAX_VALUE)
        );

        lbFundoDireita.setBackground(new java.awt.Color(255, 255, 255));
        lbFundoDireita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/fundoEsquerda.png"))); // NOI18N

        javax.swing.GroupLayout pnCorpoLayout = new javax.swing.GroupLayout(pnCorpo);
        pnCorpo.setLayout(pnCorpoLayout);
        pnCorpoLayout.setHorizontalGroup(
            pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCorpoLayout.createSequentialGroup()
                .addComponent(lbFundoEsquerda)
                .addGap(0, 0, 0)
                .addComponent(dpnCorpo)
                .addGap(0, 0, 0)
                .addComponent(lbFundoDireita))
        );
        pnCorpoLayout.setVerticalGroup(
            pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCorpoLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbFundoDireita, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(dpnCorpo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbFundoEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(3, 3, 3))
        );

        pnRodape.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("2015 - 2016 Controle de Papelaria");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Versão 0.2015.05.06 Alfa");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ajuda");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Termos de Uso");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Política de Privacidade");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("|");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("|");

        javax.swing.GroupLayout pnRodapeLayout = new javax.swing.GroupLayout(pnRodape);
        pnRodape.setLayout(pnRodapeLayout);
        pnRodapeLayout.setHorizontalGroup(
            pnRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRodapeLayout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(170, 170, 170))
        );
        pnRodapeLayout.setVerticalGroup(
            pnRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRodapeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jLabel2))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnRodape, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnCorpo, javax.swing.GroupLayout.DEFAULT_SIZE, 1134, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnCorpo, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(pnRodape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Métodos que realizarão a interação entre todos os JInternalFrames e o
     * JDesktopPane da ViewPrincipal; MouseClicked chama a função LimparDesktop
     * e define como visível uma nova view no JDesktopPane; MouseEntered
     * acontece ao passar o mouse pela label, muda a cor da mesma; MouseExited
     * acontece ao retirar o mouse da label, retorna a cor padrão.
     *
     * @param evt
     */
    private void lbHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHomeMouseClicked
        LimparDesktop();
        lbHome.setForeground(new java.awt.Color(255, 0, 0));
        viewHome.setVisible(true);
        try {
            viewHome.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(ViewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbHomeMouseClicked

    private void lbHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHomeMouseEntered
        if (viewHome.isVisible() == false) {
            lbHome.setForeground(new java.awt.Color(255, 0, 0));
        }
    }//GEN-LAST:event_lbHomeMouseEntered

    private void lbHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbHomeMouseExited
        if (viewHome.isVisible() == false) {
            lbHome.setForeground(new java.awt.Color(255, 255, 255));
        }
    }//GEN-LAST:event_lbHomeMouseExited

    private void lbCaixaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCaixaMouseClicked
        LimparDesktop();
        lbCaixa.setForeground(new java.awt.Color(255, 0, 0));
        viewCaixa.setVisible(true);
        try {
            viewCaixa.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(ViewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbCaixaMouseClicked

    private void lbCaixaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCaixaMouseEntered
        if (viewCaixa.isVisible() == false) {
            lbCaixa.setForeground(new java.awt.Color(255, 0, 0));
        }
    }//GEN-LAST:event_lbCaixaMouseEntered

    private void lbCaixaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbCaixaMouseExited
        if (viewCaixa.isVisible() == false) {
            lbCaixa.setForeground(new java.awt.Color(255, 255, 255));
        }
    }//GEN-LAST:event_lbCaixaMouseExited

    private void lbClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbClientesMouseClicked
        LimparDesktop();
        lbClientes.setForeground(new java.awt.Color(255, 0, 0));
        viewClientes.setVisible(true);
        try {
            viewClientes.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(ViewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbClientesMouseClicked

    private void lbClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbClientesMouseEntered
        if (viewClientes.isVisible() == false) {
            lbClientes.setForeground(new java.awt.Color(255, 0, 0));
        }
    }//GEN-LAST:event_lbClientesMouseEntered

    private void lbClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbClientesMouseExited
        if (viewClientes.isVisible() == false) {
            lbClientes.setForeground(new java.awt.Color(255, 255, 255));
        }
    }//GEN-LAST:event_lbClientesMouseExited

    private void lbFornecedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbFornecedoresMouseClicked
        LimparDesktop();
        lbFornecedores.setForeground(new java.awt.Color(255, 0, 0));
        viewFornecedores.setVisible(true);
        try {
            viewFornecedores.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(ViewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbFornecedoresMouseClicked

    private void lbFornecedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbFornecedoresMouseEntered
        if (viewFornecedores.isVisible() == false) {
            lbFornecedores.setForeground(new java.awt.Color(255, 0, 0));
        }
    }//GEN-LAST:event_lbFornecedoresMouseEntered

    private void lbFornecedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbFornecedoresMouseExited
        if (viewFornecedores.isVisible() == false) {
            lbFornecedores.setForeground(new java.awt.Color(255, 255, 255));
        }
    }//GEN-LAST:event_lbFornecedoresMouseExited

    private void lbEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEstoqueMouseClicked
        LimparDesktop();
        lbEstoque.setForeground(new java.awt.Color(255, 0, 0));
        viewEstoque.setVisible(true);
        try {
            viewEstoque.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(ViewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbEstoqueMouseClicked

    private void lbEstoqueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEstoqueMouseEntered
        if (viewEstoque.isVisible() == false) {
            lbEstoque.setForeground(new java.awt.Color(255, 0, 0));
        }
    }//GEN-LAST:event_lbEstoqueMouseEntered

    private void lbEstoqueMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEstoqueMouseExited
        if (viewEstoque.isVisible() == false) {
            lbEstoque.setForeground(new java.awt.Color(255, 255, 255));
        }
    }//GEN-LAST:event_lbEstoqueMouseExited

    private void lbFinanceiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbFinanceiroMouseClicked
        LimparDesktop();
        lbFinanceiro.setForeground(new java.awt.Color(255, 0, 0));
        viewFinanceiro.setVisible(true);
        try {
            viewFinanceiro.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(ViewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbFinanceiroMouseClicked

    private void lbFinanceiroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbFinanceiroMouseEntered
        if (viewFinanceiro.isVisible() == false) {
            lbFinanceiro.setForeground(new java.awt.Color(255, 0, 0));
        }
    }//GEN-LAST:event_lbFinanceiroMouseEntered

    private void lbFinanceiroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbFinanceiroMouseExited
        if (viewFinanceiro.isVisible() == false) {
            lbFinanceiro.setForeground(new java.awt.Color(255, 255, 255));
        }
    }//GEN-LAST:event_lbFinanceiroMouseExited

    private void lbRelatoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbRelatoriosMouseClicked
        LimparDesktop();
        lbRelatorios.setForeground(new java.awt.Color(255, 0, 0));
        viewRelatorios.setVisible(true);
        try {
            viewRelatorios.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(ViewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbRelatoriosMouseClicked

    private void lbRelatoriosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbRelatoriosMouseEntered
        if (viewRelatorios.isVisible() == false) {
            lbRelatorios.setForeground(new java.awt.Color(255, 0, 0));
        }
    }//GEN-LAST:event_lbRelatoriosMouseEntered

    private void lbRelatoriosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbRelatoriosMouseExited
        if (viewRelatorios.isVisible() == false) {
            lbRelatorios.setForeground(new java.awt.Color(255, 255, 255));
        }
    }//GEN-LAST:event_lbRelatoriosMouseExited

    private void lbPainelControleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPainelControleMouseClicked
        LimparDesktop();
        lbPainelControle.setForeground(new java.awt.Color(255, 0, 0));
        viewPainelControle.setVisible(true);
        try {
            viewPainelControle.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(ViewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbPainelControleMouseClicked

    private void lbPainelControleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPainelControleMouseEntered
        if (viewPainelControle.isVisible() == false) {
            lbPainelControle.setForeground(new java.awt.Color(255, 0, 0));
        }
    }//GEN-LAST:event_lbPainelControleMouseEntered

    private void lbPainelControleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPainelControleMouseExited
        if (viewPainelControle.isVisible() == false) {
            lbPainelControle.setForeground(new java.awt.Color(255, 255, 255));
        }
    }//GEN-LAST:event_lbPainelControleMouseExited

    private void lbSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSairMouseClicked
        LimparDesktop();
        viewAcesso.setVisible(true);
        try {
            viewAcesso.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(ViewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbSairMouseClicked

    private void lbSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSairMouseEntered
        lbSair.setForeground(new java.awt.Color(255, 0, 0));
    }//GEN-LAST:event_lbSairMouseEntered

    private void lbSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSairMouseExited
        lbSair.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_lbSairMouseExited
    //FIM dos Métodos de interação entre todos os JInternalFrames e o JDesktopPane da ViewPrincipal.

    /**
     * Método principal da classe, carrega lookAndFeel padrão como Windows e
     * define a ViewPrincipal visivel.
     *
     * @param args
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new ViewPrincipal().setVisible(true);
        });
    }

    //Declaração de variáveis.
    private ViewAcesso viewAcesso;
    private ViewHome viewHome;
    private ViewCaixa viewCaixa;
    private ViewClientes viewClientes;
    private ViewFornecedores viewFornecedores;
    private ViewEstoque viewEstoque;
    private ViewFinanceiro viewFinanceiro;
    private ViewRelatorios viewRelatorios;
    private ViewPainelControle viewPainelControle;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpnCorpo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbCaixa;
    private javax.swing.JLabel lbClientes;
    private javax.swing.JLabel lbEstoque;
    private javax.swing.JLabel lbFinanceiro;
    private javax.swing.JLabel lbFornecedores;
    private javax.swing.JLabel lbFundoDireita;
    private javax.swing.JLabel lbFundoEsquerda;
    private javax.swing.JLabel lbHome;
    private javax.swing.JLabel lbNull;
    private javax.swing.JLabel lbPainelControle;
    private javax.swing.JLabel lbRelatorios;
    private javax.swing.JLabel lbSair;
    private javax.swing.JPanel pnCorpo;
    private javax.swing.JPanel pnMenu;
    private javax.swing.JPanel pnRodape;
    // End of variables declaration//GEN-END:variables
}
