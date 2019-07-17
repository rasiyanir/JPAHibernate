package com.wellsbank.onetotone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CustomerPersist {

	public static void main(String[] args) {
		EntityManager em = null;
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("day4");
			em = emf.createEntityManager();
			em.getTransaction().begin();
			
			/*
			 * Customer cust = em.find(Customer.class, 1002); if(cust!= null) {
			 * em.remove(cust); } else { System.out.println("No record found"); }
			 */
			
			  PermanentAddress permanent = new PermanentAddress();
			  permanent.setDoorNo(102); permanent.setState("New York");
			  
			  Customer customer = new Customer(); customer.setCustId(1002);
			  customer.setCustName("John"); customer.setAddress(permanent);
			  
			  em.persist(customer);
			 
			em.getTransaction().commit();
			System.out.println("Persisted");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		finally {
			em.close();
		}
	}
}
