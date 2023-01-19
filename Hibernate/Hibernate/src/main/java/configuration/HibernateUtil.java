package configuration;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    private static final SessionFactory sessionFactory;

    static {
        try {
            sessionFactory = new Configuration().configure().buildSessionFactory();
            Configuration configuration = new Configuration();
            configuration = configuration.configure();
            StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder();
            builder = builder.applySettings(configuration.getProperties());

            SessionFactory sessionFactory = configuration.buildSessionFactory(builder.build());
        } catch (Throwable ex) {
            System.err.println("SessionFactory creation failed."+ ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }

    public static void shutdown() {
// Close caches and connection pools
        getSessionFactory().close();
    }
}
