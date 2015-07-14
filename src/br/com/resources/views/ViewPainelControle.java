package br.com.resources.views;

import br.com.models.bo.PainelControleBO;
import br.com.models.tabelas.TableModelCategoria;
import br.com.models.tabelas.TableModelCliente;
import br.com.models.tabelas.TableModelFornecedor;
import br.com.models.tabelas.TableModelProduto;
import br.com.models.tabelas.TableModelUsuario;
import java.awt.Color;
import java.awt.Font;

/**
 *
 * @see Classe visual. JInternalFrame que tem como objetivo gerenciar todos os
 * registros padrões do sistema.
 *
 * @author Bruna Danieli Ribeiro Gonçalves, Márlon Ândrel Coelho Freitas
 */
public class ViewPainelControle extends javax.swing.JInternalFrame {

    /**
     *
     * @see Construtor padrão.
     */
    public ViewPainelControle() {
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
    public ViewPainelControle(ViewPrincipal viewPrincipal) {
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
     *
     * @see Método que Instancia a classe PainelControleBO para realizar buscas
     * de Objetos de valores que compoem os modelos de tabelas.
     */
    public final void atualizarTabelas() {
        //Inicialização dos modelos de tabelas.
        painelControleBO = new PainelControleBO();
        tabelaUsuario = new TableModelUsuario(painelControleBO.buscarUsuarios());
        tabelaCliente = new TableModelCliente(painelControleBO.buscarClientes());
        tabelaFornecedor = new TableModelFornecedor(painelControleBO.buscarFornecedores());
        tabelaCategoria = new TableModelCategoria(painelControleBO.buscarCategorias());
        tabelaProduto = new TableModelProduto(painelControleBO.buscarProdutos());

        //Definindo modelo de tabelas para as tabelas.
        tbUsuarios.setModel(tabelaUsuario);
        tbClientes.setModel(tabelaCliente);
        tbFornecedores.setModel(tabelaFornecedor);
        tbCategorias.setModel(tabelaCategoria);
        tbProdutos.setModel(tabelaProduto);

        //Definir tabelas como sem seleção.
        tbUsuarios.clearSelection();
        tbClientes.clearSelection();
        tbFornecedores.clearSelection();
        tbCategorias.clearSelection();
        tbProdutos.clearSelection();

        //Definindo botões Aleterar e Excluir como não habilitado.
        btnAlterarUsuario.setEnabled(false);
        btnExcluirUsuario.setEnabled(false);
        btnAlterarCliente.setEnabled(false);
        btnExcluirCliente.setEnabled(false);
        btnAlterarFornecedor.setEnabled(false);
        btnExcluirFornecedor.setEnabled(false);
        btnAlterarCategoria.setEnabled(false);
        btnExcluirCategoria.setEnabled(false);
        btnAlterarProduto.setEnabled(false);
        btnExcluirProduto.setEnabled(false);
    }

    //Componentes padrões do JFrame
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tpnCorpo = new javax.swing.JTabbedPane();
        pnUsuario = new javax.swing.JPanel();
        btnNovoUsuario = new javax.swing.JButton();
        btnAlterarUsuario = new javax.swing.JButton();
        btnExcluirUsuario = new javax.swing.JButton();
        pnBuscarUsuario = new javax.swing.JPanel();
        tfBuscarUsuario = new javax.swing.JTextField();
        btnBuscarUsuario = new javax.swing.JButton();
        lbResultadosUsuario = new javax.swing.JLabel();
        spnUsuario = new javax.swing.JScrollPane();
        tbUsuarios = new javax.swing.JTable();
        pnCliente = new javax.swing.JPanel();
        btnNovoCliente = new javax.swing.JButton();
        btnAlterarCliente = new javax.swing.JButton();
        btnExcluirCliente = new javax.swing.JButton();
        pnBuscarCliente = new javax.swing.JPanel();
        tfBuscarCliente = new javax.swing.JTextField();
        btnBuscarCliente = new javax.swing.JButton();
        lbResultadosCliente = new javax.swing.JLabel();
        spnClientes = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        pnFornecedor = new javax.swing.JPanel();
        btnNovoFornecedor = new javax.swing.JButton();
        btnAlterarFornecedor = new javax.swing.JButton();
        btnExcluirFornecedor = new javax.swing.JButton();
        pnBuscarFornecedor = new javax.swing.JPanel();
        tfBuscarFornecedor = new javax.swing.JTextField();
        btnBuscarFornecedor = new javax.swing.JButton();
        lbResultadosFornecedor = new javax.swing.JLabel();
        spnFornecedores = new javax.swing.JScrollPane();
        tbFornecedores = new javax.swing.JTable();
        pnCategoria = new javax.swing.JPanel();
        btnNovaCategoria = new javax.swing.JButton();
        btnAlterarCategoria = new javax.swing.JButton();
        btnExcluirCategoria = new javax.swing.JButton();
        pnBuscarCategoria = new javax.swing.JPanel();
        tfBuscarCategoria = new javax.swing.JTextField();
        btnBuscarCategoria = new javax.swing.JButton();
        lbResultadosCategoria = new javax.swing.JLabel();
        spnCategorias = new javax.swing.JScrollPane();
        tbCategorias = new javax.swing.JTable();
        pnProduto = new javax.swing.JPanel();
        btnNovoProduto = new javax.swing.JButton();
        btnAlterarProduto = new javax.swing.JButton();
        btnExcluirProduto = new javax.swing.JButton();
        pnBuscarProduto = new javax.swing.JPanel();
        tfBuscarProduto = new javax.swing.JTextField();
        btnBuscarProduto = new javax.swing.JButton();
        lbResultadosProduto = new javax.swing.JLabel();
        spnProdutos = new javax.swing.JScrollPane();
        tbProdutos = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setResizable(true);
        setFocusable(false);
        setFrameIcon(null);

        jScrollPane1.setBorder(null);

        tpnCorpo.setForeground(new java.awt.Color(102, 102, 102));
        tpnCorpo.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tpnCorpo.setFocusable(false);
        tpnCorpo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        pnUsuario.setBackground(new java.awt.Color(255, 255, 255));
        pnUsuario.setPreferredSize(new java.awt.Dimension(642, 315));

        btnNovoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnNovoUsuarioUP.png"))); // NOI18N
        btnNovoUsuario.setBorder(null);
        btnNovoUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovoUsuario.setFocusable(false);
        btnNovoUsuario.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnNovoUsuarioDOWN.png"))); // NOI18N
        btnNovoUsuario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnNovoUsuarioDOWN.png"))); // NOI18N
        btnNovoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoUsuarioActionPerformed(evt);
            }
        });

        btnAlterarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarUP.png"))); // NOI18N
        btnAlterarUsuario.setBorder(null);
        btnAlterarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterarUsuario.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N
        btnAlterarUsuario.setFocusable(false);
        btnAlterarUsuario.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N
        btnAlterarUsuario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N
        btnAlterarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarUsuarioActionPerformed(evt);
            }
        });

        btnExcluirUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirUP.png"))); // NOI18N
        btnExcluirUsuario.setBorder(null);
        btnExcluirUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluirUsuario.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirDOWN.png"))); // NOI18N
        btnExcluirUsuario.setFocusable(false);
        btnExcluirUsuario.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirDOWN.png"))); // NOI18N
        btnExcluirUsuario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirDOWN.png"))); // NOI18N
        btnExcluirUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirUsuarioActionPerformed(evt);
            }
        });

        pnBuscarUsuario.setBackground(new java.awt.Color(255, 255, 255));

        tfBuscarUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfBuscarUsuario.setForeground(new java.awt.Color(102, 102, 102));
        tfBuscarUsuario.setText("Pesquisa");
        tfBuscarUsuario.setPreferredSize(new java.awt.Dimension(59, 19));

        btnBuscarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnBuscarUP.png"))); // NOI18N
        btnBuscarUsuario.setBorder(null);
        btnBuscarUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarUsuario.setFocusable(false);
        btnBuscarUsuario.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnBuscarDOWN.png"))); // NOI18N
        btnBuscarUsuario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnBuscarDOWN.png"))); // NOI18N

        javax.swing.GroupLayout pnBuscarUsuarioLayout = new javax.swing.GroupLayout(pnBuscarUsuario);
        pnBuscarUsuario.setLayout(pnBuscarUsuarioLayout);
        pnBuscarUsuarioLayout.setHorizontalGroup(
            pnBuscarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBuscarUsuarioLayout.createSequentialGroup()
                .addComponent(tfBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnBuscarUsuario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnBuscarUsuarioLayout.setVerticalGroup(
            pnBuscarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBuscarUsuarioLayout.createSequentialGroup()
                .addComponent(btnBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnBuscarUsuarioLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(tfBuscarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        lbResultadosUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbResultadosUsuario.setForeground(new java.awt.Color(102, 102, 102));
        lbResultadosUsuario.setText("0 resultados, mostrando todos.");

        spnUsuario.setBackground(new java.awt.Color(255, 255, 255));
        spnUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        spnUsuario.setForeground(new java.awt.Color(102, 102, 102));
        spnUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        tbUsuarios.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tbUsuarios.setForeground(new java.awt.Color(102, 102, 102));
        tbUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbUsuarios.setFocusable(false);
        tbUsuarios.setGridColor(new java.awt.Color(204, 204, 204));
        tbUsuarios.setIntercellSpacing(new java.awt.Dimension(0, 1));
        tbUsuarios.setRowHeight(30);
        tbUsuarios.setSelectionBackground(new java.awt.Color(95, 180, 25));
        tbUsuarios.setShowVerticalLines(false);
        tbUsuarios.getTableHeader().setReorderingAllowed(false);
        tbUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbUsuariosMouseClicked(evt);
            }
        });
        spnUsuario.setViewportView(tbUsuarios);
        cabecalho = tbUsuarios.getTableHeader();
        cabecalho.setFont(new Font("Arial", Font.PLAIN, 12));
        cabecalho.setForeground(new Color(102,102,102));

        javax.swing.GroupLayout pnUsuarioLayout = new javax.swing.GroupLayout(pnUsuario);
        pnUsuario.setLayout(pnUsuarioLayout);
        pnUsuarioLayout.setHorizontalGroup(
            pnUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnUsuarioLayout.createSequentialGroup()
                        .addGroup(pnUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spnUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
                            .addGroup(pnUsuarioLayout.createSequentialGroup()
                                .addComponent(lbResultadosUsuario)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(pnUsuarioLayout.createSequentialGroup()
                        .addComponent(btnNovoUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterarUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        pnUsuarioLayout.setVerticalGroup(
            pnUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNovoUsuario)
                        .addComponent(btnAlterarUsuario)
                        .addComponent(btnExcluirUsuario))
                    .addComponent(pnBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbResultadosUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addContainerGap())
        );

        tpnCorpo.addTab("Usuário        ", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/usuario.png")), pnUsuario); // NOI18N

        pnCliente.setBackground(new java.awt.Color(255, 255, 255));
        pnCliente.setPreferredSize(new java.awt.Dimension(642, 315));

        btnNovoCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnNovoClienteUP.png"))); // NOI18N
        btnNovoCliente.setBorder(null);
        btnNovoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovoCliente.setFocusable(false);
        btnNovoCliente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnNovoClienteDOWN.png"))); // NOI18N
        btnNovoCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnNovoClienteDOWN.png"))); // NOI18N
        btnNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoClienteActionPerformed(evt);
            }
        });

        btnAlterarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarUP.png"))); // NOI18N
        btnAlterarCliente.setBorder(null);
        btnAlterarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterarCliente.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N
        btnAlterarCliente.setFocusable(false);
        btnAlterarCliente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N
        btnAlterarCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N
        btnAlterarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarClienteActionPerformed(evt);
            }
        });

        btnExcluirCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirUP.png"))); // NOI18N
        btnExcluirCliente.setBorder(null);
        btnExcluirCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluirCliente.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirDOWN.png"))); // NOI18N
        btnExcluirCliente.setFocusable(false);
        btnExcluirCliente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirDOWN.png"))); // NOI18N
        btnExcluirCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirDOWN.png"))); // NOI18N
        btnExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirClienteActionPerformed(evt);
            }
        });

        pnBuscarCliente.setBackground(new java.awt.Color(255, 255, 255));

        tfBuscarCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfBuscarCliente.setForeground(new java.awt.Color(102, 102, 102));
        tfBuscarCliente.setText("Pesquisa");
        tfBuscarCliente.setPreferredSize(new java.awt.Dimension(59, 19));

        btnBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnBuscarUP.png"))); // NOI18N
        btnBuscarCliente.setBorder(null);
        btnBuscarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarCliente.setFocusable(false);
        btnBuscarCliente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnBuscarDOWN.png"))); // NOI18N
        btnBuscarCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnBuscarDOWN.png"))); // NOI18N

        javax.swing.GroupLayout pnBuscarClienteLayout = new javax.swing.GroupLayout(pnBuscarCliente);
        pnBuscarCliente.setLayout(pnBuscarClienteLayout);
        pnBuscarClienteLayout.setHorizontalGroup(
            pnBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBuscarClienteLayout.createSequentialGroup()
                .addComponent(tfBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnBuscarCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnBuscarClienteLayout.setVerticalGroup(
            pnBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBuscarClienteLayout.createSequentialGroup()
                .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnBuscarClienteLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(tfBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        lbResultadosCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbResultadosCliente.setForeground(new java.awt.Color(102, 102, 102));
        lbResultadosCliente.setText("0 resultados, mostrando todos.");

        spnClientes.setBackground(new java.awt.Color(255, 255, 255));
        spnClientes.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        spnClientes.setForeground(new java.awt.Color(102, 102, 102));
        spnClientes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        tbClientes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tbClientes.setForeground(new java.awt.Color(102, 102, 102));
        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbClientes.setFocusable(false);
        tbClientes.setGridColor(new java.awt.Color(204, 204, 204));
        tbClientes.setIntercellSpacing(new java.awt.Dimension(0, 1));
        tbClientes.setRowHeight(30);
        tbClientes.setSelectionBackground(new java.awt.Color(95, 180, 25));
        tbClientes.setShowVerticalLines(false);
        tbClientes.getTableHeader().setReorderingAllowed(false);
        tbClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbClientesMouseClicked(evt);
            }
        });
        spnClientes.setViewportView(tbClientes);
        if (tbClientes.getColumnModel().getColumnCount() > 0) {
            tbClientes.getColumnModel().getColumn(2).setHeaderValue("Categoria");
            tbClientes.getColumnModel().getColumn(3).setHeaderValue("Fornecedor");
            tbClientes.getColumnModel().getColumn(4).setHeaderValue("Valor");
            tbClientes.getColumnModel().getColumn(5).setHeaderValue("Quantidade Min");
        }
        cabecalho = tbClientes.getTableHeader();
        cabecalho.setFont(new Font("Arial", Font.PLAIN, 12));
        cabecalho.setForeground(new Color(102,102,102));

        javax.swing.GroupLayout pnClienteLayout = new javax.swing.GroupLayout(pnCliente);
        pnCliente.setLayout(pnClienteLayout);
        pnClienteLayout.setHorizontalGroup(
            pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnClienteLayout.createSequentialGroup()
                        .addComponent(lbResultadosCliente)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnClienteLayout.createSequentialGroup()
                        .addComponent(spnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(pnClienteLayout.createSequentialGroup()
                        .addComponent(btnNovoCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        pnClienteLayout.setVerticalGroup(
            pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNovoCliente)
                        .addComponent(btnAlterarCliente)
                        .addComponent(btnExcluirCliente))
                    .addComponent(pnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbResultadosCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addContainerGap())
        );

        tpnCorpo.addTab("Cliente         ", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/cliente.png")), pnCliente); // NOI18N

        pnFornecedor.setBackground(new java.awt.Color(255, 255, 255));
        pnFornecedor.setPreferredSize(new java.awt.Dimension(642, 315));

        btnNovoFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnNovoFornecedorUP.png"))); // NOI18N
        btnNovoFornecedor.setBorder(null);
        btnNovoFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovoFornecedor.setFocusable(false);
        btnNovoFornecedor.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnNovoFornecedorDOWN.png"))); // NOI18N
        btnNovoFornecedor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnNovoFornecedorDOWN.png"))); // NOI18N
        btnNovoFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoFornecedorActionPerformed(evt);
            }
        });

        btnAlterarFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarUP.png"))); // NOI18N
        btnAlterarFornecedor.setBorder(null);
        btnAlterarFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterarFornecedor.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N
        btnAlterarFornecedor.setFocusable(false);
        btnAlterarFornecedor.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N
        btnAlterarFornecedor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N
        btnAlterarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarFornecedorActionPerformed(evt);
            }
        });

        btnExcluirFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirUP.png"))); // NOI18N
        btnExcluirFornecedor.setBorder(null);
        btnExcluirFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluirFornecedor.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirDOWN.png"))); // NOI18N
        btnExcluirFornecedor.setFocusable(false);
        btnExcluirFornecedor.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirDOWN.png"))); // NOI18N
        btnExcluirFornecedor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirDOWN.png"))); // NOI18N
        btnExcluirFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirFornecedorActionPerformed(evt);
            }
        });

        pnBuscarFornecedor.setBackground(new java.awt.Color(255, 255, 255));

        tfBuscarFornecedor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfBuscarFornecedor.setForeground(new java.awt.Color(102, 102, 102));
        tfBuscarFornecedor.setText("Pesquisa");
        tfBuscarFornecedor.setPreferredSize(new java.awt.Dimension(59, 19));

        btnBuscarFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnBuscarUP.png"))); // NOI18N
        btnBuscarFornecedor.setBorder(null);
        btnBuscarFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarFornecedor.setFocusable(false);
        btnBuscarFornecedor.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnBuscarDOWN.png"))); // NOI18N
        btnBuscarFornecedor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnBuscarDOWN.png"))); // NOI18N

        javax.swing.GroupLayout pnBuscarFornecedorLayout = new javax.swing.GroupLayout(pnBuscarFornecedor);
        pnBuscarFornecedor.setLayout(pnBuscarFornecedorLayout);
        pnBuscarFornecedorLayout.setHorizontalGroup(
            pnBuscarFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBuscarFornecedorLayout.createSequentialGroup()
                .addComponent(tfBuscarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnBuscarFornecedor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnBuscarFornecedorLayout.setVerticalGroup(
            pnBuscarFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBuscarFornecedorLayout.createSequentialGroup()
                .addComponent(btnBuscarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnBuscarFornecedorLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(tfBuscarFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        lbResultadosFornecedor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbResultadosFornecedor.setForeground(new java.awt.Color(102, 102, 102));
        lbResultadosFornecedor.setText("0 resultados, mostrando todos.");

        spnFornecedores.setBackground(new java.awt.Color(255, 255, 255));
        spnFornecedores.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        spnFornecedores.setForeground(new java.awt.Color(102, 102, 102));
        spnFornecedores.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        tbFornecedores.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tbFornecedores.setForeground(new java.awt.Color(102, 102, 102));
        tbFornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbFornecedores.setFocusable(false);
        tbFornecedores.setGridColor(new java.awt.Color(204, 204, 204));
        tbFornecedores.setIntercellSpacing(new java.awt.Dimension(0, 1));
        tbFornecedores.setRowHeight(30);
        tbFornecedores.setSelectionBackground(new java.awt.Color(95, 180, 25));
        tbFornecedores.setShowVerticalLines(false);
        tbFornecedores.getTableHeader().setReorderingAllowed(false);
        tbFornecedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbFornecedoresMouseClicked(evt);
            }
        });
        spnFornecedores.setViewportView(tbFornecedores);
        if (tbFornecedores.getColumnModel().getColumnCount() > 0) {
            tbFornecedores.getColumnModel().getColumn(2).setHeaderValue("Categoria");
        }
        cabecalho = tbFornecedores.getTableHeader();
        cabecalho.setFont(new Font("Arial", Font.PLAIN, 12));
        cabecalho.setForeground(new Color(102,102,102));

        javax.swing.GroupLayout pnFornecedorLayout = new javax.swing.GroupLayout(pnFornecedor);
        pnFornecedor.setLayout(pnFornecedorLayout);
        pnFornecedorLayout.setHorizontalGroup(
            pnFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFornecedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFornecedorLayout.createSequentialGroup()
                        .addComponent(lbResultadosFornecedor)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnFornecedorLayout.createSequentialGroup()
                        .addComponent(spnFornecedores, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(pnFornecedorLayout.createSequentialGroup()
                        .addComponent(btnNovoFornecedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterarFornecedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirFornecedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnBuscarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        pnFornecedorLayout.setVerticalGroup(
            pnFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnFornecedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNovoFornecedor)
                        .addComponent(btnAlterarFornecedor)
                        .addComponent(btnExcluirFornecedor))
                    .addComponent(pnBuscarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbResultadosFornecedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnFornecedores, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addContainerGap())
        );

        tpnCorpo.addTab("Fornecedor", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/fornecedor.png")), pnFornecedor); // NOI18N

        pnCategoria.setBackground(new java.awt.Color(255, 255, 255));
        pnCategoria.setPreferredSize(new java.awt.Dimension(642, 315));

        btnNovaCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnNovaCategoriaUP.png"))); // NOI18N
        btnNovaCategoria.setBorder(null);
        btnNovaCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovaCategoria.setFocusable(false);
        btnNovaCategoria.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnNovaCategoriaDOWN.png"))); // NOI18N
        btnNovaCategoria.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnNovaCategoriaDOWN.png"))); // NOI18N
        btnNovaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovaCategoriaActionPerformed(evt);
            }
        });

        btnAlterarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarUP.png"))); // NOI18N
        btnAlterarCategoria.setBorder(null);
        btnAlterarCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterarCategoria.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N
        btnAlterarCategoria.setFocusable(false);
        btnAlterarCategoria.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N
        btnAlterarCategoria.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N
        btnAlterarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarCategoriaActionPerformed(evt);
            }
        });

        btnExcluirCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirUP.png"))); // NOI18N
        btnExcluirCategoria.setBorder(null);
        btnExcluirCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluirCategoria.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirDOWN.png"))); // NOI18N
        btnExcluirCategoria.setFocusable(false);
        btnExcluirCategoria.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirDOWN.png"))); // NOI18N
        btnExcluirCategoria.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirDOWN.png"))); // NOI18N
        btnExcluirCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCategoriaActionPerformed(evt);
            }
        });

        pnBuscarCategoria.setBackground(new java.awt.Color(255, 255, 255));

        tfBuscarCategoria.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfBuscarCategoria.setForeground(new java.awt.Color(102, 102, 102));
        tfBuscarCategoria.setText("Pesquisa");
        tfBuscarCategoria.setPreferredSize(new java.awt.Dimension(59, 19));

        btnBuscarCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnBuscarUP.png"))); // NOI18N
        btnBuscarCategoria.setBorder(null);
        btnBuscarCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarCategoria.setFocusable(false);
        btnBuscarCategoria.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnBuscarDOWN.png"))); // NOI18N
        btnBuscarCategoria.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnBuscarDOWN.png"))); // NOI18N

        javax.swing.GroupLayout pnBuscarCategoriaLayout = new javax.swing.GroupLayout(pnBuscarCategoria);
        pnBuscarCategoria.setLayout(pnBuscarCategoriaLayout);
        pnBuscarCategoriaLayout.setHorizontalGroup(
            pnBuscarCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBuscarCategoriaLayout.createSequentialGroup()
                .addComponent(tfBuscarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnBuscarCategoria)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnBuscarCategoriaLayout.setVerticalGroup(
            pnBuscarCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBuscarCategoriaLayout.createSequentialGroup()
                .addComponent(btnBuscarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnBuscarCategoriaLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(tfBuscarCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        lbResultadosCategoria.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbResultadosCategoria.setForeground(new java.awt.Color(102, 102, 102));
        lbResultadosCategoria.setText("0 resultados, mostrando todos.");

        spnCategorias.setBackground(new java.awt.Color(255, 255, 255));
        spnCategorias.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        spnCategorias.setForeground(new java.awt.Color(102, 102, 102));
        spnCategorias.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        tbCategorias.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tbCategorias.setForeground(new java.awt.Color(102, 102, 102));
        tbCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbCategorias.setFocusable(false);
        tbCategorias.setGridColor(new java.awt.Color(204, 204, 204));
        tbCategorias.setIntercellSpacing(new java.awt.Dimension(0, 1));
        tbCategorias.setRowHeight(30);
        tbCategorias.setSelectionBackground(new java.awt.Color(95, 180, 25));
        tbCategorias.setShowVerticalLines(false);
        tbCategorias.getTableHeader().setReorderingAllowed(false);
        tbCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbCategoriasMouseClicked(evt);
            }
        });
        spnCategorias.setViewportView(tbCategorias);
        cabecalho = tbCategorias.getTableHeader();
        cabecalho.setFont(new Font("Arial", Font.PLAIN, 12));
        cabecalho.setForeground(new Color(102,102,102));

        javax.swing.GroupLayout pnCategoriaLayout = new javax.swing.GroupLayout(pnCategoria);
        pnCategoria.setLayout(pnCategoriaLayout);
        pnCategoriaLayout.setHorizontalGroup(
            pnCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCategoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnCategoriaLayout.createSequentialGroup()
                        .addComponent(lbResultadosCategoria)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCategoriaLayout.createSequentialGroup()
                        .addComponent(spnCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(pnCategoriaLayout.createSequentialGroup()
                        .addComponent(btnNovaCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterarCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnBuscarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        pnCategoriaLayout.setVerticalGroup(
            pnCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCategoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNovaCategoria)
                        .addComponent(btnAlterarCategoria)
                        .addComponent(btnExcluirCategoria))
                    .addComponent(pnBuscarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbResultadosCategoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addContainerGap())
        );

        tpnCorpo.addTab("Categoria    ", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/categoria.png")), pnCategoria); // NOI18N

        pnProduto.setBackground(new java.awt.Color(255, 255, 255));
        pnProduto.setPreferredSize(new java.awt.Dimension(642, 315));

        btnNovoProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnNovoProdutoUP.png"))); // NOI18N
        btnNovoProduto.setBorder(null);
        btnNovoProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovoProduto.setFocusable(false);
        btnNovoProduto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnNovoProdutoDOWN.png"))); // NOI18N
        btnNovoProduto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnNovoProdutoDOWN.png"))); // NOI18N
        btnNovoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoProdutoActionPerformed(evt);
            }
        });

        btnAlterarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarUP.png"))); // NOI18N
        btnAlterarProduto.setBorder(null);
        btnAlterarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterarProduto.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N
        btnAlterarProduto.setFocusable(false);
        btnAlterarProduto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N
        btnAlterarProduto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N
        btnAlterarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarProdutoActionPerformed(evt);
            }
        });

        btnExcluirProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirUP.png"))); // NOI18N
        btnExcluirProduto.setBorder(null);
        btnExcluirProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluirProduto.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirDOWN.png"))); // NOI18N
        btnExcluirProduto.setFocusable(false);
        btnExcluirProduto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirDOWN.png"))); // NOI18N
        btnExcluirProduto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirDOWN.png"))); // NOI18N
        btnExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirProdutoActionPerformed(evt);
            }
        });

        pnBuscarProduto.setBackground(new java.awt.Color(255, 255, 255));

        tfBuscarProduto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfBuscarProduto.setForeground(new java.awt.Color(102, 102, 102));
        tfBuscarProduto.setText("Pesquisa");
        tfBuscarProduto.setPreferredSize(new java.awt.Dimension(59, 19));

        btnBuscarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnBuscarUP.png"))); // NOI18N
        btnBuscarProduto.setBorder(null);
        btnBuscarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBuscarProduto.setFocusable(false);
        btnBuscarProduto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnBuscarDOWN.png"))); // NOI18N
        btnBuscarProduto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnBuscarDOWN.png"))); // NOI18N

        javax.swing.GroupLayout pnBuscarProdutoLayout = new javax.swing.GroupLayout(pnBuscarProduto);
        pnBuscarProduto.setLayout(pnBuscarProdutoLayout);
        pnBuscarProdutoLayout.setHorizontalGroup(
            pnBuscarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBuscarProdutoLayout.createSequentialGroup()
                .addComponent(tfBuscarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnBuscarProduto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnBuscarProdutoLayout.setVerticalGroup(
            pnBuscarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBuscarProdutoLayout.createSequentialGroup()
                .addComponent(btnBuscarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnBuscarProdutoLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(tfBuscarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        lbResultadosProduto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbResultadosProduto.setForeground(new java.awt.Color(102, 102, 102));
        lbResultadosProduto.setText("0 resultados, mostrando todos.");

        spnProdutos.setBackground(new java.awt.Color(255, 255, 255));
        spnProdutos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        spnProdutos.setForeground(new java.awt.Color(102, 102, 102));
        spnProdutos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        tbProdutos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tbProdutos.setForeground(new java.awt.Color(102, 102, 102));
        tbProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbProdutos.setFocusable(false);
        tbProdutos.setGridColor(new java.awt.Color(204, 204, 204));
        tbProdutos.setIntercellSpacing(new java.awt.Dimension(0, 1));
        tbProdutos.setRowHeight(30);
        tbProdutos.setSelectionBackground(new java.awt.Color(95, 180, 25));
        tbProdutos.setShowVerticalLines(false);
        tbProdutos.getTableHeader().setReorderingAllowed(false);
        tbProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbProdutosMouseClicked(evt);
            }
        });
        spnProdutos.setViewportView(tbProdutos);
        if (tbProdutos.getColumnModel().getColumnCount() > 0) {
            tbProdutos.getColumnModel().getColumn(2).setHeaderValue("Categoria");
            tbProdutos.getColumnModel().getColumn(3).setHeaderValue("Fornecedor");
            tbProdutos.getColumnModel().getColumn(4).setHeaderValue("Valor");
            tbProdutos.getColumnModel().getColumn(5).setHeaderValue("Quantidade Min");
            tbProdutos.getColumnModel().getColumn(6).setHeaderValue("Criação");
            tbProdutos.getColumnModel().getColumn(7).setHeaderValue("Atualização");
        }
        cabecalho = tbProdutos.getTableHeader();
        cabecalho.setFont(new Font("Arial", Font.PLAIN, 12));
        cabecalho.setForeground(new Color(102,102,102));

        javax.swing.GroupLayout pnProdutoLayout = new javax.swing.GroupLayout(pnProduto);
        pnProduto.setLayout(pnProdutoLayout);
        pnProdutoLayout.setHorizontalGroup(
            pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnProdutoLayout.createSequentialGroup()
                        .addComponent(lbResultadosProduto)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnProdutoLayout.createSequentialGroup()
                        .addComponent(spnProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(pnProdutoLayout.createSequentialGroup()
                        .addComponent(btnNovoProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterarProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnBuscarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        pnProdutoLayout.setVerticalGroup(
            pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNovoProduto)
                        .addComponent(btnAlterarProduto)
                        .addComponent(btnExcluirProduto))
                    .addComponent(pnBuscarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbResultadosProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addContainerGap())
        );

        tpnCorpo.addTab("Produto       ", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/produto.png")), pnProduto); // NOI18N

        jScrollPane1.setViewportView(tpnCorpo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoUsuarioActionPerformed
        viewUsuario = new ViewUsuario(viewPrincipal, true);
        viewUsuario.setVisible(true);
    }//GEN-LAST:event_btnNovoUsuarioActionPerformed

    private void btnNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoClienteActionPerformed
        viewCliente = new ViewCliente(viewPrincipal, true);
        viewCliente.setVisible(true);
    }//GEN-LAST:event_btnNovoClienteActionPerformed

    private void btnNovoFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoFornecedorActionPerformed
        viewFornecedor = new ViewFornecedor(viewPrincipal, true);
        viewFornecedor.setVisible(true);
    }//GEN-LAST:event_btnNovoFornecedorActionPerformed

    private void btnNovaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovaCategoriaActionPerformed
        viewCategoria = new ViewCategoria(viewPrincipal, true);
        viewCategoria.setVisible(true);
    }//GEN-LAST:event_btnNovaCategoriaActionPerformed

    private void btnNovoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoProdutoActionPerformed
        viewProduto = new ViewProduto(viewPrincipal, true);
        viewProduto.setVisible(true);
    }//GEN-LAST:event_btnNovoProdutoActionPerformed

    private void tbUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbUsuariosMouseClicked
        if (tbUsuarios.getSelectedRow() != -1) {
            btnAlterarUsuario.setEnabled(true);
            btnExcluirUsuario.setEnabled(true);
        }
    }//GEN-LAST:event_tbUsuariosMouseClicked

    private void tbClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbClientesMouseClicked
        if (tbClientes.getSelectedRow() != -1) {
            btnAlterarCliente.setEnabled(true);
            btnExcluirCliente.setEnabled(true);
        }
    }//GEN-LAST:event_tbClientesMouseClicked

    private void tbFornecedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbFornecedoresMouseClicked
        if (tbFornecedores.getSelectedRow() != -1) {
            btnAlterarFornecedor.setEnabled(true);
            btnExcluirFornecedor.setEnabled(true);
        }
    }//GEN-LAST:event_tbFornecedoresMouseClicked

    private void tbCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbCategoriasMouseClicked
        if (tbCategorias.getSelectedRow() != -1) {
            btnAlterarCategoria.setEnabled(true);
            btnExcluirCategoria.setEnabled(true);
        }
    }//GEN-LAST:event_tbCategoriasMouseClicked

    private void tbProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProdutosMouseClicked
        if (tbProdutos.getSelectedRow() != -1) {
            btnAlterarProduto.setEnabled(true);
            btnExcluirProduto.setEnabled(true);
        }
    }//GEN-LAST:event_tbProdutosMouseClicked

    private void btnAlterarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarUsuarioActionPerformed

    private void btnAlterarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarClienteActionPerformed

    private void btnAlterarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarFornecedorActionPerformed

    private void btnAlterarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarCategoriaActionPerformed

    private void btnAlterarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarProdutoActionPerformed

    private void btnExcluirUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirUsuarioActionPerformed

    private void btnExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirClienteActionPerformed

    private void btnExcluirFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirFornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirFornecedorActionPerformed

    private void btnExcluirCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirCategoriaActionPerformed

    private void btnExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirProdutoActionPerformed

    //Declaração de variáveis(View).
    private ViewPrincipal viewPrincipal;
    private ViewUsuario viewUsuario;
    private ViewCliente viewCliente;
    private ViewFornecedor viewFornecedor;
    private ViewCategoria viewCategoria;
    private ViewProduto viewProduto;

    //Declaração de variáveis(Business Object).
    private PainelControleBO painelControleBO;

    //Declaração de variáveis(Tabelas).
    private TableModelUsuario tabelaUsuario;
    private TableModelCliente tabelaCliente;
    private TableModelFornecedor tabelaFornecedor;
    private TableModelCategoria tabelaCategoria;
    private TableModelProduto tabelaProduto;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarCategoria;
    private javax.swing.JButton btnAlterarCliente;
    private javax.swing.JButton btnAlterarFornecedor;
    private javax.swing.JButton btnAlterarProduto;
    private javax.swing.JButton btnAlterarUsuario;
    private javax.swing.JButton btnBuscarCategoria;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarFornecedor;
    private javax.swing.JButton btnBuscarProduto;
    private javax.swing.JButton btnBuscarUsuario;
    private javax.swing.JButton btnExcluirCategoria;
    private javax.swing.JButton btnExcluirCliente;
    private javax.swing.JButton btnExcluirFornecedor;
    private javax.swing.JButton btnExcluirProduto;
    private javax.swing.JButton btnExcluirUsuario;
    private javax.swing.JButton btnNovaCategoria;
    private javax.swing.JButton btnNovoCliente;
    private javax.swing.JButton btnNovoFornecedor;
    private javax.swing.JButton btnNovoProduto;
    private javax.swing.JButton btnNovoUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbResultadosCategoria;
    private javax.swing.JLabel lbResultadosCliente;
    private javax.swing.JLabel lbResultadosFornecedor;
    private javax.swing.JLabel lbResultadosProduto;
    private javax.swing.JLabel lbResultadosUsuario;
    private javax.swing.JPanel pnBuscarCategoria;
    private javax.swing.JPanel pnBuscarCliente;
    private javax.swing.JPanel pnBuscarFornecedor;
    private javax.swing.JPanel pnBuscarProduto;
    private javax.swing.JPanel pnBuscarUsuario;
    private javax.swing.JPanel pnCategoria;
    private javax.swing.JPanel pnCliente;
    private javax.swing.JPanel pnFornecedor;
    private javax.swing.JPanel pnProduto;
    private javax.swing.JPanel pnUsuario;
    private javax.swing.JScrollPane spnCategorias;
    private javax.swing.JScrollPane spnClientes;
    private javax.swing.JScrollPane spnFornecedores;
    private javax.swing.JScrollPane spnProdutos;
    private javax.swing.JScrollPane spnUsuario;
    private javax.swing.JTable tbCategorias;
    private javax.swing.JTable tbClientes;
    private javax.swing.JTable tbFornecedores;
    private javax.swing.JTable tbProdutos;
    private javax.swing.JTable tbUsuarios;
    private javax.swing.table.JTableHeader cabecalho;
    private javax.swing.JTextField tfBuscarCategoria;
    private javax.swing.JTextField tfBuscarCliente;
    private javax.swing.JTextField tfBuscarFornecedor;
    private javax.swing.JTextField tfBuscarProduto;
    private javax.swing.JTextField tfBuscarUsuario;
    private javax.swing.JTabbedPane tpnCorpo;
    // End of variables declaration//GEN-END:variables
}
