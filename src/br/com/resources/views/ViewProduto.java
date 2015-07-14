package br.com.resources.views;

/**
 *
 * @see Classe visual. JDialog que tem como objetivo cadastrar um novo produto.
 *
 * @author Bruna Danieli Ribeiro Gonçalves, Márlon Ândrel Coelho Freitas
 */
public class ViewProduto extends javax.swing.JDialog {

    /**
     * @see Construtor padrão.
     *
     * @param parent
     * @param modal
     */
    public ViewProduto(java.awt.Frame parent, boolean modal) {
        //Inicialização dos componentes padrões do JDialog.
        super(parent, modal);
        initComponents();
    }

    //Componentes padrões do JFrame.
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnTitulo = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        pnCorpo = new javax.swing.JPanel();
        pnObrigatorio = new javax.swing.JPanel();
        lbDescricao = new javax.swing.JLabel();
        tfDescricao = new javax.swing.JTextField();
        lbProduto = new javax.swing.JLabel();
        lbOpcional1 = new javax.swing.JLabel();
        lbCodigo = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JTextField();
        lbValorCusto = new javax.swing.JLabel();
        tfValorCusto = new javax.swing.JTextField();
        lbValorVenda = new javax.swing.JLabel();
        tfValorVenda = new javax.swing.JTextField();
        lbMinimo = new javax.swing.JLabel();
        tfMinimo = new javax.swing.JTextField();
        lbMaximo = new javax.swing.JLabel();
        tfMaximo = new javax.swing.JTextField();
        lbEstoque = new javax.swing.JLabel();
        lbInicial = new javax.swing.JLabel();
        tfEstoque = new javax.swing.JTextField();
        lbCategoria = new javax.swing.JLabel();
        lbOpcional2 = new javax.swing.JLabel();
        cbCategoria = new javax.swing.JComboBox();
        lbFornecedor = new javax.swing.JLabel();
        lbOpcional3 = new javax.swing.JLabel();
        cbFornecedor = new javax.swing.JComboBox();
        sprRodape = new javax.swing.JSeparator();
        btnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produto");
        setResizable(false);

        pnTitulo.setBackground(new java.awt.Color(51, 51, 51));

        lbTitulo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo.setText("Novo Produto");

