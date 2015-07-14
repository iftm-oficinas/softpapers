/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.view;

/**
 *
 * @author Familia
 */
public class ViewPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form ViewPrincipal
     */
    public ViewPrincipal() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnMenu = new javax.swing.JPanel();
        lbHome = new javax.swing.JLabel();
        lbCaixa = new javax.swing.JLabel();
        lbSair = new javax.swing.JLabel();
        lbClientes = new javax.swing.JLabel();
        lbFornecedores = new javax.swing.JLabel();
        lbContas = new javax.swing.JLabel();
        lbEstoque = new javax.swing.JLabel();
        lbSair1 = new javax.swing.JLabel();
        spCima = new javax.swing.JSeparator();
        lbEsquerda = new javax.swing.JLabel();
        spEsquerda = new javax.swing.JSeparator();
        pnCorpo = new javax.swing.JPanel();
        lbDireita = new javax.swing.JLabel();
        spDireita = new javax.swing.JSeparator();
        spBaixo = new javax.swing.JSeparator();
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

        lbHome.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lbHome.setForeground(new java.awt.Color(255, 255, 255));
        lbHome.setText("HOME");

        lbCaixa.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lbCaixa.setForeground(new java.awt.Color(255, 255, 255));
        lbCaixa.setText("CAIXA");

        lbSair.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lbSair.setForeground(new java.awt.Color(255, 255, 255));
        lbSair.setText("SAIR");

        lbClientes.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lbClientes.setForeground(new java.awt.Color(255, 255, 255));
        lbClientes.setText("CLIENTES");

        lbFornecedores.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lbFornecedores.setForeground(new java.awt.Color(255, 255, 255));
        lbFornecedores.setText("FORNECEDORES");

        lbContas.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lbContas.setForeground(new java.awt.Color(255, 255, 255));
        lbContas.setText("FINANCEIRO");

        lbEstoque.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lbEstoque.setForeground(new java.awt.Color(255, 255, 255));
        lbEstoque.setText("ESTOQUE");

        lbSair1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        lbSair1.setForeground(new java.awt.Color(255, 255, 255));
        lbSair1.setText("PAINEL DE CONTROLE");

        javax.swing.GroupLayout pnMenuLayout = new javax.swing.GroupLayout(pnMenu);
        pnMenu.setLayout(pnMenuLayout);
        pnMenuLayout.setHorizontalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuLayout.createSequentialGroup()
                .addGap(140, 140, 140)
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
                .addComponent(lbContas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addComponent(lbSair1)
                .addGap(18, 18, 18)
                .addComponent(lbSair)
                .addGap(140, 140, 140))
        );
        pnMenuLayout.setVerticalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbHome)
                    .addComponent(lbCaixa)
                    .addComponent(lbSair)
                    .addComponent(lbClientes)
                    .addComponent(lbFornecedores)
                    .addComponent(lbContas)
                    .addComponent(lbEstoque)
                    .addComponent(lbSair1))
                .addContainerGap())
        );

        spCima.setForeground(new java.awt.Color(204, 204, 204));

        lbEsquerda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/view/resources/fundo.png"))); // NOI18N

        spEsquerda.setForeground(new java.awt.Color(204, 204, 204));
        spEsquerda.setOrientation(javax.swing.SwingConstants.VERTICAL);

        pnCorpo.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnCorpoLayout = new javax.swing.GroupLayout(pnCorpo);
        pnCorpo.setLayout(pnCorpoLayout);
        pnCorpoLayout.setHorizontalGroup(
            pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 916, Short.MAX_VALUE)
        );
        pnCorpoLayout.setVerticalGroup(
            pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );

        lbDireita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/view/resources/fundo.png"))); // NOI18N

        spDireita.setForeground(new java.awt.Color(204, 204, 204));
        spDireita.setOrientation(javax.swing.SwingConstants.VERTICAL);

        spBaixo.setForeground(new java.awt.Color(204, 204, 204));

        pnRodape.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("2015 - 2016 Controle de Papelaria");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Versão 0.2015.05.06 Alfa");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Ajuda");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Termos de Uso");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Política de Privacidade");

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("|");

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 10)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("|");

        javax.swing.GroupLayout pnRodapeLayout = new javax.swing.GroupLayout(pnRodape);
        pnRodape.setLayout(pnRodapeLayout);
        pnRodapeLayout.setHorizontalGroup(
            pnRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRodapeLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel1)
                .addGap(300, 300, 300)
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
                .addGap(120, 120, 120))
        );
        pnRodapeLayout.setVerticalGroup(
            pnRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnRodapeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnRodape, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(spEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnCorpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(spDireita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbDireita, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(spCima)
            .addComponent(spBaixo)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spCima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spDireita, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(spEsquerda)
                    .addComponent(lbEsquerda, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(pnCorpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbDireita, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(spBaixo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnRodape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbCaixa;
    private javax.swing.JLabel lbClientes;
    private javax.swing.JLabel lbContas;
    private javax.swing.JLabel lbDireita;
    private javax.swing.JLabel lbEsquerda;
    private javax.swing.JLabel lbEstoque;
    private javax.swing.JLabel lbFornecedores;
    private javax.swing.JLabel lbHome;
    private javax.swing.JLabel lbSair;
    private javax.swing.JLabel lbSair1;
    private javax.swing.JPanel pnCorpo;
    private javax.swing.JPanel pnMenu;
    private javax.swing.JPanel pnRodape;
    private javax.swing.JSeparator spBaixo;
    private javax.swing.JSeparator spCima;
    private javax.swing.JSeparator spDireita;
    private javax.swing.JSeparator spEsquerda;
    // End of variables declaration//GEN-END:variables
}