package com.map1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingDemo {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Emp emp1 = new Emp();
		Emp emp2 = new Emp();
		
		emp1.setEId(212);
		emp1.setName("Abhishek");
		
		emp2.setEId(252);
		emp2.setName("Aman");
		
		Project p1 = new Project();
		Project p2 = new Project();
		
		p1.setPid(12342);
		p1.setProjectName("Managment system");
		//-----
		p2.setPid(54321);
		p2.setProjectName("ChatBot System");
		

		List<Emp> list1 = new ArrayList<Emp>();
		List<Project> list2 = new ArrayList<Project>();
		
		list1.add(emp1);
		list1.add(emp2);
		
		list2.add(p1);
		list2.add(p2);
		
		emp1.setProjects(list2);
		
		p2.setEmps(list1);
		

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(emp1);
		session.save(emp2);
		session.save(p1);
		session.save(p2);
		
		tx.commit();
		
		factory.close();
	}
}
