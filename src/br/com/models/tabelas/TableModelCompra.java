package br.com.models.tabelas;

import br.com.models.vo.Compra;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 * @see Classe modelo. Modela uma tabela para possuir todos os campos de valores
 * do Compra.
 * @author Bruna Danieli Ribeiro Gonçalves, Márlon Ândrel Coelho Freitas
 */
public class TableModelCompra extends AbstractTableModel {

    //Declaração de variáveis.
    private final List<Compra> linhas;
    private final String[] colunas;

    //Declaração de variáveis que compoem os campos da tabela.
    private static final int fornecedorCompra = 0;
    private static final int valorCompra = 1;
    private static final int parcelasCompra = 2;
    private static final int vencimentoCompra = 3;
    private static final int criacaoCompra = 4;
    private static final int atualizacaoCompra = 5;

    /**
     * @see Construtor padrão. Inicializa as linhas da coluna como nulo e define
     * as colunas com os valores do objeto.
     */
    public TableModelCompra() {
        linhas = new ArrayList<>();
        colunas = new String[]{"Fornecedor", "Valor", "Parcelas", "Vencimento", "Criação", "Atualização"};
    }

    /**
     * @see Contrutor que inicializa as linhas da coluna com a lista recebida
     * pelo parâmetro e define as colunas com os valores do objeto.
     * @param compras
     */
    public TableModelCompra(List<Compra> compras) {
        linhas = new ArrayList<>(compras);
        colunas = new String[]{"Fornecedor", "Valor", "Parcelas", "Vencimento", "Criação", "Atualização"};
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
            case fornecedorCompra:
                return String.class;
            case valorCompra:
                return BigDecimal.class;
            case parcelasCompra:
                return Integer.class;
            case vencimentoCompra:
                return Date.class;
            case criacaoCompra:
                return Date.class;
            case atualizacaoCompra:
                return Date.class;
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Compra compra = linhas.get(rowIndex);
        switch (columnIndex) {
            case fornecedorCompra:
                if(compra.getFornecedor() != null){
                    return compra.getFornecedor().getNomeFornecedor();
                } else {
                    return "SEM FORNECEDOR";
                }
            case valorCompra:
                return compra.getValorCompra();
            case parcelasCompra:
                return compra.getParcelasCompra();
            case vencimentoCompra:
                return compra.getVencimentoCompra();
            case criacaoCompra:
                return compra.getCriacaoCompra();
            case atualizacaoCompra:
                return compra.getAtualizacaoCompra();
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Compra compra = linhas.get(rowIndex);
        switch (columnIndex) {
            case fornecedorCompra:
                compra.getFornecedor().setNomeFornecedor((String) aValue);
                break;
            case valorCompra:
                compra.setValorCompra((BigDecimal) (aValue));
                break;
            case parcelasCompra:
                compra.setParcelasCompra((Integer) (aValue));
                break;
            case vencimentoCompra:
                compra.setVencimentoCompra((Date) (aValue));
                break;
            case criacaoCompra:
                compra.setCriacaoCompra((Date) (aValue));
                break;
            case atualizacaoCompra:
                compra.setAtualizacaoCompra((Date) (aValue));
                break;
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }

    public Compra getCompra(int rowIndex) {
        return linhas.get(rowIndex);
    }

    /**
     * @see Método que adiciona uma nova linha com os valores do objeto recebido
     * como parâmetro.
     * @param compra Usuario que compoe uma linha da tabela.
     */
    public void addCompra(Compra compra) {
        linhas.add(compra);
        int ultimoIndice = getRowCount() - 1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }

    /**
     * @see Método que adiciona uma lista de linhas com a lista de objetos
     * recebida como parâmetro.
     * @param compras
     */
    public void addListaCompras(List<Compra> compras) {
        int indice = getRowCount();
        linhas.addAll(compras);
        fireTableRowsInserted(indice, indice + compras.size());
    }

    /**
     * @see Método que remove linha da tabela atravez do index rebecido como
     * parâmetro.
     * @param rowIndex numero da linha da tabela.
     */
    public void removeCompra(int rowIndex) {
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
