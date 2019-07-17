package com.wellsbank.manytomanybi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MMBMainTest {
	
	public static void main(String[] args) {
		EntityManager em = null;
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("day5");
			em = emf.createEntityManager();
			em.getTransaction().begin();
			
			MMBAccount acc1 = new MMBAccount();
			acc1.setAccountId(1111);
			acc1.setBalance(25000);
			
			MMBAccount acc2 = new MMBAccount();
			acc2.setAccountId(2222);
			acc2.setBalance(50000);
			
			List<MMBAccount> list = new ArrayList<MMBAccount>();
			list.add(acc1);
			list.add(acc2);
			
			MMBJointAccountHolder joint1 = new MMBJointAccountHolder();
			joint1.setCustomerId(1001);
			joint1.setName("James");
			joint1.setAccount(list);
			
			MMBJointAccountHolder joint2 = new MMBJointAccountHolder();
			joint2.setCustomerId(1002);
			joint2.setName("Gosling");
			joint2.setAccount(list);
			
			em.persist(joint1);
			em.persist(joint2);
			
			em.getTransaction().commit();
			System.out.println("Persisted");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
