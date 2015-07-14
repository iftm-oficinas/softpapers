package br.com.resources.views;

public class ViewFinanceiro extends javax.swing.JInternalFrame {

    public ViewFinanceiro() {
        initComponents();
    }
    
    public ViewFinanceiro(ViewPrincipal viewPrincipal){
        setRootPaneCheckingEnabled(false);
        javax.swing.plaf.InternalFrameUI frame = this.getUI();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) frame).setNorthPane(null);
        
        initComponents();
        this.viewPrincipal = viewPrincipal;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spnCorpo = new javax.swing.JScrollPane();
        tpnCorpo = new javax.swing.JTabbedPane();
        pnExtrato = new javax.swing.JPanel();
        lbExtrato = new javax.swing.JLabel();
        pnContasPagar = new javax.swing.JPanel();
        lbContasPagar = new javax.swing.JLabel();
        pnContasReceber = new javax.swing.JPanel();
        lbContasReceber = new javax.swing.JLabel();
        pnHitorico = new javax.swing.JPanel();
        lbHistorico = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setResizable(true);
        setFrameIcon(null);

        spnCorpo.setBorder(null);

        tpnCorpo.setForeground(new java.awt.Color(102, 102, 102));
        tpnCorpo.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        tpnCorpo.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tpnCorpo.setFocusable(false);
        tpnCorpo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        pnExtrato.setBackground(new java.awt.Color(255, 255, 255));

        lbExtrato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/4.FinanceiroExtrato.png"))); // NOI18N

        javax.swing.GroupLayout pnExtratoLayout = new javax.swing.GroupLayout(pnExtrato);
        pnExtrato.setLayout(pnExtratoLayout);
        pnExtratoLayout.setHorizontalGroup(
            pnExtratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnExtratoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbExtrato)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnExtratoLayout.setVerticalGroup(
            pnExtratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnExtratoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbExtrato)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tpnCorpo.addTab("Extrato                  ", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/meio.png")), pnExtrato); // NOI18N

        pnContasPagar.setBackground(new java.awt.Color(255, 255, 255));

        lbContasPagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/4.FinanceiroContasPagar.png"))); // NOI18N
        lbContasPagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbContasPagarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnContasPagarLayout = new javax.swing.GroupLayout(pnContasPagar);
        pnContasPagar.setLayout(pnContasPagarLayout);
        pnContasPagarLayout.setHorizontalGroup(
            pnContasPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContasPagarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbContasPagar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnContasPagarLayout.setVerticalGroup(
            pnContasPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContasPagarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbContasPagar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tpnCorpo.addTab("Contas a Pagar     ", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/baixo.png")), pnContasPagar); // NOI18N

        pnContasReceber.setBackground(new java.awt.Color(255, 255, 255));

        lbContasReceber.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/4.FinanceiroContasReceber.png"))); // NOI18N
        lbContasReceber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbContasReceberMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnContasReceberLayout = new javax.swing.GroupLayout(pnContasReceber);
        pnContasReceber.setLayout(pnContasReceberLayout);
        pnContasReceberLayout.setHorizontalGroup(
            pnContasReceberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContasReceberLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbContasReceber)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnContasReceberLayout.setVerticalGroup(
            pnContasReceberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContasReceberLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbContasReceber)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tpnCorpo.addTab("Contas a Receber", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/cima.png")), pnContasReceber); // NOI18N

        pnHitorico.setBackground(new java.awt.Color(255, 255, 255));

        lbHistorico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/4.FinanceiroHistorico.png"))); // NOI18N

        javax.swing.GroupLayout pnHitoricoLayout = new javax.swing.GroupLayout(pnHitorico);
        pnHitorico.setLayout(pnHitoricoLayout);
        pnHitoricoLayout.setHorizontalGroup(
            pnHitoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHitoricoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbHistorico)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnHitoricoLayout.setVerticalGroup(
            pnHitoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHitoricoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbHistorico)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tpnCorpo.addTab("Histórico               ", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/bola.png")), pnHitorico); // NOI18N

        spnCorpo.setViewportView(tpnCorpo);

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

    private void lbContasPagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbContasPagarMouseClicked
        viewNovoPagamento = new ViewNovoPagamento(viewPrincipal, true);
        viewNovoPagamento.setVisible(true);
    }//GEN-LAST:event_lbContasPagarMouseClicked

    private void lbContasReceberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbContasReceberMouseClicked
        viewNovoRecebimento = new ViewNovoRecebimento(viewPrincipal, true);
        viewNovoRecebimento.setVisible(true);
    }//GEN-LAST:event_lbContasReceberMouseClicked

    private ViewPrincipal viewPrincipal;
    private ViewNovoPagamento viewNovoPagamento;
    private ViewNovoRecebimento viewNovoRecebimento;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbContasPagar;
    private javax.swing.JLabel lbContasReceber;
    private javax.swing.JLabel lbExtrato;
    private javax.swing.JLabel lbHistorico;
    private javax.swing.JPanel pnContasPagar;
    private javax.swing.JPanel pnContasReceber;
    private javax.swing.JPanel pnExtrato;
    private javax.swing.JPanel pnHitorico;
    private javax.swing.JScrollPane spnCorpo;
    private javax.swing.JTabbedPane tpnCorpo;
    // End of variables declaration//GEN-END:variables
}
