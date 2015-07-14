package br.com.resources.views;

import br.com.models.bo.VendaBO;
import br.com.models.vo.Venda;

/**
 * @see Classe visual. JDialog que tem como objetivo cadastrar uma nova venda.
 * @author Bruna Danieli Ribeiro Gonçalves, Márlon Ândrel Coelho Freitas
 */
public class ViewVenda extends javax.swing.JDialog {

    /**
     * @see Construtor padrão.
     * @param parent
     * @param modal
     * @param viewVendas
     * @param viewPrincipal
     */
    public ViewVenda(java.awt.Frame parent, boolean modal, ViewPrincipal viewPrincipal, ViewVendas viewVendas) {
        //Inicialização dos componentes padrões do JDialog.
        super(parent, modal);
        initComponents();
        this.viewPrincipal = viewPrincipal;
        this.viewVendas = viewVendas;
        this.vendaBO = new VendaBO();
    }

    /**
     * @param venda
     * @param alterar
     * @see Construtor padrão.
     * @param parent
     * @param modal
     * @param viewVendas
     * @param viewPrincipal
     */
    public ViewVenda(java.awt.Frame parent, boolean modal, ViewPrincipal viewPrincipal, ViewVendas viewVendas, Venda venda, Boolean alterar) {
        //Inicialização dos componentes padrões do JDialog.
        super(parent, modal);
        initComponents();
        this.viewPrincipal = viewPrincipal;
        this.viewVendas = viewVendas;
        this.vendaBO = new VendaBO();
    }
    
    //Componentes padrões do JFrame.
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnTitulo = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        pnCorpo = new javax.swing.JPanel();
        lbCategoria = new javax.swing.JLabel();
        lbOpcional1 = new javax.swing.JLabel();
        pnCliente = new javax.swing.JPanel();
        cbCliente = new javax.swing.JComboBox();
        lbPedido = new javax.swing.JLabel();
        pnPedido = new javax.swing.JPanel();
        btnNovoItem = new javax.swing.JButton();
        btnVisualizarItem = new javax.swing.JButton();
        btnAlterarItem = new javax.swing.JButton();
        btnExcluirItem = new javax.swing.JButton();
        spnItens = new javax.swing.JScrollPane();
        tbItens = new javax.swing.JTable();
        lbValorProdutos = new javax.swing.JLabel();
        tfValorProdutos = new javax.swing.JFormattedTextField();
        lbDesconto = new javax.swing.JLabel();
        tfDesconto = new javax.swing.JFormattedTextField();
        lbTotalVenda = new javax.swing.JLabel();
        tfTotalVenda = new javax.swing.JFormattedTextField();
        sprDireita = new javax.swing.JSeparator();
        lbPagamento = new javax.swing.JLabel();
        pnPagamento = new javax.swing.JPanel();
        rbAVista = new javax.swing.JRadioButton();
        rbAPrazo = new javax.swing.JRadioButton();
        pnAPrazo = new javax.swing.JPanel();
        lbParcelas = new javax.swing.JLabel();
        lbVencimento = new javax.swing.JLabel();
        tfVencimento = new javax.swing.JFormattedTextField();
        spnParcelas = new javax.swing.JSpinner();
        spnRecebimentos = new javax.swing.JScrollPane();
        tbRecebimentos = new javax.swing.JTable();
        pnAVista = new javax.swing.JPanel();
        lbTotalPago = new javax.swing.JLabel();
        tfTotalPago = new javax.swing.JFormattedTextField();
        lbTroco = new javax.swing.JLabel();
        tfTroco = new javax.swing.JFormattedTextField();
        tfTroco1 = new javax.swing.JFormattedTextField();
        lbTroco1 = new javax.swing.JLabel();
        sprRodape = new javax.swing.JSeparator();
        btnFinalizarVenda = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Venda");
        setResizable(false);

        pnTitulo.setBackground(new java.awt.Color(51, 51, 51));

        lbTitulo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo.setText("Nova Venda");

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

        lbCategoria.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbCategoria.setForeground(new java.awt.Color(0, 102, 205));
        lbCategoria.setText("cliente");

        lbOpcional1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbOpcional1.setForeground(new java.awt.Color(102, 102, 102));
        lbOpcional1.setText("(Opcional)");

