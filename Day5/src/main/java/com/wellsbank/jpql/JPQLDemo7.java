package com.wellsbank.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.type.CustomCollectionType;

public class JPQLDemo7 {
	public static void main(String[] args) {
		
		
		
		 
		EntityManager em = null;
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("day5");
			em = emf.createEntityManager();
			em.getTransaction().begin();
			
			Query query = em.createNamedQuery("deleteQuery");
			query.setParameter(1, 222);
			int count = query.executeUpdate();
			
			em.getTransaction().commit();
			
			System.out.println(count);
			
			Query query2 = em.createNamedQuery("findAllQuery");
			
			List rs = query2.getResultList();
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
