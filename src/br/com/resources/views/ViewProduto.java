package br.com.resources.views;

import br.com.models.bo.ProdutoBO;
import br.com.models.vo.Produto;
import java.awt.Cursor;
import java.util.ArrayList;

/**
 * @see Classe visual. JDialog que tem como objetivo cadastrar um novo produto.
 * @author Bruna Danieli Ribeiro Gonçalves, Márlon Ândrel Coelho Freitas
 */
public class ViewProduto extends javax.swing.JDialog {

    /**
     * @see Construtor padrão.
     * @param parent
     * @param modal
     * @param viewPainelControle
     */
    public ViewProduto(java.awt.Frame parent, boolean modal, ViewPainelControle viewPainelControle) {
        //Inicialização dos componentes padrões do JDialog.
        super(parent, modal);
        this.produtoBO = new ProdutoBO();
        initComponents();
        this.viewPainelControle = viewPainelControle;
        btnAlterar.setVisible(false);
    }

    /**
     * @see Construtor usado para visualizar ou alterar um produto.
     * @param parent
     * @param modal
     * @param viewPainelControle
     * @param produto
     * @param alterar
     */
    public ViewProduto(java.awt.Frame parent, boolean modal, ViewPainelControle viewPainelControle, Produto produto, Boolean alterar) {
        //Inicialização dos componentes padrões do JDialog.
        super(parent, modal);
        this.produtoBO = new ProdutoBO();
        initComponents();
        this.viewPainelControle = viewPainelControle;
        this.produtoVO = produto;
        btnCadastrar.setVisible(false);
        lbTitulo.setText("Alterar Produto");

        //Definindo os atributos.
        tfDescricao.setText(produto.getDescricaoProduto());
        tfCodigo.setText(produto.getCodigoProduto());
        tfValorCusto.setText(produto.getCustoProduto().toString());
        tfValorVenda.setText(produto.getVendaProduto().toString());
        tfMinimo.setText(produto.getMinimoProduto().toString());
        tfMaximo.setText(produto.getMaximoProduto().toString());
        tfEstoque.setText(produto.getEstoqueProduto().toString());

        //Definindo Modelo com lista de Categorias e Fornecedores para os JComboBox.
        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel(produtoBO.buscarNomeCategorias()));
        cbFornecedor.setModel(new javax.swing.DefaultComboBoxModel(produtoBO.buscarNomeFornecedores()));

