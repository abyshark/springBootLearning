package com.states;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.Certificate;
import com.demo.Student;

public class StateDemo {

	public static void main(String[] args) {

		 //This is the program for states in Hibernate
		//Persistent
		//transient 
		//Detach
		//remove
		
		System.out.println("Example : ");
		
		SessionFactory f = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		
		//Student object created
		Student student = new Student();
		student.setId(0);
		student.setName("Peter");
		student.setCity("LKO");
		student.setCertificate(new Certificate("Java","2 Months"));
		
		Session s = f.openSession();
		Transaction tx = s.beginTransaction();
		s.save(student);
		student.setName("John");
		tx.commit();
		
		
		
		f.close();
	}

}
