package com.wellsbank.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPQLDemo5 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("day5");
		EntityManager em = emf.createEntityManager();
		try {
			
			em.getTransaction().begin();
			Query query = em.createQuery("delete jpqlcustomer c where c.customerId =?1");
			query.setParameter(1, 221);
			int updateCount = query.executeUpdate();
			em.getTransaction().commit();
			System.out.println(updateCount + "row updated");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
