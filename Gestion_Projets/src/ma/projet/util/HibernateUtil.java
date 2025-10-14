
package ma.projet.util;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/**
 *
 * @author hp probook
 */
public class HibernateUtil {
     private static final SessionFactory sessionFactory;

    static {
        try {
            
            sessionFactory = new Configuration().configure("config/hibernate.xml").buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Erreur de création de la SessionFactory : " + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
     public static void shutdown() {
        getSessionFactory().close();
    }
}
