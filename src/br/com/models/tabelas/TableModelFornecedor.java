package br.com.models.tabelas;

import br.com.models.vo.Fornecedor;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @see Classe modelo. Modela uma tabela para possuir todos os campos de valores
 * do Fornecedor.
 *
 * @author Bruna Danieli Ribeiro Gonçalves, Márlon Ândrel Coelho Freitas
 */
public class TableModelFornecedor extends AbstractTableModel {

    //Declaração de variáveis.
    private final List<Fornecedor> linhas;
    private final String[] colunas;

    //Declaração de variáveis que compoem os campos da tabela.
    private static final int idFornecedor = 0;
    private static final int nomeFornecedor = 1;
    private static final int telefoneFornecedor = 2;
    private static final int dataCriacao = 3;
    private static final int dataAtualizacao = 4;

    /**
     *
     * @see Construtor padrão. Inicializa as linhas da coluna como nulo e define
     * as colunas com os valores do objeto.
     */
    public TableModelFornecedor() {
        linhas = new ArrayList<>();
        colunas = new String[]{"Fornecedor", "Nome", "Telefone", "Criação", "Atualização"};
    }

    /**
     *
     * @see Contrutor que inicializa as linhas da coluna com a lista recebida
     * pelo parâmetro e define as colunas com os valores do objeto.
     *
     * @param fornecedor
     */
    public TableModelFornecedor(List<Fornecedor> fornecedor) {
        linhas = new ArrayList<>(fornecedor);
        colunas = new String[]{"Fornecedor", "Nome", "Telefone", "Criação", "Atualização"};
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
            case idFornecedor:
                return Long.class;
            case nomeFornecedor:
                return String.class;
            case telefoneFornecedor:
                return String.class;
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
        Fornecedor fornecedor = linhas.get(rowIndex);
        switch (columnIndex) {
            case idFornecedor:
                return fornecedor.getIdFornecedor();
            case nomeFornecedor:
                return fornecedor.getNomeFornecedor();
            case telefoneFornecedor:
                return fornecedor.getTelefoneFornecedor();
            case dataCriacao:
                return fornecedor.getDataCriacao();
            case dataAtualizacao:
                return fornecedor.getDataAtualizacao();
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Fornecedor fornecedor = linhas.get(rowIndex);
        switch (columnIndex) {
            case idFornecedor:
                fornecedor.setIdFornecedor((Long) aValue);
                break;
            case nomeFornecedor:
                fornecedor.setNomeFornecedor((String) aValue);
                break;
            case telefoneFornecedor:
                fornecedor.setTelefoneFornecedor((String) aValue);
                break;
            case dataCriacao:
                fornecedor.setDataCriacao((Date) aValue);
                break;
            case dataAtualizacao:
                fornecedor.setDataAtualizacao((Date) aValue);
                break;
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }

    public Fornecedor getFornecedor(int rowIndex) {
        return linhas.get(rowIndex);
    }

    /**
     *
     * @see Método que adiciona uma nova linha com os valores do objeto recebido
     * como parâmetro.
     *
     * @param fornecedor Usuario que compoe uma linha da tabela.
     */
    public void addFornecedor(Fornecedor fornecedor) {
        linhas.add(fornecedor);
        int ultimoIndice = getRowCount() - 1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }

    /**
     *
     * @see Método que adiciona uma lista de linhas com a lista de objetos
     * recebida como parâmetro.
     *
     * @param fornecedores
     */
    public void addListaFornecedores(List<Fornecedor> fornecedores) {
        int indice = getRowCount();
        linhas.addAll(fornecedores);
        fireTableRowsInserted(indice, indice + fornecedores.size());
    }

    /**
     *
     * @see Método que remove linha da tabela atravez do index rebecido como
     * parâmetro.
     *
     * @param rowIndex numero da linha da tabela.
     */
    public void removeFornecedores(int rowIndex) {
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
