package br.com.models.bo;

import br.com.models.dao.GenericDAO;
import br.com.models.vo.Categoria;
import br.com.models.vo.Fornecedor;
import java.util.ArrayList;
import java.util.List;

public class ProdutoBO {

    /**
     *
     * @see Método que realiza consulta ao banco de dados por todos as
     * Categorias.
     *
     * @return Lista de Categorias composta por todas as linhas da tabela
     * categoria do banco de dados.
     */
    public String[] buscarCategorias() {
        GenericDAO<Categoria> categoriaDAO = new GenericDAO<>();
        ArrayList<Categoria> categoriasVO = new ArrayList<>(categoriaDAO.consultar(new Categoria()));
        ArrayList<String> array = new ArrayList<>();
        categoriasVO.stream().forEach((categoriasVO1) -> {
            array.add(categoriasVO1.getDescricaoCategoria());
        });
        String[] Arr = new String[array.size()];
        Arr = array.toArray(Arr);
        return Arr;
    }

    /**
     *
     * @see Método que realiza consulta ao banco de dados por todos os
     * Fornecedores.
     *
     * @return Lista de Fornecedores composta por todas as linhas da tabela
     * fornecedor do banco de dados.
     */
    public String[] buscarFornecedores() {
        GenericDAO<Fornecedor> fornecedorDAO = new GenericDAO<>();
        ArrayList<Fornecedor> fornecedoresVO = new ArrayList<>(fornecedorDAO.consultar(new Fornecedor()));
        ArrayList<String> array = new ArrayList<>();
        fornecedoresVO.stream().forEach((fornecedoresVO1) -> {
            array.add(fornecedoresVO1.getNomeFornecedor());
        });
        String[] Arr = new String[array.size()];
        Arr = array.toArray(Arr);
        return Arr;
    }
}
