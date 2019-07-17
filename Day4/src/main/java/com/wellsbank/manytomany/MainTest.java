package com.wellsbank.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainTest {
	
	public static void main(String[] args) {
		EntityManager em = null;
		try {
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("day4");
			em = emf.createEntityManager();
			em.getTransaction().begin();
			
			MMAccount acc1 = new MMAccount();
			acc1.setAccountId(1111);
			acc1.setBalance(25000);
			
			MMAccount acc2 = new MMAccount();
			acc2.setAccountId(2222);
			acc2.setBalance(50000);
			
			List<MMAccount> list = new ArrayList<MMAccount>();
			list.add(acc1);
			list.add(acc2);
			
			JointAccountHolder joint1 = new JointAccountHolder();
			joint1.setCustomerId(1001);
			joint1.setName("James");
			joint1.setAccount(list);
			
			JointAccountHolder joint2 = new JointAccountHolder();
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
