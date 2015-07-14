package br.com.resources.views;

/**
 *
 * @see Classe visual. JInternalFrame que tem como objetivo demonstrar os
 * relatórios do sistema.
 *
 * @author Bruna Danieli Ribeiro Gonçalves, Márlon Ândrel Coelho Freitas
 */
public class ViewRelatorios extends javax.swing.JInternalFrame {

    /**
     *
     * @see Construtor padrão.
     */
    public ViewRelatorios() {
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
        pnVendasVendedor = new javax.swing.JPanel();
        pnFluxoCaixaDiario = new javax.swing.JPanel();
        pnFluxoCaixaMensal = new javax.swing.JPanel();
        pnGiroEstoque = new javax.swing.JPanel();
        pnAnaliseDespesas = new javax.swing.JPanel();
        pnCentroCustos = new javax.swing.JPanel();
        pnFaturamento = new javax.swing.JPanel();

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

        javax.swing.GroupLayout pnVendasClienteLayout = new javax.swing.GroupLayout(pnVendasCliente);
        pnVendasCliente.setLayout(pnVendasClienteLayout);
        pnVendasClienteLayout.setHorizontalGroup(
            pnVendasClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        pnVendasClienteLayout.setVerticalGroup(
            pnVendasClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 323, Short.MAX_VALUE)
        );

        tpnCorpo.addTab("Vendas por cliente     ", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/vendasCliente.png")), pnVendasCliente); // NOI18N

        pnVendasVendedor.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnVendasVendedorLayout = new javax.swing.GroupLayout(pnVendasVendedor);
        pnVendasVendedor.setLayout(pnVendasVendedorLayout);
        pnVendasVendedorLayout.setHorizontalGroup(
            pnVendasVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        pnVendasVendedorLayout.setVerticalGroup(
            pnVendasVendedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 323, Short.MAX_VALUE)
        );

        tpnCorpo.addTab("Vendas por vendedor", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/vendasVendedor.png")), pnVendasVendedor); // NOI18N

        pnFluxoCaixaDiario.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnFluxoCaixaDiarioLayout = new javax.swing.GroupLayout(pnFluxoCaixaDiario);
        pnFluxoCaixaDiario.setLayout(pnFluxoCaixaDiarioLayout);
        pnFluxoCaixaDiarioLayout.setHorizontalGroup(
            pnFluxoCaixaDiarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        pnFluxoCaixaDiarioLayout.setVerticalGroup(
            pnFluxoCaixaDiarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 323, Short.MAX_VALUE)
        );

        tpnCorpo.addTab("Fluxo de caixa mensal", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/fluxoCaixaMensal.png")), pnFluxoCaixaDiario); // NOI18N

        pnFluxoCaixaMensal.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnFluxoCaixaMensalLayout = new javax.swing.GroupLayout(pnFluxoCaixaMensal);
        pnFluxoCaixaMensal.setLayout(pnFluxoCaixaMensalLayout);
        pnFluxoCaixaMensalLayout.setHorizontalGroup(
            pnFluxoCaixaMensalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        pnFluxoCaixaMensalLayout.setVerticalGroup(
            pnFluxoCaixaMensalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 323, Short.MAX_VALUE)
        );

        tpnCorpo.addTab("Fluxo de caixa anual   ", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/fluxoCaixaMensal.png")), pnFluxoCaixaMensal); // NOI18N

        pnGiroEstoque.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnGiroEstoqueLayout = new javax.swing.GroupLayout(pnGiroEstoque);
        pnGiroEstoque.setLayout(pnGiroEstoqueLayout);
        pnGiroEstoqueLayout.setHorizontalGroup(
            pnGiroEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        pnGiroEstoqueLayout.setVerticalGroup(
            pnGiroEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 323, Short.MAX_VALUE)
        );

        tpnCorpo.addTab("Giro de estoque          ", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/giroEstoque.png")), pnGiroEstoque); // NOI18N

        pnAnaliseDespesas.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnAnaliseDespesasLayout = new javax.swing.GroupLayout(pnAnaliseDespesas);
        pnAnaliseDespesas.setLayout(pnAnaliseDespesasLayout);
        pnAnaliseDespesasLayout.setHorizontalGroup(
            pnAnaliseDespesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        pnAnaliseDespesasLayout.setVerticalGroup(
            pnAnaliseDespesasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 323, Short.MAX_VALUE)
        );

        tpnCorpo.addTab("Análise de despesas  ", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/analiseDespesas.png")), pnAnaliseDespesas); // NOI18N

        pnCentroCustos.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnCentroCustosLayout = new javax.swing.GroupLayout(pnCentroCustos);
        pnCentroCustos.setLayout(pnCentroCustosLayout);
        pnCentroCustosLayout.setHorizontalGroup(
            pnCentroCustosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        pnCentroCustosLayout.setVerticalGroup(
            pnCentroCustosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 323, Short.MAX_VALUE)
        );

        tpnCorpo.addTab("Centro de custos        ", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/centroCustos.png")), pnCentroCustos); // NOI18N

        pnFaturamento.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnFaturamentoLayout = new javax.swing.GroupLayout(pnFaturamento);
        pnFaturamento.setLayout(pnFaturamentoLayout);
        pnFaturamentoLayout.setHorizontalGroup(
            pnFaturamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );
        pnFaturamentoLayout.setVerticalGroup(
            pnFaturamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 323, Short.MAX_VALUE)
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