        pnCliente.setBackground(new java.awt.Color(255, 255, 255));

        cbCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbCliente.setForeground(new java.awt.Color(102, 102, 102));
        cbCliente.setFocusable(false);
        cbCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnClienteLayout = new javax.swing.GroupLayout(pnCliente);
        pnCliente.setLayout(pnClienteLayout);
        pnClienteLayout.setHorizontalGroup(
            pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnClienteLayout.setVerticalGroup(
            pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lbPedido.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbPedido.setForeground(new java.awt.Color(0, 102, 205));
        lbPedido.setText("pedido");

        pnPedido.setBackground(new java.awt.Color(255, 255, 255));

        btnNovoItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnNovaVendaUP.png"))); // NOI18N
        btnNovoItem.setBorder(null);
        btnNovoItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovoItem.setFocusable(false);
        btnNovoItem.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnNovaVendaDOWN.png"))); // NOI18N
        btnNovoItem.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnNovaVendaDOWN.png"))); // NOI18N
        btnNovoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoItemActionPerformed(evt);
            }
        });

        btnVisualizarItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnVisualizarUP.png"))); // NOI18N
        btnVisualizarItem.setBorder(null);
        btnVisualizarItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVisualizarItem.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnVisualizarDOWN.png"))); // NOI18N
        btnVisualizarItem.setEnabled(false);
        btnVisualizarItem.setFocusable(false);
        btnVisualizarItem.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnVisualizarDOWN.png"))); // NOI18N
        btnVisualizarItem.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnVisualizarDOWN.png"))); // NOI18N

        btnAlterarItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarUP.png"))); // NOI18N
        btnAlterarItem.setBorder(null);
        btnAlterarItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterarItem.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N
        btnAlterarItem.setEnabled(false);
        btnAlterarItem.setFocusable(false);
        btnAlterarItem.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N
        btnAlterarItem.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N

        btnExcluirItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirUP.png"))); // NOI18N
        btnExcluirItem.setBorder(null);
        btnExcluirItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluirItem.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirDOWN.png"))); // NOI18N
        btnExcluirItem.setEnabled(false);
        btnExcluirItem.setFocusable(false);
        btnExcluirItem.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirDOWN.png"))); // NOI18N
        btnExcluirItem.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirDOWN.png"))); // NOI18N

        spnItens.setBackground(new java.awt.Color(255, 255, 255));
        spnItens.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        spnItens.setForeground(new java.awt.Color(102, 102, 102));
        spnItens.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        tbItens.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tbItens.setForeground(new java.awt.Color(102, 102, 102));
        tbItens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbItens.setFocusable(false);
        tbItens.setGridColor(new java.awt.Color(204, 204, 204));
        tbItens.setIntercellSpacing(new java.awt.Dimension(0, 1));
        tbItens.setRowHeight(30);
        tbItens.setSelectionBackground(new java.awt.Color(95, 180, 25));
        tbItens.setShowVerticalLines(false);
        tbItens.getTableHeader().setReorderingAllowed(false);
        tbItens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbItensMouseClicked(evt);
            }
        });
        spnItens.setViewportView(tbItens);
        cabecalho = tbItens.getTableHeader();
        cabecalho.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 12));
        cabecalho.setForeground(new java.awt.Color(102,102,102));

        lbValorProdutos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbValorProdutos.setForeground(new java.awt.Color(102, 102, 102));
        lbValorProdutos.setText("Valor dos produtos R$");

        tfValorProdutos.setEditable(false);
        tfValorProdutos.setForeground(new java.awt.Color(102, 102, 102));
        tfValorProdutos.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("########.##"))));
        tfValorProdutos.setText("0,0");
        tfValorProdutos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lbDesconto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbDesconto.setForeground(new java.awt.Color(102, 102, 102));
        lbDesconto.setText("Desconto (-)");

        tfDesconto.setEditable(false);
        tfDesconto.setForeground(new java.awt.Color(102, 102, 102));
        tfDesconto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("########.##"))));
        tfDesconto.setText("0,0");
        tfDesconto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lbTotalVenda.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbTotalVenda.setForeground(new java.awt.Color(102, 102, 102));
        lbTotalVenda.setText("Total da venda R$");

        tfTotalVenda.setEditable(false);
        tfTotalVenda.setForeground(new java.awt.Color(102, 102, 102));
        tfTotalVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("########.##"))));
        tfTotalVenda.setText("0,0");
        tfTotalVenda.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout pnPedidoLayout = new javax.swing.GroupLayout(pnPedido);
        pnPedido.setLayout(pnPedidoLayout);
        pnPedidoLayout.setHorizontalGroup(
            pnPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPedidoLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(btnNovoItem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVisualizarItem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterarItem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluirItem)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnPedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spnItens, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnPedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbValorProdutos)
                    .addComponent(lbDesconto)
                    .addComponent(lbTotalVenda))
                .addGap(18, 18, 18)
                .addGroup(pnPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfValorProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnPedidoLayout.setVerticalGroup(
            pnPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNovoItem)
                        .addComponent(btnAlterarItem)
                        .addComponent(btnExcluirItem))
                    .addComponent(btnVisualizarItem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnItens, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfValorProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbValorProdutos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDesconto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTotalVenda))
                .addContainerGap())
        );

        sprDireita.setForeground(new java.awt.Color(204, 204, 204));
        sprDireita.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lbPagamento.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbPagamento.setForeground(new java.awt.Color(0, 102, 205));
        lbPagamento.setText("    pagamento");

        pnPagamento.setBackground(new java.awt.Color(255, 255, 255));

        rbAVista.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbAVista);
        rbAVista.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rbAVista.setForeground(new java.awt.Color(102, 102, 102));
        rbAVista.setSelected(true);
        rbAVista.setText("A vista");
        rbAVista.setFocusable(false);
        rbAVista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAVistaActionPerformed(evt);
            }
        });

        rbAPrazo.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(rbAPrazo);
        rbAPrazo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        rbAPrazo.setForeground(new java.awt.Color(102, 102, 102));
        rbAPrazo.setText("A prazo");
        rbAPrazo.setFocusable(false);
        rbAPrazo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAPrazoActionPerformed(evt);
            }
        });

        pnAPrazo.setBackground(new java.awt.Color(255, 255, 255));

        lbParcelas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbParcelas.setForeground(new java.awt.Color(102, 102, 102));
        lbParcelas.setText("Parcelas");

        lbVencimento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbVencimento.setForeground(new java.awt.Color(102, 102, 102));
        lbVencimento.setText("Vencimento");

        tfVencimento.setForeground(new java.awt.Color(102, 102, 102));
        try {
            tfVencimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfVencimento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        spnParcelas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        spnParcelas.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));
        spnParcelas.setFocusable(false);
        spnParcelas.setForeground(new java.awt.Color(102, 102, 102));
        spnParcelas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                spnParcelasMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnAPrazoLayout = new javax.swing.GroupLayout(pnAPrazo);
        pnAPrazo.setLayout(pnAPrazoLayout);
        pnAPrazoLayout.setHorizontalGroup(
            pnAPrazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAPrazoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnAPrazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbVencimento)
                    .addComponent(lbParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnAPrazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfVencimento)
                    .addComponent(spnParcelas, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnAPrazoLayout.setVerticalGroup(
            pnAPrazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnAPrazoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnAPrazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spnParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbParcelas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnAPrazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbVencimento))
                .addContainerGap())
        );

        spnRecebimentos.setBackground(new java.awt.Color(255, 255, 255));
        spnRecebimentos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        spnRecebimentos.setForeground(new java.awt.Color(102, 102, 102));
        spnRecebimentos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        tbRecebimentos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tbRecebimentos.setForeground(new java.awt.Color(102, 102, 102));
        tbRecebimentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbRecebimentos.setFocusable(false);
        tbRecebimentos.setGridColor(new java.awt.Color(204, 204, 204));
        tbRecebimentos.setIntercellSpacing(new java.awt.Dimension(0, 1));
        tbRecebimentos.setRowHeight(30);
        tbRecebimentos.setSelectionBackground(new java.awt.Color(95, 180, 25));
        tbRecebimentos.setShowVerticalLines(false);
        tbRecebimentos.getTableHeader().setReorderingAllowed(false);
        tbRecebimentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbRecebimentosMouseClicked(evt);
            }
        });
        spnRecebimentos.setViewportView(tbRecebimentos);
        cabecalho = tbItens.getTableHeader();
        cabecalho.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 12));
        cabecalho.setForeground(new java.awt.Color(102,102,102));

        pnAVista.setBackground(new java.awt.Color(255, 255, 255));

        lbTotalPago.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbTotalPago.setForeground(new java.awt.Color(102, 102, 102));
        lbTotalPago.setText("Total pago R$");

        tfTotalPago.setForeground(new java.awt.Color(102, 102, 102));
        tfTotalPago.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("########.##"))));
        tfTotalPago.setText("0,0");
        tfTotalPago.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfTotalPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfTotalPagoKeyTyped(evt);
            }
        });

        lbTroco.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbTroco.setForeground(new java.awt.Color(102, 102, 102));
        lbTroco.setText("Troco R$");

        tfTroco.setEditable(false);
        tfTroco.setForeground(new java.awt.Color(102, 102, 102));
        tfTroco.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("########.##"))));
        tfTroco.setText("0,0");
        tfTroco.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        tfTroco1.setEditable(false);
        tfTroco1.setForeground(new java.awt.Color(102, 102, 102));
        tfTroco1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("########.##"))));
        tfTroco1.setText("0,0");
        tfTroco1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lbTroco1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbTroco1.setForeground(new java.awt.Color(102, 102, 102));
        lbTroco1.setText("Total pagamento R$");

        javax.swing.GroupLayout pnAVistaLayout = new javax.swing.GroupLayout(pnAVista);
        pnAVista.setLayout(pnAVistaLayout);
        pnAVistaLayout.setHorizontalGroup(
            pnAVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAVistaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnAVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnAVistaLayout.createSequentialGroup()
                        .addGroup(pnAVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTotalPago)
                            .addComponent(lbTroco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnAVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfTotalPago, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnAVistaLayout.createSequentialGroup()
                        .addComponent(lbTroco1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfTroco1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnAVistaLayout.setVerticalGroup(
            pnAVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnAVistaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnAVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTroco1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTroco1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnAVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTotalPago, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTotalPago))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnAVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTroco, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTroco))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnPagamentoLayout = new javax.swing.GroupLayout(pnPagamento);
        pnPagamento.setLayout(pnPagamentoLayout);
        pnPagamentoLayout.setHorizontalGroup(
            pnPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPagamentoLayout.createSequentialGroup()
                .addGroup(pnPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnAVista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnAPrazo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnPagamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPagamentoLayout.createSequentialGroup()
                        .addComponent(rbAVista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbAPrazo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(spnRecebimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnPagamentoLayout.setVerticalGroup(
            pnPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPagamentoLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbAVista, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbAPrazo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(pnAPrazo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(spnRecebimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(pnAVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        sprRodape.setForeground(new java.awt.Color(204, 204, 204));

        btnFinalizarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnFinalizarVendaUP.png"))); // NOI18N
        btnFinalizarVenda.setBorder(null);
        btnFinalizarVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinalizarVenda.setFocusable(false);
        btnFinalizarVenda.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnFinalizarVendaDOWN.png"))); // NOI18N
        btnFinalizarVenda.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnFinalizarVendaDOWN.png"))); // NOI18N

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarUP.png"))); // NOI18N
        btnAlterar.setBorder(null);
        btnAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterar.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N
        btnAlterar.setFocusable(false);
        btnAlterar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N
        btnAlterar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N

        javax.swing.GroupLayout pnCorpoLayout = new javax.swing.GroupLayout(pnCorpo);
        pnCorpo.setLayout(pnCorpoLayout);
        pnCorpoLayout.setHorizontalGroup(
            pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sprRodape)
            .addGroup(pnCorpoLayout.createSequentialGroup()
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCorpoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnCorpoLayout.createSequentialGroup()
                                .addComponent(lbCategoria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbOpcional1))
                            .addComponent(lbPedido)))
                    .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pnPedido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, 0)
                .addComponent(sprDireita, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCorpoLayout.createSequentialGroup()
                        .addComponent(lbPagamento)
                        .addContainerGap())
                    .addComponent(pnPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(pnCorpoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnFinalizarVenda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnCorpoLayout.setVerticalGroup(
            pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCorpoLayout.createSequentialGroup()
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCorpoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnCorpoLayout.createSequentialGroup()
                                .addComponent(lbPagamento)
                                .addGap(0, 0, 0)
                                .addComponent(pnPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(0, 0, 0))
                            .addGroup(pnCorpoLayout.createSequentialGroup()
                                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbCategoria)
                                    .addComponent(lbOpcional1))
                                .addGap(0, 0, 0)
                                .addComponent(pnCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbPedido)
                                .addGap(0, 0, 0)
                                .addComponent(pnPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(sprDireita))
                .addGap(0, 0, 0)
                .addComponent(sprRodape, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAlterar)
                    .addComponent(btnFinalizarVenda))
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

    private void tbItensMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbItensMouseClicked
        if (tbItens.getSelectedRow() != -1) {
            btnVisualizarItem.setEnabled(true);
            btnAlterarItem.setEnabled(true);
            btnExcluirItem.setEnabled(true);
        }
    }//GEN-LAST:event_tbItensMouseClicked

    private void tbRecebimentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRecebimentosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbRecebimentosMouseClicked

    private void rbAVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAVistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbAVistaActionPerformed

    private void rbAPrazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAPrazoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbAPrazoActionPerformed

    private void cbClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbClienteActionPerformed

    private void spnParcelasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spnParcelasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_spnParcelasMouseClicked

    private void tfTotalPagoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTotalPagoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTotalPagoKeyTyped

    private void btnNovoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoItemActionPerformed
        viewItem = new ViewItem(viewPrincipal, true, this);
        viewItem.setVisible(true);
    }//GEN-LAST:event_btnNovoItemActionPerformed

    //Declaração de variáveis(View).
    private final ViewPrincipal viewPrincipal;
    private final ViewVendas viewVendas;
    private ViewItem viewItem;

    //Declaração de variáveis(Value Object).
    private Venda vendaVO;

    //Declaração de variáveis(Business Object).
    private VendaBO vendaBO;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAlterarItem;
    private javax.swing.JButton btnExcluirItem;
    private javax.swing.JButton btnFinalizarVenda;
    private javax.swing.JButton btnNovoItem;
    private javax.swing.JButton btnVisualizarItem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbCliente;
    private javax.swing.JLabel lbCategoria;
    private javax.swing.JLabel lbDesconto;
    private javax.swing.JLabel lbOpcional1;
    private javax.swing.JLabel lbPagamento;
    private javax.swing.JLabel lbParcelas;
    private javax.swing.JLabel lbPedido;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbTotalPago;
    private javax.swing.JLabel lbTotalVenda;
    private javax.swing.JLabel lbTroco;
    private javax.swing.JLabel lbTroco1;
    private javax.swing.JLabel lbValorProdutos;
    private javax.swing.JLabel lbVencimento;
    private javax.swing.JPanel pnAPrazo;
    private javax.swing.JPanel pnAVista;
    private javax.swing.JPanel pnCliente;
    private javax.swing.JPanel pnCorpo;
    private javax.swing.JPanel pnPagamento;
    private javax.swing.JPanel pnPedido;
    private javax.swing.JPanel pnTitulo;
    private javax.swing.JRadioButton rbAPrazo;
    private javax.swing.JRadioButton rbAVista;
    private javax.swing.JScrollPane spnItens;
    private javax.swing.JSpinner spnParcelas;
    private javax.swing.JScrollPane spnRecebimentos;
    private javax.swing.JSeparator sprDireita;
    private javax.swing.JSeparator sprRodape;
    private javax.swing.JTable tbItens;
    private javax.swing.table.JTableHeader cabecalho;
    private javax.swing.JTable tbRecebimentos;
    private javax.swing.JFormattedTextField tfDesconto;
    private javax.swing.JFormattedTextField tfTotalPago;
    private javax.swing.JFormattedTextField tfTotalVenda;
    private javax.swing.JFormattedTextField tfTroco;
    private javax.swing.JFormattedTextField tfTroco1;
    private javax.swing.JFormattedTextField tfValorProdutos;
    private javax.swing.JFormattedTextField tfVencimento;
    // End of variables declaration//GEN-END:variables
}
