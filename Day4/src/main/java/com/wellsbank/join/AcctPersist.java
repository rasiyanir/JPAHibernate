package com.wellsbank.join;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.wellsbank.singletable.LoanAccount;
import com.wellsbank.singletable.SavingsAccount;

public class AcctPersist {

	public static void main(String[] args) {
		EntityManager em = null;
		
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("day4");
			em = emf.createEntityManager();
			em.getTransaction().begin();
			
			SavingsAcct savings = new SavingsAcct();
			savings.setAccountNo(1001);
			savings.setBalance(200);
			savings.setMinBalance(100);
			
			em.persist(savings);
			
			LoanAcct loan = new LoanAcct();
			loan.setAccountNo(1002);
			loan.setBalance(1200);
			loan.setLoanAmount(1222);

			
			em.persist(loan);
			
			em.getTransaction().commit();
			
			System.out.println("Persisted");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			em.close();
		}
	}
}
