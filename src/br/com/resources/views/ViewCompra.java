package br.com.resources.views;

import br.com.models.bo.CompraBO;
import br.com.models.tabelas.TableModelItemCompra;
import br.com.models.tabelas.TableModelPagamento;
import br.com.models.vo.Compra;
import br.com.models.vo.Itemcompra;
import br.com.models.vo.Pagamento;
import java.awt.Cursor;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 * @see Classe visual. JDialog que tem como objetivo cadastrar uma nova compra.
 * @author Bruna Danieli Ribeiro Gonçalves, Márlon Ândrel Coelho Freitas
 */
public final class ViewCompra extends javax.swing.JDialog {

    /**
     * @see Construtor padrão.
     * @param parent
     * @param modal
     * @param viewPrincipal
     * @param viewEstoque
     */
    public ViewCompra(java.awt.Frame parent, boolean modal, ViewPrincipal viewPrincipal, ViewEstoque viewEstoque) {
        //Inicialização dos componentes padrões do JDialog.
        super(parent, modal);
        this.viewPrincipal = viewPrincipal;
        this.viewEstoque = viewEstoque;
        this.compraBO = new CompraBO();
        this.itens = new ArrayList<>();
        this.pagamentos = new ArrayList<>();
        initComponents();
        rbAVista.doClick();
        btnAlterar.setVisible(false);
        atualizarPagina();
    }

    /**
     * @param compra
     * @param alterar
     * @see Construtor padrão.
     * @param parent
     * @param modal
     * @param viewPrincipal
     * @param viewEstoque
     */
    public ViewCompra(java.awt.Frame parent, boolean modal, ViewPrincipal viewPrincipal, ViewEstoque viewEstoque, Compra compra, Boolean alterar) {
        //Inicialização dos componentes padrões do JDialog.
        super(parent, modal);
        this.viewPrincipal = viewPrincipal;
        this.viewEstoque = viewEstoque;
        this.compraBO = new CompraBO();
        this.compraVO = compra;
        this.itens = compraBO.buscarItens(compra.getIdCompra());;
        this.pagamentos = new ArrayList<>();
        initComponents();
        rbAVista.doClick();
        btnFinalizarCompra.setVisible(false);

        //Definindo Modelo com Fornecedor para os JComboBox.
        ArrayList<String> array = new ArrayList<>();
        String[] Arr = new String[array.size()];
        if (compra.getFornecedor() != null) {
            array.add(compra.getFornecedor().getNomeFornecedor());
        } else {
            array.add("FORNECEDOR");
        }
        Arr = array.toArray(Arr);
        cbFornecedor.setModel(new javax.swing.DefaultComboBoxModel(Arr));

        //Definindo como não editável
        if (!alterar) {
            btnAlterar.setVisible(false);
            cbFornecedor.setEnabled(false);
            btnNovoItem.setVisible(false);
            btnAlterarItem.setVisible(false);
            btnVisualizarItem.setVisible(false);
            btnExcluirItem.setVisible(false);
            pnPagamento.setVisible(false);
        }
        atualizarPagina();
    }

    public void atualizarPagina() {
        calcularValores();
        calcularPagamento();
        calcularTroco();
        gerarRecebimentos();
        atualizarTabelas();
        calcularValores();
        calcularPagamento();
        calcularTroco();
    }

    /**
     * @see Método que Instancia a classe PainelControleBO para realizar buscas
     * de Objetos de valores que compoem os modelos de tabelas.
     */
    public final void atualizarTabelas() {
        //Inicialização dos modelos de tabelas.
        compraBO = new CompraBO();
        try {
            tabelaItens = new TableModelItemCompra(itens);
        } catch (Exception e) {
            tabelaItens = new TableModelItemCompra();
        }
        try {
            tabelaPagamento = new TableModelPagamento(pagamentos);
        } catch (Exception e) {
            tabelaPagamento = new TableModelPagamento();
        }

        //Definindo modelo de tabelas para as tabelas.
        tbItens.setModel(tabelaItens);
        tbPagamentos.setModel(tabelaPagamento);

        //Definir tabelas como sem seleção.
        tbItens.clearSelection();
        tbPagamentos.clearSelection();

        //Definindo botões Aleterar e Excluir como não habilitado.
        btnAlterarItem.setEnabled(false);
        btnExcluirItem.setEnabled(false);

        //Definindo valores da venda
        tfTotalVenda.setText("0.0");
    }

