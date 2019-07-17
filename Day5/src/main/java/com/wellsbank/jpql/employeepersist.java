package com.wellsbank.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class employeepersist {

	public static void main(String[] args) {
		EntityManager em = null;
		
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("day5");
			em = emf.createEntityManager();
			em.getTransaction().begin();
			
			jpqldept dept = new jpqldept();
			dept.setDeptNo(901);
			dept.setdName("BOC");
			dept.setLoc("SSCB");
			
			jpqlEmployee emp = new jpqlEmployee();
			emp.setEmpNo(10001);
			emp.seteName("Riyaz");
			emp.setJob("Developer");
			emp.setMgr(391);
			emp.setHireDate("04/18/2014");
			emp.setSal(4000);
			emp.setComm(200);
			//emp.setDept(dept);
			
			jpqlEmployee emp2 = new jpqlEmployee();
			emp2.setEmpNo(10002);
			emp2.seteName("Karim");
			emp2.setJob("manager");
			emp2.setMgr(392);
			emp2.setHireDate("08/14/2011");
			emp2.setSal(5000);
			emp2.setComm(0);
			//emp2.setDept(dept);
			
			em.persist(emp);
			em.persist(emp2);
			
			em.getTransaction().commit();
			System.out.println("Persisted");
			
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
}
