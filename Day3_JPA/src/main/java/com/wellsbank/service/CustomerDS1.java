package com.wellsbank.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.wellsbank.entities.Customer;

public class CustomerDS1 {
	
	public static void main(String[] args) throws Exception{
		
		int customerId;
		EntityManager em = null;
		ReadData rd = new ReadData();
		
		System.out.println("Enter CustomerId: ");
		customerId = Integer.parseInt(rd.acceptString());
		
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("FirstProject");
			em = emf.createEntityManager();
			Customer customer = em.find(Customer.class, customerId);
			
			if(customer == null) {
				System.out.println("Invalid Customer Id");
			}
			else {
				System.out.println("Customer Name is : " + customer.getCustName());
			}
		}
		finally {
			em.close();
		}
	}
}
