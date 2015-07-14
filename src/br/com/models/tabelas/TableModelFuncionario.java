package br.com.models.tabelas;

import br.com.models.vo.Funcionario;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @see Classe modelo. Modela uma tabela para possuir todos os campos de valores
 * do Funcionario.
 *
 * @author Bruna Danieli Ribeiro Gonçalves, Márlon Ândrel Coelho Freitas
 */
public class TableModelFuncionario extends AbstractTableModel {

    //Declaração de variáveis.
    private final List<Funcionario> linhas;
    private final String[] colunas;

    //Declaração de variáveis que compoem os campos da tabela.
    private static final int nomeFuncionario = 0;
    private static final int cargoFuncionario = 1;
    private static final int emailFuncionario = 2;
    private static final int telefoneFuncionario = 3;
    private static final int criacaoFuncionario = 4;
    private static final int atualizacaoFuncionario = 5;

    /**
     *
     * @see Construtor padrão. Inicializa as linhas da coluna como nulo e define
     * as colunas com os valores do objeto.
     */
    public TableModelFuncionario() {
        linhas = new ArrayList<>();
        colunas = new String[]{"Funcionario", "Cargo", "E-mail", "Telefone", "Criação", "Atualização"};
    }

    /**
     *
     * @see Contrutor que inicializa as linhas da coluna com a lista recebida
     * pelo parâmetro e define as colunas com os valores do objeto.
     *
     * @param funcionarios
     */
    public TableModelFuncionario(List<Funcionario> funcionarios) {
        linhas = new ArrayList<>(funcionarios);
        colunas = new String[]{"Funcionario", "Cargo", "E-mail", "Telefone", "Criação", "Atualização"};
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
            case nomeFuncionario:
                return String.class;
            case cargoFuncionario:
                return String.class;
            case emailFuncionario:
                return String.class;
            case telefoneFuncionario:
                return String.class;
            case criacaoFuncionario:
                return Date.class;
            case atualizacaoFuncionario:
                return Date.class;
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Funcionario funcionario = linhas.get(rowIndex);
        switch (columnIndex) {
            case nomeFuncionario:
                return funcionario.getNomeFuncionario();
            case cargoFuncionario:
                return funcionario.getCargoFuncionario();
            case emailFuncionario:
                return funcionario.getContato().getEmailContato();
            case telefoneFuncionario:
                return funcionario.getContato().getTelefoneContato();
            case criacaoFuncionario:
                return funcionario.getCriacaoFuncionario();
            case atualizacaoFuncionario:
                return funcionario.getAtualizacaoFuncionario();
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Funcionario funcionario = linhas.get(rowIndex);
        switch (columnIndex) {
            case nomeFuncionario:
                funcionario.setNomeFuncionario((String) aValue);
                break;
            case cargoFuncionario:
                funcionario.setCargoFuncionario((String) aValue);
                break;
            case emailFuncionario:
                funcionario.getContato().setEmailContato((String) aValue);
                break;
            case telefoneFuncionario:
                funcionario.getContato().setTelefoneContato((String) aValue);
                break;
            case criacaoFuncionario:
                funcionario.setCriacaoFuncionario((Date) (aValue));
                break;
            case atualizacaoFuncionario:
                funcionario.setAtualizacaoFuncionario((Date) (aValue));
                break;
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }

    public Funcionario getFuncionario(int rowIndex) {
        return linhas.get(rowIndex);
    }

    /**
     *
     * @see Método que adiciona uma nova linha com os valores do objeto recebido
     * como parâmetro.
     *
     * @param funcionario Usuario que compoe uma linha da tabela.
     */
    public void addFuncionario(Funcionario funcionario) {
        linhas.add(funcionario);
        int ultimoIndice = getRowCount() - 1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }

    /**
     *
     * @see Método que adiciona uma lista de linhas com a lista de objetos
     * recebida como parâmetro.
     *
     * @param funcionarios
     */
    public void addListaFuncionarioos(List<Funcionario> funcionarios) {
        int indice = getRowCount();
        linhas.addAll(funcionarios);
        fireTableRowsInserted(indice, indice + funcionarios.size());
    }

    /**
     *
     * @see Método que remove linha da tabela atravez do index rebecido como
     * parâmetro.
     *
     * @param rowIndex numero da linha da tabela.
     */
    public void removeFuncionario(int rowIndex) {
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
