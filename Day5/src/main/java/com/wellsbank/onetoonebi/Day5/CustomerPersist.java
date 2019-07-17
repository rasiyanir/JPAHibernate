package com.wellsbank.onetoonebi.Day5;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CustomerPersist {
	public static void main(String[] args) {
		
		try {
			OOBPermanentAddress permanent = new OOBPermanentAddress();
			permanent.setDoorNo(108);
			permanent.setState("Texas");
			
			OOBCustomer customer = new OOBCustomer();
			customer.setCustId(1008);
			customer.setCustName("Rahul");
			customer.setPermanentAddress(permanent);
			
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("day5");
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			
			em.persist(customer);
			
			em.getTransaction().commit();
			System.out.println("Persisted");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		
		
	}
}
