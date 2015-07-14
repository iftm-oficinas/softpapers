package br.com.resources.tabelas;

import br.com.models.vo.Usuario;
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
public class TabelaUsuario extends AbstractTableModel {

    //Declaração de variáveis.
    private final List<Usuario> linhas;
    private final String[] colunas;

    //Declaração de variáveis que compoem os campos da tabela.
    private static final int idUsuario = 0;
    private static final int nomeUsuario = 1;
    private static final int cpfUsuario = 2;
    private static final int emailUsuario = 3;
    private static final int senhaUsuario = 4;
    private static final int enderecoUsuario = 5;
    private static final int dataCriacao = 6;
    private static final int dataAtualizacao = 7;

    /**
     *
     * @see Construtor padrão. Inicializa as linhas da coluna como nulo e define
     * as colunas com os valores do objeto.
     */
    public TabelaUsuario() {
        linhas = new ArrayList<>();
        colunas = new String[]{"Id", "Nome", "Cpf", "Email", "Senha", "Endereço", "Data criação", "Data atualização"};
    }

    /**
     *
     * @see Contrutor que inicializa as linhas da coluna com a lista recebida
     * pelo parâmetro e define as colunas com os valores do objeto.
     *
     * @param usuarios
     */
    public TabelaUsuario(List<Usuario> usuarios) {
        linhas = new ArrayList<>(usuarios);
        colunas = new String[]{"Id", "Nome", "Cpf", "Email", "Senha", "Endereço", "Data criação", "Data atualização"};
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
            case idUsuario:
                return Long.class;
            case nomeUsuario:
                return String.class;
            case cpfUsuario:
                return String.class;
            case emailUsuario:
                return String.class;
            case senhaUsuario:
                return String.class;
            case enderecoUsuario:
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
        Usuario usuario = linhas.get(rowIndex);
        switch (columnIndex) {
            case idUsuario:
                return usuario.getIdUsuario();
            case nomeUsuario:
                return usuario.getNomeUsuario();
            case cpfUsuario:
                return usuario.getCpfUsuario();
            case emailUsuario:
                return usuario.getEmailUsuario();
            case senhaUsuario:
                return usuario.getSenhaUsuario();
            case enderecoUsuario:
                return usuario.getEnderecoUsuario();
            case dataCriacao:
                return usuario.getDataCriacao();
            case dataAtualizacao:
                return usuario.getDataAtualizacao();
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Usuario usuario = linhas.get(rowIndex);
        switch (columnIndex) {
            case idUsuario:
                usuario.setIdUsuario((Long) aValue);
                break;
            case nomeUsuario:
                usuario.setNomeUsuario((String) aValue);
                break;
            case cpfUsuario:
                usuario.setCpfUsuario((String) aValue);
                break;
            case emailUsuario:
                usuario.setEmailUsuario((String) aValue);
                break;
            case senhaUsuario:
                usuario.setSenhaUsuario((String) aValue);
                break;
            case enderecoUsuario:
                usuario.setEnderecoUsuario((String) aValue);
                break;
            case dataCriacao:
                usuario.setDataCriacao((Date) aValue);
                break;
            case dataAtualizacao:
                usuario.setDataAtualizacao((Date) aValue);
                break;
            default:
                throw new IndexOutOfBoundsException("columnIndex out of bounds");
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }

    public Usuario getUsuario(int rowIndex) {
        return linhas.get(rowIndex);
    }

    /**
     *
     * @see Método que adiciona uma nova linha com os valores do objeto recebido
     * como parâmetro.
     *
     * @param usuario Usuario que compoe uma linha da tabela.
     */
    public void addUsuario(Usuario usuario) {
        linhas.add(usuario);
        int ultimoIndice = getRowCount() - 1;
        fireTableRowsInserted(ultimoIndice, ultimoIndice);
    }

    /**
     *
     * @see Método que adiciona uma lista de linhas com a lista de objetos
     * recebida como parâmetro.
     *
     * @param usuarios
     */
    public void addListaUsuarios(List<Usuario> usuarios) {
        int indice = getRowCount();
        linhas.addAll(usuarios);
        fireTableRowsInserted(indice, indice + usuarios.size());
    }

    /**
     *
     * @see Método que remove linha da tabela atravez do index rebecido como
     * parâmetro.
     *
     * @param rowIndex numero da linha da tabela.
     */
    public void removeUsuario(int rowIndex) {
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
