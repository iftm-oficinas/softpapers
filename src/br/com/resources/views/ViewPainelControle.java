package br.com.resources.views;

import br.com.models.bo.PainelControleBO;
import br.com.models.vo.Usuario;
import br.com.resources.tabelas.TabelaUsuario;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

public class ViewPainelControle extends javax.swing.JInternalFrame {

    public ViewPainelControle() {
        initComponents();
    }

    public ViewPainelControle(ViewPrincipal viewPrincipal) {
        setRootPaneCheckingEnabled(false);
        javax.swing.plaf.InternalFrameUI frame = this.getUI();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) frame).setNorthPane(null);

        initComponents();
        this.viewPrincipal = viewPrincipal;

//        JTableHeader cabecalho = tbProdutos.getTableHeader();
//        cabecalho.setFont(new Font("Arial", Font.PLAIN, 12));
//        cabecalho.setForeground(new Color(102,102,102));
        
        painelControleBO = new PainelControleBO();
        tabelaUsuario = new TabelaUsuario(painelControleBO.buscarUsuarios());
        int cont;
        for(cont = 0; cont<18; cont++){
            tabelaUsuario.addUsuario(new Usuario());
        }
        
        tbUsuarios.setModel(tabelaUsuario);
        tbUsuarios.setRowHeight(30);
