package br.com.resources.views;

/**
 * @see Classe visual. JInternalFrame que tem como objetivo controlar e
 * gerenciar os registros dos produtos e os pedidos de compras, composto pelas
 * funcionalidades de Inventário(lista de produto e suas quantidades),
 * Compras(lista de pedidos de compras), Lançamentos(histórico de etidade de
 * produtos).
 * @author Familia
 */
public class ViewEstoque extends javax.swing.JInternalFrame {

    /**
     * @see Construtor padrão.
     */
    public ViewEstoque() {
        //Inicialização dos componentes padrões do JFrame.
        initComponents();
    }

    /**
     * @see Construtor usado quando classe é instanciada na ViewPrincipal,
     * recebe a viewPrincipal como pai e organiza esse JInternalFrame dentro do
     * JFrame principal.
     * @param viewPrincipal
     */
    public ViewEstoque(ViewPrincipal viewPrincipal) {
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
        pnInventario = new javax.swing.JPanel();
        pnCompras = new javax.swing.JPanel();
        pnLancamentos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setResizable(true);
        setTitle("Estoque");
        setFrameIcon(null);

        tpnCorpo.setForeground(new java.awt.Color(102, 102, 102));
        tpnCorpo.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tpnCorpo.setFocusable(false);
        tpnCorpo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        pnInventario.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnInventarioLayout = new javax.swing.GroupLayout(pnInventario);
        pnInventario.setLayout(pnInventarioLayout);
        pnInventarioLayout.setHorizontalGroup(
            pnInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 813, Short.MAX_VALUE)
        );
        pnInventarioLayout.setVerticalGroup(
            pnInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 337, Short.MAX_VALUE)
        );

        tpnCorpo.addTab("Inventário     ", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/inventario.png")), pnInventario); // NOI18N

        pnCompras.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout pnComprasLayout = new javax.swing.GroupLayout(pnCompras);
        pnCompras.setLayout(pnComprasLayout);
        pnComprasLayout.setHorizontalGroup(
            pnComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 813, Short.MAX_VALUE)
        );
        pnComprasLayout.setVerticalGroup(
            pnComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 337, Short.MAX_VALUE)
        );

        tpnCorpo.addTab("Compras       ", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/compras.png")), pnCompras); // NOI18N

        pnLancamentos.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/prototipo/3.EstoqueLancamentos.png"))); // NOI18N

        javax.swing.GroupLayout pnLancamentosLayout = new javax.swing.GroupLayout(pnLancamentos);
        pnLancamentos.setLayout(pnLancamentosLayout);
        pnLancamentosLayout.setHorizontalGroup(
            pnLancamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLancamentosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnLancamentosLayout.setVerticalGroup(
            pnLancamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnLancamentosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tpnCorpo.addTab("Lançamentos", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/lancamentos.png")), pnLancamentos); // NOI18N

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
    private ViewCompra viewCompra;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pnCompras;
    private javax.swing.JPanel pnInventario;
    private javax.swing.JPanel pnLancamentos;
    private javax.swing.JScrollPane spnCorpo;
    private javax.swing.JTabbedPane tpnCorpo;
    // End of variables declaration//GEN-END:variables
}
