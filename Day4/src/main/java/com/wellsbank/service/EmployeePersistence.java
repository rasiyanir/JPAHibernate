package com.wellsbank.service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.wellsbank.singletable.FullTimeEmployee;
import com.wellsbank.singletable.PartTimeEmployee;

public class EmployeePersistence {
	
	public static void main(String[] args) {
		EntityManager em = null;
		
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("day4");
			em = emf.createEntityManager();
			em.getTransaction().begin();
			
			FullTimeEmployee full = new FullTimeEmployee();
			full.setEmployeeId(1003);
			full.setEmployeeName("abcd");
			full.setSalary(8000);
			em.persist(full);
			
			PartTimeEmployee part = new PartTimeEmployee();
			part.setEmployeeId(1004);
			part.setEmployeeName("efgh");
			part.setWages(100);
			em.persist(part);
			
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
