package br.com.model.util;

import static br.com.model.util.HibernateUtil.getSessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;

public class HibernateUtil {

    private static Session session;
    private static final SessionFactory sessionFactory;

    static {
        try {
            sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    public static Session getSession() {
        if(session != null && !session.isOpen()){
            setSessao(null);
        }
        if(session == null){
            session = getSessionFactory().openSession();
        }
        return session;
    }

    public static void setSessao(Session sessao) {
        HibernateUtil.session = sessao;
    }
}