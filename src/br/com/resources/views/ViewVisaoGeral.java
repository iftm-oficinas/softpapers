package br.com.resources.views;

/**
     *
     * @see Classe visual. JInternalFrame que tem como objetivo apresentar um
     * pequeno resumo da saúde de sua empresa, composta pelas funcionalidades:
     * Faturamento(demonstra o lucro decorrente em forma de gráfico), Contas a
     * Pagar(demonstra últimos pagamentos a serem feitos que o usuário
     * cadastrou) e Contas a Receber.
     * 
     * @author Bruna Danieli Ribeiro Gonçalves, Márlon Ândrel Coelho Freitas
     */
public class ViewVisaoGeral extends javax.swing.JInternalFrame {

    /**
     *
     * @see Construtor padrão.
     */
    public ViewVisaoGeral() {
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
    public ViewVisaoGeral(ViewPrincipal viewPrincipal) {
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
        pnCorpo = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setResizable(true);
        setTitle("Visão Geral");
        setFrameIcon(null);

        spnCorpo.setBorder(null);

        pnCorpo.setBackground(new java.awt.Color(255, 255, 255));
        pnCorpo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout pnCorpoLayout = new javax.swing.GroupLayout(pnCorpo);
        pnCorpo.setLayout(pnCorpoLayout);
        pnCorpoLayout.setHorizontalGroup(
            pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
        );
        pnCorpoLayout.setVerticalGroup(
            pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 315, Short.MAX_VALUE)
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

    //Declaração de variáveis(View).
    private ViewPrincipal viewPrincipal;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel pnCorpo;
    private javax.swing.JScrollPane spnCorpo;
    // End of variables declaration//GEN-END:variables
}
