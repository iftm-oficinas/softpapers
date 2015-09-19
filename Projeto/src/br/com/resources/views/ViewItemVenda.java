package br.com.resources.views;

import br.com.models.bo.ItemVendaBO;
import br.com.models.vo.Itemvenda;
import java.awt.Cursor;
import java.math.BigDecimal;
import java.util.ArrayList;

/**
 * @see Classe visual. JDialog que tem como objetivo cadastrar um novo item de
 * produtos.
 * @author Bruna Danieli Ribeiro Gonçalves, Márlon Ândrel Coelho Freitas
 */
public class ViewItemVenda extends javax.swing.JDialog {

    /**
     * @param itens
     * @see Construtor padrão.
     * @param parent
     * @param modal
     * @param viewVenda
     */
    public ViewItemVenda(java.awt.Frame parent, boolean modal, ViewVenda viewVenda, ArrayList<Itemvenda> itens) {
        //Inicialização dos componentes padrões do JDialog.
        super(parent, modal);
        this.viewVenda = viewVenda;
        this.itemBO = new ItemVendaBO();
        this.itens = itens;
        this.itemVO = new Itemvenda();
        initComponents();
        btnAlterar.setVisible(false);
    }

    /**
     * @param alterar
     * @param item
     * @see Construtor padrão.
     * @param parent
     * @param modal
     * @param viewVenda
     */
    public ViewItemVenda(java.awt.Frame parent, boolean modal, ViewVenda viewVenda, Itemvenda item, Boolean alterar) {
        //Inicialização dos componentes padrões do JDialog.
        super(parent, modal);
        this.viewVenda = viewVenda;
        this.itemBO = new ItemVendaBO();
        this.itemVO = item;
        this.itens = null;
        initComponents();
        btnCadastrar.setVisible(false);
        btnAlterar.setVisible(false);

        //Definindo Modelo com Produto para os JComboBox.
        ArrayList<String> array = new ArrayList<>();
        String[] Arr = new String[array.size()];
        if (item.getProduto() != null) {
            array.add(item.getProduto().getDescricaoProduto());
        } else {
            array.add("PRODUTO");
        }
        Arr = array.toArray(Arr);
        cbProduto.setModel(new javax.swing.DefaultComboBoxModel(Arr));
        cbProduto.setEnabled(false);

        //Definindo valores quantidade e valor
        tfQuantidade.setText(item.getQuantidadeItemVenda().toString());
        tfValor.setText(item.getValorItemVenda().toString());
        tfBuscarProduto.setText(item.getProduto().getCodigoProduto());
        tfBuscarProduto.setEditable(false);
        btnBuscarProduto.setEnabled(false);
        if (alterar) {
            btnAlterar.setVisible(true);
            tfQuantidade.setEnabled(true);
            valor = new BigDecimal(tfValor.getText()).divide(new BigDecimal(tfQuantidade.getText()));
        }
    }

    //Componentes padrões do JFrame.
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnTitulo = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        pnCorpo = new javax.swing.JPanel();
        lbProduto = new javax.swing.JLabel();
        pnItem = new javax.swing.JPanel();
        cbProduto = new javax.swing.JComboBox();
        lbQuantidade = new javax.swing.JLabel();
        tfQuantidade = new javax.swing.JFormattedTextField();
        lbValor = new javax.swing.JLabel();
        tfValor = new javax.swing.JFormattedTextField();
        tfBuscarProduto = new javax.swing.JTextField();
        btnBuscarProduto = new javax.swing.JButton();
        sprRodape = new javax.swing.JSeparator();
        btnAlterar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Item");
        setResizable(false);

        pnTitulo.setBackground(new java.awt.Color(51, 51, 51));

        lbTitulo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo.setText("Novo Item");

