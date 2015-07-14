package br.com.resources.views;

import br.com.models.bo.PainelControleBO;
import br.com.resources.tabelas.TabelaUsuario;

public class ViewPainelControle extends javax.swing.JInternalFrame {

    public ViewPainelControle() {
        initComponents();
    }

    public ViewPainelControle(ViewPrincipal viewPrincipal) {
        setRootPaneCheckingEnabled(false);
        javax.swing.plaf.InternalFrameUI frame = this.getUI();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) frame).setNorthPane(null);

        initComponents();
        this.viewPrincipal = viewPrincipal;

        painelControleBO = new PainelControleBO();
//        tabelaUsuario = new TabelaUsuario(painelControleBO.buscarUsuarios());

//        tbUsuario.setModel(tabelaUsuario);
//        tbUsuario.setRowHeight(25);
//        tabelaUsuario.limpar();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setResizable(true);
        setFrameIcon(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 119, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 114, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private ViewPrincipal viewPrincipal;
    private PainelControleBO painelControleBO;
    private TabelaUsuario tabelaUsuario;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