    /**
     * @see Método que calcula os valores da venda.
     */
    public void calcularValores() {
        if (itens.size() > 0) {
            BigDecimal aux = new BigDecimal(0);
            for (Itemcompra iten : itens) {
                aux = aux.add(iten.getValorItemCompra());
            }
            tfTotalVenda.setText(aux.toString());
        }
    }

    /**
     * @see Método que calcula os valores do troco.
     */
    public void calcularTroco() {
        try {
            BigDecimal troco = new BigDecimal(tfTotalPago.getText()).subtract(new BigDecimal(tfTotalAVista.getText()));
            tfTroco.setText(troco.toString());
        } catch (Exception e) {

        }
    }

    public void calcularPagamento() {
        if (rbAVista.isSelected()) {
            tfTotalAVista.setText(tfTotalVenda.getText());
        } else {
            BigDecimal valor = new BigDecimal(0);
            for (Pagamento recebimento : pagamentos) {
                if (recebimento.getStatusPagamento()) {
                    valor = valor.add(recebimento.getValorPagamento());
                }
            }
            tfTotalAVista.setText(valor.toString());
        }
    }

    /**
     * @see Método que calcula os valores do pagamento da venda.
     */
    public void gerarRecebimentos() {
        pagamentos.clear();
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date());
            if (rbAPrazo.isSelected()) {
                for (int cont = 0; cont < (Integer) sldParcelas.getValue(); cont++) {
                    calendar.add(Calendar.MONTH, +1);
                    if (((calendar.getTime().getMonth() + 1) == 2) && ((cbVencimento.getSelectedIndex() + 1) > 28)) {
                        calendar.set(Calendar.DAY_OF_MONTH, 28);
                    } else {
                        if (((calendar.getTime().getMonth() + 1) == 4) && ((cbVencimento.getSelectedIndex() + 1) > 30)) {
                            calendar.set(Calendar.DAY_OF_MONTH, 30);
                        } else {
                            if (((calendar.getTime().getMonth() + 1) == 6) && ((cbVencimento.getSelectedIndex() + 1) > 30)) {
                                calendar.set(Calendar.DAY_OF_MONTH, 30);
                            } else {
                                if (((calendar.getTime().getMonth() + 1) == 9) && ((cbVencimento.getSelectedIndex() + 1) > 30)) {
                                    calendar.set(Calendar.DAY_OF_MONTH, 30);
                                } else {
                                    if (((calendar.getTime().getMonth() + 1) == 11) && ((cbVencimento.getSelectedIndex() + 1) > 30)) {
                                        calendar.set(Calendar.DAY_OF_MONTH, 30);
                                    } else {
                                        calendar.set(Calendar.DAY_OF_MONTH, cbVencimento.getSelectedIndex() + 1);
                                    }
                                }
                            }
                        }
                    }
                    pagamentos.add(new Pagamento(compraVO, null, null, "Compra", new BigDecimal(tfTotalVenda.getText()).divide(new BigDecimal(sldParcelas.getValue()), MathContext.DECIMAL128).setScale(2, RoundingMode.HALF_EVEN), calendar.getTime(), false, new Date(), new Date()));
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
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
        pnFornecedor = new javax.swing.JPanel();
        cbFornecedor = new javax.swing.JComboBox();
        lbPedido = new javax.swing.JLabel();
        pnPedido = new javax.swing.JPanel();
        btnNovoItem = new javax.swing.JButton();
        btnVisualizarItem = new javax.swing.JButton();
        btnAlterarItem = new javax.swing.JButton();
        btnExcluirItem = new javax.swing.JButton();
        spnItens = new javax.swing.JScrollPane();
        tbItens = new javax.swing.JTable();
        lbTotalVenda = new javax.swing.JLabel();
        tfTotalVenda = new javax.swing.JFormattedTextField();
        sprDireita = new javax.swing.JSeparator();
        lbPagamento = new javax.swing.JLabel();
        sprRodape = new javax.swing.JSeparator();
        btnFinalizarCompra = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        pnPagamento = new javax.swing.JPanel();
        rbAVista = new javax.swing.JRadioButton();
        rbAPrazo = new javax.swing.JRadioButton();
        pnAPrazo = new javax.swing.JPanel();
        tfParcelas = new javax.swing.JLabel();
        sldParcelas = new javax.swing.JSlider();
        tfVencimento = new javax.swing.JLabel();
        cbVencimento = new javax.swing.JComboBox();
        spnPagamentos = new javax.swing.JScrollPane();
        tbPagamentos = new javax.swing.JTable();
        pnAVista = new javax.swing.JPanel();
        lbTotalAVista = new javax.swing.JLabel();
        tfTotalAVista = new javax.swing.JFormattedTextField();
        lbTotalPago = new javax.swing.JLabel();
        tfTotalPago = new javax.swing.JFormattedTextField();
        lbTroco = new javax.swing.JLabel();
        tfTroco = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        pnTitulo.setBackground(new java.awt.Color(51, 51, 51));

        lbTitulo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo.setText("Nova Compra");

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
        lbCategoria.setText("fornecedor");

        lbOpcional1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbOpcional1.setForeground(new java.awt.Color(102, 102, 102));
        lbOpcional1.setText("(Opcional)");

        pnFornecedor.setBackground(new java.awt.Color(255, 255, 255));

        cbFornecedor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbFornecedor.setForeground(new java.awt.Color(102, 102, 102));
        cbFornecedor.setModel(new javax.swing.DefaultComboBoxModel(compraBO.buscarNomeFornecedores()));
        cbFornecedor.setFocusable(false);

        javax.swing.GroupLayout pnFornecedorLayout = new javax.swing.GroupLayout(pnFornecedor);
        pnFornecedor.setLayout(pnFornecedorLayout);
        pnFornecedorLayout.setHorizontalGroup(
            pnFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFornecedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbFornecedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnFornecedorLayout.setVerticalGroup(
            pnFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFornecedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lbPedido.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbPedido.setForeground(new java.awt.Color(0, 102, 205));
        lbPedido.setText("pedido");

        pnPedido.setBackground(new java.awt.Color(255, 255, 255));

        btnNovoItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnNovoItemUP.png"))); // NOI18N
        btnNovoItem.setBorder(null);
        btnNovoItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovoItem.setFocusable(false);
        btnNovoItem.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnNovoItemDOWN.png"))); // NOI18N
        btnNovoItem.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnNovoItemDOWN.png"))); // NOI18N
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
        btnVisualizarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarItemActionPerformed(evt);
            }
        });

        btnAlterarItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarUP.png"))); // NOI18N
        btnAlterarItem.setBorder(null);
        btnAlterarItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterarItem.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N
        btnAlterarItem.setEnabled(false);
        btnAlterarItem.setFocusable(false);
        btnAlterarItem.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N
        btnAlterarItem.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N
        btnAlterarItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarItemActionPerformed(evt);
            }
        });

        btnExcluirItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirUP.png"))); // NOI18N
        btnExcluirItem.setBorder(null);
        btnExcluirItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluirItem.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirDOWN.png"))); // NOI18N
        btnExcluirItem.setEnabled(false);
        btnExcluirItem.setFocusable(false);
        btnExcluirItem.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirDOWN.png"))); // NOI18N
        btnExcluirItem.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirDOWN.png"))); // NOI18N
        btnExcluirItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirItemActionPerformed(evt);
            }
        });

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
                .addComponent(lbTotalVenda)
                .addGap(42, 42, 42)
                .addComponent(tfTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(spnItens, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(83, 83, 83)
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

        sprRodape.setForeground(new java.awt.Color(204, 204, 204));

        btnFinalizarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnFinalizarCompraUP.png"))); // NOI18N
        btnFinalizarCompra.setBorder(null);
        btnFinalizarCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinalizarCompra.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnFinalizarCompraDOWN.png"))); // NOI18N
        btnFinalizarCompra.setFocusable(false);
        btnFinalizarCompra.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnFinalizarCompraDOWN.png"))); // NOI18N
        btnFinalizarCompra.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnFinalizarCompraDOWN.png"))); // NOI18N
        btnFinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarCompraActionPerformed(evt);
            }
        });

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

        tfParcelas.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfParcelas.setForeground(new java.awt.Color(102, 102, 102));
        tfParcelas.setText("Parcelas");

        sldParcelas.setBackground(new java.awt.Color(255, 255, 255));
        sldParcelas.setFont(new java.awt.Font("Arial", 0, 8)); // NOI18N
        sldParcelas.setForeground(new java.awt.Color(102, 102, 102));
        sldParcelas.setMajorTickSpacing(1);
        sldParcelas.setMaximum(12);
        sldParcelas.setPaintLabels(true);
        sldParcelas.setPaintTicks(true);
        sldParcelas.setSnapToTicks(true);
        sldParcelas.setValue(0);
        sldParcelas.setFocusable(false);
        sldParcelas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sldParcelasMouseReleased(evt);
            }
        });

        tfVencimento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfVencimento.setForeground(new java.awt.Color(102, 102, 102));
        tfVencimento.setText("Vencimento nos dias");

        cbVencimento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbVencimento.setForeground(new java.awt.Color(102, 102, 102));
        cbVencimento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cbVencimento.setFocusable(false);
        cbVencimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbVencimentoActionPerformed(evt);
            }
        });

        spnPagamentos.setBackground(new java.awt.Color(255, 255, 255));
        spnPagamentos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        spnPagamentos.setForeground(new java.awt.Color(102, 102, 102));
        spnPagamentos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        tbPagamentos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tbPagamentos.setForeground(new java.awt.Color(102, 102, 102));
        tbPagamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbPagamentos.setFocusable(false);
        tbPagamentos.setGridColor(new java.awt.Color(204, 204, 204));
        tbPagamentos.setIntercellSpacing(new java.awt.Dimension(0, 1));
        tbPagamentos.setRowHeight(30);
        tbPagamentos.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tbPagamentos.setSelectionForeground(new java.awt.Color(102, 102, 102));
        tbPagamentos.setShowVerticalLines(false);
        tbPagamentos.getTableHeader().setReorderingAllowed(false);
        tbPagamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPagamentosMouseClicked(evt);
            }
        });
        spnPagamentos.setViewportView(tbPagamentos);
        cabecalho = tbPagamentos.getTableHeader();
        cabecalho.setFont(new java.awt.Font("Arial", java.awt.Font.PLAIN, 12));
        cabecalho.setForeground(new java.awt.Color(102,102,102));

        javax.swing.GroupLayout pnAPrazoLayout = new javax.swing.GroupLayout(pnAPrazo);
        pnAPrazo.setLayout(pnAPrazoLayout);
        pnAPrazoLayout.setHorizontalGroup(
            pnAPrazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAPrazoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnAPrazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnAPrazoLayout.createSequentialGroup()
                        .addComponent(spnPagamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(pnAPrazoLayout.createSequentialGroup()
                        .addGroup(pnAPrazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnAPrazoLayout.createSequentialGroup()
                                .addComponent(tfVencimento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnAPrazoLayout.createSequentialGroup()
                                .addComponent(tfParcelas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sldParcelas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(10, 10, 10))))
        );
        pnAPrazoLayout.setVerticalGroup(
            pnAPrazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnAPrazoLayout.createSequentialGroup()
                .addGroup(pnAPrazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnAPrazoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tfParcelas))
                    .addComponent(sldParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnAPrazoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfVencimento)
                    .addComponent(cbVencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spnPagamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnAVista.setBackground(new java.awt.Color(255, 255, 255));

        lbTotalAVista.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbTotalAVista.setForeground(new java.awt.Color(102, 102, 102));
        lbTotalAVista.setText("Total pagamento R$");

        tfTotalAVista.setEditable(false);
        tfTotalAVista.setForeground(new java.awt.Color(102, 102, 102));
        tfTotalAVista.setText("0.0");
        tfTotalAVista.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lbTotalPago.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbTotalPago.setForeground(new java.awt.Color(102, 102, 102));
        lbTotalPago.setText("Total pago R$");

        tfTotalPago.setForeground(new java.awt.Color(102, 102, 102));
        tfTotalPago.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("########.##"))));
        tfTotalPago.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfTotalPago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfTotalPagoKeyReleased(evt);
            }
        });

        lbTroco.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbTroco.setForeground(new java.awt.Color(102, 102, 102));
        lbTroco.setText("Troco R$");

        tfTroco.setEditable(false);
        tfTroco.setForeground(new java.awt.Color(102, 102, 102));
        tfTroco.setText("0.0");
        tfTroco.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

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
                        .addComponent(lbTotalAVista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addComponent(tfTotalAVista, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnAVistaLayout.setVerticalGroup(
            pnAVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnAVistaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnAVistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTotalAVista, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTotalAVista))
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
                .addComponent(pnAVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnPagamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbAVista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbAPrazo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(pnAPrazo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnPagamentoLayout.setVerticalGroup(
            pnPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPagamentoLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnPagamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbAVista, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbAPrazo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnAPrazo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(pnAVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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
                        .addComponent(pnFornecedor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 0, 0)
                .addComponent(sprDireita, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCorpoLayout.createSequentialGroup()
                        .addComponent(lbPagamento)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnCorpoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(pnCorpoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnFinalizarCompra)
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pnPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnCorpoLayout.createSequentialGroup()
                                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbCategoria)
                                    .addComponent(lbOpcional1))
                                .addGap(0, 0, 0)
                                .addComponent(pnFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(btnFinalizarCompra))
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

    private void btnNovoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoItemActionPerformed
        viewItem = new ViewItemCompra(viewPrincipal, true, this, itens);
        viewItem.setVisible(true);
    }//GEN-LAST:event_btnNovoItemActionPerformed

    private void tbItensMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbItensMouseClicked
        if (tbItens.getSelectedRow() != -1) {
            btnAlterarItem.setEnabled(true);
            btnExcluirItem.setEnabled(true);
        }
    }//GEN-LAST:event_tbItensMouseClicked

    private void rbAVistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAVistaActionPerformed
        if (rbAVista.isSelected()) {
            pnAPrazo.setVisible(false);
            pnAVista.setVisible(true);
            atualizarPagina();
        }
    }//GEN-LAST:event_rbAVistaActionPerformed

    private void rbAPrazoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAPrazoActionPerformed
        if (rbAPrazo.isSelected()) {
            pnAPrazo.setVisible(true);
            atualizarPagina();
        }
    }//GEN-LAST:event_rbAPrazoActionPerformed

    private void sldParcelasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sldParcelasMouseReleased
        sldParcelas.setEnabled(false);
        atualizarPagina();
        sldParcelas.setEnabled(true);
    }//GEN-LAST:event_sldParcelasMouseReleased

    private void cbVencimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVencimentoActionPerformed
        atualizarPagina();
    }//GEN-LAST:event_cbVencimentoActionPerformed

    private void tbPagamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPagamentosMouseClicked
        if (tbPagamentos.getSelectedRow() != -1) {
            if (pagamentos.get(tbPagamentos.getSelectedRow()).getStatusPagamento()) {
                pagamentos.get(tbPagamentos.getSelectedRow()).setStatusPagamento(false);
            } else {
                pagamentos.get(tbPagamentos.getSelectedRow()).setStatusPagamento(true);
            }
            atualizarTabelas();
            calcularValores();
            calcularPagamento();
            calcularTroco();
        }
    }//GEN-LAST:event_tbPagamentosMouseClicked

    private void tfTotalPagoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTotalPagoKeyReleased
        calcularTroco();
    }//GEN-LAST:event_tfTotalPagoKeyReleased

    private void btnAlterarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarItemActionPerformed
        if (tbItens.getSelectedRow() != -1) {
            viewItem = new ViewItemCompra(viewPrincipal, true, this, itens.get(tbItens.getSelectedRow()), true);
            viewItem.setVisible(true);
        }
    }//GEN-LAST:event_btnAlterarItemActionPerformed

    private void btnVisualizarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnVisualizarItemActionPerformed

    private void btnExcluirItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirItemActionPerformed
        if (tbItens.getSelectedRow() != -1) {
            itens.remove(tbItens.getSelectedRow());
            atualizarPagina();
        }
    }//GEN-LAST:event_btnExcluirItemActionPerformed

    private void btnFinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarCompraActionPerformed
        btnFinalizarCompra.setEnabled(false);
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        if (tbItens.getModel().getRowCount() > 0) {
            if (compraBO.verificarEstoque(itens)) {
                if (compraBO.finalizarCompra(viewPrincipal.getFuncionario().getIdFuncionario(), cbFornecedor.getSelectedIndex(), tfTotalVenda.getText(), sldParcelas.getValue(), null, itens)) {
                    viewEstoque.atualizarTabelas();
                    this.dispose();
                }
            }else {
                JOptionPane.showMessageDialog(null, "Quantidade maxima de produto no estoque.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Insira itens para a compra primeiro.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        btnFinalizarCompra.setEnabled(true);
    }//GEN-LAST:event_btnFinalizarCompraActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        btnAlterar.setEnabled(false);
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));

        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        btnAlterar.setEnabled(true);
    }//GEN-LAST:event_btnAlterarActionPerformed

    //Declaração de variáveis(View).
    private final ViewPrincipal viewPrincipal;
    private final ViewEstoque viewEstoque;
    private ViewItemCompra viewItem;

    //Declaração de variáveis(Value Object).
    private Compra compraVO;
    private final ArrayList<Itemcompra> itens;
    private final ArrayList<Pagamento> pagamentos;

    //Declaração de variáveis(Business Object).
    private CompraBO compraBO;

    //Declaração de variáveis(Tabelas).
    private TableModelItemCompra tabelaItens;
    private TableModelPagamento tabelaPagamento;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAlterarItem;
    private javax.swing.JButton btnExcluirItem;
    private javax.swing.JButton btnFinalizarCompra;
    private javax.swing.JButton btnNovoItem;
    private javax.swing.JButton btnVisualizarItem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbFornecedor;
    private javax.swing.JComboBox cbVencimento;
    private javax.swing.JLabel lbCategoria;
    private javax.swing.JLabel lbOpcional1;
    private javax.swing.JLabel lbPagamento;
    private javax.swing.JLabel lbPedido;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbTotalAVista;
    private javax.swing.JLabel lbTotalPago;
    private javax.swing.JLabel lbTotalVenda;
    private javax.swing.JLabel lbTroco;
    private javax.swing.JPanel pnAPrazo;
    private javax.swing.JPanel pnAVista;
    private javax.swing.JPanel pnCorpo;
    private javax.swing.JPanel pnFornecedor;
    private javax.swing.JPanel pnPagamento;
    private javax.swing.JPanel pnPedido;
    private javax.swing.JPanel pnTitulo;
    private javax.swing.JRadioButton rbAPrazo;
    private javax.swing.JRadioButton rbAVista;
    private javax.swing.JSlider sldParcelas;
    private javax.swing.JScrollPane spnItens;
    private javax.swing.JScrollPane spnPagamentos;
    private javax.swing.JSeparator sprDireita;
    private javax.swing.JSeparator sprRodape;
    private javax.swing.JTable tbItens;
    private javax.swing.table.JTableHeader cabecalho;
    private javax.swing.JTable tbPagamentos;
    private javax.swing.JLabel tfParcelas;
    private javax.swing.JFormattedTextField tfTotalAVista;
    private javax.swing.JFormattedTextField tfTotalPago;
    private javax.swing.JFormattedTextField tfTotalVenda;
    private javax.swing.JFormattedTextField tfTroco;
    private javax.swing.JLabel tfVencimento;
    // End of variables declaration//GEN-END:variables
}
