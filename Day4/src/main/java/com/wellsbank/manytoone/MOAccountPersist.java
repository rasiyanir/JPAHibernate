package com.wellsbank.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MOAccountPersist {

	public static void main(String[] args) {
		EntityManager em = null;
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("day4");
			em = emf.createEntityManager();
			em.getTransaction().begin();
			
			MOCustomer cust = new MOCustomer();
			cust.setCustId(10001);
			cust.setCustName("Seema");
			
			MOAccount acct1 = new MOAccount();
			acct1.setAccountId(1001);
			acct1.setAccountType("Savings");
			acct1.setCustomer(cust);
			
			MOAccount acct2 = new MOAccount();
			acct2.setAccountId(1002);
			acct2.setAccountType("Current");
			acct2.setCustomer(cust);
			
			em.persist(acct1);
			em.persist(acct2);
			em.getTransaction().commit();
			System.out.println("Persisted");
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
