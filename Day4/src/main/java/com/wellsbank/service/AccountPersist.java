package com.wellsbank.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.wellsbank.singletable.LoanAccount;
import com.wellsbank.singletable.SavingsAccount;

public class AccountPersist {

	public static void main(String[] args) {
		EntityManager em = null;
		
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("day4");
			em = emf.createEntityManager();
			em.getTransaction().begin();
			
			SavingsAccount savings = new SavingsAccount();
			savings.setAccountNo(1003);
			savings.setBalance(20000);
			savings.setInterestRate(12.22);
			savings.setMinBalance(500);
			
			em.persist(savings);
			
			LoanAccount loan = new LoanAccount();
			loan.setAccountNo(1004);
			loan.setBalance(14000);
			loan.setLoanAmount(1000);
			loan.setLoanType("Car Loan");
			
			em.persist(loan);
			
			em.getTransaction().commit();
			
			System.out.println("Persisted");
		}
		finally {
			em.close();
		}
	}
}
