package fr.utbm;

import fr.utbm.entity.Movie;
import fr.utbm.tools.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class AppHibernate {

    public static void main(String[] args) {
        
        try ( Session session = HibernateUtil.getSessionFactory().openSession()) {
            List< Movie> movies = session.createQuery("from Movie", Movie.class).list();
            movies.forEach(m -> System.out.println(m.toString()));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            HibernateUtil.shutdown();
        }
    }
}
