package com.wellsbank.jpql;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class jpqlPersist {
	
	public static void main(String[] args) {
		EntityManager em = null;
		
		
		
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("day5");
			em = emf.createEntityManager();
			em.getTransaction().begin();
			
			jpqlcustomer cust = new jpqlcustomer();
			cust.setName("Tony");
			cust.setEmail("tony@gmail.com");
			cust.setGender('M');
			cust.setCustomerId(225);
			cust.setTelephone("2814441111");
			cust.setFax("2814442222");
			Calendar d = new GregorianCalendar(2004,5,12);
			cust.setDateOfBirth(d);
			cust.setAddress("1324 BayArea");
			cust.setCity("Irving");
			cust.setState("Texas");
			cust.setPin(12345);
			em.persist(cust);
			
			em.getTransaction().commit();
			System.out.println("Persisted");
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
