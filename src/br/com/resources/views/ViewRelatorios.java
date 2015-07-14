package br.com.resources.views;

/**
 * @see Classe visual. JInternalFrame que tem como objetivo demonstrar os
 * relatórios do sistema.
 * @author Bruna Danieli Ribeiro Gonçalves, Márlon Ândrel Coelho Freitas
 */
public class ViewRelatorios extends javax.swing.JInternalFrame {

    /**
     * @see Construtor padrão.
     */
    public ViewRelatorios() {
        initComponents();
    }

    /**
     * @see Construtor usado quando classe é instanciada na ViewPrincipal,
     * recebe a viewPrincipal como pai e organiza esse JInternalFrame dentro do
     * JFrame principal.
     * @param viewPrincipal
     */
    public ViewRelatorios(ViewPrincipal viewPrincipal) {
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
        pnVendasCliente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnVendasVendedor = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnFluxoCaixaDiario = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        pnFluxoCaixaMensal = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        pnGiroEstoque = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        pnAnaliseDespesas = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        pnCentroCustos = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        pnFaturamento = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

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

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/prototipo/5.RelatoriosVendasClientes.png"))); // NOI18N

        javax.swing.GroupLayout pnVendasClienteLayout = new javax.swing.GroupLayout(pnVendasCliente);
        pnVendasCliente.setLayout(pnVendasClienteLayout);
        pnVendasClienteLayout.setHorizontalGroup(
            pnVendasClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnVendasClienteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnVendasClienteLayout.setVerticalGroup(
            pnVendasClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnVendasClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tpnCorpo.addTab("Vendas por cliente     ", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/vendasCliente.png")), pnVendasCliente); // NOI18N

        pnVendasVendedor.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/prototipo/5.RelatoriosVendasVendedor.png"))); // NOI18N

        javax.swing.GroupLayout pnVendasVendedorLayout = new javax.swing.GroupLayout(pnVendasVendedor);
        pnVendasVendedor.setLayout(pnVendasVendedorLayout);
        pnVendasVendedorLayout.setHorizontalGroup(
            pnVendasVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnVendasVendedorLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnVendasVendedorLayout.setVerticalGroup(
            pnVendasVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnVendasVendedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tpnCorpo.addTab("Vendas por vendedor", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/vendasVendedor.png")), pnVendasVendedor); // NOI18N

        pnFluxoCaixaDiario.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/prototipo/5.RelatoriosFluxoCaixaDiario.png"))); // NOI18N

        javax.swing.GroupLayout pnFluxoCaixaDiarioLayout = new javax.swing.GroupLayout(pnFluxoCaixaDiario);
        pnFluxoCaixaDiario.setLayout(pnFluxoCaixaDiarioLayout);
        pnFluxoCaixaDiarioLayout.setHorizontalGroup(
            pnFluxoCaixaDiarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFluxoCaixaDiarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnFluxoCaixaDiarioLayout.setVerticalGroup(
            pnFluxoCaixaDiarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFluxoCaixaDiarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tpnCorpo.addTab("Fluxo de caixa mensal", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/fluxoCaixaMensal.png")), pnFluxoCaixaDiario); // NOI18N

        pnFluxoCaixaMensal.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/prototipo/5.RelatoriosFluxoCaixaMensal.png"))); // NOI18N

        javax.swing.GroupLayout pnFluxoCaixaMensalLayout = new javax.swing.GroupLayout(pnFluxoCaixaMensal);
        pnFluxoCaixaMensal.setLayout(pnFluxoCaixaMensalLayout);
        pnFluxoCaixaMensalLayout.setHorizontalGroup(
            pnFluxoCaixaMensalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFluxoCaixaMensalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnFluxoCaixaMensalLayout.setVerticalGroup(
            pnFluxoCaixaMensalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFluxoCaixaMensalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tpnCorpo.addTab("Fluxo de caixa anual   ", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/fluxoCaixaMensal.png")), pnFluxoCaixaMensal); // NOI18N

        pnGiroEstoque.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/prototipo/5.RelatoriosGiroEstoque.png"))); // NOI18N

        javax.swing.GroupLayout pnGiroEstoqueLayout = new javax.swing.GroupLayout(pnGiroEstoque);
        pnGiroEstoque.setLayout(pnGiroEstoqueLayout);
        pnGiroEstoqueLayout.setHorizontalGroup(
            pnGiroEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnGiroEstoqueLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnGiroEstoqueLayout.setVerticalGroup(
            pnGiroEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnGiroEstoqueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tpnCorpo.addTab("Giro de estoque          ", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/giroEstoque.png")), pnGiroEstoque); // NOI18N

        pnAnaliseDespesas.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/prototipo/5.RelatoriosGiroEstoque.png"))); // NOI18N

        javax.swing.GroupLayout pnAnaliseDespesasLayout = new javax.swing.GroupLayout(pnAnaliseDespesas);
        pnAnaliseDespesas.setLayout(pnAnaliseDespesasLayout);
        pnAnaliseDespesasLayout.setHorizontalGroup(
            pnAnaliseDespesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAnaliseDespesasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnAnaliseDespesasLayout.setVerticalGroup(
            pnAnaliseDespesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAnaliseDespesasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tpnCorpo.addTab("Análise de despesas  ", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/analiseDespesas.png")), pnAnaliseDespesas); // NOI18N

        pnCentroCustos.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/prototipo/5.RelatoriosGiroEstoque.png"))); // NOI18N

        javax.swing.GroupLayout pnCentroCustosLayout = new javax.swing.GroupLayout(pnCentroCustos);
        pnCentroCustos.setLayout(pnCentroCustosLayout);
        pnCentroCustosLayout.setHorizontalGroup(
            pnCentroCustosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCentroCustosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnCentroCustosLayout.setVerticalGroup(
            pnCentroCustosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCentroCustosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tpnCorpo.addTab("Centro de custos        ", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/centroCustos.png")), pnCentroCustos); // NOI18N

        pnFaturamento.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/prototipo/5.RelatoriosGiroEstoque.png"))); // NOI18N

        javax.swing.GroupLayout pnFaturamentoLayout = new javax.swing.GroupLayout(pnFaturamento);
        pnFaturamento.setLayout(pnFaturamentoLayout);
        pnFaturamentoLayout.setHorizontalGroup(
            pnFaturamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFaturamentoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnFaturamentoLayout.setVerticalGroup(
            pnFaturamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFaturamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tpnCorpo.addTab("Faturamento                ", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/faturamento.png")), pnFaturamento); // NOI18N

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel pnAnaliseDespesas;
    private javax.swing.JPanel pnCentroCustos;
    private javax.swing.JPanel pnFaturamento;
    private javax.swing.JPanel pnFluxoCaixaDiario;
    private javax.swing.JPanel pnFluxoCaixaMensal;
    private javax.swing.JPanel pnGiroEstoque;
    private javax.swing.JPanel pnVendasCliente;
    private javax.swing.JPanel pnVendasVendedor;
    private javax.swing.JScrollPane spnCorpo;
    private javax.swing.JTabbedPane tpnCorpo;
    // End of variables declaration//GEN-END:variables
}
