package br.com.resources.views;

import br.com.models.bo.CompraBO;
import br.com.models.tabelas.TableModelCompra;
import br.com.models.tabelas.TableModelInventario;
import java.awt.Cursor;

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
        
        //Carrega todas os modelos de tabelas.
        atualizarTabelas();
    }
    
    /**
     * @see Método que Instancia a classe PainelControleBO para realizar buscas
     * de Objetos de valores que compoem os modelos de tabelas.
     */
    public final void atualizarTabelas() {
        //Inicialização dos modelos de tabelas.
        compraBO = new CompraBO();
        tabelaInventario = new TableModelInventario(compraBO.buscarInventario());
        tabelaCompra = new TableModelCompra(compraBO.buscarCompras());

        //Definindo modelo de tabelas para as tabelas.
        tbIventario.setModel(tabelaInventario);
        tbCompras.setModel(tabelaCompra);

        //Definir tabelas como sem seleção.
        tbIventario.clearSelection();
        tbCompras.clearSelection();

        //Definindo botões Aleterar e Excluir como não habilitado.
        btnVisualizarCompras.setEnabled(false);
        btnAlterarCompras.setEnabled(false);
        btnExcluirCompras.setEnabled(false);

        //Definindo lbResultados
        lbResultadosIventario.setText(tbIventario.getModel().getRowCount() + " resultados, mostrando todos.");
        lbResultadosCompras.setText(tbCompras.getModel().getRowCount() + " resultados, mostrando todos.");
    }

    //Componentes padrões do JFrame
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spnCorpo = new javax.swing.JScrollPane();
        tpnCorpo = new javax.swing.JTabbedPane();
        pnInventario = new javax.swing.JPanel();
        btnAtualizarIventario = new javax.swing.JButton();
        pnBuscarIventario = new javax.swing.JPanel();
        tfBuscarIventario = new javax.swing.JTextField();
        btnBuscarIventario = new javax.swing.JButton();
        lbResultadosIventario = new javax.swing.JLabel();
        spnIventario = new javax.swing.JScrollPane();
        tbIventario = new javax.swing.JTable();
        pnCompras = new javax.swing.JPanel();
        btnNovaCompra = new javax.swing.JButton();
        btnVisualizarCompras = new javax.swing.JButton();
        btnAlterarCompras = new javax.swing.JButton();
        btnExcluirCompras = new javax.swing.JButton();
        pnBuscarCompras = new javax.swing.JPanel();
        tfBuscarCompras = new javax.swing.JTextField();
        btnBuscarCompras = new javax.swing.JButton();
        lbResultadosCompras = new javax.swing.JLabel();
        spnCompras = new javax.swing.JScrollPane();
        tbCompras = new javax.swing.JTable();
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

        btnAtualizarIventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnVisualizarUP.png"))); // NOI18N
        btnAtualizarIventario.setBorder(null);
        btnAtualizarIventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtualizarIventario.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnVisualizarDOWN.png"))); // NOI18N
        btnAtualizarIventario.setFocusable(false);
        btnAtualizarIventario.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnVisualizarDOWN.png"))); // NOI18N
        btnAtualizarIventario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnVisualizarDOWN.png"))); // NOI18N
        btnAtualizarIventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarIventarioActionPerformed(evt);
            }
        });

        pnBuscarIventario.setBackground(new java.awt.Color(255, 255, 255));

        tfBuscarIventario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfBuscarIventario.setForeground(new java.awt.Color(102, 102, 102));
        tfBuscarIventario.setText("Pesquisa");
        tfBuscarIventario.setPreferredSize(new java.awt.Dimension(59, 19));

        btnBuscarIventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnBuscarUP.png"))); // NOI18N
        btnBuscarIventario.setBorder(null);
        btnBuscarIventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarIventario.setFocusable(false);
        btnBuscarIventario.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnBuscarDOWN.png"))); // NOI18N
        btnBuscarIventario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnBuscarDOWN.png"))); // NOI18N

        javax.swing.GroupLayout pnBuscarIventarioLayout = new javax.swing.GroupLayout(pnBuscarIventario);
        pnBuscarIventario.setLayout(pnBuscarIventarioLayout);
        pnBuscarIventarioLayout.setHorizontalGroup(
            pnBuscarIventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBuscarIventarioLayout.createSequentialGroup()
                .addComponent(tfBuscarIventario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnBuscarIventario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnBuscarIventarioLayout.setVerticalGroup(
            pnBuscarIventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBuscarIventarioLayout.createSequentialGroup()
                .addComponent(btnBuscarIventario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnBuscarIventarioLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(tfBuscarIventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        lbResultadosIventario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbResultadosIventario.setForeground(new java.awt.Color(102, 102, 102));
        lbResultadosIventario.setText("0 resultados, mostrando todos.");

        spnIventario.setBackground(new java.awt.Color(255, 255, 255));
        spnIventario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        spnIventario.setForeground(new java.awt.Color(102, 102, 102));
        spnIventario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        tbIventario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tbIventario.setForeground(new java.awt.Color(102, 102, 102));
        tbIventario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbIventario.setFocusable(false);
        tbIventario.setGridColor(new java.awt.Color(204, 204, 204));
        tbIventario.setIntercellSpacing(new java.awt.Dimension(0, 1));
        tbIventario.setRowHeight(30);
        tbIventario.setSelectionBackground(new java.awt.Color(95, 180, 25));
        tbIventario.setShowVerticalLines(false);
        tbIventario.getTableHeader().setReorderingAllowed(false);
        spnIventario.setViewportView(tbIventario);
        cabecalho = tbIventario.getTableHeader();
        cabecalho.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 12));
        cabecalho.setForeground(new java.awt.Color(102,102,102));

        javax.swing.GroupLayout pnInventarioLayout = new javax.swing.GroupLayout(pnInventario);
        pnInventario.setLayout(pnInventarioLayout);
        pnInventarioLayout.setHorizontalGroup(
            pnInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInventarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnInventarioLayout.createSequentialGroup()
                        .addGroup(pnInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spnIventario, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE)
                            .addGroup(pnInventarioLayout.createSequentialGroup()
                                .addComponent(lbResultadosIventario)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(pnInventarioLayout.createSequentialGroup()
                        .addComponent(btnAtualizarIventario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnBuscarIventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        pnInventarioLayout.setVerticalGroup(
            pnInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnInventarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnBuscarIventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizarIventario))
                .addGap(18, 18, 18)
                .addComponent(lbResultadosIventario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnIventario, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addContainerGap())
        );

        tpnCorpo.addTab("Inventário     ", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/inventario.png")), pnInventario); // NOI18N

        pnCompras.setBackground(new java.awt.Color(255, 255, 255));

        btnNovaCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnNovoFuncionarioUP.png"))); // NOI18N
        btnNovaCompra.setBorder(null);
        btnNovaCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovaCompra.setFocusable(false);
        btnNovaCompra.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnNovoFuncionarioDOWN.png"))); // NOI18N
        btnNovaCompra.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnNovoFuncionarioDOWN.png"))); // NOI18N
        btnNovaCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaCompraActionPerformed(evt);
            }
        });

        btnVisualizarCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnVisualizarUP.png"))); // NOI18N
        btnVisualizarCompras.setBorder(null);
        btnVisualizarCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVisualizarCompras.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnVisualizarDOWN.png"))); // NOI18N
        btnVisualizarCompras.setEnabled(false);
        btnVisualizarCompras.setFocusable(false);
        btnVisualizarCompras.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnVisualizarDOWN.png"))); // NOI18N
        btnVisualizarCompras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnVisualizarDOWN.png"))); // NOI18N
        btnVisualizarCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarComprasActionPerformed(evt);
            }
        });

        btnAlterarCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarUP.png"))); // NOI18N
        btnAlterarCompras.setBorder(null);
        btnAlterarCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterarCompras.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N
        btnAlterarCompras.setEnabled(false);
        btnAlterarCompras.setFocusable(false);
        btnAlterarCompras.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N
        btnAlterarCompras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N
        btnAlterarCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarComprasActionPerformed(evt);
            }
        });

        btnExcluirCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirUP.png"))); // NOI18N
        btnExcluirCompras.setBorder(null);
        btnExcluirCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluirCompras.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirDOWN.png"))); // NOI18N
        btnExcluirCompras.setEnabled(false);
        btnExcluirCompras.setFocusable(false);
        btnExcluirCompras.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirDOWN.png"))); // NOI18N
        btnExcluirCompras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirDOWN.png"))); // NOI18N
        btnExcluirCompras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirComprasActionPerformed(evt);
            }
        });

        pnBuscarCompras.setBackground(new java.awt.Color(255, 255, 255));

        tfBuscarCompras.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfBuscarCompras.setForeground(new java.awt.Color(102, 102, 102));
        tfBuscarCompras.setText("Pesquisa");
        tfBuscarCompras.setPreferredSize(new java.awt.Dimension(59, 19));

        btnBuscarCompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnBuscarUP.png"))); // NOI18N
        btnBuscarCompras.setBorder(null);
        btnBuscarCompras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarCompras.setFocusable(false);
        btnBuscarCompras.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnBuscarDOWN.png"))); // NOI18N
        btnBuscarCompras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnBuscarDOWN.png"))); // NOI18N

        javax.swing.GroupLayout pnBuscarComprasLayout = new javax.swing.GroupLayout(pnBuscarCompras);
        pnBuscarCompras.setLayout(pnBuscarComprasLayout);
        pnBuscarComprasLayout.setHorizontalGroup(
            pnBuscarComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBuscarComprasLayout.createSequentialGroup()
                .addComponent(tfBuscarCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnBuscarCompras)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnBuscarComprasLayout.setVerticalGroup(
            pnBuscarComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBuscarComprasLayout.createSequentialGroup()
                .addComponent(btnBuscarCompras, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnBuscarComprasLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(tfBuscarCompras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        lbResultadosCompras.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbResultadosCompras.setForeground(new java.awt.Color(102, 102, 102));
        lbResultadosCompras.setText("0 resultados, mostrando todos.");

        spnCompras.setBackground(new java.awt.Color(255, 255, 255));
        spnCompras.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        spnCompras.setForeground(new java.awt.Color(102, 102, 102));
        spnCompras.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        tbCompras.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tbCompras.setForeground(new java.awt.Color(102, 102, 102));
        tbCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbCompras.setFocusable(false);
        tbCompras.setGridColor(new java.awt.Color(204, 204, 204));
        tbCompras.setIntercellSpacing(new java.awt.Dimension(0, 1));
        tbCompras.setRowHeight(30);
        tbCompras.setSelectionBackground(new java.awt.Color(95, 180, 25));
        tbCompras.setShowVerticalLines(false);
        tbCompras.getTableHeader().setReorderingAllowed(false);
        tbCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbComprasMouseClicked(evt);
            }
        });
        spnCompras.setViewportView(tbCompras);
        cabecalho = tbCompras.getTableHeader();
        cabecalho.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 12));
        cabecalho.setForeground(new java.awt.Color(102,102,102));

        javax.swing.GroupLayout pnComprasLayout = new javax.swing.GroupLayout(pnCompras);
        pnCompras.setLayout(pnComprasLayout);
        pnComprasLayout.setHorizontalGroup(
            pnComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnComprasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnComprasLayout.createSequentialGroup()
                        .addGroup(pnComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spnCompras)
                            .addGroup(pnComprasLayout.createSequentialGroup()
                                .addComponent(lbResultadosCompras)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(pnComprasLayout.createSequentialGroup()
                        .addComponent(btnNovaCompra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVisualizarCompras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterarCompras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirCompras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 210, Short.MAX_VALUE)
                        .addComponent(pnBuscarCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        pnComprasLayout.setVerticalGroup(
            pnComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnComprasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnComprasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNovaCompra)
                        .addComponent(btnAlterarCompras)
                        .addComponent(btnExcluirCompras))
                    .addComponent(pnBuscarCompras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVisualizarCompras))
                .addGap(18, 18, 18)
                .addComponent(lbResultadosCompras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnCompras, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                .addContainerGap())
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

    private void btnNovaCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaCompraActionPerformed
        viewCompra = new ViewCompra(viewPrincipal, true, viewPrincipal, this);
        viewCompra.setVisible(true);
    }//GEN-LAST:event_btnNovaCompraActionPerformed

    private void tbComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbComprasMouseClicked
        if (tbCompras.getSelectedRow() != -1) {
            btnVisualizarCompras.setEnabled(true);
            btnAlterarCompras.setEnabled(true);
            btnExcluirCompras.setEnabled(true);
        }
    }//GEN-LAST:event_tbComprasMouseClicked

    private void btnAtualizarIventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarIventarioActionPerformed
        btnAtualizarIventario.setEnabled(false);
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        atualizarTabelas();
        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        btnAtualizarIventario.setEnabled(true);
    }//GEN-LAST:event_btnAtualizarIventarioActionPerformed

    private void btnVisualizarComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarComprasActionPerformed
        if (tbCompras.getSelectedRow() != -1) {
            TableModelCompra modelo = (TableModelCompra) tbCompras.getModel();
            viewCompra = new ViewCompra(viewPrincipal, true, viewPrincipal, this, modelo.getCompra(tbCompras.getSelectedRow()), false);
            viewCompra.setVisible(true);
        }
    }//GEN-LAST:event_btnVisualizarComprasActionPerformed

    private void btnAlterarComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarComprasActionPerformed
        if (tbCompras.getSelectedRow() != -1) {
            TableModelCompra modelo = (TableModelCompra) tbCompras.getModel();
            viewCompra = new ViewCompra(viewPrincipal, true, viewPrincipal, this, modelo.getCompra(tbCompras.getSelectedRow()), true);
            viewCompra.setVisible(true);
        }
    }//GEN-LAST:event_btnAlterarComprasActionPerformed

    private void btnExcluirComprasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirComprasActionPerformed
        if (tbCompras.getSelectedRow() != -1) {
            TableModelCompra modelo = (TableModelCompra) tbCompras.getModel();
            if (compraBO.excluirCompra(modelo.getCompra(tbCompras.getSelectedRow()).getIdCompra())) {
                atualizarTabelas();
            }
        }
    }//GEN-LAST:event_btnExcluirComprasActionPerformed

    //Declaração de variáveis(View).
    private ViewPrincipal viewPrincipal;
    private ViewCompra viewCompra;

    //Declaração de variáveis(Business Object).
    private CompraBO compraBO;

    //Declaração de variáveis(Tabelas).
    private TableModelCompra tabelaCompra;
    private TableModelInventario tabelaInventario;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarCompras;
    private javax.swing.JButton btnAtualizarIventario;
    private javax.swing.JButton btnBuscarCompras;
    private javax.swing.JButton btnBuscarIventario;
    private javax.swing.JButton btnExcluirCompras;
    private javax.swing.JButton btnNovaCompra;
    private javax.swing.JButton btnVisualizarCompras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbResultadosCompras;
    private javax.swing.JLabel lbResultadosIventario;
    private javax.swing.JPanel pnBuscarCompras;
    private javax.swing.JPanel pnBuscarIventario;
    private javax.swing.JPanel pnCompras;
    private javax.swing.JPanel pnInventario;
    private javax.swing.JPanel pnLancamentos;
    private javax.swing.JScrollPane spnCompras;
    private javax.swing.JScrollPane spnCorpo;
    private javax.swing.JScrollPane spnIventario;
    private javax.swing.JTable tbCompras;
    private javax.swing.JTable tbIventario;
    private javax.swing.table.JTableHeader cabecalho;
    private javax.swing.JTextField tfBuscarCompras;
    private javax.swing.JTextField tfBuscarIventario;
    private javax.swing.JTabbedPane tpnCorpo;
    // End of variables declaration//GEN-END:variables
}
