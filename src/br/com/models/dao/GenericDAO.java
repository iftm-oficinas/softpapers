package br.com.models.dao;

import br.com.models.util.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class GenericDAO<T> {

    private final Session session = (Session) HibernateUtil.getSession();

    public void inserir(T obj) {
        session.persist(obj);
    }

    public void atualizar(T obj) {
        session.saveOrUpdate(obj);
    }

    public void apagar(T obj) {
        session.delete(obj);
    }

    public List<T> consultar(T obj) {
        Criteria c = session.createCriteria(obj.getClass());
        return c.list();
    }

    //consulta pelo id.
    public T consultar(String campo, Long valor, T obj) {
        Criteria c = session.createCriteria(obj.getClass());
        c.add(Restrictions.eq(campo, valor));
        if (c.list() == null) {
            return null;
        } else {
            return (T) c.uniqueResult();
        }
    }

    //consulta de dois campos.
    public T consultar(String campo1, String valor1, String campo2, String valor2, T obj) {
        Criteria c = session.createCriteria(obj.getClass());
        c.add(Restrictions.eq(campo1, valor1));
        c.add(Restrictions.eq(campo2, valor2));
        if (c.list() == null) {
            return null;
        } else {
            return (T) c.uniqueResult();
        }
    }

    //consulta do ultimo resulado.
    public T consultar(String campo, T obj) {
        Criteria c = session.createCriteria(obj.getClass());
        c.addOrder(Order.desc(campo));
        c.setMaxResults(1);
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
