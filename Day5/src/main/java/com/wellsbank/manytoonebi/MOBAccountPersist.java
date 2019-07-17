package com.wellsbank.manytoonebi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MOBAccountPersist {

	public static void main(String[] args) {
		EntityManager em = null;
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("day5");
			em = emf.createEntityManager();
			em.getTransaction().begin();
			
			MOBCustomer cust = new MOBCustomer();
			cust.setCustId(10001);
			cust.setCustName("Seema");
			
			MOBAccount acct1 = new MOBAccount();
			acct1.setAccountId(1001);
			acct1.setAccountType("Savings");
			acct1.setCustomer(cust);
			
			MOBAccount acct2 = new MOBAccount();
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
