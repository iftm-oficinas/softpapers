package br.com.resources.views;

/**
 * @see Classe visual. JInternalFrame que tem como objetivo gerenciar todos os
 * registros das contas a receber, pagar e o saldo, assim como listar todas as
 * alterações. Composto pelas funcionalidades: Contas a pagar, Contas a receber,
 * Extrato, Histórico.
 * @author Bruna Danieli Ribeiro Gonçalves, Márlon Ândrel Coelho Freitas
 */
public class ViewFinanceiro extends javax.swing.JInternalFrame {

    /**
     * @see Construtor padrão.
     */
    public ViewFinanceiro() {
        //Inicialização dos componentes padrões do JFrame.
        initComponents();
    }

    /**
     * @see Construtor usado quando classe é instanciada na ViewPrincipal,
     * recebe a viewPrincipal como pai e organiza esse JInternalFrame dentro do
     * JFrame principal.
     * @param viewPrincipal
     */
    public ViewFinanceiro(ViewPrincipal viewPrincipal) {
        //Esconde barra de título padrão do JInternalFrama.
        setRootPaneCheckingEnabled(false);
        javax.swing.plaf.InternalFrameUI frame = this.getUI();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) frame).setNorthPane(null);

        //Inicialização dos componentes padrões do JFrame.
        initComponents();
        this.viewPrincipal = viewPrincipal;
    }

    //Componentes padrões do JFrame
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spnCorpo = new javax.swing.JScrollPane();
        tpnCorpo = new javax.swing.JTabbedPane();
        pnExtrato = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnContasPagar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnContasReceber = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pnHitorico = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/prototipo/4.FinanceiroExtrato.png"))); // NOI18N

        javax.swing.GroupLayout pnExtratoLayout = new javax.swing.GroupLayout(pnExtrato);
        pnExtrato.setLayout(pnExtratoLayout);
        pnExtratoLayout.setHorizontalGroup(
            pnExtratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnExtratoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnExtratoLayout.setVerticalGroup(
            pnExtratoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnExtratoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tpnCorpo.addTab("Extrato                  ", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/extrato.png")), pnExtrato); // NOI18N

        pnContasPagar.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/prototipo/4.FinanceiroContasPagar.png"))); // NOI18N

        javax.swing.GroupLayout pnContasPagarLayout = new javax.swing.GroupLayout(pnContasPagar);
        pnContasPagar.setLayout(pnContasPagarLayout);
        pnContasPagarLayout.setHorizontalGroup(
            pnContasPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContasPagarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnContasPagarLayout.setVerticalGroup(
            pnContasPagarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContasPagarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tpnCorpo.addTab("Contas a Pagar     ", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/contasPagar.png")), pnContasPagar); // NOI18N

        pnContasReceber.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/prototipo/4.FinanceiroContasReceber.png"))); // NOI18N

        javax.swing.GroupLayout pnContasReceberLayout = new javax.swing.GroupLayout(pnContasReceber);
        pnContasReceber.setLayout(pnContasReceberLayout);
        pnContasReceberLayout.setHorizontalGroup(
            pnContasReceberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContasReceberLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnContasReceberLayout.setVerticalGroup(
            pnContasReceberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContasReceberLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tpnCorpo.addTab("Contas a Receber", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/contasReceber.png")), pnContasReceber); // NOI18N

        pnHitorico.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/prototipo/4.FinanceiroHistorico.png"))); // NOI18N

        javax.swing.GroupLayout pnHitoricoLayout = new javax.swing.GroupLayout(pnHitorico);
        pnHitorico.setLayout(pnHitoricoLayout);
        pnHitoricoLayout.setHorizontalGroup(
            pnHitoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHitoricoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnHitoricoLayout.setVerticalGroup(
            pnHitoricoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnHitoricoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tpnCorpo.addTab("Histórico               ", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/historico.png")), pnHitorico); // NOI18N

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

    //Declaração de variáveis(View).
    private ViewPrincipal viewPrincipal;
    private ViewPagamento viewNovoPagamento;
    private ViewRecebimento viewNovoRecebimento;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel pnContasPagar;
    private javax.swing.JPanel pnContasReceber;
    private javax.swing.JPanel pnExtrato;
    private javax.swing.JPanel pnHitorico;
    private javax.swing.JScrollPane spnCorpo;
    private javax.swing.JTabbedPane tpnCorpo;
    // End of variables declaration//GEN-END:variables
}
