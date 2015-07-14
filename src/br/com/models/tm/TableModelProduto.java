package br.com.models.tm;

import br.com.models.vo.Categoria;
import br.com.models.vo.Fornecedor;
import br.com.models.vo.Produto;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @see Classe modelo. Modela uma tabela para possuir todos os campos de valores
 * do Usuario.
 *
 * @author Bruna Danieli Ribeiro Gonçalves, Márlon Ândrel Coelho Freitas
 */
public class TableModelProduto extends AbstractTableModel {

    //Declaração de variáveis.
    private final List<Produto> linhas;
    private final String[] colunas;

    //Declaração de variáveis que compoem os campos da tabela.
    private static final int idProduto = 0;
    private static final int nomeProduto = 1;
    private static final int categoriaProduto = 2;
    private static final int fornecedorProduto = 3;
    private static final int valorProduto = 4;
    private static final int quantidadeMinimaProduto = 5;
    private static final int dataCriacao = 6;
    private static final int dataAtualizacao = 7;

    /**
     *
     * @see Construtor padrão. Inicializa as linhas da coluna como nulo e define
     * as colunas com os valores do objeto.
     */
    public TableModelProduto() {
        linhas = new ArrayList<>();
        colunas = new String[]{"Produto", "Nome", "Categoria", "Fornecedor", "Valor", "Quantidade min.", "Criação", "Atualização"};
    }

    /**
     *
     * @see Contrutor que inicializa as linhas da coluna com a lista recebida
     * pelo parâmetro e define as colunas com os valores do objeto.
     *
     * @param produtos
     */
    public TableModelProduto(List<Produto> produtos) {
        linhas = new ArrayList<>(produtos);
        colunas = new String[]{"Produto", "Nome", "Categoria", "Fornecedor", "Valor", "Quantidade min.", "Criação", "Atualização"};
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
            case idProduto:
                return Long.class;
            case nomeProduto:
                return String.class;
            case categoriaProduto:
                return Categoria.class;
            case fornecedorProduto:
                return Fornecedor.class;
            case valorProduto:
                return BigDecimal.class;
            case quantidadeMinimaProduto:
                return Integer.class;
            case dataCriacao:
                return Date.class;
            case dataAtualizacao:
                return Date.class;
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Produto produto = linhas.get(rowIndex);
        switch (columnIndex) {
            case idProduto:
                return produto.getIdProduto();
            case nomeProduto:
                return produto.getNomeProduto();
            case categoriaProduto:
                return produto.getCategoria();
            case fornecedorProduto:
                return produto.getFornecedor();
            case valorProduto:
                return produto.getValorProduto();
            case quantidadeMinimaProduto:
                return produto.getQuantidadeMinimaProduto();
            case dataCriacao:
                return produto.getDataCriacao();
            case dataAtualizacao:
                return produto.getDataAtualizacao();
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Produto produto = linhas.get(rowIndex);
        switch (columnIndex) {
            case idProduto:
                produto.setIdProduto((Long) aValue);
                break;
            case nomeProduto:
                produto.setNomeProduto((String) aValue);
                break;
            case categoriaProduto:
                produto.setCategoria((Categoria) aValue);
                break;
            case fornecedorProduto:
                produto.setFornecedor((Fornecedor) aValue);
                break;
            case quantidadeMinimaProduto:
                produto.setQuantidadeMinimaProduto((Integer) aValue);
                break;
            case valorProduto:
                produto.setValorProduto((BigDecimal) aValue);
                break;
            case dataCriacao:
                produto.setDataCriacao((Date) aValue);
                break;
            case dataAtualizacao:
                produto.setDataAtualizacao((Date) aValue);
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
     *
     * @see Método que adiciona uma nova linha com os valores do objeto recebido
     * como parâmetro.
     *
     * @param produto Usuario que compoe uma linha da tabela.
     */
    public void addProduto(Produto produto) {
        linhas.add(produto);
        int ultimoIndice = getRowCount() - 1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }

    /**
     *
     * @see Método que adiciona uma lista de linhas com a lista de objetos
     * recebida como parâmetro.
     *
     * @param produtos
     */
    public void addListaProdutos(List<Produto> produtos) {
        int indice = getRowCount();
        linhas.addAll(produtos);
        fireTableRowsInserted(indice, indice + produtos.size());
    }

    /**
     *
     * @see Método que remove linha da tabela atravez do index rebecido como
     * parâmetro.
     *
     * @param rowIndex numero da linha da tabela.
     */
    public void removeProduto(int rowIndex) {
        linhas.remove(rowIndex);
        fireTableRowsDeleted(rowIndex, rowIndex);
    }

    /**
     * 
     * @see Método que remove todas as linhas da tabela.
     */
    public void limpar() {
        linhas.clear();
        fireTableDataChanged();
    }
}
