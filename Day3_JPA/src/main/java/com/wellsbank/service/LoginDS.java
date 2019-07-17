package com.wellsbank.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.wellsbank.entities.Login;

public class LoginDS {

	public static void main(String[] args) throws Exception{
		EntityManager em = null;
		
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("FirstProject");
			em = emf.createEntityManager();
			EntityTransaction et = em.getTransaction();
			et.begin();
			Login login = new Login();
			login.setUserId("Riyaza");
			login.setPassword("riy");
			login.setRole('p');
			em.persist(login);
			et.commit();
			
		}
		finally {
			em.close();
		}
	}
	
}
