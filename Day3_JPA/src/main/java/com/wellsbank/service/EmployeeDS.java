package com.wellsbank.service;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.wellsbank.entities.Employee;

public class EmployeeDS {

	public static void main(String[] args) {
		EntityManager em = null;
		
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("FirstProject");
			em = emf.createEntityManager();
			EntityTransaction et = em.getTransaction();
			et.begin();
			Employee employee = new Employee();
			employee.setEmployeeId(1001);
			employee.setUserId("riy");
			employee.setName("Riyaz");
			employee.setEmail("riyaz@gmail.com");
			employee.setGender('M');
			employee.setJob("Java Developer");
			Calendar d = new GregorianCalendar(2004, 06, 16);
			employee.setDateOfJoin(d);
			em.persist(employee);
			et.commit();
			System.out.println("Persisted");
		}
		finally {
			em.close();
		}
	}
	
	
}
