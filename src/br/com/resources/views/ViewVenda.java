package br.com.resources.views;

import br.com.models.bo.VendaBO;
import br.com.models.tabelas.TableModelItemVenda;
import br.com.models.tabelas.TableModelRecebimento;
import br.com.models.vo.Itemvenda;
import br.com.models.vo.Recebimento;
import br.com.models.vo.Venda;
import java.awt.Cursor;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 * @see Classe visual. JDialog que tem como objetivo cadastrar uma nova venda.
 * @author Bruna Danieli Ribeiro Gonçalves, Márlon Ândrel Coelho Freitas
 */
public final class ViewVenda extends javax.swing.JDialog {

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
        this.viewPrincipal = viewPrincipal;
        this.viewVendas = viewVendas;
        this.vendaBO = new VendaBO();
        this.itens = new ArrayList<>();
        this.recebimentos = new ArrayList<>();
        initComponents();
        rbAVista.doClick();
        btnAlterar.setVisible(false);
        atualizarPagina();
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
        this.viewPrincipal = viewPrincipal;
        this.viewVendas = viewVendas;
        this.vendaBO = new VendaBO();
        this.vendaVO = venda;
        this.itens = vendaBO.buscarItens(venda.getIdVenda());
        this.recebimentos = new ArrayList<>();
        initComponents();
        rbAVista.doClick();
        btnFinalizarVenda.setVisible(false);

        //Definindo Modelo com Cliente para os JComboBox.
        ArrayList<String> array = new ArrayList<>();
        String[] Arr = new String[array.size()];
        if (venda.getCliente() != null) {
            array.add(venda.getCliente().getNomeCliente());
            tfDesconto.setText(venda.getCliente().getDescontoCliente().toString());
        } else {
            array.add("CLIENTE");
        }
        Arr = array.toArray(Arr);
        cbCliente.setModel(new javax.swing.DefaultComboBoxModel(Arr));
        //Definindo como não editável
        if (!alterar) {
            btnAlterar.setVisible(false);
            cbCliente.setEnabled(false);
            btnNovoItem.setVisible(false);
            btnAlterarItem.setVisible(false);
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
        vendaBO = new VendaBO();
        try {
            tabelaItens = new TableModelItemVenda(itens);
        } catch (Exception e) {
            tabelaItens = new TableModelItemVenda();
        }
        try {
            tabelaRecebimento = new TableModelRecebimento(recebimentos);
        } catch (Exception e) {
            tabelaRecebimento = new TableModelRecebimento();
        }

        //Definindo modelo de tabelas para as tabelas.
        tbItens.setModel(tabelaItens);
        tbRecebimentos.setModel(tabelaRecebimento);

        //Definir tabelas como sem seleção.
        tbItens.clearSelection();
        tbRecebimentos.clearSelection();

        //Definindo botões Aleterar e Excluir como não habilitado.
        btnAlterarItem.setEnabled(false);
        btnExcluirItem.setEnabled(false);

        //Definindo valores da venda
        tfTotalVenda.setText("0.0");
        tfValorProdutos.setText("0.0");
        if (cbCliente.getSelectedIndex() == 0) {
            tfDesconto.setText("0.0");
        }
    }

    /**
     * @see Método que calcula os valores da venda.
     */
    public void calcularValores() {
        if (itens.size() > 0) {
            BigDecimal aux = new BigDecimal(0);
            for (Itemvenda iten : itens) {
                aux = aux.add(iten.getValorItemVenda());
            }
            tfValorProdutos.setText(aux.toString());
            aux.add(aux.multiply(new BigDecimal(-1)).multiply(new BigDecimal(tfDesconto.getText().replace(",", ".")).divide(new BigDecimal(100))));

            tfTotalVenda.setText(aux.add(aux.multiply(new BigDecimal(-1)).multiply(new BigDecimal(tfDesconto.getText().replace(",", ".")).divide(new BigDecimal(100)))).setScale(2, RoundingMode.UP).toString());
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
            for (Recebimento recebimento : recebimentos) {
                if (recebimento.getStatusRecebimento()) {
                    valor = valor.add(recebimento.getValorRecebimento());
                }
            }
            tfTotalAVista.setText(valor.toString());
        }
    }

