package br.com.resources.views;

public class ViewEstoque extends javax.swing.JInternalFrame {

    public ViewEstoque() {
        initComponents();
    }

    public ViewEstoque(ViewPrincipal viewPrincipal) {
        setRootPaneCheckingEnabled(false);
        javax.swing.plaf.InternalFrameUI frame = this.getUI();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) frame).setNorthPane(null);

        initComponents();
        this.viewPrincipal = viewPrincipal;
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tpnCorpo = new javax.swing.JTabbedPane();
        pnInventario = new javax.swing.JPanel();
        lbInventario = new javax.swing.JLabel();
        pnCompras = new javax.swing.JPanel();
        lbCompras = new javax.swing.JLabel();

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

        lbInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/3.EstoqueInventario.png"))); // NOI18N

        javax.swing.GroupLayout pnInventarioLayout = new javax.swing.GroupLayout(pnInventario);
        pnInventario.setLayout(pnInventarioLayout);
        pnInventarioLayout.setHorizontalGroup(
            pnInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnInventarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbInventario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnInventarioLayout.setVerticalGroup(
            pnInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInventarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbInventario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tpnCorpo.addTab("Inventário", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/inventario.png")), pnInventario); // NOI18N

        pnCompras.setBackground(new java.awt.Color(255, 255, 255));

        lbCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/3.EstoqueCompras.png"))); // NOI18N
        lbCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbComprasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnComprasLayout = new javax.swing.GroupLayout(pnCompras);
        pnCompras.setLayout(pnComprasLayout);
        pnComprasLayout.setHorizontalGroup(
            pnComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnComprasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbCompras)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnComprasLayout.setVerticalGroup(
            pnComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnComprasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbCompras)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tpnCorpo.addTab("Compras  ", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/compras.png")), pnCompras); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpnCorpo)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpnCorpo)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbComprasMouseClicked
        viewNovaCompra = new ViewNovaCompra(viewPrincipal, true);
        viewNovaCompra.setVisible(true);
    }//GEN-LAST:event_lbComprasMouseClicked

    private ViewPrincipal viewPrincipal;
    private ViewNovaCompra viewNovaCompra;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCompras;
    private javax.swing.JLabel lbInventario;
    private javax.swing.JPanel pnCompras;
    private javax.swing.JPanel pnInventario;
    private javax.swing.JTabbedPane tpnCorpo;
    // End of variables declaration//GEN-END:variables
}
