package br.com.resources.views;

import java.beans.PropertyVetoException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @see Classe visual. JFrame principal do programa que possui uma barra de menu
 * (JPanel) que ao clicar em cada opção (JLabel) adiciona um JInternalFrame ao
 * JDesktopPane.
 *
 * @author Bruna Danieli Ribeiro Gonçalves, Márlon Ândrel Coelho Freitas
 */
public class ViewPrincipal extends javax.swing.JFrame {

    /**
     *
     * @see Construtor padrão que é carregado quando se executa o programa pela
     * primeira vez e é necessário a verificação de acesso.
     */
    public ViewPrincipal() {
        //Inicialização dos componentes padrões do JFrame.
        initComponents();

        //Define que a view sempre carregue como maximizada.
        setExtendedState(MAXIMIZED_BOTH);

        //Instanciando e adicionando todos os JInternalFrames no JDesktopPane(dpnCorpo) da viewPrincipal.
        dpnCorpo.add(viewAcesso = new ViewAcesso(this));
        dpnCorpo.add(viewAjuda = new ViewAjuda(this));
        dpnCorpo.add(viewCaixa = new ViewVendas(this));
        dpnCorpo.add(viewEstoque = new ViewEstoque(this));
        dpnCorpo.add(viewFinanceiro = new ViewFinanceiro(this));
        dpnCorpo.add(viewHome = new ViewVisaoGeral(this));
        dpnCorpo.add(viewPainelControle = new ViewPainelControle(this));
        dpnCorpo.add(viewPoliticaPrivacidade = new ViewPoliticaPrivacidade(this));
        dpnCorpo.add(viewRelatorios = new ViewRelatorios(this));
        dpnCorpo.add(viewTermosUso = new ViewTermosUso(this));

        //Condição try que tenta definir a viewAcesso com tamanho maximo.
        viewAcesso.setVisible(true);
        try {
            viewAcesso.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(ViewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Atualiza JLabel (lbVersao).
        lbVersao.setText("Versão 0." + (new Date().getYear() + 1900) + "." + (new Date().getMonth() + 1) + "." + new Date().getDate() + " Alfa");

        //Define como não visível todos os elementos do menu (pnMenu).
        ocultarMenu();
    }

    /**
     *
     * @see Método que define todos os elementos do menu como não visíveis para
     * restringir o acesso antes do usuario acessar.
     */
    public final void ocultarMenu() {
        lbVisaoGeral.setVisible(false);
        lbVendas.setVisible(false);
        lbEstoque.setVisible(false);
        lbFinanceiro.setVisible(false);
        lbRelatorios.setVisible(false);
        lbPainelControle.setVisible(false);
        lbSair.setVisible(false);
        lbAjuda.setVisible(false);
        lbTermosUso.setVisible(false);
        lbPoliticaPrivacidade.setVisible(false);
    }

    /**
     *
     * @see Método que define todos os elementos do menu como visíveis após
     * realizar o acesso.
     */
    public final void mostrarMenu() {
        lbVisaoGeral.setVisible(true);
        lbVendas.setVisible(true);
        lbEstoque.setVisible(true);
        lbFinanceiro.setVisible(true);
        lbRelatorios.setVisible(true);
        lbPainelControle.setVisible(true);
        lbSair.setVisible(true);
        lbAjuda.setVisible(true);
        lbTermosUso.setVisible(true);
        lbPoliticaPrivacidade.setVisible(true);

        //Define como visível a viewHome que é a padrão ao acessar o programa.
        LimparDesktop();
        pnVisaoGeral.setBackground(new java.awt.Color(153, 204, 0));
        viewHome.setVisible(true);
        try {
            viewHome.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(ViewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @see Método que retorna a aparencia da viewPrincipal ao seu padrão e
     * define como não visivel todos os JInternalFrames, utilizado sempre que
     * uma nova view for definida como visível.
     */
    public final void LimparDesktop() {
        viewAcesso.setVisible(false);
        viewAjuda.setVisible(false);
        viewCaixa.setVisible(false);
        viewEstoque.setVisible(false);
        viewFinanceiro.setVisible(false);
        viewHome.setVisible(false);
        viewPainelControle.setVisible(false);
        viewPoliticaPrivacidade.setVisible(false);
        viewRelatorios.setVisible(false);
        viewTermosUso.setVisible(false);
        pnVisaoGeral.setBackground(new java.awt.Color(51, 51, 51));
        pnVendas.setBackground(new java.awt.Color(51, 51, 51));
        pnEstoque.setBackground(new java.awt.Color(51, 51, 51));
        pnFinanceiro.setBackground(new java.awt.Color(51, 51, 51));
        pnRelatorios.setBackground(new java.awt.Color(51, 51, 51));
        pnPainelControle.setBackground(new java.awt.Color(51, 51, 51));
        pnSair.setBackground(new java.awt.Color(51, 51, 51));
        lbAjuda.setForeground(new java.awt.Color(255, 255, 255));
        lbTermosUso.setForeground(new java.awt.Color(255, 255, 255));
        lbPoliticaPrivacidade.setForeground(new java.awt.Color(255, 255, 255));
    }

    //Componentes padrões do JFrame
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnMenu = new javax.swing.JPanel();
        pnVisaoGeral = new javax.swing.JPanel();
        lbVisaoGeral = new javax.swing.JLabel();
        lbNull = new javax.swing.JLabel();
        pnPainelControle = new javax.swing.JPanel();
        lbPainelControle = new javax.swing.JLabel();
        pnSair = new javax.swing.JPanel();
        lbSair = new javax.swing.JLabel();
        pnVendas = new javax.swing.JPanel();
        lbVendas = new javax.swing.JLabel();
        pnEstoque = new javax.swing.JPanel();
        lbEstoque = new javax.swing.JLabel();
        pnFinanceiro = new javax.swing.JPanel();
        lbFinanceiro = new javax.swing.JLabel();
        pnRelatorios = new javax.swing.JPanel();
        lbRelatorios = new javax.swing.JLabel();
        pnCorpo = new javax.swing.JPanel();
        lbFundoEsquerda = new javax.swing.JLabel();
        dpnCorpo = new javax.swing.JDesktopPane();
        lbFundoDireita = new javax.swing.JLabel();
        pnRodape = new javax.swing.JPanel();
        lbDireitos = new javax.swing.JLabel();
        lbAjuda = new javax.swing.JLabel();
        lbTermosUso = new javax.swing.JLabel();
        lbPoliticaPrivacidade = new javax.swing.JLabel();
        lbVersao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pricipal");

        pnMenu.setBackground(new java.awt.Color(51, 51, 51));

        pnVisaoGeral.setBackground(new java.awt.Color(51, 51, 51));

        lbVisaoGeral.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbVisaoGeral.setForeground(new java.awt.Color(255, 255, 255));
        lbVisaoGeral.setText("VISÃO GERAL");
        lbVisaoGeral.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbVisaoGeralMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbVisaoGeralMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbVisaoGeralMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnVisaoGeralLayout = new javax.swing.GroupLayout(pnVisaoGeral);
        pnVisaoGeral.setLayout(pnVisaoGeralLayout);
        pnVisaoGeralLayout.setHorizontalGroup(
            pnVisaoGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnVisaoGeralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbVisaoGeral)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnVisaoGeralLayout.setVerticalGroup(
            pnVisaoGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbVisaoGeral, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        lbNull.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbNull.setForeground(new java.awt.Color(51, 51, 51));
        lbNull.setText("NULL");

        pnPainelControle.setBackground(new java.awt.Color(51, 51, 51));

        lbPainelControle.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbPainelControle.setForeground(new java.awt.Color(255, 255, 255));
        lbPainelControle.setText("PAINEL DE CONTROLE");
        lbPainelControle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbPainelControleMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbPainelControleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbPainelControleMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnPainelControleLayout = new javax.swing.GroupLayout(pnPainelControle);
        pnPainelControle.setLayout(pnPainelControleLayout);
        pnPainelControleLayout.setHorizontalGroup(
            pnPainelControleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPainelControleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbPainelControle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnPainelControleLayout.setVerticalGroup(
            pnPainelControleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPainelControleLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbPainelControle, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnSair.setBackground(new java.awt.Color(51, 51, 51));

        lbSair.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbSair.setForeground(new java.awt.Color(255, 255, 255));
        lbSair.setText("SAIR");
        lbSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbSairMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbSairMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnSairLayout = new javax.swing.GroupLayout(pnSair);
        pnSair.setLayout(pnSairLayout);
        pnSairLayout.setHorizontalGroup(
            pnSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSairLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnSairLayout.setVerticalGroup(
            pnSairLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        pnVendas.setBackground(new java.awt.Color(51, 51, 51));

        lbVendas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbVendas.setForeground(new java.awt.Color(255, 255, 255));
        lbVendas.setText("VENDAS");
        lbVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbVendasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbVendasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbVendasMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnVendasLayout = new javax.swing.GroupLayout(pnVendas);
        pnVendas.setLayout(pnVendasLayout);
        pnVendasLayout.setHorizontalGroup(
            pnVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnVendasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbVendas)
                .addContainerGap())
        );
        pnVendasLayout.setVerticalGroup(
            pnVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbVendas, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        pnEstoque.setBackground(new java.awt.Color(51, 51, 51));

        lbEstoque.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbEstoque.setForeground(new java.awt.Color(255, 255, 255));
        lbEstoque.setText("ESTOQUE");
        lbEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbEstoqueMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbEstoqueMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbEstoqueMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnEstoqueLayout = new javax.swing.GroupLayout(pnEstoque);
        pnEstoque.setLayout(pnEstoqueLayout);
        pnEstoqueLayout.setHorizontalGroup(
            pnEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnEstoqueLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbEstoque)
                .addContainerGap())
        );
        pnEstoqueLayout.setVerticalGroup(
            pnEstoqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        pnFinanceiro.setBackground(new java.awt.Color(51, 51, 51));

        lbFinanceiro.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbFinanceiro.setForeground(new java.awt.Color(255, 255, 255));
        lbFinanceiro.setText("FINANCEIRO");
        lbFinanceiro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbFinanceiroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbFinanceiroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbFinanceiroMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnFinanceiroLayout = new javax.swing.GroupLayout(pnFinanceiro);
        pnFinanceiro.setLayout(pnFinanceiroLayout);
        pnFinanceiroLayout.setHorizontalGroup(
            pnFinanceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFinanceiroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbFinanceiro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnFinanceiroLayout.setVerticalGroup(
            pnFinanceiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbFinanceiro, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        pnRelatorios.setBackground(new java.awt.Color(51, 51, 51));

        lbRelatorios.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lbRelatorios.setForeground(new java.awt.Color(255, 255, 255));
        lbRelatorios.setText("RELATÓRIOS");
        lbRelatorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbRelatoriosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbRelatoriosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbRelatoriosMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnRelatoriosLayout = new javax.swing.GroupLayout(pnRelatorios);
        pnRelatorios.setLayout(pnRelatoriosLayout);
        pnRelatoriosLayout.setHorizontalGroup(
            pnRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRelatoriosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbRelatorios)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnRelatoriosLayout.setVerticalGroup(
            pnRelatoriosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbRelatorios, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnMenuLayout = new javax.swing.GroupLayout(pnMenu);
        pnMenu.setLayout(pnMenuLayout);
        pnMenuLayout.setHorizontalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMenuLayout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(pnVisaoGeral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnFinanceiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbNull)
                .addGap(5, 5, 5)
                .addComponent(pnPainelControle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
        );
        pnMenuLayout.setVerticalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnMenuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnRelatorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnFinanceiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnPainelControle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnVisaoGeral, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbNull, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pnCorpo.setBackground(new java.awt.Color(153, 153, 153));
        pnCorpo.setPreferredSize(new java.awt.Dimension(0, 3));

        lbFundoEsquerda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/fundoDireita.png"))); // NOI18N

        dpnCorpo.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout dpnCorpoLayout = new javax.swing.GroupLayout(dpnCorpo);
        dpnCorpo.setLayout(dpnCorpoLayout);
        dpnCorpoLayout.setHorizontalGroup(
            dpnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        dpnCorpoLayout.setVerticalGroup(
            dpnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 316, Short.MAX_VALUE)
        );

        lbFundoDireita.setBackground(new java.awt.Color(255, 255, 255));
        lbFundoDireita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/imagens/fundoEsquerda.png"))); // NOI18N

        javax.swing.GroupLayout pnCorpoLayout = new javax.swing.GroupLayout(pnCorpo);
        pnCorpo.setLayout(pnCorpoLayout);
        pnCorpoLayout.setHorizontalGroup(
            pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCorpoLayout.createSequentialGroup()
                .addComponent(lbFundoEsquerda)
                .addGap(0, 0, 0)
                .addComponent(dpnCorpo)
                .addGap(0, 0, 0)
                .addComponent(lbFundoDireita))
        );
        pnCorpoLayout.setVerticalGroup(
            pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCorpoLayout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(pnCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbFundoDireita, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lbFundoEsquerda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(dpnCorpo))
                .addGap(3, 3, 3))
        );

        pnRodape.setBackground(new java.awt.Color(51, 51, 51));

        lbDireitos.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        lbDireitos.setForeground(new java.awt.Color(255, 255, 255));
        lbDireitos.setText("2015 - 2016 Controle de Papelaria");

        lbAjuda.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        lbAjuda.setForeground(new java.awt.Color(255, 255, 255));
        lbAjuda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAjuda.setText("Ajuda");
        lbAjuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbAjudaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbAjudaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbAjudaMouseExited(evt);
            }
        });

        lbTermosUso.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        lbTermosUso.setForeground(new java.awt.Color(255, 255, 255));
        lbTermosUso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTermosUso.setText("Termos de Uso");
        lbTermosUso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbTermosUsoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbTermosUsoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbTermosUsoMouseExited(evt);
            }
        });

        lbPoliticaPrivacidade.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        lbPoliticaPrivacidade.setForeground(new java.awt.Color(255, 255, 255));
        lbPoliticaPrivacidade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPoliticaPrivacidade.setText("Política de Privacidade");
        lbPoliticaPrivacidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbPoliticaPrivacidadeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbPoliticaPrivacidadeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbPoliticaPrivacidadeMouseExited(evt);
            }
        });

