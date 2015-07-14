package br.com.models.tabelas;

import br.com.models.vo.Recebimento;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * @see Classe modelo. Modela uma tabela para possuir todos os campos de valores
 * da classe Recebimento.
 * @author Bruna Danieli Ribeiro Gonçalves, Márlon Ândrel Coelho Freitas
 */
public class TableModelRecebimento extends AbstractTableModel {

    //Declaração de variáveis.
    private final List<Recebimento> linhas;
    private final String[] colunas;

    //Declaração de variáveis que compoem os campos da tabela.
    private static final int statusRecebimento = 0;
    private static final int valorRecebimento = 1;
    private static final int dataRecebimento = 2;

    /**
     * @see Construtor padrão. Inicializa as linhas da coluna como nulo e define
     * as colunas com os valores do objeto.
     */
    public TableModelRecebimento() {
        linhas = new ArrayList<>();
        colunas = new String[]{"Pago", "Valor", "Data"};
    }

    /**
     * @see Contrutor que inicializa as linhas da coluna com a lista recebida
     * pelo parâmetro e define as colunas com os valores do objeto.
     * @param recebimentos
     */
    public TableModelRecebimento(List<Recebimento> recebimentos) {
        linhas = new ArrayList<>(recebimentos);
        colunas = new String[]{"Pago", "Valor", "Data"};
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
            case statusRecebimento:
                return Boolean.class;
            case valorRecebimento:
                return BigDecimal.class;
            case dataRecebimento:
                return Date.class;
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Recebimento recebimento = linhas.get(rowIndex);
        switch (columnIndex) {
            case statusRecebimento:
                return recebimento.getStatusRecebimento();
            case valorRecebimento:
                return recebimento.getValorRecebimento();
            case dataRecebimento:
                return recebimento.getDataRecebimento();
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Recebimento recebimento = linhas.get(rowIndex);
        switch (columnIndex) {
            case statusRecebimento:
                recebimento.setStatusRecebimento((Boolean) aValue);
                break;
            case valorRecebimento:
                recebimento.setValorRecebimento((BigDecimal) (aValue));
                break;
            case dataRecebimento:
                recebimento.setDataRecebimento((Date) (aValue));
                break;
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }

    public Recebimento getRecebimento(int rowIndex) {
        return linhas.get(rowIndex);
    }

    /**
     * @see Método que adiciona uma nova linha com os valores do objeto recebido
     * como parâmetro.
     * @param recebimento
     */
    public void addPagamento(Recebimento recebimento) {
        linhas.add(recebimento);
        int ultimoIndice = getRowCount() - 1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }

    /**
     * @see Método que adiciona uma lista de linhas com a lista de objetos
     * recebida como parâmetro.
     * @param recebimentos
     */
    public void addListaPagamentos(List<Recebimento> recebimentos) {
        int indice = getRowCount();
        linhas.addAll(recebimentos);
        fireTableRowsInserted(indice, indice + recebimentos.size());
    }

    /**
     * @see Método que remove linha da tabela atravez do index rebecido como
     * parâmetro.
     * @param rowIndex numero da linha da tabela.
     */
    public void removeRecebimento(int rowIndex) {
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