        //Definindo como não editável.
        if (!alterar) {
            btnAlterar.setVisible(false);
            lbTitulo.setText("Produto");
            tfDescricao.setEditable(false);
            tfCodigo.setEditable(false);
            tfValorCusto.setEditable(false);
            tfValorVenda.setEditable(false);
            tfMinimo.setEditable(false);
            tfMaximo.setEditable(false);
            tfEstoque.setEditable(false);
            cbCategoria.setEnabled(false);
            cbFornecedor.setEnabled(false);

            //Definindo Modelo com Categoria e Fornecedor para os JComboBox.
            ArrayList<String> array = new ArrayList<>();
            String[] Arr = new String[array.size()];
            if (produto.getCategoria() != null) {
                array.add(produto.getCategoria().getDescricaoCategoria());
            } else {
                array.add("CATEGORIA");
            }
            Arr = array.toArray(Arr);
            cbCategoria.setModel(new javax.swing.DefaultComboBoxModel(Arr));
            array.clear();
            if (produto.getFornecedor() != null) {
                array.add(produto.getFornecedor().getNomeFornecedor());
            } else {
                array.add("FORNECEDOR");
            }
            Arr = array.toArray(Arr);
            cbFornecedor.setModel(new javax.swing.DefaultComboBoxModel(Arr));
        }
    }

    //Componentes padrões do JFrame.
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnTitulo = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();
        pnCorpo = new javax.swing.JPanel();
        pnObrigatorio = new javax.swing.JPanel();
        lbDescricao = new javax.swing.JLabel();
        tfDescricao = new javax.swing.JFormattedTextField();
        lbProduto = new javax.swing.JLabel();
        lbOpcional1 = new javax.swing.JLabel();
        pnProduto = new javax.swing.JPanel();
        lbCodigo = new javax.swing.JLabel();
        tfCodigo = new javax.swing.JFormattedTextField();
        lbValorCusto = new javax.swing.JLabel();
        tfValorCusto = new javax.swing.JFormattedTextField();
        lbValorVenda = new javax.swing.JLabel();
        tfValorVenda = new javax.swing.JFormattedTextField();
        lbMinimo = new javax.swing.JLabel();
        tfMinimo = new javax.swing.JFormattedTextField();
        lbMaximo = new javax.swing.JLabel();
        tfMaximo = new javax.swing.JFormattedTextField();
        lbEstoque = new javax.swing.JLabel();
        lbInicial = new javax.swing.JLabel();
        tfEstoque = new javax.swing.JFormattedTextField();
        lbCategoria = new javax.swing.JLabel();
        lbOpcional2 = new javax.swing.JLabel();
        cbCategoria = new javax.swing.JComboBox();
        lbFornecedor = new javax.swing.JLabel();
        lbOpcional3 = new javax.swing.JLabel();
        cbFornecedor = new javax.swing.JComboBox();
        sprRodape = new javax.swing.JSeparator();
        btnCadastrar = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();

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

        tfDescricao.setForeground(new java.awt.Color(102, 102, 102));
        try {
            tfDescricao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("**************************************************")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfDescricao.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        javax.swing.GroupLayout pnObrigatorioLayout = new javax.swing.GroupLayout(pnObrigatorio);
        pnObrigatorio.setLayout(pnObrigatorioLayout);
        pnObrigatorioLayout.setHorizontalGroup(
            pnObrigatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnObrigatorioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnObrigatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnObrigatorioLayout.createSequentialGroup()
                        .addComponent(lbDescricao)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(tfDescricao))
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

        pnProduto.setBackground(new java.awt.Color(255, 255, 255));

        lbCodigo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbCodigo.setForeground(new java.awt.Color(102, 102, 102));
        lbCodigo.setText("Codigo");

        tfCodigo.setForeground(new java.awt.Color(102, 102, 102));
        try {
            tfCodigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####################")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfCodigo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lbValorCusto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbValorCusto.setForeground(new java.awt.Color(102, 102, 102));
        lbValorCusto.setText("Valor de Custo");

        tfValorCusto.setForeground(new java.awt.Color(102, 102, 102));
        tfValorCusto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("########.##"))));
        tfValorCusto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lbValorVenda.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbValorVenda.setForeground(new java.awt.Color(102, 102, 102));
        lbValorVenda.setText("Valor de Venda");

        tfValorVenda.setForeground(new java.awt.Color(102, 102, 102));
        tfValorVenda.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("########.##"))));
        tfValorVenda.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lbMinimo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbMinimo.setForeground(new java.awt.Color(102, 102, 102));
        lbMinimo.setText("Quantidade mínima");

        tfMinimo.setForeground(new java.awt.Color(102, 102, 102));
        tfMinimo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("########.##"))));
        tfMinimo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lbMaximo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbMaximo.setForeground(new java.awt.Color(102, 102, 102));
        lbMaximo.setText("Quantidade máxima");

        tfMaximo.setForeground(new java.awt.Color(102, 102, 102));
        tfMaximo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("########.##"))));
        tfMaximo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lbEstoque.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbEstoque.setForeground(new java.awt.Color(102, 102, 102));
        lbEstoque.setText("Quantidade estoque");

        lbInicial.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbInicial.setForeground(new java.awt.Color(102, 102, 102));
        lbInicial.setText("(inicial)");

        tfEstoque.setForeground(new java.awt.Color(102, 102, 102));
        tfEstoque.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("########.##"))));
        tfEstoque.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        lbCategoria.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbCategoria.setForeground(new java.awt.Color(0, 102, 205));
        lbCategoria.setText("categoria");

        lbOpcional2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbOpcional2.setForeground(new java.awt.Color(102, 102, 102));
        lbOpcional2.setText("(Opcional)");

        cbCategoria.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbCategoria.setForeground(new java.awt.Color(102, 102, 102));
        cbCategoria.setModel(new javax.swing.DefaultComboBoxModel(produtoBO.buscarNomeCategorias()));
        cbCategoria.setFocusable(false);

        lbFornecedor.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbFornecedor.setForeground(new java.awt.Color(0, 102, 205));
        lbFornecedor.setText("fornecedor");

        lbOpcional3.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        lbOpcional3.setForeground(new java.awt.Color(102, 102, 102));
        lbOpcional3.setText("(Opcional)");

        cbFornecedor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        cbFornecedor.setForeground(new java.awt.Color(102, 102, 102));
        cbFornecedor.setModel(new javax.swing.DefaultComboBoxModel(produtoBO.buscarNomeFornecedores()));
        cbFornecedor.setFocusable(false);

        javax.swing.GroupLayout pnProdutoLayout = new javax.swing.GroupLayout(pnProduto);
        pnProduto.setLayout(pnProdutoLayout);
        pnProdutoLayout.setHorizontalGroup(
            pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnProdutoLayout.createSequentialGroup()
                        .addGroup(pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbMinimo)
                            .addComponent(lbCodigo)
                            .addComponent(tfCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(tfMinimo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbMaximo)
                            .addComponent(lbValorCusto)
                            .addComponent(tfValorCusto)
                            .addComponent(tfMaximo, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfEstoque)
                            .addGroup(pnProdutoLayout.createSequentialGroup()
                                .addGroup(pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbValorVenda)
                                    .addGroup(pnProdutoLayout.createSequentialGroup()
                                        .addComponent(lbEstoque)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbInicial)))
                                .addGap(0, 30, Short.MAX_VALUE))
                            .addComponent(tfValorVenda)))
                    .addGroup(pnProdutoLayout.createSequentialGroup()
                        .addGroup(pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnProdutoLayout.createSequentialGroup()
                                .addComponent(lbCategoria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbOpcional2))
                            .addGroup(pnProdutoLayout.createSequentialGroup()
                                .addComponent(lbFornecedor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbOpcional3)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(cbFornecedor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbCategoria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnProdutoLayout.setVerticalGroup(
            pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbValorCusto)
                    .addComponent(lbValorVenda)
                    .addComponent(lbCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfValorCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMaximo)
                    .addComponent(lbEstoque)
                    .addComponent(lbMinimo)
                    .addComponent(lbInicial))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfMaximo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCategoria)
                    .addComponent(lbOpcional2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFornecedor)
                    .addComponent(lbOpcional3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

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

        javax.swing.GroupLayout pnCorpoLayout = new javax.swing.GroupLayout(pnCorpo);
        pnCorpo.setLayout(pnCorpoLayout);
        pnCorpoLayout.setHorizontalGroup(
            pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnObrigatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(sprRodape, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnCorpoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCorpoLayout.createSequentialGroup()
                        .addComponent(btnCadastrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterar))
                    .addGroup(pnCorpoLayout.createSequentialGroup()
                        .addComponent(lbProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbOpcional1)))
                .addContainerGap())
        );
        pnCorpoLayout.setVerticalGroup(
            pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCorpoLayout.createSequentialGroup()
                .addComponent(pnObrigatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbProduto)
                    .addComponent(lbOpcional1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sprRodape, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCadastrar)
                    .addComponent(btnAlterar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnCorpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(pnCorpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @see Método que responde ao clique do JButton e verifica se os campos
     * estão preenchidos para inserir um novo Produto.
     * @param evt
     */
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        btnCadastrar.setEnabled(false);
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        produtoBO = new ProdutoBO();
        if (produtoBO.validarCampos(pnObrigatorio)) {
            if (produtoBO.inserirProduto(cbCategoria.getSelectedIndex(), cbFornecedor.getSelectedIndex(), tfDescricao.getText(), tfCodigo.getText(), tfValorCusto.getText(), tfValorVenda.getText(), tfMinimo.getText(), tfMaximo.getText(), tfEstoque.getText())) {
                viewPainelControle.atualizarTabelas();
                this.dispose();
            }
        }
        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        btnCadastrar.setEnabled(true);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    /**
     * @see Método que responde ao clique do JButton e verifica se os campos
     * estão preenchidos para alterar um novo Produto.
     * @param evt
     */
    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        btnCadastrar.setEnabled(false);
        this.setCursor(Cursor.getPredefinedCursor(Cursor.WAIT_CURSOR));
        produtoBO = new ProdutoBO();
        if (produtoBO.validarCampos(pnObrigatorio)) {
            if (produtoBO.alterarProduto(produtoVO.getIdProduto(), cbCategoria.getSelectedIndex(), cbFornecedor.getSelectedIndex(), tfDescricao.getText(), tfCodigo.getText(), tfValorCusto.getText(), tfValorVenda.getText(), tfMinimo.getText(), tfMaximo.getText(), tfEstoque.getText())) {
                viewPainelControle.atualizarTabelas();
                this.dispose();
            }
        }
        this.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
        btnCadastrar.setEnabled(true);
    }//GEN-LAST:event_btnAlterarActionPerformed

    //Declaração de variáveis(View).
    private final ViewPainelControle viewPainelControle;

    //Declaração de variáveis(Value Object).
    private Produto produtoVO;

    //Declaração de variáveis(Business Object).
    private ProdutoBO produtoBO;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
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
    private javax.swing.JPanel pnProduto;
    private javax.swing.JPanel pnTitulo;
    private javax.swing.JSeparator sprRodape;
    private javax.swing.JFormattedTextField tfCodigo;
    private javax.swing.JFormattedTextField tfDescricao;
    private javax.swing.JFormattedTextField tfEstoque;
    private javax.swing.JFormattedTextField tfMaximo;
    private javax.swing.JFormattedTextField tfMinimo;
    private javax.swing.JFormattedTextField tfValorCusto;
    private javax.swing.JFormattedTextField tfValorVenda;
    // End of variables declaration//GEN-END:variables
}