        lbVersao.setFont(new java.awt.Font("Arial", 0, 9)); // NOI18N
        lbVersao.setForeground(new java.awt.Color(255, 255, 255));
        lbVersao.setText("Versão 0.2015.05.06 Alfa");

        javax.swing.GroupLayout pnRodapeLayout = new javax.swing.GroupLayout(pnRodape);
        pnRodape.setLayout(pnRodapeLayout);
        pnRodapeLayout.setHorizontalGroup(
            pnRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRodapeLayout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(lbDireitos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbAjuda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTermosUso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbPoliticaPrivacidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbVersao)
                .addGap(170, 170, 170))
        );
        pnRodapeLayout.setVerticalGroup(
            pnRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnRodapeLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnRodapeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbAjuda)
                        .addComponent(lbTermosUso)
                        .addComponent(lbPoliticaPrivacidade)
                        .addComponent(lbVersao))
                    .addComponent(lbDireitos, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnRodape, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnCorpo, javax.swing.GroupLayout.DEFAULT_SIZE, 1012, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnCorpo, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(pnRodape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     *
     * @see Métodos que realizarão a interação entre todos os JInternalFrames e
     * o JDesktopPane da ViewPrincipal, MouseClicked chama a função
     * LimparDesktop e define como visível uma nova view no JDesktopPane.
     * MouseEntered acontece ao passar o mouse pela label, muda a cor da mesma.
     * MouseExited acontece ao retirar o mouse da label, retorna a cor padrão.
     *
     * @param evt
     */
    private void lbVisaoGeralMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbVisaoGeralMouseClicked
        LimparDesktop();
        pnVisaoGeral.setBackground(new java.awt.Color(153, 204, 0));
        viewHome.setVisible(true);
        try {
            viewHome.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(ViewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbVisaoGeralMouseClicked

    private void lbVisaoGeralMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbVisaoGeralMouseEntered
        if (viewHome.isVisible() == false) {
            pnVisaoGeral.setBackground(new java.awt.Color(00, 00, 00));
        }
    }//GEN-LAST:event_lbVisaoGeralMouseEntered

    private void lbVisaoGeralMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbVisaoGeralMouseExited
        if (viewHome.isVisible() == false) {
            pnVisaoGeral.setBackground(new java.awt.Color(51, 51, 51));
        }
    }//GEN-LAST:event_lbVisaoGeralMouseExited

    private void lbVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbVendasMouseClicked
        LimparDesktop();
        pnVendas.setBackground(new java.awt.Color(153, 204, 0));
        viewCaixa.setVisible(true);
        try {
            viewCaixa.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(ViewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbVendasMouseClicked

    private void lbVendasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbVendasMouseEntered
        if (viewCaixa.isVisible() == false) {
            pnVendas.setBackground(new java.awt.Color(00, 00, 00));
        }
    }//GEN-LAST:event_lbVendasMouseEntered

    private void lbVendasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbVendasMouseExited
        if (viewCaixa.isVisible() == false) {
            pnVendas.setBackground(new java.awt.Color(51, 51, 51));
        }
    }//GEN-LAST:event_lbVendasMouseExited

    private void lbEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEstoqueMouseClicked
        LimparDesktop();
        pnEstoque.setBackground(new java.awt.Color(153, 204, 0));
        viewEstoque.setVisible(true);
        try {
            viewEstoque.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(ViewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbEstoqueMouseClicked

    private void lbEstoqueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEstoqueMouseEntered
        if (viewEstoque.isVisible() == false) {
            pnEstoque.setBackground(new java.awt.Color(00, 00, 00));
        }
    }//GEN-LAST:event_lbEstoqueMouseEntered

    private void lbEstoqueMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEstoqueMouseExited
        if (viewEstoque.isVisible() == false) {
            pnEstoque.setBackground(new java.awt.Color(51, 51, 51));
        }
    }//GEN-LAST:event_lbEstoqueMouseExited

    private void lbFinanceiroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbFinanceiroMouseClicked
        LimparDesktop();
        pnFinanceiro.setBackground(new java.awt.Color(153, 204, 0));
        viewFinanceiro.setVisible(true);
        try {
            viewFinanceiro.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(ViewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbFinanceiroMouseClicked

    private void lbFinanceiroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbFinanceiroMouseEntered
        if (viewFinanceiro.isVisible() == false) {
            pnFinanceiro.setBackground(new java.awt.Color(00, 00, 00));
        }
    }//GEN-LAST:event_lbFinanceiroMouseEntered

    private void lbFinanceiroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbFinanceiroMouseExited
        if (viewFinanceiro.isVisible() == false) {
            pnFinanceiro.setBackground(new java.awt.Color(51, 51, 51));
        }
    }//GEN-LAST:event_lbFinanceiroMouseExited

    private void lbRelatoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbRelatoriosMouseClicked
        LimparDesktop();
        pnRelatorios.setBackground(new java.awt.Color(153, 204, 0));
        viewRelatorios.setVisible(true);
        try {
            viewRelatorios.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(ViewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbRelatoriosMouseClicked

    private void lbRelatoriosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbRelatoriosMouseEntered
        if (viewRelatorios.isVisible() == false) {
            pnRelatorios.setBackground(new java.awt.Color(00, 00, 00));
        }
    }//GEN-LAST:event_lbRelatoriosMouseEntered

    private void lbRelatoriosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbRelatoriosMouseExited
        if (viewRelatorios.isVisible() == false) {
            pnRelatorios.setBackground(new java.awt.Color(51, 51, 51));
        }
    }//GEN-LAST:event_lbRelatoriosMouseExited

    private void lbPainelControleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPainelControleMouseClicked
        LimparDesktop();
        pnPainelControle.setBackground(new java.awt.Color(153, 204, 0));
        viewPainelControle.setVisible(true);
        try {
            viewPainelControle.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(ViewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbPainelControleMouseClicked

    private void lbPainelControleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPainelControleMouseEntered
        if (viewPainelControle.isVisible() == false) {
            pnPainelControle.setBackground(new java.awt.Color(00, 00, 00));
        }
    }//GEN-LAST:event_lbPainelControleMouseEntered

    private void lbPainelControleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPainelControleMouseExited
        if (viewPainelControle.isVisible() == false) {
            pnPainelControle.setBackground(new java.awt.Color(51, 51, 51));
        }
    }//GEN-LAST:event_lbPainelControleMouseExited

    private void lbSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSairMouseClicked
        if (JOptionPane.showConfirmDialog(null, "Tem certeza que deseja sair?", "Alerta", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            LimparDesktop();
            ocultarMenu();
            viewAcesso.setVisible(true);
            try {
                viewAcesso.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(ViewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_lbSairMouseClicked

    private void lbSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSairMouseEntered
        pnSair.setBackground(new java.awt.Color(00, 00, 00));
    }//GEN-LAST:event_lbSairMouseEntered

    private void lbSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSairMouseExited
        pnSair.setBackground(new java.awt.Color(51, 51, 51));
    }//GEN-LAST:event_lbSairMouseExited

    private void lbAjudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAjudaMouseClicked
        LimparDesktop();
        viewAjuda.setVisible(true);
        try {
            viewAjuda.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(ViewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbAjudaMouseClicked

    private void lbAjudaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAjudaMouseEntered
        if (viewAjuda.isVisible() == false) {
            lbAjuda.setForeground(new java.awt.Color(153, 204, 0));
        }
    }//GEN-LAST:event_lbAjudaMouseEntered

    private void lbAjudaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAjudaMouseExited
        if (viewAjuda.isVisible() == false) {
            lbAjuda.setForeground(new java.awt.Color(255, 255, 255));
        }
    }//GEN-LAST:event_lbAjudaMouseExited

    private void lbTermosUsoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTermosUsoMouseClicked
        LimparDesktop();
        viewTermosUso.setVisible(true);
        try {
            viewTermosUso.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(ViewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbTermosUsoMouseClicked

    private void lbTermosUsoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTermosUsoMouseEntered
        if (viewTermosUso.isVisible() == false) {
            lbTermosUso.setForeground(new java.awt.Color(153, 204, 0));
        }
    }//GEN-LAST:event_lbTermosUsoMouseEntered

    private void lbTermosUsoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbTermosUsoMouseExited
        if (viewTermosUso.isVisible() == false) {
            lbTermosUso.setForeground(new java.awt.Color(255, 255, 255));
        }
    }//GEN-LAST:event_lbTermosUsoMouseExited

    private void lbPoliticaPrivacidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPoliticaPrivacidadeMouseClicked
        LimparDesktop();
        viewPoliticaPrivacidade.setVisible(true);
        try {
            viewPoliticaPrivacidade.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(ViewPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_lbPoliticaPrivacidadeMouseClicked

    private void lbPoliticaPrivacidadeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPoliticaPrivacidadeMouseEntered
        if (viewPoliticaPrivacidade.isVisible() == false) {
            lbPoliticaPrivacidade.setForeground(new java.awt.Color(153, 204, 0));
        }
    }//GEN-LAST:event_lbPoliticaPrivacidadeMouseEntered

    private void lbPoliticaPrivacidadeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbPoliticaPrivacidadeMouseExited
        if (viewPoliticaPrivacidade.isVisible() == false) {
            lbPoliticaPrivacidade.setForeground(new java.awt.Color(255, 255, 255));
        }
    }//GEN-LAST:event_lbPoliticaPrivacidadeMouseExited
    //FIM dos Métodos de interação entre todos os JInternalFrames e o JDesktopPane da ViewPrincipal.

    /**
     *
     * @see Método principal da classe, carrega lookAndFeel padrão como Windows
     * e define a ViewPrincipal visível.
     *
     * @param args
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new ViewPrincipal().setVisible(true);
        });
    }

    //Declaração de variáveis(Views).
    private ViewAcesso viewAcesso;
    private ViewAjuda viewAjuda;
    private ViewVendas viewCaixa;
    private ViewEstoque viewEstoque;
    private ViewFinanceiro viewFinanceiro;
    private ViewVisaoGeral viewHome;
    private ViewPainelControle viewPainelControle;
    private ViewPoliticaPrivacidade viewPoliticaPrivacidade;
    private ViewRelatorios viewRelatorios;
    private ViewTermosUso viewTermosUso;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpnCorpo;
    private javax.swing.JLabel lbAjuda;
    private javax.swing.JLabel lbDireitos;
    private javax.swing.JLabel lbEstoque;
    private javax.swing.JLabel lbFinanceiro;
    private javax.swing.JLabel lbFundoDireita;
    private javax.swing.JLabel lbFundoEsquerda;
    private javax.swing.JLabel lbNull;
    private javax.swing.JLabel lbPainelControle;
    private javax.swing.JLabel lbPoliticaPrivacidade;
    private javax.swing.JLabel lbRelatorios;
    private javax.swing.JLabel lbSair;
    private javax.swing.JLabel lbTermosUso;
    private javax.swing.JLabel lbVendas;
    private javax.swing.JLabel lbVersao;
    private javax.swing.JLabel lbVisaoGeral;
    private javax.swing.JPanel pnCorpo;
    private javax.swing.JPanel pnEstoque;
    private javax.swing.JPanel pnFinanceiro;
    private javax.swing.JPanel pnMenu;
    private javax.swing.JPanel pnPainelControle;
    private javax.swing.JPanel pnRelatorios;
    private javax.swing.JPanel pnRodape;
    private javax.swing.JPanel pnSair;
    private javax.swing.JPanel pnVendas;
    private javax.swing.JPanel pnVisaoGeral;
    // End of variables declaration//GEN-END:variables
}
