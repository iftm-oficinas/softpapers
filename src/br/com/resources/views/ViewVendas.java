package br.com.resources.views;

import br.com.models.bo.VendaBO;
import br.com.models.tabelas.TableModelVenda;

/**
 * @see Classe visual. JInternalFrame que tem como objetivo simular um ponto de
 * venda, responsável por listar e gerenciar todas as vendas(cadastrar, alterar,
 * excluir). Podendo tambem transformar um pedido de venda em uma
 * venda(finalizar).
 * @author Bruna Danieli Ribeiro Gonçalves, Márlon Ândrel Coelho Freitas
 */
public class ViewVendas extends javax.swing.JInternalFrame {

    /**
     * @see Construtor padrão.
     */
    public ViewVendas() {
        initComponents();
    }

    /**
     * @see Construtor usado quando classe é instanciada na ViewPrincipal,
     * recebe a viewPrincipal como pai e organiza esse JInternalFrame dentro do
     * JFrame principal.
     * @param viewPrincipal
     */
    public ViewVendas(ViewPrincipal viewPrincipal) {
        //Esconde barra de título padrão do JInternalFrama.
        setRootPaneCheckingEnabled(false);
        javax.swing.plaf.InternalFrameUI frame = this.getUI();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) frame).setNorthPane(null);

        //Inicialização dos componentes padrões do JFrame.
        initComponents();
        this.viewPrincipal = viewPrincipal;
        
        //Carrega todas os modelos de tabelas.
        atualizarTabelas();
    }

    /**
     * @see Método que Instancia a classe PainelControleBO para realizar buscas
     * de Objetos de valores que compoem os modelos de tabelas.
     */
    public final void atualizarTabelas() {
        //Inicialização dos modelos de tabelas.
        vendaBO = new VendaBO();
        tabelaVenda = new TableModelVenda(vendaBO.buscarVendas());

        //Definindo modelo de tabelas para as tabelas.
        tbVendas.setModel(tabelaVenda);

        //Definir tabelas como sem seleção.
        tbVendas.clearSelection();

        //Definindo botões Aleterar e Excluir como não habilitado.
        btnVisualizarVenda.setEnabled(false);
        btnAlterarVenda.setEnabled(false);
        btnExcluirVenda.setEnabled(false);

        //Definindo lbResultados
        lbResultadosVenda.setText(tbVendas.getModel().getRowCount() + " resultados, mostrando todos.");
    }

    //Componentes padrões do JFrame
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnCorpo = new javax.swing.JPanel();
        btnNovaVenda = new javax.swing.JButton();
        btnVisualizarVenda = new javax.swing.JButton();
        btnAlterarVenda = new javax.swing.JButton();
        btnExcluirVenda = new javax.swing.JButton();
        pnBuscarVenda = new javax.swing.JPanel();
        tfBuscarFuncionario = new javax.swing.JTextField();
        btnBuscarFuncionario = new javax.swing.JButton();
        lbResultadosVenda = new javax.swing.JLabel();
        spnVendas = new javax.swing.JScrollPane();
        tbVendas = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setResizable(true);
        setTitle("Vendas");
        setFrameIcon(null);

        pnCorpo.setBackground(new java.awt.Color(255, 255, 255));
        pnCorpo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnNovaVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnNovaVendaUP.png"))); // NOI18N
        btnNovaVenda.setBorder(null);
        btnNovaVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovaVenda.setFocusable(false);
        btnNovaVenda.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnNovaVendaDOWN.png"))); // NOI18N
        btnNovaVenda.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnNovaVendaDOWN.png"))); // NOI18N
        btnNovaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaVendaActionPerformed(evt);
            }
        });

        btnVisualizarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnVisualizarUP.png"))); // NOI18N
        btnVisualizarVenda.setBorder(null);
        btnVisualizarVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVisualizarVenda.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnVisualizarDOWN.png"))); // NOI18N
        btnVisualizarVenda.setEnabled(false);
        btnVisualizarVenda.setFocusable(false);
        btnVisualizarVenda.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnVisualizarDOWN.png"))); // NOI18N
        btnVisualizarVenda.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnVisualizarDOWN.png"))); // NOI18N
        btnVisualizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarVendaActionPerformed(evt);
            }
        });

        btnAlterarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarUP.png"))); // NOI18N
        btnAlterarVenda.setBorder(null);
        btnAlterarVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterarVenda.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N
        btnAlterarVenda.setEnabled(false);
        btnAlterarVenda.setFocusable(false);
        btnAlterarVenda.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N
        btnAlterarVenda.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N
        btnAlterarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarVendaActionPerformed(evt);
            }
        });

        btnExcluirVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirUP.png"))); // NOI18N
        btnExcluirVenda.setBorder(null);
        btnExcluirVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluirVenda.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirDOWN.png"))); // NOI18N
        btnExcluirVenda.setEnabled(false);
        btnExcluirVenda.setFocusable(false);
        btnExcluirVenda.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirDOWN.png"))); // NOI18N
        btnExcluirVenda.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirDOWN.png"))); // NOI18N
        btnExcluirVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirVendaActionPerformed(evt);
            }
        });

        pnBuscarVenda.setBackground(new java.awt.Color(255, 255, 255));

        tfBuscarFuncionario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfBuscarFuncionario.setForeground(new java.awt.Color(102, 102, 102));
        tfBuscarFuncionario.setText("Pesquisa");
        tfBuscarFuncionario.setPreferredSize(new java.awt.Dimension(59, 19));

        btnBuscarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnBuscarUP.png"))); // NOI18N
        btnBuscarFuncionario.setBorder(null);
        btnBuscarFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarFuncionario.setFocusable(false);
        btnBuscarFuncionario.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnBuscarDOWN.png"))); // NOI18N
        btnBuscarFuncionario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnBuscarDOWN.png"))); // NOI18N

        javax.swing.GroupLayout pnBuscarVendaLayout = new javax.swing.GroupLayout(pnBuscarVenda);
        pnBuscarVenda.setLayout(pnBuscarVendaLayout);
        pnBuscarVendaLayout.setHorizontalGroup(
            pnBuscarVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBuscarVendaLayout.createSequentialGroup()
                .addComponent(tfBuscarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnBuscarFuncionario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnBuscarVendaLayout.setVerticalGroup(
            pnBuscarVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBuscarVendaLayout.createSequentialGroup()
                .addComponent(btnBuscarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnBuscarVendaLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(tfBuscarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        lbResultadosVenda.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbResultadosVenda.setForeground(new java.awt.Color(102, 102, 102));
        lbResultadosVenda.setText("0 resultados, mostrando todos.");

        spnVendas.setBackground(new java.awt.Color(255, 255, 255));
        spnVendas.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        spnVendas.setForeground(new java.awt.Color(102, 102, 102));
        spnVendas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        tbVendas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tbVendas.setForeground(new java.awt.Color(102, 102, 102));
        tbVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbVendas.setFocusable(false);
        tbVendas.setGridColor(new java.awt.Color(204, 204, 204));
        tbVendas.setIntercellSpacing(new java.awt.Dimension(0, 1));
        tbVendas.setRowHeight(30);
        tbVendas.setSelectionBackground(new java.awt.Color(95, 180, 25));
        tbVendas.setShowVerticalLines(false);
        tbVendas.getTableHeader().setReorderingAllowed(false);
        tbVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbVendasMouseClicked(evt);
            }
        });
        spnVendas.setViewportView(tbVendas);
        cabecalho = tbVendas.getTableHeader();
        cabecalho.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 12));
        cabecalho.setForeground(new java.awt.Color(102,102,102));

        javax.swing.GroupLayout pnCorpoLayout = new javax.swing.GroupLayout(pnCorpo);
        pnCorpo.setLayout(pnCorpoLayout);
        pnCorpoLayout.setHorizontalGroup(
            pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCorpoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCorpoLayout.createSequentialGroup()
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spnVendas)
                            .addGroup(pnCorpoLayout.createSequentialGroup()
                                .addComponent(lbResultadosVenda)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(pnCorpoLayout.createSequentialGroup()
                        .addComponent(btnNovaVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVisualizarVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterarVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirVenda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnBuscarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        pnCorpoLayout.setVerticalGroup(
            pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCorpoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNovaVenda)
                        .addComponent(btnAlterarVenda)
                        .addComponent(btnExcluirVenda))
                    .addComponent(pnBuscarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVisualizarVenda))
                .addGap(18, 18, 18)
                .addComponent(lbResultadosVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnVendas, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnCorpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnCorpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbVendasMouseClicked
        if (tbVendas.getSelectedRow() != -1) {
            btnVisualizarVenda.setEnabled(true);
            btnAlterarVenda.setEnabled(true);
            btnExcluirVenda.setEnabled(true);
        }
    }//GEN-LAST:event_tbVendasMouseClicked

    private void btnNovaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaVendaActionPerformed
        viewVenda = new ViewVenda(viewPrincipal, true, viewPrincipal, this);
        viewVenda.setVisible(true);
    }//GEN-LAST:event_btnNovaVendaActionPerformed

    private void btnVisualizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarVendaActionPerformed
        if (tbVendas.getSelectedRow() != -1) {
            TableModelVenda modelo = (TableModelVenda) tbVendas.getModel();
            viewVenda = new ViewVenda(viewPrincipal, true, viewPrincipal, this, modelo.getVenda(tbVendas.getSelectedRow()), false);
            viewVenda.setVisible(true);
        }
    }//GEN-LAST:event_btnVisualizarVendaActionPerformed

    private void btnAlterarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarVendaActionPerformed
        if (tbVendas.getSelectedRow() != -1) {
            TableModelVenda modelo = (TableModelVenda) tbVendas.getModel();
            viewVenda = new ViewVenda(viewPrincipal, true, viewPrincipal, this, modelo.getVenda(tbVendas.getSelectedRow()), true);
            viewVenda.setVisible(true);
        }
    }//GEN-LAST:event_btnAlterarVendaActionPerformed

    private void btnExcluirVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirVendaActionPerformed
        if (tbVendas.getSelectedRow() != -1) {
            TableModelVenda modelo = (TableModelVenda) tbVendas.getModel();
            if (vendaBO.excluirVenda(modelo.getVenda(tbVendas.getSelectedRow()).getIdVenda())) {
                atualizarTabelas();
            }
        }
    }//GEN-LAST:event_btnExcluirVendaActionPerformed

    //Declaração de variáveis(View).
    private ViewPrincipal viewPrincipal;
    private ViewVenda viewVenda;

    //Declaração de variáveis(Business Object).
    private VendaBO vendaBO;

    //Declaração de variáveis(Tabelas).
    private TableModelVenda tabelaVenda;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarVenda;
    private javax.swing.JButton btnBuscarFuncionario;
    private javax.swing.JButton btnExcluirVenda;
    private javax.swing.JButton btnNovaVenda;
    private javax.swing.JButton btnVisualizarVenda;
    private javax.swing.JLabel lbResultadosVenda;
    private javax.swing.JPanel pnBuscarVenda;
    private javax.swing.JPanel pnCorpo;
    private javax.swing.JScrollPane spnVendas;
    private javax.swing.JTable tbVendas;
    private javax.swing.table.JTableHeader cabecalho;
    private javax.swing.JTextField tfBuscarFuncionario;
    // End of variables declaration//GEN-END:variables
}
