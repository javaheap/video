package fr.utbm.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import fr.utbm.entity.Test;

public class AppEntity {

	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("video");
    private static EntityManager entityManager = emf.createEntityManager();

    public static void main(String[] args) {

        Test t = new Test();

        entityManager.getTransaction().begin();
        entityManager.persist(t);
        entityManager.getTransaction().commit();

    }
    
}
