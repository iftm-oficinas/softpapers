package br.com.resources.views;

public class ViewRelatorios extends javax.swing.JInternalFrame {

    public ViewRelatorios() {
        initComponents();
    }
    
    public ViewRelatorios(ViewPrincipal viewPrincipal){
        setRootPaneCheckingEnabled(false);
        javax.swing.plaf.InternalFrameUI frame = this.getUI();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) frame).setNorthPane(null);
        
        initComponents();
        this.viewPrincipal = viewPrincipal;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tpnCorpo = new javax.swing.JTabbedPane();
        spnVendasCliente = new javax.swing.JScrollPane();
        pnVendasCliente = new javax.swing.JPanel();
        lbVendasCliente = new javax.swing.JLabel();
        spnVendasVendedor = new javax.swing.JScrollPane();
        pnVendasVendedor = new javax.swing.JPanel();
        lbVendasVededor = new javax.swing.JLabel();
        spnFluxoCaixaDiario = new javax.swing.JScrollPane();
        pnFluxoCaixaDiario = new javax.swing.JPanel();
        lbFluxoCaixaDiario = new javax.swing.JLabel();
        spnFluxoCaixaMensal = new javax.swing.JScrollPane();
        pnFluxoCaixaMensal = new javax.swing.JPanel();
        lbFluxoCaixaMensal = new javax.swing.JLabel();
        spnGiroEstoque = new javax.swing.JScrollPane();
        pnGiroEstoque = new javax.swing.JPanel();
        lbGiroEstoque = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setResizable(true);
        setFrameIcon(null);

        tpnCorpo.setForeground(new java.awt.Color(102, 102, 102));
        tpnCorpo.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tpnCorpo.setFocusable(false);
        tpnCorpo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        spnVendasCliente.setBorder(null);

        pnVendasCliente.setBackground(new java.awt.Color(255, 255, 255));

        lbVendasCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/5.RelatoriosVendasClientes.png"))); // NOI18N

        javax.swing.GroupLayout pnVendasClienteLayout = new javax.swing.GroupLayout(pnVendasCliente);
        pnVendasCliente.setLayout(pnVendasClienteLayout);
        pnVendasClienteLayout.setHorizontalGroup(
            pnVendasClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnVendasClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbVendasCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnVendasClienteLayout.setVerticalGroup(
            pnVendasClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnVendasClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbVendasCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        spnVendasCliente.setViewportView(pnVendasCliente);

        tpnCorpo.addTab("Vendas por Cliente      ", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/vendasCliente.png")), spnVendasCliente); // NOI18N

        spnVendasVendedor.setBorder(null);

        pnVendasVendedor.setBackground(new java.awt.Color(255, 255, 255));

        lbVendasVededor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/5.RelatoriosVendasVendedor.png"))); // NOI18N

        javax.swing.GroupLayout pnVendasVendedorLayout = new javax.swing.GroupLayout(pnVendasVendedor);
        pnVendasVendedor.setLayout(pnVendasVendedorLayout);
        pnVendasVendedorLayout.setHorizontalGroup(
            pnVendasVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnVendasVendedorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbVendasVededor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnVendasVendedorLayout.setVerticalGroup(
            pnVendasVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnVendasVendedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbVendasVededor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        spnVendasVendedor.setViewportView(pnVendasVendedor);

        tpnCorpo.addTab("Vendas por Vendedor  ", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/vendasVendedor.png")), spnVendasVendedor); // NOI18N

        spnFluxoCaixaDiario.setBorder(null);

        pnFluxoCaixaDiario.setBackground(new java.awt.Color(255, 255, 255));

        lbFluxoCaixaDiario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/5.RelatoriosFluxoCaixaDiario.png"))); // NOI18N

        javax.swing.GroupLayout pnFluxoCaixaDiarioLayout = new javax.swing.GroupLayout(pnFluxoCaixaDiario);
        pnFluxoCaixaDiario.setLayout(pnFluxoCaixaDiarioLayout);
        pnFluxoCaixaDiarioLayout.setHorizontalGroup(
            pnFluxoCaixaDiarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFluxoCaixaDiarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbFluxoCaixaDiario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnFluxoCaixaDiarioLayout.setVerticalGroup(
            pnFluxoCaixaDiarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFluxoCaixaDiarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbFluxoCaixaDiario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        spnFluxoCaixaDiario.setViewportView(pnFluxoCaixaDiario);

        tpnCorpo.addTab("Fluxo de Caixa Diário   ", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/fluxoCaixaDiario.png")), spnFluxoCaixaDiario); // NOI18N

        spnFluxoCaixaMensal.setBorder(null);

        pnFluxoCaixaMensal.setBackground(new java.awt.Color(255, 255, 255));

        lbFluxoCaixaMensal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/5.RelatoriosFluxoCaixaMensal.png"))); // NOI18N

        javax.swing.GroupLayout pnFluxoCaixaMensalLayout = new javax.swing.GroupLayout(pnFluxoCaixaMensal);
        pnFluxoCaixaMensal.setLayout(pnFluxoCaixaMensalLayout);
        pnFluxoCaixaMensalLayout.setHorizontalGroup(
            pnFluxoCaixaMensalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFluxoCaixaMensalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbFluxoCaixaMensal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnFluxoCaixaMensalLayout.setVerticalGroup(
            pnFluxoCaixaMensalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFluxoCaixaMensalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbFluxoCaixaMensal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        spnFluxoCaixaMensal.setViewportView(pnFluxoCaixaMensal);

        tpnCorpo.addTab("FLuxo de Caixa Mensal", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/fluxoCaixaMensal.png")), spnFluxoCaixaMensal); // NOI18N

        spnGiroEstoque.setBorder(null);

        pnGiroEstoque.setBackground(new java.awt.Color(255, 255, 255));

        lbGiroEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/5.RelatoriosGiroEstoque.png"))); // NOI18N

        javax.swing.GroupLayout pnGiroEstoqueLayout = new javax.swing.GroupLayout(pnGiroEstoque);
        pnGiroEstoque.setLayout(pnGiroEstoqueLayout);
        pnGiroEstoqueLayout.setHorizontalGroup(
            pnGiroEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnGiroEstoqueLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbGiroEstoque)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnGiroEstoqueLayout.setVerticalGroup(
            pnGiroEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnGiroEstoqueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbGiroEstoque)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        spnGiroEstoque.setViewportView(pnGiroEstoque);

        tpnCorpo.addTab("Giro de Estoque           ", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/giroCaixa.png")), spnGiroEstoque); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpnCorpo, javax.swing.GroupLayout.DEFAULT_SIZE, 1058, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpnCorpo)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private ViewPrincipal viewPrincipal;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbFluxoCaixaDiario;
    private javax.swing.JLabel lbFluxoCaixaMensal;
    private javax.swing.JLabel lbGiroEstoque;
    private javax.swing.JLabel lbVendasCliente;
    private javax.swing.JLabel lbVendasVededor;
    private javax.swing.JPanel pnFluxoCaixaDiario;
    private javax.swing.JPanel pnFluxoCaixaMensal;
    private javax.swing.JPanel pnGiroEstoque;
    private javax.swing.JPanel pnVendasCliente;
    private javax.swing.JPanel pnVendasVendedor;
    private javax.swing.JScrollPane spnFluxoCaixaDiario;
    private javax.swing.JScrollPane spnFluxoCaixaMensal;
    private javax.swing.JScrollPane spnGiroEstoque;
    private javax.swing.JScrollPane spnVendasCliente;
    private javax.swing.JScrollPane spnVendasVendedor;
    private javax.swing.JTabbedPane tpnCorpo;
    // End of variables declaration//GEN-END:variables
}
