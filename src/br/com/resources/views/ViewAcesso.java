package br.com.resources.views;

import br.com.controllers.ControllerPrincipal;

public class ViewAcesso extends javax.swing.JInternalFrame {

    public ViewAcesso() {
        initComponents();
    }
    
    public ViewAcesso(ViewPrincipal viewPrincipal){
        setRootPaneCheckingEnabled(false);
        javax.swing.plaf.InternalFrameUI frame = this.getUI();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) frame).setNorthPane(null);
        
        initComponents();
        this.viewPrincipal = viewPrincipal;
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnAcesso = new javax.swing.JPanel();
        lbEmail = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        lbSenha = new javax.swing.JLabel();
        pfSenha = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setResizable(true);
        setTitle("Acesso");
        setFrameIcon(null);

        pnAcesso.setBackground(new java.awt.Color(255, 255, 255));

        lbEmail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbEmail.setForeground(new java.awt.Color(102, 102, 102));
        lbEmail.setText("Email");

        tfEmail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfEmail.setForeground(new java.awt.Color(102, 102, 102));

        lbSenha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbSenha.setForeground(new java.awt.Color(102, 102, 102));
        lbSenha.setText("Senha");

        pfSenha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        pfSenha.setForeground(new java.awt.Color(102, 102, 102));

        btnEntrar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(102, 102, 102));
        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnAcessoLayout = new javax.swing.GroupLayout(pnAcesso);
        pnAcesso.setLayout(pnAcessoLayout);
        pnAcessoLayout.setHorizontalGroup(
            pnAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAcessoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfEmail)
                    .addComponent(btnEntrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                    .addGroup(pnAcessoLayout.createSequentialGroup()
                        .addGroup(pnAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbEmail)
                            .addComponent(lbSenha))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(pfSenha))
                .addContainerGap())
        );
        pnAcessoLayout.setVerticalGroup(
            pnAcessoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAcessoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(pnAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(pnAcesso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        controllerPrincipal.realizarAcesso(tfEmail.getText(), pfSenha.getText());
    }//GEN-LAST:event_btnEntrarActionPerformed

    private ViewPrincipal viewPrincipal;
    private ControllerPrincipal controllerPrincipal;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JPasswordField pfSenha;
    private javax.swing.JPanel pnAcesso;
    private javax.swing.JTextField tfEmail;
    // End of variables declaration//GEN-END:variables
}
