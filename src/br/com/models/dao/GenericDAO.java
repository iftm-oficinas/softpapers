package br.com.models.dao;

import br.com.models.util.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @see @see Classe de objetos de acesso ao banco de dados. Métodos: inserir(),
 * atualizar(), apagar(), consultar().
 *
 * @author Bruna Danieli Ribeiro Gonçalves, Márlon Ândrel Coelho Freitas
 * @param <T> obejeto genérico que substitui como parâmetro todos os objetos de
 * valores do sistema.
 */
public class GenericDAO<T> {

    //Declaração da sessão de conexão ao banco de dados.
    private Session session;

    /**
     *
     * @see Método INSERT INTO.
     *
     * @param obj objeto de valor que abstrai uma linha do banco.
     */
    public void inserir(T obj) {
        session = (Session) HibernateUtil.getSession();
        session.persist(obj);
        session.close();
    }

    /**
     *
     * @see Método UPDATE.
     *
     * @param obj objeto de valor que abstrai uma linha do banco.
     */
    public void atualizar(T obj) {
        session = (Session) HibernateUtil.getSession();
        session.saveOrUpdate(obj);
        session.close();
    }

    /**
     *
     * @see Método DELETE.
     *
     * @param obj objeto de valor que abstrai uma linha do banco.
     */
    public void apagar(T obj) {
        session = (Session) HibernateUtil.getSession();
        session.delete(obj);
        session.close();
    }

    /**
     *
     * @see Método SELECT *.
     *
     * @param obj objeto de valor que abstrai uma linha do banco.
     * @return Lista de obejtos do parâmetro.
     */
    public List<T> consultar(T obj) {
        session = (Session) HibernateUtil.getSession();
        Criteria c = session.createCriteria(obj.getClass());
        session.close();
        return c.list();
    }

    /**
     *
     * @see Método SELECT WHERE(campo = valor).
     *
     * @param campo nome da linha no BD.
     * @param valor valor da linha no BD.
     * @param obj objeto de valor que abstrai uma linha do banco.
     * @return obejeto do parâmetro que a consulta localizar.
     */
    public T consultar(String campo, Long valor, T obj) {
        session = (Session) HibernateUtil.getSession();
        Criteria c = session.createCriteria(obj.getClass());
        c.add(Restrictions.eq(campo, valor));
        session.close();
        if (c.list() == null) {
            return null;
        } else {
            return (T) c.uniqueResult();
        }
    }

    /**
     *
     * @see Método SELECT WHERE(campo1 = valor1 AND campo2 = valor2).
     *
     * @param campo1 primeiro nome da linha no BD.
     * @param valor1 primeiro valor da linha no BD.
     * @param campo2 segundo nome da linha no BD.
     * @param valor2 segundo valor da linha no BD.
     * @param obj objeto de valor que abstrai uma linha do banco.
     * @return obejeto do parâmetro que a consulta localizar quando dos dois
     * critérios forem verdadeiros.
     */
    public T consultar(String campo1, String valor1, String campo2, String valor2, T obj) {
        session = (Session) HibernateUtil.getSession();
        Criteria c = session.createCriteria(obj.getClass());
        c.add(Restrictions.eq(campo1, valor1));
        c.add(Restrictions.eq(campo2, valor2));
        session.close();
        if (c.list() == null) {
            return null;
        } else {
            return (T) c.uniqueResult();
        }
    }

    /**
     *
     * @see Método SELECT ORDER BY(campo).
     *
     * @param campo nome da linha no BD.
     * @param obj objeto de valor que abstrai uma linha do banco.
     * @return único resultado de uma lista de objetos do parâmetro ordenados
     * pelo campo do parâmetro.
     */
    public T consultar(String campo, T obj) {
        session = (Session) HibernateUtil.getSession();
        Criteria c = session.createCriteria(obj.getClass());
        c.addOrder(Order.desc(campo));
        c.setMaxResults(1);
        session.close();
        if (c.list() == null) {
            return null;
        } else {
            return (T) c.uniqueResult();
        }
    }
}

//    c.add(Restrictions.eq("idPessoa", obj.getClass()));
//    c.add(Restrictions.ne("String propertyName", "Object value"));
//    c.add(Restrictions.isNull("String propertyName"));
//
//    c.add(Restrictions.like("String propertyName","Object value%"));
//    c.add(Restrictions.ilike("String propertyName","Object value%"));
//    c.add(Restrictions.ilike("String propertyName","Object value", MatchMode.ANYWHERE));
//    c.add(Restrictions.ilike("String propertyName","Object value", MatchMode.END));
//    c.add(Restrictions.ilike("String propertyName","Object value", MatchMode.EXACT));
//    c.add(Restrictions.ilike("String propertyName","Object value", MatchMode.START));
//
//    c.add(Restrictions.gt("String propertyName",new Double(30.0)));//maior que 30
//    c.add(Restrictions.ge("String propertyName",new Double(30.0)));//maior ou igual a 30
//    c.add(Restrictions.lt("String propertyName",new Double(30.0)));//menor que 30
//    c.add(Restrictions.le("String propertyName",new Double(30.0)));//menor ou igual a 30
//
//    //Consultas com expressão lógica OU
//    LogicalExpression orExp = Restrictions.or(criteria1,criteria2);
//
//    //Consultas com SQLs que o hibernate não possui por padrão
//    c.add(Restrictions.sqlRestriction("SQL"));//usar {alias} para tabelas genericas
//
//    //Paginando Resultados das consultas
//    c.setFirstResult(1);
//    c.setMaxResults(1);
//
//    //Retornando consultas únicas
//    obj = (T) c.uniqueResult();
//
//    //Odenando consultas
//    c.addOrder(Order.desc("String propertyName"));
//    c.addOrder(Order.asc("String propertyName"));
