package com.wellsbank.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class joinDemo {

	public static void main(String[] args) {
		
		EntityManager em = null;
		
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("day5");
			em = emf.createEntityManager();
			em.getTransaction().begin();
			
			/*Query query = em.createQuery("select e, d from jpqlEmployee e, jpqldept d where e.deptNo = d.deptNo and (e.eName like 'R%' or e.eName like 'K%')");
			List rs = query.getResultList();
			System.out.println("Employee Name \t DeptName");
			for(int i = 0;i < rs.size(); i++) {
				Object[] o = (Object[])rs.get(i);
				System.out.println("");
				jpqlEmployee emp = (jpqlEmployee) o[0];
				System.out.print(emp.geteName() + "\t\t");
				jpqldept dept = (jpqldept) o[1];
				System.out.println(dept.getdName());
			}*/
			
			/*
			 * Query query = em.
			 * createQuery("select e from jpqlEmployee e where e.sal = (select max(p.sal) from jpqlEmployee p)"
			 * ); List rs = query.getResultList(); for(int i = 0; i < rs.size(); i++) {
			 * jpqlEmployee emp = (jpqlEmployee) rs.get(i);
			 * System.out.println(emp.geteName()); System.out.println(emp.getSal()); }
			 */
			
			Query query = em.createQuery("select e, d from jpqlEmployee e, jpqldept d where e.deptNo = d.deptNo and"
										+ " (e.job = 'manager' or e.job = 'president') "
										+ "and (d.loc = 'SSCB')");
			List rs = query.getResultList();
			//System.out.println("Employee Name \t DeptName");
			for(int i = 0;i < rs.size(); i++) {
				Object[] o = (Object[])rs.get(i);
				System.out.println("");
				jpqlEmployee emp = (jpqlEmployee) o[0];
				System.out.print(emp.geteName());
				jpqldept dept = (jpqldept) o[1];
				System.out.println(dept.getdName());
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