    /**
     * @see Método que calcula os valores do pagamento da venda.
     */
    public void gerarRecebimentos() {
        recebimentos.clear();
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
                    recebimentos.add(new Recebimento(null, null, vendaVO, "Venda", new BigDecimal(tfTotalVenda.getText()).divide(new BigDecimal(sldParcelas.getValue()), MathContext.DECIMAL128).setScale(2, RoundingMode.HALF_EVEN), calendar.getTime(), false, new Date(), new Date()));
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
        pnCliente = new javax.swing.JPanel();
        cbCliente = new javax.swing.JComboBox();
        lbPedido = new javax.swing.JLabel();
        pnPedido = new javax.swing.JPanel();
        btnNovoItem = new javax.swing.JButton();
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
        tfParcelas = new javax.swing.JLabel();
        sldParcelas = new javax.swing.JSlider();
        tfVencimento = new javax.swing.JLabel();
        cbVencimento = new javax.swing.JComboBox();
        spnRecebimentos = new javax.swing.JScrollPane();
        tbRecebimentos = new javax.swing.JTable();
        pnAVista = new javax.swing.JPanel();
        lbTotalAVista = new javax.swing.JLabel();
        tfTotalAVista = new javax.swing.JFormattedTextField();
        lbTotalPago = new javax.swing.JLabel();
        tfTotalPago = new javax.swing.JFormattedTextField();
        lbTroco = new javax.swing.JLabel();
        tfTroco = new javax.swing.JFormattedTextField();
        sprRodape = new javax.swing.JSeparator();
        btnFinalizarVenda = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        lbOpcional2 = new javax.swing.JLabel();

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
        cbCliente.setModel(new javax.swing.DefaultComboBoxModel(vendaBO.buscarNomeClientes()));
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

        btnNovoItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnNovoItemUP.png"))); // NOI18N
        btnNovoItem.setBorder(null);
        btnNovoItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovoItem.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnNovoItemDOWN.png"))); // NOI18N
        btnNovoItem.setFocusable(false);
        btnNovoItem.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnNovoItemDOWN.png"))); // NOI18N
        btnNovoItem.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnNovoItemDOWN.png"))); // NOI18N
        btnNovoItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoItemActionPerformed(evt);
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

        lbValorProdutos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbValorProdutos.setForeground(new java.awt.Color(102, 102, 102));
        lbValorProdutos.setText("Valor dos produtos R$");

        tfValorProdutos.setEditable(false);
        tfValorProdutos.setForeground(new java.awt.Color(102, 102, 102));
        tfValorProdutos.setText("0.0");
        tfValorProdutos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lbDesconto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbDesconto.setForeground(new java.awt.Color(102, 102, 102));
        lbDesconto.setText("Desconto %");

        tfDesconto.setEditable(false);
        tfDesconto.setForeground(new java.awt.Color(102, 102, 102));
        tfDesconto.setText("0.0");
        tfDesconto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lbTotalVenda.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbTotalVenda.setForeground(new java.awt.Color(102, 102, 102));
        lbTotalVenda.setText("Total da venda R$");

        tfTotalVenda.setEditable(false);
        tfTotalVenda.setForeground(new java.awt.Color(102, 102, 102));
        tfTotalVenda.setText("0.0");
        tfTotalVenda.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout pnPedidoLayout = new javax.swing.GroupLayout(pnPedido);
        pnPedido.setLayout(pnPedidoLayout);
        pnPedidoLayout.setHorizontalGroup(
            pnPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPedidoLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(btnNovoItem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAlterarItem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExcluirItem)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnPedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(spnItens, javax.swing.GroupLayout.DEFAULT_SIZE, 559, Short.MAX_VALUE)
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
                .addContainerGap(328, Short.MAX_VALUE))
        );
        pnPedidoLayout.setVerticalGroup(
            pnPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAlterarItem)
                    .addComponent(btnExcluirItem, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNovoItem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnItens, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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
        tbRecebimentos.setSelectionBackground(new java.awt.Color(255, 255, 255));
        tbRecebimentos.setSelectionForeground(new java.awt.Color(102, 102, 102));
        tbRecebimentos.setShowVerticalLines(false);
        tbRecebimentos.getTableHeader().setReorderingAllowed(false);
        tbRecebimentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbRecebimentosMouseClicked(evt);
            }
        });
        spnRecebimentos.setViewportView(tbRecebimentos);
        cabecalho = tbRecebimentos.getTableHeader();
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
                        .addComponent(spnRecebimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
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
                .addComponent(spnRecebimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        sprRodape.setForeground(new java.awt.Color(204, 204, 204));

        btnFinalizarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnFinalizarVendaUP.png"))); // NOI18N
        btnFinalizarVenda.setBorder(null);
        btnFinalizarVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinalizarVenda.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnFinalizarVendaDOWN.png"))); // NOI18N
        btnFinalizarVenda.setFocusable(false);
        btnFinalizarVenda.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnFinalizarVendaDOWN.png"))); // NOI18N
        btnFinalizarVenda.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnFinalizarVendaDOWN.png"))); // NOI18N
        btnFinalizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarVendaActionPerformed(evt);
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

        lbOpcional2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbOpcional2.setForeground(new java.awt.Color(102, 102, 102));
        lbOpcional2.setText("(Opcional)");

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbOpcional2)
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
                                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lbPagamento)
                                    .addComponent(lbOpcional2))
                                .addGap(0, 0, 0)
                                .addComponent(pnPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            btnAlterarItem.setEnabled(true);
            btnExcluirItem.setEnabled(true);
        }
    }//GEN-LAST:event_tbItensMouseClicked

    private void tbRecebimentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRecebimentosMouseClicked
        if (tbRecebimentos.getSelectedRow() != -1) {
            if (recebimentos.get(tbRecebimentos.getSelectedRow()).getStatusRecebimento()) {
                recebimentos.get(tbRecebimentos.getSelectedRow()).setStatusRecebimento(false);
            } else {
                recebimentos.get(tbRecebimentos.getSelectedRow()).setStatusRecebimento(true);
            }
            atualizarTabelas();
            calcularValores();
            calcularPagamento();
            calcularTroco();
        }
    }//GEN-LAST:event_tbRecebimentosMouseClicked

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

    private void cbClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbClienteActionPerformed
        if (cbCliente.getSelectedIndex() > 0) {
            tfDesconto.setText(vendaBO.buscarCliente(cbCliente.getSelectedIndex() - 1).getDescontoCliente().toString());
        } else {
            tfDesconto.setText("0.0");
        }
        atualizarPagina();
    }//GEN-LAST:event_cbClienteActionPerformed

    private void btnNovoItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoItemActionPerformed
        viewItem = new ViewItemVenda(viewPrincipal, true, this, itens);
        viewItem.setVisible(true);
    }//GEN-LAST:event_btnNovoItemActionPerformed

    private void btnAlterarItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarItemActionPerformed
        if (tbItens.getSelectedRow() != -1) {
            viewItem = new ViewItemVenda(viewPrincipal, true, this, itens.get(tbItens.getSelectedRow()), true);
            viewItem.setVisible(true);
        }
    }//GEN-LAST:event_btnAlterarItemActionPerformed

    private void btnExcluirItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirItemActionPerformed
        if (tbItens.getSelectedRow() != -1) {
            itens.remove(tbItens.getSelectedRow());
            atualizarPagina();
        }
    }//GEN-LAST:event_btnExcluirItemActionPerformed

    private void tfTotalPagoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfTotalPagoKeyReleased
        calcularTroco();
    }//GEN-LAST:event_tfTotalPagoKeyReleased

    private void sldParcelasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sldParcelasMouseReleased
        sldParcelas.setEnabled(false);
        atualizarPagina();
        sldParcelas.setEnabled(true);
    }//GEN-LAST:event_sldParcelasMouseReleased

    private void cbVencimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbVencimentoActionPerformed
        atualizarPagina();
    }//GEN-LAST:event_cbVencimentoActionPerformed

    private void btnFinalizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarVendaActionPerformed
        btnFinalizarVenda.setEnabled(false);
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        if (tbItens.getModel().getRowCount() > 0) {
            if (vendaBO.finalizarVenda(viewPrincipal.getFuncionario().getIdFuncionario(), cbCliente.getSelectedIndex(), tfTotalVenda.getText(), sldParcelas.getValue(), null, itens)) {
                viewVendas.atualizarTabelas();
                this.dispose();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Insira itens para a venda primeiro.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        btnFinalizarVenda.setEnabled(true);
    }//GEN-LAST:event_btnFinalizarVendaActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        btnAlterar.setEnabled(false);
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));

        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        btnAlterar.setEnabled(true);
    }//GEN-LAST:event_btnAlterarActionPerformed

    //Declaração de variáveis(View).
    private final ViewPrincipal viewPrincipal;
    private final ViewVendas viewVendas;
    private ViewItemVenda viewItem;

    //Declaração de variáveis(Value Object).
    private Venda vendaVO;
    private final ArrayList<Itemvenda> itens;
    private final ArrayList<Recebimento> recebimentos;

    //Declaração de variáveis(Business Object).
    private VendaBO vendaBO;

    //Declaração de variáveis(Tabelas).
    private TableModelItemVenda tabelaItens;
    private TableModelRecebimento tabelaRecebimento;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnAlterarItem;
    private javax.swing.JButton btnExcluirItem;
    private javax.swing.JButton btnFinalizarVenda;
    private javax.swing.JButton btnNovoItem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbCliente;
    private javax.swing.JComboBox cbVencimento;
    private javax.swing.JLabel lbCategoria;
    private javax.swing.JLabel lbDesconto;
    private javax.swing.JLabel lbOpcional1;
    private javax.swing.JLabel lbOpcional2;
    private javax.swing.JLabel lbPagamento;
    private javax.swing.JLabel lbPedido;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JLabel lbTotalAVista;
    private javax.swing.JLabel lbTotalPago;
    private javax.swing.JLabel lbTotalVenda;
    private javax.swing.JLabel lbTroco;
    private javax.swing.JLabel lbValorProdutos;
    private javax.swing.JPanel pnAPrazo;
    private javax.swing.JPanel pnAVista;
    private javax.swing.JPanel pnCliente;
    private javax.swing.JPanel pnCorpo;
    private javax.swing.JPanel pnPagamento;
    private javax.swing.JPanel pnPedido;
    private javax.swing.JPanel pnTitulo;
    private javax.swing.JRadioButton rbAPrazo;
    private javax.swing.JRadioButton rbAVista;
    private javax.swing.JSlider sldParcelas;
    private javax.swing.JScrollPane spnItens;
    private javax.swing.JScrollPane spnRecebimentos;
    private javax.swing.JSeparator sprDireita;
    private javax.swing.JSeparator sprRodape;
    private javax.swing.JTable tbItens;
    private javax.swing.table.JTableHeader cabecalho;
    private javax.swing.JTable tbRecebimentos;
    private javax.swing.JFormattedTextField tfDesconto;
    private javax.swing.JLabel tfParcelas;
    private javax.swing.JFormattedTextField tfTotalAVista;
    private javax.swing.JFormattedTextField tfTotalPago;
    private javax.swing.JFormattedTextField tfTotalVenda;
    private javax.swing.JFormattedTextField tfTroco;
    private javax.swing.JFormattedTextField tfValorProdutos;
    private javax.swing.JLabel tfVencimento;
    // End of variables declaration//GEN-END:variables
}