        javax.swing.GroupLayout pnTituloLayout = new javax.swing.GroupLayout(pnTitulo);
        pnTitulo.setLayout(pnTituloLayout);
        pnTituloLayout.setHorizontalGroup(
            pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo)
                .addContainerGap(451, Short.MAX_VALUE))
        );
        pnTituloLayout.setVerticalGroup(
            pnTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnCorpo.setBackground(new java.awt.Color(255, 255, 255));

        lbProduto.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbProduto.setForeground(new java.awt.Color(0, 102, 205));
        lbProduto.setText("produto");

        pnItem.setBackground(new java.awt.Color(255, 255, 255));

        cbProduto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbProduto.setForeground(new java.awt.Color(102, 102, 102));
        cbProduto.setModel(new javax.swing.DefaultComboBoxModel(itemBO.buscarNomeProdutos()));
        cbProduto.setFocusable(false);
        cbProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProdutoActionPerformed(evt);
            }
        });

        lbQuantidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbQuantidade.setForeground(new java.awt.Color(102, 102, 102));
        lbQuantidade.setText("Quantidade");

        tfQuantidade.setForeground(new java.awt.Color(102, 102, 102));
        tfQuantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("########.##"))));
        tfQuantidade.setEnabled(false);
        tfQuantidade.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfQuantidadeKeyReleased(evt);
            }
        });

        lbValor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbValor.setForeground(new java.awt.Color(102, 102, 102));
        lbValor.setText("Valor do Item");

        tfValor.setEditable(false);
        tfValor.setForeground(new java.awt.Color(102, 102, 102));
        tfValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("########.##"))));
        tfValor.setText("0,0");
        tfValor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        tfBuscarProduto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfBuscarProduto.setForeground(new java.awt.Color(102, 102, 102));
        tfBuscarProduto.setText("Código");
        tfBuscarProduto.setPreferredSize(new java.awt.Dimension(59, 19));

        btnBuscarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnBuscarUP.png"))); // NOI18N
        btnBuscarProduto.setBorder(null);
        btnBuscarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarProduto.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnBuscarDOWN.png"))); // NOI18N
        btnBuscarProduto.setFocusable(false);
        btnBuscarProduto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnBuscarDOWN.png"))); // NOI18N
        btnBuscarProduto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnBuscarDOWN.png"))); // NOI18N

        javax.swing.GroupLayout pnItemLayout = new javax.swing.GroupLayout(pnItem);
        pnItem.setLayout(pnItemLayout);
        pnItemLayout.setHorizontalGroup(
            pnItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnItemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbProduto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnItemLayout.createSequentialGroup()
                        .addComponent(lbQuantidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbValor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfBuscarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnBuscarProduto)))
                .addContainerGap())
        );
        pnItemLayout.setVerticalGroup(
            pnItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnItemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnItemLayout.createSequentialGroup()
                        .addGroup(pnItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tfQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbQuantidade)
                                .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbValor))
                            .addComponent(btnBuscarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tfBuscarProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        sprRodape.setForeground(new java.awt.Color(204, 204, 204));

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarUP.png"))); // NOI18N
        btnAlterar.setBorder(null);
        btnAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterar.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N
        btnAlterar.setFocusable(false);
        btnAlterar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N
        btnAlterar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnInserirUP.png"))); // NOI18N
        btnCadastrar.setBorder(null);
        btnCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCadastrar.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnInserirDOWN.png"))); // NOI18N
        btnCadastrar.setFocusable(false);
        btnCadastrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnInserirDOWN.png"))); // NOI18N
        btnCadastrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnInserirDOWN.png"))); // NOI18N
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
            .addComponent(pnItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnCorpoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbProduto)
                    .addGroup(pnCorpoLayout.createSequentialGroup()
                        .addComponent(btnCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnCorpoLayout.setVerticalGroup(
            pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCorpoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbProduto)
                .addGap(0, 0, 0)
                .addComponent(pnItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sprRodape, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadastrar)
                    .addComponent(btnAlterar))
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

    private void cbProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProdutoActionPerformed
        if (cbProduto.getSelectedIndex() != 0) {
            tfQuantidade.setEnabled(true);
        } else {
            tfQuantidade.setEnabled(false);
        }
        tfQuantidade.setText("");
        tfValor.setText("0,0");
    }//GEN-LAST:event_cbProdutoActionPerformed

    private void tfQuantidadeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfQuantidadeKeyReleased
        try {
            if (tfValor.getText().length() > 0 && cbProduto.getSelectedIndex() > 0) {
                tfValor.setText(new BigDecimal(tfQuantidade.getText()).multiply(itemBO.buscarProduto(cbProduto.getSelectedIndex() - 1).getVendaProduto()).toString());
            } else {
                tfValor.setText("0,0");
            }
        } catch (Exception e) {

        }
        if (!cbProduto.isEnabled()) {
            try {
                if (tfValor.getText().length() > 0) {
                    tfValor.setText(new BigDecimal(tfQuantidade.getText()).multiply(valor).toString());
                } else {
                    tfValor.setText("0,0");
                }
            } catch (Exception e) {

            }
        }
    }//GEN-LAST:event_tfQuantidadeKeyReleased

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        btnCadastrar.setEnabled(false);
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        if (itemBO.validarCampos(pnItem) && cbProduto.getSelectedIndex() > 0) {
            itemVO = itemBO.inserirItem(null, itemBO.buscarProduto(cbProduto.getSelectedIndex() - 1), tfQuantidade.getText(), tfValor.getText());
            if (itemVO != null) {
                itens.add(itemVO);
                viewVenda.atualizarPagina();
                this.dispose();
            }
        }
        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        btnCadastrar.setEnabled(true);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        btnCadastrar.setEnabled(false);
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        if (itemBO.validarCampos(pnItem)) {
            if (itemBO.alterarItem(itemVO, tfQuantidade.getText(), tfValor.getText())) {
                viewVenda.atualizarPagina();
                this.dispose();
            }
        }
        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        btnCadastrar.setEnabled(true);
    }//GEN-LAST:event_btnAlterarActionPerformed

    //Declaração de variáveis(View).
    private final ViewVenda viewVenda;

    //Declaração de variáveis(Value Object).
    private Itemvenda itemVO;
    private final ArrayList<Itemvenda> itens;
    private BigDecimal valor;

    //Declaração de variáveis(Business Object).
    private final ItemVendaBO itemBO;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscarProduto;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JComboBox cbProduto;
    private javax.swing.JLabel lbProduto;
    private javax.swing.JLabel lbQuantidade;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbValor;
    private javax.swing.JPanel pnCorpo;
    private javax.swing.JPanel pnItem;
    private javax.swing.JPanel pnTitulo;
    private javax.swing.JSeparator sprRodape;
    private javax.swing.JTextField tfBuscarProduto;
    private javax.swing.JFormattedTextField tfQuantidade;
    private javax.swing.JFormattedTextField tfValor;
    // End of variables declaration//GEN-END:variables
}
