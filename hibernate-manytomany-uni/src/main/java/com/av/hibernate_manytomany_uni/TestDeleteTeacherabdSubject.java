package com.av.hibernate_manytomany_uni;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDeleteTeacherabdSubject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("manisha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Teacher t = em.find(Teacher.class, 2);
		
		et.begin();
		em.remove(t);
		et.commit();
		System.out.println("deleted");
		
		
		
	}

}
