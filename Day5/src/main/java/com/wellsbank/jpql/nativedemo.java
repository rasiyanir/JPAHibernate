package com.wellsbank.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class nativedemo {

	public static void main(String[] args) {
		EntityManager em = null;
		
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("day5");
			em = emf.createEntityManager();
			em.getTransaction().begin();
			Query query = em.createNativeQuery("select SF_FindDesignation(?1) from dual");
			query.setParameter(1, 22);
			String rs = (String) query.getSingleResult();
			
			System.out.println(rs);
			if(rs.equals("PRESIDENT")) {
				System.out.println("The job is of High Responsibility");
			}
			else if(rs.equals("MANAGER")) {
				System.out.println("The job is of Team Management");
			}
			else if(rs.equals("SUPERVISOR")) {
				System.out.println("The job is of Supervision");
			}
			else if(rs.equals("ENGINEER")) {
				System.out.println("The job is on technology");
			}
			else {
				System.out.println("The job code is invalid");
			}
		}
		catch(Exception e) {
			
		}
	}
}
