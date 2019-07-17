package com.wellsbank.manytoonebi;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MOBRetrieve {
	
	public static void main(String[] args) {
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("day5");
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			
			MOBCustomer customer = em.find(MOBCustomer.class, 10001);
			List<MOBAccount> list = customer.getAccount();
			MOBAccount acc1 = list.get(0);
			MOBAccount acc2 = list.get(1);
			
			System.out.println("Customer's First Account Details: AccountNo " + acc1.getAccountId() + " Account Type " + acc1.getAccountType() );
			System.out.println("Customer's Second Account Details: AccountNo " + acc2.getAccountId() + " Account Type " + acc2.getAccountType() );
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
