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

        spnCorpo = new javax.swing.JScrollPane();
        tpnCorpo = new javax.swing.JTabbedPane();
        pnVendasCliente = new javax.swing.JPanel();
        lbVendasCliente = new javax.swing.JLabel();
        pnVendasVendedor = new javax.swing.JPanel();
        lbVendasVededor = new javax.swing.JLabel();
        pnFluxoCaixaDiario = new javax.swing.JPanel();
        lbFluxoCaixaDiario = new javax.swing.JLabel();
        pnFluxoCaixaMensal = new javax.swing.JPanel();
        lbFluxoCaixaMensal = new javax.swing.JLabel();
        pnGiroEstoque = new javax.swing.JPanel();
        lbGiroEstoque = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setResizable(true);
        setFrameIcon(null);

        spnCorpo.setBorder(null);

        tpnCorpo.setForeground(new java.awt.Color(102, 102, 102));
        tpnCorpo.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tpnCorpo.setFocusable(false);
        tpnCorpo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        pnVendasCliente.setBackground(new java.awt.Color(255, 255, 255));

        lbVendasCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/5.RelatoriosVendasClientes.png"))); // NOI18N

        javax.swing.GroupLayout pnVendasClienteLayout = new javax.swing.GroupLayout(pnVendasCliente);
        pnVendasCliente.setLayout(pnVendasClienteLayout);
        pnVendasClienteLayout.setHorizontalGroup(
            pnVendasClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnVendasClienteLayout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(lbVendasCliente)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        pnVendasClienteLayout.setVerticalGroup(
            pnVendasClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnVendasClienteLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lbVendasCliente)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tpnCorpo.addTab("Vendas por Cliente     ", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/vendasCliente.png")), pnVendasCliente); // NOI18N

        pnVendasVendedor.setBackground(new java.awt.Color(255, 255, 255));

        lbVendasVededor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/5.RelatoriosVendasVendedor.png"))); // NOI18N

        javax.swing.GroupLayout pnVendasVendedorLayout = new javax.swing.GroupLayout(pnVendasVendedor);
        pnVendasVendedor.setLayout(pnVendasVendedorLayout);
        pnVendasVendedorLayout.setHorizontalGroup(
            pnVendasVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnVendasVendedorLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbVendasVededor)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnVendasVendedorLayout.setVerticalGroup(
            pnVendasVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnVendasVendedorLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lbVendasVededor)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tpnCorpo.addTab("Vendas por Vendedor ", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/vendasVendedor.png")), pnVendasVendedor); // NOI18N

        pnFluxoCaixaDiario.setBackground(new java.awt.Color(255, 255, 255));

        lbFluxoCaixaDiario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/5.RelatoriosFluxoCaixaDiario.png"))); // NOI18N

        javax.swing.GroupLayout pnFluxoCaixaDiarioLayout = new javax.swing.GroupLayout(pnFluxoCaixaDiario);
        pnFluxoCaixaDiario.setLayout(pnFluxoCaixaDiarioLayout);
        pnFluxoCaixaDiarioLayout.setHorizontalGroup(
            pnFluxoCaixaDiarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFluxoCaixaDiarioLayout.createSequentialGroup()
                .addGap(0, 2, Short.MAX_VALUE)
                .addComponent(lbFluxoCaixaDiario)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        pnFluxoCaixaDiarioLayout.setVerticalGroup(
            pnFluxoCaixaDiarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFluxoCaixaDiarioLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lbFluxoCaixaDiario)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tpnCorpo.addTab("Fluxo de Caixa Diário  ", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/fluxoCaixaDiario.png")), pnFluxoCaixaDiario); // NOI18N

        pnFluxoCaixaMensal.setBackground(new java.awt.Color(255, 255, 255));

        lbFluxoCaixaMensal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/5.RelatoriosFluxoCaixaMensal.png"))); // NOI18N

        javax.swing.GroupLayout pnFluxoCaixaMensalLayout = new javax.swing.GroupLayout(pnFluxoCaixaMensal);
        pnFluxoCaixaMensal.setLayout(pnFluxoCaixaMensalLayout);
        pnFluxoCaixaMensalLayout.setHorizontalGroup(
            pnFluxoCaixaMensalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFluxoCaixaMensalLayout.createSequentialGroup()
                .addGap(0, 51, Short.MAX_VALUE)
                .addComponent(lbFluxoCaixaMensal)
                .addGap(0, 51, Short.MAX_VALUE))
        );
        pnFluxoCaixaMensalLayout.setVerticalGroup(
            pnFluxoCaixaMensalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFluxoCaixaMensalLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lbFluxoCaixaMensal)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tpnCorpo.addTab("Fluxo de Caixa Mensal", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/fluxoCaixaMensal.png")), pnFluxoCaixaMensal); // NOI18N

        pnGiroEstoque.setBackground(new java.awt.Color(255, 255, 255));

        lbGiroEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/5.RelatoriosGiroEstoque.png"))); // NOI18N

        javax.swing.GroupLayout pnGiroEstoqueLayout = new javax.swing.GroupLayout(pnGiroEstoque);
        pnGiroEstoque.setLayout(pnGiroEstoqueLayout);
        pnGiroEstoqueLayout.setHorizontalGroup(
            pnGiroEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnGiroEstoqueLayout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(lbGiroEstoque)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        pnGiroEstoqueLayout.setVerticalGroup(
            pnGiroEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnGiroEstoqueLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lbGiroEstoque)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        tpnCorpo.addTab("Giro de Estoque          ", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/giroEstoque.png")), pnGiroEstoque); // NOI18N

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
    private javax.swing.JScrollPane spnCorpo;
    private javax.swing.JTabbedPane tpnCorpo;
    // End of variables declaration//GEN-END:variables
}
