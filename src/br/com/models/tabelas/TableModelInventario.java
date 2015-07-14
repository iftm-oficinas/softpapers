package br.com.models.tabelas;

import br.com.models.vo.Produto;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * @see Classe modelo. Modela uma tabela para possuir todos os campos de valores
 * do Inventario.
 * @author Bruna Danieli Ribeiro Gonçalves, Márlon Ândrel Coelho Freitas
 */
public class TableModelInventario extends AbstractTableModel {

    //Declaração de variáveis.
    private final List<Produto> linhas;
    private final String[] colunas;

    //Declaração de variáveis que compoem os campos da tabela.
    private static final int descricaoProduto = 0;
    private static final int valorProduto = 1;
    private static final int minimoProduto = 2;
    private static final int maximoProduto = 3;
    private static final int estoqueProduto = 4;

    /**
     * @see Construtor padrão. Inicializa as linhas da coluna como nulo e define
     * as colunas com os valores do objeto.
     */
    public TableModelInventario() {
        linhas = new ArrayList<>();
        colunas = new String[]{"Produto", "Valor", "Minimo", "Maximo", "Estoque"};
    }

    /**
     * @see Contrutor que inicializa as linhas da coluna com a lista recebida
     * pelo parâmetro e define as colunas com os valores do objeto.
     * @param produtos
     */
    public TableModelInventario(List<Produto> produtos) {
        linhas = new ArrayList<>(produtos);
        colunas = new String[]{"Produto", "Valor", "Minimo", "Maximo", "Estoque"};
    }

    //Gets and Sets
    @Override
    public int getRowCount() {
        return linhas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case descricaoProduto:
                return String.class;
            case valorProduto:
                return BigDecimal.class;
            case minimoProduto:
                return Long.class;
            case maximoProduto:
                return Long.class;
            case estoqueProduto:
                return Long.class;
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Produto produto = linhas.get(rowIndex);
        switch (columnIndex) {
            case descricaoProduto:
                return produto.getDescricaoProduto();
            case valorProduto:
                return produto.getVendaProduto();
            case minimoProduto:
                return produto.getMinimoProduto();
            case maximoProduto:
                return produto.getMaximoProduto();
            case estoqueProduto:
                return produto.getEstoqueProduto();
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Produto produto = linhas.get(rowIndex);
        switch (columnIndex) {
            case descricaoProduto:
                produto.setDescricaoProduto((String) aValue);
                break;
            case valorProduto:
                produto.setVendaProduto((BigDecimal) aValue);
                break;
            case minimoProduto:
                produto.setMinimoProduto((Long) aValue);
                break;
            case maximoProduto:
                produto.setMaximoProduto((Long) aValue);
                break;
            case estoqueProduto:
                produto.setEstoqueProduto((Long) (aValue));
                break;
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }

    public Produto getProduto(int rowIndex) {
        return linhas.get(rowIndex);
    }

    /**
     * @see Método que adiciona uma nova linha com os valores do objeto recebido
     * como parâmetro.
     * @param produto Usuario que compoe uma linha da tabela.
     */
    public void addProduto(Produto produto) {
        linhas.add(produto);
        int ultimoIndice = getRowCount() - 1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }

    /**
     * @see Método que adiciona uma lista de linhas com a lista de objetos
     * recebida como parâmetro.
     * @param produtos
     */
    public void addListaProdutos(List<Produto> produtos) {
        int indice = getRowCount();
        linhas.addAll(produtos);
        fireTableRowsInserted(indice, indice + produtos.size());
    }

    /**
     * @see Método que remove linha da tabela atravez do index rebecido como
     * parâmetro.
     * @param rowIndex numero da linha da tabela.
     */
    public void removeProduto(int rowIndex) {
        linhas.remove(rowIndex);
        fireTableRowsDeleted(rowIndex, rowIndex);
    }

    /**
     * @see Método que remove todas as linhas da tabela.
     */
    public void limpar() {
        linhas.clear();
        fireTableDataChanged();
    }
}