//        tabelaUsuario.limpar();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        spnCorpo = new javax.swing.JScrollPane();
        tpnCorpo = new javax.swing.JTabbedPane();
        pnUsuario = new javax.swing.JPanel();
        btnNovoUsuario = new javax.swing.JButton();
        btnAlterarUsuario = new javax.swing.JButton();
        btnExcluirUsuario = new javax.swing.JButton();
        pnBuscarUsuario = new javax.swing.JPanel();
        btnBuscarUsuario = new javax.swing.JButton();
        tfBuscarUsuario = new javax.swing.JTextField();
        lbResultadosUsuario = new javax.swing.JLabel();
        spnUsuario = new javax.swing.JScrollPane();
        tbUsuarios = new javax.swing.JTable();
        pnCliente = new javax.swing.JPanel();
        btnNovoCliente = new javax.swing.JButton();
        btnAlterarCliente = new javax.swing.JButton();
        btnExcluirCliente = new javax.swing.JButton();
        pnBuscarCliente = new javax.swing.JPanel();
        btnBuscarCliente = new javax.swing.JButton();
        tfBuscarCliente = new javax.swing.JTextField();
        lbResultadosCliente = new javax.swing.JLabel();
        spnClientes = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        pnFornecedor = new javax.swing.JPanel();
        btnNovoFornecedor = new javax.swing.JButton();
        btnExcluirFornecedor = new javax.swing.JButton();
        btnAlterarFornecedor = new javax.swing.JButton();
        pnBuscarFornecedor = new javax.swing.JPanel();
        btnBuscarFornecedor = new javax.swing.JButton();
        tfBuscarFornecedor = new javax.swing.JTextField();
        lbResultadosFornecedor = new javax.swing.JLabel();
        spnFornecedores = new javax.swing.JScrollPane();
        tbFornecedores = new javax.swing.JTable();
        pnCategoria = new javax.swing.JPanel();
        btnNovaCategoria = new javax.swing.JButton();
        btnExcluirCategoria = new javax.swing.JButton();
        btnAlterarCategoria = new javax.swing.JButton();
        pnBuscarCategoria = new javax.swing.JPanel();
        btnBuscarCategoria = new javax.swing.JButton();
        tfBuscarCategoria = new javax.swing.JTextField();
        lbResultadosCategoria = new javax.swing.JLabel();
        spnCategorias = new javax.swing.JScrollPane();
        tbCategorias = new javax.swing.JTable();
        pnProduto = new javax.swing.JPanel();
        btnNovoProduto = new javax.swing.JButton();
        btnAlterarProduto = new javax.swing.JButton();
        btnExcluirProduto = new javax.swing.JButton();
        pnBuscarProduto = new javax.swing.JPanel();
        btnBuscarProduto = new javax.swing.JButton();
        tfBuscarProduto = new javax.swing.JTextField();
        lbResultadosProduto = new javax.swing.JLabel();
        spnProdutos = new javax.swing.JScrollPane();
        tbProdutos = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setResizable(true);
        setFocusable(false);
        setFrameIcon(null);

        tpnCorpo.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        tpnCorpo.setFocusable(false);

        pnUsuario.setBackground(new java.awt.Color(255, 255, 255));
        pnUsuario.setPreferredSize(new java.awt.Dimension(642, 315));

        btnNovoUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnNovoUsuario.setForeground(new java.awt.Color(102, 102, 102));
        btnNovoUsuario.setText("Novo Usuario");
        btnNovoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoUsuarioActionPerformed(evt);
            }
        });

        btnAlterarUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnAlterarUsuario.setForeground(new java.awt.Color(102, 102, 102));
        btnAlterarUsuario.setText("Alterar");
        btnAlterarUsuario.setEnabled(false);

        btnExcluirUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnExcluirUsuario.setForeground(new java.awt.Color(102, 102, 102));
        btnExcluirUsuario.setText("Excluir");
        btnExcluirUsuario.setEnabled(false);

        pnBuscarUsuario.setBackground(new java.awt.Color(255, 255, 255));

        btnBuscarUsuario.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnBuscarUsuario.setForeground(new java.awt.Color(102, 102, 102));
        btnBuscarUsuario.setText("Buscar");

        tfBuscarUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfBuscarUsuario.setForeground(new java.awt.Color(102, 102, 102));
        tfBuscarUsuario.setText("Pesquisa");

        javax.swing.GroupLayout pnBuscarUsuarioLayout = new javax.swing.GroupLayout(pnBuscarUsuario);
        pnBuscarUsuario.setLayout(pnBuscarUsuarioLayout);
        pnBuscarUsuarioLayout.setHorizontalGroup(
            pnBuscarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBuscarUsuarioLayout.createSequentialGroup()
                .addComponent(tfBuscarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(btnBuscarUsuario)
                .addContainerGap())
        );
        pnBuscarUsuarioLayout.setVerticalGroup(
            pnBuscarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBuscarUsuarioLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnBuscarUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        lbResultadosUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbResultadosUsuario.setForeground(new java.awt.Color(102, 102, 102));
        lbResultadosUsuario.setText("1 resultado, mostrando todos");

        spnUsuario.setBackground(new java.awt.Color(255, 255, 255));
        spnUsuario.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        spnUsuario.setForeground(new java.awt.Color(102, 102, 102));
        spnUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        tbUsuarios.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tbUsuarios.setForeground(new java.awt.Color(102, 102, 102));
        tbUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Usuário", "Nome", "Cpf", "Email", "Senha", "Endereco"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbUsuarios.setFocusable(false);
        tbUsuarios.setGridColor(new java.awt.Color(204, 204, 204));
        tbUsuarios.setIntercellSpacing(new java.awt.Dimension(0, 1));
        tbUsuarios.setRowHeight(30);
        tbUsuarios.setSelectionBackground(new java.awt.Color(153, 204, 0));
        tbUsuarios.setShowVerticalLines(false);
        tbUsuarios.getTableHeader().setReorderingAllowed(false);
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
                        .addComponent(btnNovoUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterarUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirUsuario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnUsuarioLayout.createSequentialGroup()
                        .addComponent(lbResultadosUsuario)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnUsuarioLayout.createSequentialGroup()
                        .addComponent(spnUsuario)
                        .addContainerGap())))
        );
        pnUsuarioLayout.setVerticalGroup(
            pnUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNovoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAlterarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnExcluirUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(lbResultadosUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addContainerGap())
        );

        tpnCorpo.addTab("Usuario                                       ", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/usuario.png")), pnUsuario); // NOI18N

        pnCliente.setBackground(new java.awt.Color(255, 255, 255));
        pnCliente.setPreferredSize(new java.awt.Dimension(642, 315));

        btnNovoCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnNovoCliente.setForeground(new java.awt.Color(102, 102, 102));
        btnNovoCliente.setText("Novo Cliente");

        btnAlterarCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnAlterarCliente.setForeground(new java.awt.Color(102, 102, 102));
        btnAlterarCliente.setText("Alterar");
        btnAlterarCliente.setEnabled(false);

        btnExcluirCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnExcluirCliente.setForeground(new java.awt.Color(102, 102, 102));
        btnExcluirCliente.setText("Excluir");
        btnExcluirCliente.setEnabled(false);

        pnBuscarCliente.setBackground(new java.awt.Color(255, 255, 255));

        btnBuscarCliente.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnBuscarCliente.setForeground(new java.awt.Color(102, 102, 102));
        btnBuscarCliente.setText("Buscar");

        tfBuscarCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfBuscarCliente.setForeground(new java.awt.Color(102, 102, 102));
        tfBuscarCliente.setText("Pesquisa");

        javax.swing.GroupLayout pnBuscarClienteLayout = new javax.swing.GroupLayout(pnBuscarCliente);
        pnBuscarCliente.setLayout(pnBuscarClienteLayout);
        pnBuscarClienteLayout.setHorizontalGroup(
            pnBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBuscarClienteLayout.createSequentialGroup()
                .addComponent(tfBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(btnBuscarCliente)
                .addContainerGap())
        );
        pnBuscarClienteLayout.setVerticalGroup(
            pnBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBuscarClienteLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnBuscarClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        lbResultadosCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbResultadosCliente.setForeground(new java.awt.Color(102, 102, 102));
        lbResultadosCliente.setText("0 resultados, mostrando todos");

        spnClientes.setBackground(new java.awt.Color(255, 255, 255));
        spnClientes.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        spnClientes.setForeground(new java.awt.Color(102, 102, 102));
        spnClientes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        tbClientes.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tbClientes.setForeground(new java.awt.Color(102, 102, 102));
        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cliente", "Nome", "Cpf", "Rg", "Telefone", "Nascimento", "Endereco", "Email", "Sexo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbClientes.setFocusable(false);
        tbClientes.setGridColor(new java.awt.Color(204, 204, 204));
        tbClientes.setIntercellSpacing(new java.awt.Dimension(0, 1));
        tbClientes.setRowHeight(30);
        tbClientes.setSelectionBackground(new java.awt.Color(153, 204, 0));
        tbClientes.setShowVerticalLines(false);
        tbClientes.getTableHeader().setReorderingAllowed(false);
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
                        .addComponent(btnNovoCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterarCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                        .addComponent(pnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnClienteLayout.createSequentialGroup()
                        .addComponent(lbResultadosCliente)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnClienteLayout.createSequentialGroup()
                        .addComponent(spnClientes)
                        .addContainerGap())))
        );
        pnClienteLayout.setVerticalGroup(
            pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNovoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAlterarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnExcluirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(lbResultadosCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnClientes, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addContainerGap())
        );

        tpnCorpo.addTab("Cliente                                        ", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/cliente.png")), pnCliente); // NOI18N

        pnFornecedor.setBackground(new java.awt.Color(255, 255, 255));
        pnFornecedor.setPreferredSize(new java.awt.Dimension(642, 315));

        btnNovoFornecedor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnNovoFornecedor.setForeground(new java.awt.Color(102, 102, 102));
        btnNovoFornecedor.setText("Novo Fornecedor");

        btnExcluirFornecedor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnExcluirFornecedor.setForeground(new java.awt.Color(102, 102, 102));
        btnExcluirFornecedor.setText("Excluir");
        btnExcluirFornecedor.setEnabled(false);

        btnAlterarFornecedor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnAlterarFornecedor.setForeground(new java.awt.Color(102, 102, 102));
        btnAlterarFornecedor.setText("Alterar");
        btnAlterarFornecedor.setEnabled(false);

        pnBuscarFornecedor.setBackground(new java.awt.Color(255, 255, 255));

        btnBuscarFornecedor.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnBuscarFornecedor.setForeground(new java.awt.Color(102, 102, 102));
        btnBuscarFornecedor.setText("Buscar");

        tfBuscarFornecedor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfBuscarFornecedor.setForeground(new java.awt.Color(102, 102, 102));
        tfBuscarFornecedor.setText("Pesquisa");

        javax.swing.GroupLayout pnBuscarFornecedorLayout = new javax.swing.GroupLayout(pnBuscarFornecedor);
        pnBuscarFornecedor.setLayout(pnBuscarFornecedorLayout);
        pnBuscarFornecedorLayout.setHorizontalGroup(
            pnBuscarFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBuscarFornecedorLayout.createSequentialGroup()
                .addComponent(tfBuscarFornecedor, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(btnBuscarFornecedor)
                .addContainerGap())
        );
        pnBuscarFornecedorLayout.setVerticalGroup(
            pnBuscarFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBuscarFornecedorLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnBuscarFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBuscarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        lbResultadosFornecedor.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbResultadosFornecedor.setForeground(new java.awt.Color(102, 102, 102));
        lbResultadosFornecedor.setText("0 resultados, mostrando todos");

        spnFornecedores.setBackground(new java.awt.Color(255, 255, 255));
        spnFornecedores.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        spnFornecedores.setForeground(new java.awt.Color(102, 102, 102));
        spnFornecedores.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        tbFornecedores.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tbFornecedores.setForeground(new java.awt.Color(102, 102, 102));
        tbFornecedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Fornecedor", "Nome", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbFornecedores.setFocusable(false);
        tbFornecedores.setGridColor(new java.awt.Color(204, 204, 204));
        tbFornecedores.setIntercellSpacing(new java.awt.Dimension(0, 1));
        tbFornecedores.setRowHeight(30);
        tbFornecedores.setSelectionBackground(new java.awt.Color(153, 204, 0));
        tbFornecedores.setShowVerticalLines(false);
        tbFornecedores.getTableHeader().setReorderingAllowed(false);
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
                        .addComponent(btnNovoFornecedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterarFornecedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirFornecedor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                        .addComponent(pnBuscarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnFornecedorLayout.createSequentialGroup()
                        .addComponent(lbResultadosFornecedor)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnFornecedorLayout.createSequentialGroup()
                        .addComponent(spnFornecedores)
                        .addContainerGap())))
        );
        pnFornecedorLayout.setVerticalGroup(
            pnFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnFornecedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnFornecedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNovoFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAlterarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnExcluirFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnBuscarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(lbResultadosFornecedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnFornecedores, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addContainerGap())
        );

        tpnCorpo.addTab("Fornecedor                               ", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/fornecedor.png")), pnFornecedor); // NOI18N

        pnCategoria.setBackground(new java.awt.Color(255, 255, 255));
        pnCategoria.setPreferredSize(new java.awt.Dimension(642, 315));

        btnNovaCategoria.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnNovaCategoria.setForeground(new java.awt.Color(102, 102, 102));
        btnNovaCategoria.setText("Nova Categoria");

        btnExcluirCategoria.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnExcluirCategoria.setForeground(new java.awt.Color(102, 102, 102));
        btnExcluirCategoria.setText("Excluir");
        btnExcluirCategoria.setEnabled(false);

        btnAlterarCategoria.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnAlterarCategoria.setForeground(new java.awt.Color(102, 102, 102));
        btnAlterarCategoria.setText("Alterar");
        btnAlterarCategoria.setEnabled(false);

        pnBuscarCategoria.setBackground(new java.awt.Color(255, 255, 255));

        btnBuscarCategoria.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnBuscarCategoria.setForeground(new java.awt.Color(102, 102, 102));
        btnBuscarCategoria.setText("Buscar");

        tfBuscarCategoria.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfBuscarCategoria.setForeground(new java.awt.Color(102, 102, 102));
        tfBuscarCategoria.setText("Pesquisa");

        javax.swing.GroupLayout pnBuscarCategoriaLayout = new javax.swing.GroupLayout(pnBuscarCategoria);
        pnBuscarCategoria.setLayout(pnBuscarCategoriaLayout);
        pnBuscarCategoriaLayout.setHorizontalGroup(
            pnBuscarCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBuscarCategoriaLayout.createSequentialGroup()
                .addComponent(tfBuscarCategoria, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(btnBuscarCategoria)
                .addContainerGap())
        );
        pnBuscarCategoriaLayout.setVerticalGroup(
            pnBuscarCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBuscarCategoriaLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnBuscarCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBuscarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        lbResultadosCategoria.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbResultadosCategoria.setForeground(new java.awt.Color(102, 102, 102));
        lbResultadosCategoria.setText("0 resultados, mostrando todos");

        spnCategorias.setBackground(new java.awt.Color(255, 255, 255));
        spnCategorias.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        spnCategorias.setForeground(new java.awt.Color(102, 102, 102));
        spnCategorias.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        tbCategorias.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tbCategorias.setForeground(new java.awt.Color(102, 102, 102));
        tbCategorias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Categoria", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbCategorias.setFocusable(false);
        tbCategorias.setGridColor(new java.awt.Color(204, 204, 204));
        tbCategorias.setIntercellSpacing(new java.awt.Dimension(0, 1));
        tbCategorias.setRowHeight(30);
        tbCategorias.setSelectionBackground(new java.awt.Color(153, 204, 0));
        tbCategorias.setShowVerticalLines(false);
        tbCategorias.getTableHeader().setReorderingAllowed(false);
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
                        .addComponent(btnNovaCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterarCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirCategoria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                        .addComponent(pnBuscarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnCategoriaLayout.createSequentialGroup()
                        .addComponent(lbResultadosCategoria)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCategoriaLayout.createSequentialGroup()
                        .addComponent(spnCategorias)
                        .addContainerGap())))
        );
        pnCategoriaLayout.setVerticalGroup(
            pnCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnCategoriaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnCategoriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNovaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAlterarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnExcluirCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnBuscarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(lbResultadosCategoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addContainerGap())
        );

        tpnCorpo.addTab("Categoria                                   ", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/categoria.png")), pnCategoria); // NOI18N

        pnProduto.setBackground(new java.awt.Color(255, 255, 255));
        pnProduto.setPreferredSize(new java.awt.Dimension(642, 315));

        btnNovoProduto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnNovoProduto.setForeground(new java.awt.Color(102, 102, 102));
        btnNovoProduto.setText("Novo Produto");

        btnAlterarProduto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnAlterarProduto.setForeground(new java.awt.Color(102, 102, 102));
        btnAlterarProduto.setText("Alterar");
        btnAlterarProduto.setEnabled(false);

        btnExcluirProduto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnExcluirProduto.setForeground(new java.awt.Color(102, 102, 102));
        btnExcluirProduto.setText("Excluir");
        btnExcluirProduto.setEnabled(false);

        pnBuscarProduto.setBackground(new java.awt.Color(255, 255, 255));

        btnBuscarProduto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        btnBuscarProduto.setForeground(new java.awt.Color(102, 102, 102));
        btnBuscarProduto.setText("Buscar");

        tfBuscarProduto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tfBuscarProduto.setForeground(new java.awt.Color(102, 102, 102));
        tfBuscarProduto.setText("Pesquisa");

        javax.swing.GroupLayout pnBuscarProdutoLayout = new javax.swing.GroupLayout(pnBuscarProduto);
        pnBuscarProduto.setLayout(pnBuscarProdutoLayout);
        pnBuscarProdutoLayout.setHorizontalGroup(
            pnBuscarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBuscarProdutoLayout.createSequentialGroup()
                .addComponent(tfBuscarProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(btnBuscarProduto)
                .addContainerGap())
        );
        pnBuscarProdutoLayout.setVerticalGroup(
            pnBuscarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBuscarProdutoLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnBuscarProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfBuscarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        lbResultadosProduto.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbResultadosProduto.setForeground(new java.awt.Color(102, 102, 102));
        lbResultadosProduto.setText("0 resultados, mostrando todos");

        spnProdutos.setBackground(new java.awt.Color(255, 255, 255));
        spnProdutos.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        spnProdutos.setForeground(new java.awt.Color(102, 102, 102));
        spnProdutos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        tbProdutos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tbProdutos.setForeground(new java.awt.Color(102, 102, 102));
        tbProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Produto", "Nome", "Categoria", "Fornecedor", "Valor", "Quantidade Min", "Criação", "Atualização"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbProdutos.setFocusable(false);
        tbProdutos.setGridColor(new java.awt.Color(204, 204, 204));
        tbProdutos.setIntercellSpacing(new java.awt.Dimension(0, 1));
        tbProdutos.setRowHeight(30);
        tbProdutos.setSelectionBackground(new java.awt.Color(153, 204, 0));
        tbProdutos.setShowVerticalLines(false);
        tbProdutos.getTableHeader().setReorderingAllowed(false);
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
                        .addComponent(btnNovoProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlterarProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExcluirProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                        .addComponent(pnBuscarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnProdutoLayout.createSequentialGroup()
                        .addComponent(lbResultadosProduto)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnProdutoLayout.createSequentialGroup()
                        .addComponent(spnProdutos)
                        .addContainerGap())))
        );
        pnProdutoLayout.setVerticalGroup(
            pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnNovoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAlterarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnBuscarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(lbResultadosProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                .addContainerGap())
        );

        tpnCorpo.addTab("Produto                                      ", new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/produto.png")), pnProduto); // NOI18N

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

    private void btnNovoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoUsuarioActionPerformed
        btnNovoUsuario.setEnabled(false);
        ViewNovoProduto viewNovoProduto = new ViewNovoProduto(viewPrincipal, true);
        viewNovoProduto.setVisible(true);
        btnNovoUsuario.setEnabled(true);
    }//GEN-LAST:event_btnNovoUsuarioActionPerformed

    private ViewPrincipal viewPrincipal;
    private PainelControleBO painelControleBO;
    private TabelaUsuario tabelaUsuario;

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
    private javax.swing.JScrollPane spnCorpo;
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
