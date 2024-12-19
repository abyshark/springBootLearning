package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Student student = session.get(Student.class, 1);
		System.out.println("Student: "+student);
		
		Address address = session.get(Address.class, 1);
		System.out.println("Address: "+ address);
		
		session.close();
		factory.close();
	}

}
