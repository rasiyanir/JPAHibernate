package com.wellsbank.service;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.wellsbank.entities.Brand;

public class BrandDS {

	public static void main(String[] args) {
		
		EntityManager em = null;
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("classProject");
			em = emf.createEntityManager();
			EntityTransaction et = em.getTransaction();
			et.begin();
			Brand brand = new Brand();
			brand.setBrandid(102);
			brand.setBrandname("Indigonation");
			Calendar d = new GregorianCalendar(2008,04,23);
			brand.setDateoflaunch(d);
			em.persist(brand);
			et.commit();
			System.out.println("Persisted");
		}
		finally {
			em.close();
		}
		
	}
}
