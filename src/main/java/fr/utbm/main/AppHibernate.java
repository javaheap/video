package fr.utbm.main;

import fr.utbm.entity.Movie;
import fr.utbm.tools.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class AppHibernate {

    public static void main(String[] args) {
        Transaction transaction = null;
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            List< Movie> movies = session.createQuery("from Movie", Movie.class).list();
            movies.forEach(m -> System.out.println(m.toString()));
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            HibernateUtil.shutdown();
        }
    }
}
