package com.wellsbank.join;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EducatorPersist {

	public static void main(String[] args) {
		EntityManager em = null;
		
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("day4");
			em = emf.createEntityManager();
			em.getTransaction().begin();
			
			TechAssociate tech = new TechAssociate();
			tech.setEmpID(1001);
			tech.setName("abcd");
			tech.setNoOfLabs(5);
			em.persist(tech);
			
			
			Evangelist evan = new Evangelist();
			evan.setEmpID(1002);
			evan.setName("efg");
			evan.setNoOfSession(10);
			em.persist(evan);
			
			em.getTransaction().commit();
			System.out.println("Persisted");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
