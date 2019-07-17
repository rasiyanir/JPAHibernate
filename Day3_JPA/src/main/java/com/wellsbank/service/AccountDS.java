package com.wellsbank.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.wellsbank.entities.Account;

public class AccountDS {
	
	public static void main(String[] args) throws Exception{
		int accountNo;
		double balance;
		String customerName;
		String userId;
		EntityManager em = null;
		
		ReadData rd = new ReadData();
		
		System.out.println("Enter Account Number: ");
		accountNo = Integer.parseInt(rd.acceptString());
		System.out.println("Enter Account Balance: ");
		balance = Double.parseDouble(rd.acceptString());
		System.out.println("Enter Customer Name: ");
		customerName = rd.acceptString();
		System.out.println("Enter userId: ");
		userId = rd.acceptString();
		
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("FirstProject");
			em = emf.createEntityManager();
			EntityTransaction et =  em.getTransaction();
			et.begin();
			Account account = new Account();
			account.setAccountNo(accountNo);
			account.setBalance(balance);
			account.setCustomerName(customerName);
			account.setUserId(userId);
			em.persist(account);
			et.commit();
			System.out.println("Persisted");
		}
		finally {
			em.close();
		}
		
		
	}

}
