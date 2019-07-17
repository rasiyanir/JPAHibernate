package com.wellsbank.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NamedQuery;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.type.CustomCollectionType;

public class JPQLDemo6 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("day5");
		EntityManager em = emf.createEntityManager();
		try {
			
			em.getTransaction().begin();
			
			Query query = em.createNamedQuery("findQuery");
			List rs = query.getResultList();
			for(int i = 0; i < rs.size(); i++) {
				jpqlcustomer c = (jpqlcustomer) rs.get(i);
				System.out.println("");
				System.out.println(c.getName());
				System.out.println(c.getAddress());
				System.out.println(c.getCity());
				System.out.println(c.getEmail());
			}
			//em.getTransaction().commit();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
