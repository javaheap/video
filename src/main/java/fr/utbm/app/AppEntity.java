package fr.utbm;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import fr.utbm.entity.Test;

public class AppEntity {

    @PersistenceContext
    private static EntityManager entityManager;

    public static void main(String[] args) {

        Test t = new Test();

        entityManager.getTransaction().begin();
        entityManager.persist(t);
        entityManager.getTransaction().commit();

    }
}
