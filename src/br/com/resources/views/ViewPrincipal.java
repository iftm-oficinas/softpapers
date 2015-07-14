package br.com.resources.views;

import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @see Classe visual. JFrame principal do programa que possui uma barra de menu
 * (JPanel) que ao clicar em cada opção (JButton) adiciona um JInternalFrame ao
 * JDesktopPane.
 *
 * @author Bruna Danieli Ribeiro Gonçalves, Márlon Ândrel Coelho Freitas
 */
public class ViewPrincipal extends javax.swing.JFrame {

    /**
     *
     * @see Construtor padrão que é carregado quando se executa o programa pela
     * primeira vez e é necessário a verificação de acesso.
     */
    public ViewPrincipal() {
        //Inicialização dos componentes padrões do JFrame.
        initComponents();

        //Define que a view sempre carregue como maximizada.
        setExtendedState(MAXIMIZED_BOTH);

        //Instanciando e adicionando todos os JInternalFrames no JDesktopPane(dpnCorpo) da viewPrincipal.
        dpnCorpo.add(viewAcesso = new ViewAcesso(this));
        dpnCorpo.add(viewEstoque = new ViewEstoque(this));
        dpnCorpo.add(viewFinanceiro = new ViewFinanceiro(this));
        dpnCorpo.add(viewPainelControle = new ViewPainelControle(this));
        dpnCorpo.add(viewRelatorios = new ViewRelatorios(this));
        dpnCorpo.add(viewVendas = new ViewVendas(this));
        dpnCorpo.add(viewVisaoGeral = new ViewVisaoGeral(this));

        //Condição try que tenta definir a viewAcesso com tamanho máximo.
        viewAcesso.setVisible(true);
        try {
            viewAcesso.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(ViewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Define como não visível todos os elementos do menu (pnMenu).
        ocultarMenu();
    }

    /**
     *
     * @see Método que define todos os elementos do menu como não visíveis para
     * restringir o acesso antes do usuario acessar.
     */
    public final void ocultarMenu() {
        btnVisaoGeral.setVisible(false);
        btnVendas.setVisible(false);
        btnEstoque.setVisible(false);
        btnFinanceiro.setVisible(false);
        btnRelatorios.setVisible(false);
        btnPainelControle.setVisible(false);
        btnSair.setVisible(false);
    }

    /**
     *
     * @see Método que define todos os elementos do menu como visíveis após
     * realizar o acesso.
     */
    public final void mostrarMenu() {
        btnVisaoGeral.setVisible(true);
        btnVendas.setVisible(true);
        btnEstoque.setVisible(true);
        btnFinanceiro.setVisible(true);
        btnRelatorios.setVisible(true);
        btnPainelControle.setVisible(true);
        btnSair.setVisible(true);

        //Chamada do Método btnVisaoGeralActionPerformed que define como visível a viewVisaoGeral.
        btnVisaoGeral.doClick();
    }

    /**
     * @see Método que retorna a aparencia da viewPrincipal ao seu padrão e
     * define como não visivel todos os JInternalFrames, utilizado sempre que
     * uma nova view for definida como visível.
     */
    public final void LimparDesktop() {
        viewAcesso.setVisible(false);
        viewEstoque.setVisible(false);
        viewFinanceiro.setVisible(false);
        viewPainelControle.setVisible(false);
        viewRelatorios.setVisible(false);
        viewVendas.setVisible(false);
        viewVisaoGeral.setVisible(false);
    }

    //Componentes padrões do JFrame
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        pnMenu = new javax.swing.JPanel();
        btnVisaoGeral = new javax.swing.JToggleButton();
        btnVendas = new javax.swing.JToggleButton();
        btnEstoque = new javax.swing.JToggleButton();
        btnFinanceiro = new javax.swing.JToggleButton();
        btnRelatorios = new javax.swing.JToggleButton();
        btnPainelControle = new javax.swing.JToggleButton();
        btnSair = new javax.swing.JButton();
        lbNULL = new javax.swing.JLabel();
        pnCorpo = new javax.swing.JPanel();
        lbFundoEsquerda = new javax.swing.JLabel();
        dpnCorpo = new javax.swing.JDesktopPane();
        lbLogo = new javax.swing.JLabel();
        pnRodape = new javax.swing.JPanel();
        sprRodape = new javax.swing.JSeparator();
        lbRodape = new javax.swing.JLabel();
        lbFundoDireita = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pricipal");

        pnMenu.setBackground(new java.awt.Color(51, 51, 51));

        buttonGroup.add(btnVisaoGeral);
        btnVisaoGeral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnVsaoGeralUP.png"))); // NOI18N
        btnVisaoGeral.setBorder(null);
        btnVisaoGeral.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVisaoGeral.setFocusable(false);
        btnVisaoGeral.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnVisaoGeralDOWN.png"))); // NOI18N
        btnVisaoGeral.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnVisaoGeralMIDDLE.png"))); // NOI18N
        btnVisaoGeral.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnVisaoGeralDOWN.png"))); // NOI18N
        btnVisaoGeral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisaoGeralActionPerformed(evt);
            }
        });

        buttonGroup.add(btnVendas);
        btnVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnVendasUP.png"))); // NOI18N
        btnVendas.setBorder(null);
        btnVendas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVendas.setFocusable(false);
        btnVendas.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnVendasDOWN.png"))); // NOI18N
        btnVendas.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnVendasMIDDLE.png"))); // NOI18N
        btnVendas.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnVendasDOWN.png"))); // NOI18N
        btnVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendasActionPerformed(evt);
            }
        });

        buttonGroup.add(btnEstoque);
        btnEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnEstoqueUP.png"))); // NOI18N
        btnEstoque.setBorder(null);
        btnEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEstoque.setFocusable(false);
        btnEstoque.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnEstoqueDOWN.png"))); // NOI18N
        btnEstoque.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnEstoqueMIDDLE.png"))); // NOI18N
        btnEstoque.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnEstoqueDOWN.png"))); // NOI18N
        btnEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstoqueActionPerformed(evt);
            }
        });

        buttonGroup.add(btnFinanceiro);
        btnFinanceiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnFinanceiroUP.png"))); // NOI18N
        btnFinanceiro.setBorder(null);
        btnFinanceiro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinanceiro.setFocusable(false);
        btnFinanceiro.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnFinanceiroDOWN.png"))); // NOI18N
        btnFinanceiro.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnFinanceiroMIDDLE.png"))); // NOI18N
        btnFinanceiro.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnFinanceiroDOWN.png"))); // NOI18N
        btnFinanceiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinanceiroActionPerformed(evt);
            }
        });

        buttonGroup.add(btnRelatorios);
        btnRelatorios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnRelatoriosUP.png"))); // NOI18N
        btnRelatorios.setBorder(null);
        btnRelatorios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRelatorios.setFocusable(false);
        btnRelatorios.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnRelatoriosDOWN.png"))); // NOI18N
        btnRelatorios.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnRelatoriosMIDDLE.png"))); // NOI18N
        btnRelatorios.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnRelatoriosDOWN.png"))); // NOI18N
        btnRelatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatoriosActionPerformed(evt);
            }
        });

        buttonGroup.add(btnPainelControle);
        btnPainelControle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnPainelControleUP.png"))); // NOI18N
        btnPainelControle.setBorder(null);
        btnPainelControle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPainelControle.setFocusable(false);
        btnPainelControle.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnPainelControleDOWN.png"))); // NOI18N
        btnPainelControle.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnPainelControleMIDDLE.png"))); // NOI18N
        btnPainelControle.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnPainelControleDOWN.png"))); // NOI18N
        btnPainelControle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPainelControleActionPerformed(evt);
            }
        });

        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnSairUP.png"))); // NOI18N
        btnSair.setBorder(null);
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.setFocusable(false);
        btnSair.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnSairDOWN.png"))); // NOI18N
        btnSair.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnSairMIDDLE.png"))); // NOI18N
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });

        lbNULL.setForeground(new java.awt.Color(51, 51, 51));
        lbNULL.setText("NULL");

        javax.swing.GroupLayout pnMenuLayout = new javax.swing.GroupLayout(pnMenu);
        pnMenu.setLayout(pnMenuLayout);
        pnMenuLayout.setHorizontalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuLayout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(btnVisaoGeral)
                .addGap(0, 0, 0)
                .addComponent(btnVendas)
                .addGap(0, 0, 0)
                .addComponent(btnEstoque)
                .addGap(0, 0, 0)
                .addComponent(btnFinanceiro)
                .addGap(0, 0, 0)
                .addComponent(btnRelatorios)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbNULL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPainelControle)
                .addGap(0, 0, 0)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170))
        );
        pnMenuLayout.setVerticalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuLayout.createSequentialGroup()
                .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnFinanceiro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEstoque, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVendas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPainelControle, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnSair, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnVisaoGeral)
                    .addComponent(btnRelatorios)
                    .addComponent(lbNULL, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pnCorpo.setBackground(new java.awt.Color(153, 153, 153));
        pnCorpo.setPreferredSize(new java.awt.Dimension(0, 3));

        lbFundoEsquerda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/fundoDireita.png"))); // NOI18N

        dpnCorpo.setBackground(new java.awt.Color(255, 255, 255));

        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/logoGRAY.png"))); // NOI18N

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
                .addContainerGap(233, Short.MAX_VALUE)
                .addComponent(lbRodape)
                .addContainerGap(233, Short.MAX_VALUE))
        );
        pnRodapeLayout.setVerticalGroup(
            pnRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRodapeLayout.createSequentialGroup()
                .addComponent(sprRodape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbRodape)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout dpnCorpoLayout = new javax.swing.GroupLayout(dpnCorpo);
        dpnCorpo.setLayout(dpnCorpoLayout);
        dpnCorpoLayout.setHorizontalGroup(
            dpnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dpnCorpoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbLogo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pnRodape, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        dpnCorpoLayout.setVerticalGroup(
            dpnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dpnCorpoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbLogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnRodape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        dpnCorpo.setLayer(lbLogo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dpnCorpo.setLayer(pnRodape, javax.swing.JLayeredPane.DEFAULT_LAYER);

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
            .addGroup(pnCorpoLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dpnCorpo)
                    .addComponent(lbFundoEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lbFundoDireita, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnCorpo, javax.swing.GroupLayout.DEFAULT_SIZE, 1135, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnCorpo, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //INICIO dos Métodos que realizão interação entre todos os JInternalFrames e o JDesktopPane da ViewPrincipal. 
    private void btnVisaoGeralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaoGeralActionPerformed
        if (!viewVisaoGeral.isVisible()) {
            LimparDesktop();
            viewVisaoGeral.setVisible(true);
            try {
                viewVisaoGeral.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(ViewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnVisaoGeralActionPerformed

    private void btnVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendasActionPerformed
        if (!viewVendas.isVisible()) {
            LimparDesktop();
            viewVendas.setVisible(true);
            try {
                viewVendas.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(ViewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnVendasActionPerformed

    private void btnEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstoqueActionPerformed
        if (!viewEstoque.isVisible()) {
            LimparDesktop();
            viewEstoque.setVisible(true);
            try {
                viewEstoque.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(ViewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnEstoqueActionPerformed

    private void btnFinanceiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinanceiroActionPerformed
        if (!viewFinanceiro.isVisible()) {
            LimparDesktop();
            viewFinanceiro.setVisible(true);
            try {
                viewFinanceiro.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(ViewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnFinanceiroActionPerformed

    private void btnRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatoriosActionPerformed
        if (!viewRelatorios.isVisible()) {
            LimparDesktop();
            viewRelatorios.setVisible(true);
            try {
                viewRelatorios.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(ViewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnRelatoriosActionPerformed

    private void btnPainelControleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPainelControleActionPerformed
        if (!viewPainelControle.isVisible()) {
            LimparDesktop();
            viewPainelControle.setVisible(true);
            try {
                viewPainelControle.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(ViewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnPainelControleActionPerformed

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "Alerta", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            LimparDesktop();
            ocultarMenu();
            viewAcesso.setVisible(true);
            try {
                viewAcesso.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(ViewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnSairActionPerformed
    //FIM dos Métodos de interação entre todos os JInternalFrames e o JDesktopPane da ViewPrincipal.

    /**
     *
     * @see Método principal da classe, carrega lookAndFeel padrão como Windows
     * e define a ViewPrincipal visível.
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

    //Declaração de variáveis(Views).
    private ViewAcesso viewAcesso;
    private ViewEstoque viewEstoque;
    private ViewFinanceiro viewFinanceiro;
    private ViewPainelControle viewPainelControle;
    private ViewRelatorios viewRelatorios;
    private ViewVendas viewVendas;
    private ViewVisaoGeral viewVisaoGeral;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnEstoque;
    private javax.swing.JToggleButton btnFinanceiro;
    private javax.swing.JToggleButton btnPainelControle;
    private javax.swing.JToggleButton btnRelatorios;
    private javax.swing.JButton btnSair;
    private javax.swing.JToggleButton btnVendas;
    private javax.swing.JToggleButton btnVisaoGeral;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JDesktopPane dpnCorpo;
    private javax.swing.JLabel lbFundoDireita;
    private javax.swing.JLabel lbFundoEsquerda;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbNULL;
    private javax.swing.JLabel lbRodape;
    private javax.swing.JPanel pnCorpo;
    private javax.swing.JPanel pnMenu;
    private javax.swing.JPanel pnRodape;
    private javax.swing.JSeparator sprRodape;
    // End of variables declaration//GEN-END:variables
}