        javax.swing.GroupLayout pnTituloLayout = new javax.swing.GroupLayout(pnTitulo);
        pnTitulo.setLayout(pnTituloLayout);
        pnTituloLayout.setHorizontalGroup(
            pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnTituloLayout.setVerticalGroup(
            pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnCorpo.setBackground(new java.awt.Color(255, 255, 255));

        pnObrigatorio.setBackground(new java.awt.Color(255, 255, 255));

        lbDescricao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbDescricao.setForeground(new java.awt.Color(102, 102, 102));
        lbDescricao.setText("Descrição");

        tfDescricao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfDescricao.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout pnObrigatorioLayout = new javax.swing.GroupLayout(pnObrigatorio);
        pnObrigatorio.setLayout(pnObrigatorioLayout);
        pnObrigatorioLayout.setHorizontalGroup(
            pnObrigatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnObrigatorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnObrigatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfDescricao)
                    .addGroup(pnObrigatorioLayout.createSequentialGroup()
                        .addComponent(lbDescricao)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnObrigatorioLayout.setVerticalGroup(
            pnObrigatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnObrigatorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbDescricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbProduto.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbProduto.setForeground(new java.awt.Color(0, 102, 205));
        lbProduto.setText("produto");

        lbOpcional1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbOpcional1.setForeground(new java.awt.Color(102, 102, 102));
        lbOpcional1.setText("(Opcional)");

        lbCodigo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbCodigo.setForeground(new java.awt.Color(102, 102, 102));
        lbCodigo.setText("Codigo");

        tfCodigo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfCodigo.setForeground(new java.awt.Color(102, 102, 102));

        lbValorCusto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbValorCusto.setForeground(new java.awt.Color(102, 102, 102));
        lbValorCusto.setText("Valor de Custo");

        tfValorCusto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfValorCusto.setForeground(new java.awt.Color(102, 102, 102));

        lbValorVenda.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbValorVenda.setForeground(new java.awt.Color(102, 102, 102));
        lbValorVenda.setText("Valor de Venda");

        tfValorVenda.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfValorVenda.setForeground(new java.awt.Color(102, 102, 102));

        lbMinimo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbMinimo.setForeground(new java.awt.Color(102, 102, 102));
        lbMinimo.setText("Quantidade mínima");

        tfMinimo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfMinimo.setForeground(new java.awt.Color(102, 102, 102));

        lbMaximo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbMaximo.setForeground(new java.awt.Color(102, 102, 102));
        lbMaximo.setText("Quantidade máxima");

        tfMaximo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfMaximo.setForeground(new java.awt.Color(102, 102, 102));

        lbEstoque.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbEstoque.setForeground(new java.awt.Color(102, 102, 102));
        lbEstoque.setText("Quantidade estoque");

        lbInicial.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbInicial.setForeground(new java.awt.Color(102, 102, 102));
        lbInicial.setText("(inicial)");

        tfEstoque.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfEstoque.setForeground(new java.awt.Color(102, 102, 102));

        lbCategoria.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbCategoria.setForeground(new java.awt.Color(0, 102, 205));
        lbCategoria.setText("categoria");

        lbOpcional2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbOpcional2.setForeground(new java.awt.Color(102, 102, 102));
        lbOpcional2.setText("(Opcional)");

        cbCategoria.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbCategoria.setForeground(new java.awt.Color(102, 102, 102));

        lbFornecedor.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbFornecedor.setForeground(new java.awt.Color(0, 102, 205));
        lbFornecedor.setText("fornecedor");

        lbOpcional3.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbOpcional3.setForeground(new java.awt.Color(102, 102, 102));
        lbOpcional3.setText("(Opcional)");

        cbFornecedor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbFornecedor.setForeground(new java.awt.Color(102, 102, 102));

        sprRodape.setForeground(new java.awt.Color(204, 204, 204));

        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnCadastrarUP.png"))); // NOI18N
        btnCadastrar.setBorder(null);
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnCadastrarDOWN.png"))); // NOI18N
        btnCadastrar.setFocusable(false);
        btnCadastrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnCadastrarDOWN.png"))); // NOI18N
        btnCadastrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnCadastrarDOWN.png"))); // NOI18N
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnCorpoLayout = new javax.swing.GroupLayout(pnCorpo);
        pnCorpo.setLayout(pnCorpoLayout);
        pnCorpoLayout.setHorizontalGroup(
            pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sprRodape)
            .addComponent(pnObrigatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnCorpoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCorpoLayout.createSequentialGroup()
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCodigo, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfValorCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbValorCusto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbValorVenda)
                            .addComponent(tfValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnCadastrar)
                    .addGroup(pnCorpoLayout.createSequentialGroup()
                        .addComponent(lbProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbOpcional1))
                    .addGroup(pnCorpoLayout.createSequentialGroup()
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnCorpoLayout.createSequentialGroup()
                                .addComponent(lbCategoria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbOpcional2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnCorpoLayout.createSequentialGroup()
                                .addComponent(lbFornecedor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbOpcional3))))
                    .addGroup(pnCorpoLayout.createSequentialGroup()
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfMinimo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbMinimo, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbMaximo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnCorpoLayout.createSequentialGroup()
                                .addComponent(lbEstoque)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbInicial))
                            .addComponent(tfEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnCorpoLayout.setVerticalGroup(
            pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCorpoLayout.createSequentialGroup()
                .addComponent(pnObrigatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbProduto)
                    .addComponent(lbOpcional1))
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbValorCusto)
                    .addComponent(lbValorVenda)
                    .addComponent(lbCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfValorCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMaximo)
                    .addComponent(lbEstoque)
                    .addComponent(lbMinimo)
                    .addComponent(lbInicial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCorpoLayout.createSequentialGroup()
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbCategoria)
                            .addComponent(lbOpcional2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCorpoLayout.createSequentialGroup()
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbFornecedor)
                            .addComponent(lbOpcional3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(sprRodape, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadastrar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnCorpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(pnCorpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

    }//GEN-LAST:event_btnCadastrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JComboBox cbCategoria;
    private javax.swing.JComboBox cbFornecedor;
    private javax.swing.JLabel lbCategoria;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbDescricao;
    private javax.swing.JLabel lbEstoque;
    private javax.swing.JLabel lbFornecedor;
    private javax.swing.JLabel lbInicial;
    private javax.swing.JLabel lbMaximo;
    private javax.swing.JLabel lbMinimo;
    private javax.swing.JLabel lbOpcional1;
    private javax.swing.JLabel lbOpcional2;
    private javax.swing.JLabel lbOpcional3;
    private javax.swing.JLabel lbProduto;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbValorCusto;
    private javax.swing.JLabel lbValorVenda;
    private javax.swing.JPanel pnCorpo;
    private javax.swing.JPanel pnObrigatorio;
    private javax.swing.JPanel pnTitulo;
    private javax.swing.JSeparator sprRodape;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfDescricao;
    private javax.swing.JTextField tfEstoque;
    private javax.swing.JTextField tfMaximo;
    private javax.swing.JTextField tfMinimo;
    private javax.swing.JTextField tfValorCusto;
    private javax.swing.JTextField tfValorVenda;
    // End of variables declaration//GEN-END:variables
}
