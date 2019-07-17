package com.wellsbank.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPQLDemo3 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("day5");
		EntityManager em = emf.createEntityManager();
		try {
			int customerId = 2221;
			em.getTransaction().begin();
			Query query = em.createQuery("select c from jpqlcustomer c where c.customerId = ?1");
			query.setParameter(1, customerId);
			List rs = query.getResultList();
			System.out.println("Name");
			if(rs.size() != 0) {
				jpqlcustomer c = (jpqlcustomer) rs.get(0);
				System.out.println("");
				System.out.println(c.getName());
				System.out.println(c.getAddress());
				System.out.println(c.getCity());
				System.out.println(c.getEmail());
			}
			else {
				System.out.println("No record exists witht the enetered customerId");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
