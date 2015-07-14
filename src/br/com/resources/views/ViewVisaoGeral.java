package br.com.resources.views;

public class ViewVisaoGeral extends javax.swing.JInternalFrame {

    public ViewVisaoGeral() {
        initComponents();
    }
    
    public ViewVisaoGeral(ViewPrincipal viewPrincipal){
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
        lbVisaoGeral = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setResizable(true);
        setTitle("Visão Geral");
        setFrameIcon(null);

        spnCorpo.setBackground(new java.awt.Color(255, 255, 255));
        spnCorpo.setBorder(null);

        pnCorpo.setBackground(new java.awt.Color(255, 255, 255));

        lbVisaoGeral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/1.VisaoGeral.png"))); // NOI18N

        javax.swing.GroupLayout pnCorpoLayout = new javax.swing.GroupLayout(pnCorpo);
        pnCorpo.setLayout(pnCorpoLayout);
        pnCorpoLayout.setHorizontalGroup(
            pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCorpoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbVisaoGeral)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnCorpoLayout.setVerticalGroup(
            pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCorpoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbVisaoGeral)
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

    private ViewPrincipal viewPrincipal;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbVisaoGeral;
    private javax.swing.JPanel pnCorpo;
    private javax.swing.JScrollPane spnCorpo;
    // End of variables declaration//GEN-END:variables
}
