package br.com.models.tm;

import br.com.models.vo.Cliente;
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
public class TableModelCliente extends AbstractTableModel {

    //Declaração de variáveis.
    private final List<Cliente> linhas;
    private final String[] colunas;

    //Declaração de variáveis que compoem os campos da tabela.
    private static final int idCliente = 0;
    private static final int nomeCliente = 1;
    private static final int cpfCliente = 2;
    private static final int rgCliente = 3;
    private static final int telefone = 4;
    private static final int dataNascimento = 5;
    private static final int enderecoCliente = 6;
    private static final int emailCliente = 7;
    private static final int sexoCliente = 8;
    private static final int dataCriacao = 9;
    private static final int dataAtualizacao = 10;

    /**
     *
     * @see Construtor padrão. Inicializa as linhas da coluna como nulo e define
     * as colunas com os valores do objeto.
     */
    public TableModelCliente() {
        linhas = new ArrayList<>();
        colunas = new String[]{"Cliente", "Nome", "Cpf", "Rg", "Telefone", "Nascimento", "Endereço", "Email", "Sexo", "Criação", "Atualização"};
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
        colunas = new String[]{"Cliente", "Nome", "Cpf", "Rg", "Telefone", "Nascimento", "Endereço", "Email", "Sexo", "Criação", "Atualização"};
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
            case idCliente:
                return Long.class;
            case nomeCliente:
                return String.class;
            case cpfCliente:
                return String.class;
            case rgCliente:
                return String.class;
            case telefone:
                return String.class;
            case dataNascimento:
                return Date.class;
            case enderecoCliente:
                return String.class;
            case emailCliente:
                return String.class;
            case sexoCliente:
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
        Cliente cliente = linhas.get(rowIndex);
        switch (columnIndex) {
            case idCliente:
                return cliente.getIdCliente();
            case nomeCliente:
                return cliente.getNomeCliente();
            case cpfCliente:
                return cliente.getCpfCliente();
            case rgCliente:
                return cliente.getRgCliente();
            case telefone:
                return cliente.getTelefone();
            case dataNascimento:
                return cliente.getDataNascimento();
            case enderecoCliente:
                return cliente.getEnderecoCliente();
            case emailCliente:
                return cliente.getEmailCliente();
            case sexoCliente:
                return cliente.getSexoCliente();
            case dataCriacao:
                return cliente.getDataCriacao();
            case dataAtualizacao:
                return cliente.getDataAtualizacao();
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Cliente cliente = linhas.get(rowIndex);
        switch (columnIndex) {
            case idCliente:
                cliente.setIdCliente((Long) aValue);
                break;
            case nomeCliente:
                cliente.setNomeCliente((String) aValue);
                break;
            case cpfCliente:
                cliente.setCpfCliente((String) aValue);
                break;
            case rgCliente:
                cliente.setRgCliente((String) aValue);
                break;
            case telefone:
                cliente.setTelefone((String) aValue);
                break;
            case dataNascimento:
                cliente.setDataNascimento((Date) aValue);
                break;
            case enderecoCliente:
                cliente.setEnderecoCliente((String) aValue);
                break;
            case emailCliente:
                cliente.setEmailCliente((String) aValue);
                break;
            case sexoCliente:
                cliente.setSexoCliente((String) aValue);
                break;
            case dataCriacao:
                cliente.setDataCriacao((Date) aValue);
                break;
            case dataAtualizacao:
                cliente.setDataAtualizacao((Date) aValue);
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
