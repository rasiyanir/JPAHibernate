package com.wellsbank.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.wellsbank.entities.Customer;

public class CustomerDS {
	
	public static void main(String[] args) throws Exception{
		EntityManager em = null;
		
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("FirstProject");
			em = emf.createEntityManager();
			EntityTransaction et = em.getTransaction();
			et.begin();
			Customer customer = new Customer();
			customer.setCustId(1001);
			customer.setCustName("Wells");
			em.persist(customer);
			et.commit();
			
		}finally {
			em.close();
		}
		
	}
}
