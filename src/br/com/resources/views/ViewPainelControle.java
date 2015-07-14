package br.com.resources.views;

import br.com.models.bo.PainelControleBO;
import br.com.models.tabelas.TableModelCliente;
import br.com.models.tabelas.TableModelFornecedor;
import br.com.models.tabelas.TableModelProduto;
import br.com.models.tabelas.TableModelFuncionario;
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
        tabelaFuncionario = new TableModelFuncionario(painelControleBO.buscarFuncionarios());
        tabelaCliente = new TableModelCliente(painelControleBO.buscarClientes());
        tabelaFornecedor = new TableModelFornecedor(painelControleBO.buscarFornecedores());
        tabelaProduto = new TableModelProduto(painelControleBO.buscarProdutos());

        //Definindo modelo de tabelas para as tabelas.
        tbFuncionarios.setModel(tabelaFuncionario);
        tbClientes.setModel(tabelaCliente);
        tbFornecedores.setModel(tabelaFornecedor);
        tbProdutos.setModel(tabelaProduto);

        //Definir tabelas como sem seleção.
        tbFuncionarios.clearSelection();
        tbClientes.clearSelection();
        tbFornecedores.clearSelection();
        tbProdutos.clearSelection();

        //Definindo botões Aleterar e Excluir como não habilitado.
        btnVisualizarFuncionario.setEnabled(false);
        btnAlterarFuncionario.setEnabled(false);
        btnExcluirFuncionario.setEnabled(false);
        btnVisualizarCliente.setEnabled(false);
        btnAlterarCliente.setEnabled(false);
        btnExcluirCliente.setEnabled(false);
        btnVisualizarFornecedor.setEnabled(false);
        btnAlterarFornecedor.setEnabled(false);
        btnExcluirFornecedor.setEnabled(false);
        btnVisualizarProduto.setEnabled(false);
        btnAlterarProduto.setEnabled(false);
        btnExcluirProduto.setEnabled(false);
    }

    //Componentes padrões do JFrame
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tpnCorpo = new javax.swing.JTabbedPane();
        pnFuncionario = new javax.swing.JPanel();
        btnNovoFuncionario = new javax.swing.JButton();
        btnVisualizarFuncionario = new javax.swing.JButton();
        btnAlterarFuncionario = new javax.swing.JButton();
        btnExcluirFuncionario = new javax.swing.JButton();
        pnBuscarFuncionario = new javax.swing.JPanel();
        tfBuscarFuncionario = new javax.swing.JTextField();
        btnBuscarFuncionario = new javax.swing.JButton();
        lbResultadosFuncionario = new javax.swing.JLabel();
        spnFuncionario = new javax.swing.JScrollPane();
        tbFuncionarios = new javax.swing.JTable();
        pnCliente = new javax.swing.JPanel();
        btnNovoCliente = new javax.swing.JButton();
        btnVisualizarCliente = new javax.swing.JButton();
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
        btnVisualizarFornecedor = new javax.swing.JButton();
        btnAlterarFornecedor = new javax.swing.JButton();
        btnExcluirFornecedor = new javax.swing.JButton();
        pnBuscarFornecedor = new javax.swing.JPanel();
        tfBuscarFornecedor = new javax.swing.JTextField();
        btnBuscarFornecedor = new javax.swing.JButton();
        lbResultadosFornecedor = new javax.swing.JLabel();
        spnFornecedores = new javax.swing.JScrollPane();
        tbFornecedores = new javax.swing.JTable();
        pnProduto = new javax.swing.JPanel();
        btnNovoProduto = new javax.swing.JButton();
        btnVisualizarProduto = new javax.swing.JButton();
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

        pnFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        pnFuncionario.setPreferredSize(new java.awt.Dimension(642, 315));

        btnNovoFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnNovoFuncionarioUP.png"))); // NOI18N
        btnNovoFuncionario.setBorder(null);
        btnNovoFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovoFuncionario.setFocusable(false);
        btnNovoFuncionario.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnNovoFuncionarioDOWN.png"))); // NOI18N
        btnNovoFuncionario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnNovoFuncionarioDOWN.png"))); // NOI18N
        btnNovoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoFuncionarioActionPerformed(evt);
            }
        });

        btnVisualizarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnVisualizarUP.png"))); // NOI18N
        btnVisualizarFuncionario.setBorder(null);
        btnVisualizarFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVisualizarFuncionario.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnVisualizarDOWN.png"))); // NOI18N
        btnVisualizarFuncionario.setFocusable(false);
        btnVisualizarFuncionario.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnVisualizarDOWN.png"))); // NOI18N
        btnVisualizarFuncionario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnVisualizarDOWN.png"))); // NOI18N
        btnVisualizarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarFuncionarioActionPerformed(evt);
            }
        });

        btnAlterarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarUP.png"))); // NOI18N
        btnAlterarFuncionario.setBorder(null);
        btnAlterarFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterarFuncionario.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N
        btnAlterarFuncionario.setFocusable(false);
        btnAlterarFuncionario.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N
        btnAlterarFuncionario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N
        btnAlterarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarFuncionarioActionPerformed(evt);
            }
        });

        btnExcluirFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirUP.png"))); // NOI18N
        btnExcluirFuncionario.setBorder(null);
        btnExcluirFuncionario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluirFuncionario.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirDOWN.png"))); // NOI18N
        btnExcluirFuncionario.setFocusable(false);
        btnExcluirFuncionario.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirDOWN.png"))); // NOI18N
        btnExcluirFuncionario.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirDOWN.png"))); // NOI18N
        btnExcluirFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirFuncionarioActionPerformed(evt);
            }
        });

        pnBuscarFuncionario.setBackground(new java.awt.Color(255, 255, 255));

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

        javax.swing.GroupLayout pnBuscarFuncionarioLayout = new javax.swing.GroupLayout(pnBuscarFuncionario);
        pnBuscarFuncionario.setLayout(pnBuscarFuncionarioLayout);
        pnBuscarFuncionarioLayout.setHorizontalGroup(
            pnBuscarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBuscarFuncionarioLayout.createSequentialGroup()
                .addComponent(tfBuscarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnBuscarFuncionario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnBuscarFuncionarioLayout.setVerticalGroup(
            pnBuscarFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBuscarFuncionarioLayout.createSequentialGroup()
                .addComponent(btnBuscarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnBuscarFuncionarioLayout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(tfBuscarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        lbResultadosFuncionario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbResultadosFuncionario.setForeground(new java.awt.Color(102, 102, 102));
        lbResultadosFuncionario.setText("0 resultados, mostrando todos.");

        spnFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        spnFuncionario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        spnFuncionario.setForeground(new java.awt.Color(102, 102, 102));
        spnFuncionario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        tbFuncionarios.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tbFuncionarios.setForeground(new java.awt.Color(102, 102, 102));
        tbFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbFuncionarios.setFocusable(false);
        tbFuncionarios.setGridColor(new java.awt.Color(204, 204, 204));
        tbFuncionarios.setIntercellSpacing(new java.awt.Dimension(0, 1));
        tbFuncionarios.setRowHeight(30);
        tbFuncionarios.setSelectionBackground(new java.awt.Color(95, 180, 25));
        tbFuncionarios.setShowVerticalLines(false);
        tbFuncionarios.getTableHeader().setReorderingAllowed(false);
        tbFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbFuncionariosMouseClicked(evt);
            }
        });
        spnFuncionario.setViewportView(tbFuncionarios);
        cabecalho = tbFuncionarios.getTableHeader();
        cabecalho.setFont(new Font("Arial", Font.PLAIN, 12));
        cabecalho.setForeground(new Color(102,102,102));

        javax.swing.GroupLayout pnFuncionarioLayout = new javax.swing.GroupLayout(pnFuncionario);
        pnFuncionario.setLayout(pnFuncionarioLayout);
        pnFuncionarioLayout.setHorizontalGroup(
            pnFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnFuncionarioLayout.createSequentialGroup()
                        .addGroup(pnFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spnFuncionario)
                            .addGroup(pnFuncionarioLayout.createSequentialGroup()
                                .addComponent(lbResultadosFuncionario)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(pnFuncionarioLayout.createSequentialGroup()
                        .addComponent(btnNovoFuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVisualizarFuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterarFuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirFuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                        .addComponent(pnBuscarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        pnFuncionarioLayout.setVerticalGroup(
            pnFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNovoFuncionario)
                        .addComponent(btnAlterarFuncionario)
                        .addComponent(btnExcluirFuncionario))
                    .addComponent(pnBuscarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVisualizarFuncionario))
                .addGap(18, 18, 18)
                .addComponent(lbResultadosFuncionario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addContainerGap())
        );

        tpnCorpo.addTab("Funcionário", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/usuario.png")), pnFuncionario); // NOI18N

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

        btnVisualizarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnVisualizarUP.png"))); // NOI18N
        btnVisualizarCliente.setBorder(null);
        btnVisualizarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVisualizarCliente.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnVisualizarDOWN.png"))); // NOI18N
        btnVisualizarCliente.setFocusable(false);
        btnVisualizarCliente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnVisualizarDOWN.png"))); // NOI18N
        btnVisualizarCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnVisualizarDOWN.png"))); // NOI18N

        btnAlterarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarUP.png"))); // NOI18N
        btnAlterarCliente.setBorder(null);
        btnAlterarCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterarCliente.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N
        btnAlterarCliente.setFocusable(false);
        btnAlterarCliente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N
        btnAlterarCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N

        btnExcluirCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirUP.png"))); // NOI18N
        btnExcluirCliente.setBorder(null);
        btnExcluirCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluirCliente.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirDOWN.png"))); // NOI18N
        btnExcluirCliente.setFocusable(false);
        btnExcluirCliente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirDOWN.png"))); // NOI18N
        btnExcluirCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirDOWN.png"))); // NOI18N

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
                        .addComponent(spnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(pnClienteLayout.createSequentialGroup()
                        .addComponent(btnNovoCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVisualizarCliente)
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
                    .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAlterarCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnExcluirCliente, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnNovoCliente))
                    .addComponent(pnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVisualizarCliente))
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

        btnVisualizarFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnVisualizarUP.png"))); // NOI18N
        btnVisualizarFornecedor.setBorder(null);
        btnVisualizarFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVisualizarFornecedor.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnVisualizarDOWN.png"))); // NOI18N
        btnVisualizarFornecedor.setFocusable(false);
        btnVisualizarFornecedor.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnVisualizarDOWN.png"))); // NOI18N
        btnVisualizarFornecedor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnVisualizarDOWN.png"))); // NOI18N

        btnAlterarFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarUP.png"))); // NOI18N
        btnAlterarFornecedor.setBorder(null);
        btnAlterarFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterarFornecedor.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N
        btnAlterarFornecedor.setFocusable(false);
        btnAlterarFornecedor.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N
        btnAlterarFornecedor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N

        btnExcluirFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirUP.png"))); // NOI18N
        btnExcluirFornecedor.setBorder(null);
        btnExcluirFornecedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluirFornecedor.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirDOWN.png"))); // NOI18N
        btnExcluirFornecedor.setFocusable(false);
        btnExcluirFornecedor.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirDOWN.png"))); // NOI18N
        btnExcluirFornecedor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirDOWN.png"))); // NOI18N

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
                        .addComponent(spnFornecedores, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(pnFornecedorLayout.createSequentialGroup()
                        .addComponent(btnNovoFornecedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVisualizarFornecedor)
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
                    .addGroup(pnFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAlterarFornecedor, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnExcluirFornecedor, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnNovoFornecedor))
                    .addComponent(pnBuscarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVisualizarFornecedor))
                .addGap(18, 18, 18)
                .addComponent(lbResultadosFornecedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnFornecedores, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                .addContainerGap())
        );

        tpnCorpo.addTab("Fornecedor", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/fornecedor.png")), pnFornecedor); // NOI18N

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

        btnVisualizarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnVisualizarUP.png"))); // NOI18N
        btnVisualizarProduto.setBorder(null);
        btnVisualizarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVisualizarProduto.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnVisualizarDOWN.png"))); // NOI18N
        btnVisualizarProduto.setFocusable(false);
        btnVisualizarProduto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnVisualizarDOWN.png"))); // NOI18N
        btnVisualizarProduto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnVisualizarDOWN.png"))); // NOI18N

        btnAlterarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarUP.png"))); // NOI18N
        btnAlterarProduto.setBorder(null);
        btnAlterarProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterarProduto.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N
        btnAlterarProduto.setFocusable(false);
        btnAlterarProduto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N
        btnAlterarProduto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnAlterarDOWN.png"))); // NOI18N

        btnExcluirProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirUP.png"))); // NOI18N
        btnExcluirProduto.setBorder(null);
        btnExcluirProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluirProduto.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirDOWN.png"))); // NOI18N
        btnExcluirProduto.setFocusable(false);
        btnExcluirProduto.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirDOWN.png"))); // NOI18N
        btnExcluirProduto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/btnExcluirDOWN.png"))); // NOI18N

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
                        .addComponent(spnProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(pnProdutoLayout.createSequentialGroup()
                        .addComponent(btnNovoProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVisualizarProduto)
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
                    .addGroup(pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAlterarProduto, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnExcluirProduto, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnNovoProduto))
                    .addComponent(pnBuscarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVisualizarProduto))
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

    private void tbFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbFuncionariosMouseClicked
        if (tbFuncionarios.getSelectedRow() != -1) {
            btnVisualizarFuncionario.setEnabled(true);
            btnAlterarFuncionario.setEnabled(true);
            btnExcluirFuncionario.setEnabled(true);
        }
    }//GEN-LAST:event_tbFuncionariosMouseClicked

    private void tbClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbClientesMouseClicked
        if (tbClientes.getSelectedRow() != -1) {
            btnVisualizarCliente.setEnabled(true);
            btnAlterarCliente.setEnabled(true);
            btnExcluirCliente.setEnabled(true);
        }
    }//GEN-LAST:event_tbClientesMouseClicked

    private void tbFornecedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbFornecedoresMouseClicked
        if (tbFornecedores.getSelectedRow() != -1) {
            btnVisualizarFornecedor.setEnabled(true);
            btnAlterarFornecedor.setEnabled(true);
            btnExcluirFornecedor.setEnabled(true);
        }
    }//GEN-LAST:event_tbFornecedoresMouseClicked

    private void tbProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbProdutosMouseClicked
        if (tbProdutos.getSelectedRow() != -1) {
            btnVisualizarProduto.setEnabled(true);
            btnAlterarProduto.setEnabled(true);
            btnExcluirProduto.setEnabled(true);
        }
    }//GEN-LAST:event_tbProdutosMouseClicked

    private void btnNovoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoProdutoActionPerformed
        viewProduto = new ViewProduto(viewPrincipal, true);
        viewProduto.setVisible(true);
    }//GEN-LAST:event_btnNovoProdutoActionPerformed

    private void btnNovoFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoFornecedorActionPerformed
        viewFornecedor = new ViewFornecedor(viewPrincipal, true, this);
        viewFornecedor.setVisible(true);
    }//GEN-LAST:event_btnNovoFornecedorActionPerformed

    private void btnNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoClienteActionPerformed
        viewCliente = new ViewCliente(viewPrincipal, true);
        viewCliente.setVisible(true);
    }//GEN-LAST:event_btnNovoClienteActionPerformed

    private void btnNovoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoFuncionarioActionPerformed
        viewFuncionario = new ViewFuncionario(viewPrincipal, true, this);
        viewFuncionario.setVisible(true);
    }//GEN-LAST:event_btnNovoFuncionarioActionPerformed

    private void btnVisualizarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarFuncionarioActionPerformed
        viewFuncionario = new ViewFuncionario(viewPrincipal, true, this);
        viewFuncionario.setVisible(true);
    }//GEN-LAST:event_btnVisualizarFuncionarioActionPerformed

    private void btnAlterarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAlterarFuncionarioActionPerformed

    private void btnExcluirFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirFuncionarioActionPerformed

    //Declaração de variáveis(View).
    private ViewPrincipal viewPrincipal;
    private ViewFuncionario viewFuncionario;
    private ViewCliente viewCliente;
    private ViewFornecedor viewFornecedor;
    private ViewCategoria viewCategoria;
    private ViewProduto viewProduto;

    //Declaração de variáveis(Business Object).
    private PainelControleBO painelControleBO;

    //Declaração de variáveis(Tabelas).
    private TableModelFuncionario tabelaFuncionario;
    private TableModelCliente tabelaCliente;
    private TableModelFornecedor tabelaFornecedor;
    private TableModelProduto tabelaProduto;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterarCliente;
    private javax.swing.JButton btnAlterarFornecedor;
    private javax.swing.JButton btnAlterarFuncionario;
    private javax.swing.JButton btnAlterarProduto;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarFornecedor;
    private javax.swing.JButton btnBuscarFuncionario;
    private javax.swing.JButton btnBuscarProduto;
    private javax.swing.JButton btnExcluirCliente;
    private javax.swing.JButton btnExcluirFornecedor;
    private javax.swing.JButton btnExcluirFuncionario;
    private javax.swing.JButton btnExcluirProduto;
    private javax.swing.JButton btnNovoCliente;
    private javax.swing.JButton btnNovoFornecedor;
    private javax.swing.JButton btnNovoFuncionario;
    private javax.swing.JButton btnNovoProduto;
    private javax.swing.JButton btnVisualizarCliente;
    private javax.swing.JButton btnVisualizarFornecedor;
    private javax.swing.JButton btnVisualizarFuncionario;
    private javax.swing.JButton btnVisualizarProduto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbResultadosCliente;
    private javax.swing.JLabel lbResultadosFornecedor;
    private javax.swing.JLabel lbResultadosFuncionario;
    private javax.swing.JLabel lbResultadosProduto;
    private javax.swing.JPanel pnBuscarCliente;
    private javax.swing.JPanel pnBuscarFornecedor;
    private javax.swing.JPanel pnBuscarFuncionario;
    private javax.swing.JPanel pnBuscarProduto;
    private javax.swing.JPanel pnCliente;
    private javax.swing.JPanel pnFornecedor;
    private javax.swing.JPanel pnFuncionario;
    private javax.swing.JPanel pnProduto;
    private javax.swing.JScrollPane spnClientes;
    private javax.swing.JScrollPane spnFornecedores;
    private javax.swing.JScrollPane spnFuncionario;
    private javax.swing.JScrollPane spnProdutos;
    private javax.swing.JTable tbClientes;
    private javax.swing.JTable tbFornecedores;
    private javax.swing.JTable tbFuncionarios;
    private javax.swing.table.JTableHeader cabecalho;
    private javax.swing.JTable tbProdutos;
    private javax.swing.JTextField tfBuscarCliente;
    private javax.swing.JTextField tfBuscarFornecedor;
    private javax.swing.JTextField tfBuscarFuncionario;
    private javax.swing.JTextField tfBuscarProduto;
    private javax.swing.JTabbedPane tpnCorpo;
    // End of variables declaration//GEN-END:variables
}
