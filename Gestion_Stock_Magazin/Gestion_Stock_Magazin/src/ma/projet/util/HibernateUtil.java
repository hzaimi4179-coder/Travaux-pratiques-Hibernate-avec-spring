package ma.projet.util;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
     private static final SessionFactory sessionFactory;

    static {
        try {
            // Lecture du fichier de configuration hibernate.cfg.xml
            sessionFactory = new Configuration().configure("config/hibernate.xml").buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Erreur de création de la SessionFactory : " + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
