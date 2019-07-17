package com.wellsbank.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.wellsbank.entities.Customer;

public class CustomerDS2 {

public static void main(String[] args) throws Exception{
		
		int customerId;
		EntityManager em = null;
		ReadData rd = new ReadData();
		
		System.out.println("Enter CustomerId: ");
		customerId = Integer.parseInt(rd.acceptString());
		
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("FirstProject");
			em = emf.createEntityManager();
			EntityTransaction et = em.getTransaction();
			et.begin();
			Customer customer = em.find(Customer.class, customerId);
			
			if(customer == null) {
				System.out.println("Invalid Customer Id");
			}
			else {
				em.remove(customer);
				et.commit();
			}
		}
		finally {
			em.close();
		}
	}
}
