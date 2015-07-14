package br.com.models.tabelas;

import br.com.models.vo.Cliente;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @see Classe modelo. Modela uma tabela para possuir todos os campos de valores
 * do Cliente.
 *
 * @author Bruna Danieli Ribeiro Gonçalves, Márlon Ândrel Coelho Freitas
 */
public class TableModelCliente extends AbstractTableModel {

    //Declaração de variáveis.
    private final List<Cliente> linhas;
    private final String[] colunas;

    //Declaração de variáveis que compoem os campos da tabela.
    private static final int nomeCliente = 0;
    private static final int pessoaCliente = 1;
    private static final int emailCliente = 2;
    private static final int TelefoneCliente = 3;
    private static final int criacaoCliente = 4;
    private static final int atualizacaoCliente = 5;

    /**
     *
     * @see Construtor padrão. Inicializa as linhas da coluna como nulo e define
     * as colunas com os valores do objeto.
     */
    public TableModelCliente() {
        linhas = new ArrayList<>();
        colunas = new String[]{"Cliente", "Pessoa", "E-mail", "Telefone", "Criação", "Atualização"};
    }

    /**
     *
     * @see Contrutor que inicializa as linhas da coluna com a lista recebida
     * pelo parâmetro e define as colunas com os valores do objeto.
     *
     * @param clientes
     */
    public TableModelCliente(List<Cliente> clientes) {
        linhas = new ArrayList<>(clientes);
        colunas = new String[]{"Cliente", "Pessoa", "E-mail", "Telefone", "Criação", "Atualização"};
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
            case nomeCliente:
                return String.class;
            case pessoaCliente:
                return String.class;
            case emailCliente:
                return String.class;
            case TelefoneCliente:
                return String.class;
            case criacaoCliente:
                return Date.class;
            case atualizacaoCliente:
                return Date.class;
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Cliente cliente = linhas.get(rowIndex);
        switch (columnIndex) {
            case nomeCliente:
                return cliente.getNomeCliente();
            case pessoaCliente:
                return cliente.getPessoa().getTipoPessoa();
            case emailCliente:
                return cliente.getContato().getEmailContato();
            case TelefoneCliente:
                return cliente.getContato().getTelefoneContato();
            case criacaoCliente:
                return cliente.getCriacaoCliente();
            case atualizacaoCliente:
                return cliente.getAtualizacaoCliente();
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Cliente cliente = linhas.get(rowIndex);
        switch (columnIndex) {
            case nomeCliente:
                cliente.setNomeCliente((String) aValue);
                break;
            case pessoaCliente:
                cliente.getPessoa().setTipoPessoa((String) (aValue));
                break;
            case emailCliente:
                cliente.getContato().setEmailContato((String) (aValue));
                break;
            case TelefoneCliente:
                cliente.getContato().setTelefoneContato((String) (aValue));
                break;
            case criacaoCliente:
                cliente.setCriacaoCliente((Date) (aValue));
                break;
            case atualizacaoCliente:
                cliente.setAtualizacaoCliente((Date) (aValue));
                break;
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }

    public Cliente getCliente(int rowIndex) {
        return linhas.get(rowIndex);
    }

    /**
     *
     * @see Método que adiciona uma nova linha com os valores do objeto recebido
     * como parâmetro.
     *
     * @param cliente Usuario que compoe uma linha da tabela.
     */
    public void addCliente(Cliente cliente) {
        linhas.add(cliente);
        int ultimoIndice = getRowCount() - 1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }

    /**
     *
     * @see Método que adiciona uma lista de linhas com a lista de objetos
     * recebida como parâmetro.
     *
     * @param clientes
     */
    public void addListaClientes(List<Cliente> clientes) {
        int indice = getRowCount();
        linhas.addAll(clientes);
        fireTableRowsInserted(indice, indice + clientes.size());
    }

    /**
     *
     * @see Método que remove linha da tabela atravez do index rebecido como
     * parâmetro.
     *
     * @param rowIndex numero da linha da tabela.
     */
    public void removeCliente(int rowIndex) {
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
