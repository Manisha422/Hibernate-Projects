package com.av.hibernate_manytomany_bi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestUpdateTeacherandSubject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("manisha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Subject s1=em.find(Subject.class, 1);
		s1.setSname("PYTHON");
		s1.setDuration(8);
		
		Subject s2=em.find(Subject.class, 2);
		s2.setSname("SWIFT");
		s2.setDuration(4);
		
		List<Subject> sub = new ArrayList<Subject>();
		sub.add(s1);
		sub.add(s2);
		
		Teacher t = em.find(Teacher.class, 1);
		t.setName("LOLU");
		t.setSalary(50000);
		t.setSub(sub);
		
		List<Teacher> list1 = new ArrayList<Teacher>();
		list1.add(t);
		
		et.begin();
		em.merge(s1);
		em.merge(s2);
		em.merge(t);
		
		System.out.println("Data Updated");

	}

}
