package util;

import entity.Message;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try{
            //create the SessionFactory from hibernate.cfg.xml
            Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
            configuration.addAnnotatedClass(Message.class);
            return configuration.buildSessionFactory(new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build());

        }catch (Throwable ex){
            System.err.println("Initial SeesionFactory creation faild." + ex);
            throw new ExceptionInInitializerError(ex);

        }
    }
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
