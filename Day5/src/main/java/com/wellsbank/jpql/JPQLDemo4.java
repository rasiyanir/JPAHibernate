package com.wellsbank.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPQLDemo4 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("day5");
		EntityManager em = emf.createEntityManager();
		try {
			String name = "Riyaz Rasiyani";
			int cId = 221;
			em.getTransaction().begin();
			Query query = em.createQuery("update jpqlcustomer c set c.name =: customerName where c.customerId = :customerId");
			query.setParameter("customerName", name);
			query.setParameter("customerId", cId);
			int updateCount = query.executeUpdate();
			em.getTransaction().commit();
			System.out.println(updateCount + "row updated");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
