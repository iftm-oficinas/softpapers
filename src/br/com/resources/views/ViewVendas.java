package br.com.resources.views;

public class ViewVendas extends javax.swing.JInternalFrame {

    public ViewVendas() {
        initComponents();
    }
    
    public ViewVendas(ViewPrincipal viewPrincipal){
        setRootPaneCheckingEnabled(false);
        javax.swing.plaf.InternalFrameUI frame = this.getUI();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) frame).setNorthPane(null);
        
        initComponents();
        this.viewPrincipal = viewPrincipal;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spnCorpo = new javax.swing.JScrollPane();
        pnCorpo = new javax.swing.JPanel();
        lbVendas = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setResizable(true);
        setTitle("Vendas");
        setFrameIcon(null);

        spnCorpo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        pnCorpo.setBackground(new java.awt.Color(255, 255, 255));

        lbVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/2.Vendas.png"))); // NOI18N
        lbVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbVendasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnCorpoLayout = new javax.swing.GroupLayout(pnCorpo);
        pnCorpo.setLayout(pnCorpoLayout);
        pnCorpoLayout.setHorizontalGroup(
            pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCorpoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbVendas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnCorpoLayout.setVerticalGroup(
            pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCorpoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbVendas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        spnCorpo.setViewportView(pnCorpo);

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

    private void lbVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbVendasMouseClicked
        viewNovaVenda = new ViewNovaVenda(viewPrincipal, true);
        viewNovaVenda.setVisible(true);
    }//GEN-LAST:event_lbVendasMouseClicked

    private ViewPrincipal viewPrincipal;
    private ViewNovaVenda viewNovaVenda;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbVendas;
    private javax.swing.JPanel pnCorpo;
    private javax.swing.JScrollPane spnCorpo;
    // End of variables declaration//GEN-END:variables
}
