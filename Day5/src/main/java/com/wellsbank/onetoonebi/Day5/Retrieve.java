package com.wellsbank.onetoonebi.Day5;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Retrieve {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("day5");
		EntityManager em = emf.createEntityManager();
		
		OOBPermanentAddress permanent1 = em.find(OOBPermanentAddress.class, 102);
		OOBCustomer cust1 = permanent1.getCustomer();
		
		System.out.println("Customer Id is " + cust1.getCustId());
		System.out.println("Customer Name is " + cust1.getCustName());
		System.out.println("Customer Details of customer living in Door No 102 retrived");
	
		
		  OOBPermanentAddress permanent2 = em.find(OOBPermanentAddress.class, 105);
		  OOBCustomer cust2 = permanent2.getCustomer();
		  
		  System.out.println("Customer Id is " + cust2.getCustId());
		  System.out.println("Customer Name is " + cust2.getCustName()); System.out.
		  println("Customer Details of customer living in Door No 101 retrived");
		 
	}
}
