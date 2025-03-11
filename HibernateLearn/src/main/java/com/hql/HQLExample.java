package com.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.Student;

public class HQLExample {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session s = factory.openSession();
		
		
		//HQL
		//Syntax
		String query= "from Student";
		
		String query1= "from Student where city=:x";
		Query q = s.createQuery(query);
		Query q1 = s.createQuery(query1);
		
		q1.setParameter("x", "LKO");
		
		List<Student> list = q.list();
		for(Student student : list) {
			System.out.println(student.toString());
		}
		
		List<Student> list1 = q1.list();
		for(Student student1 : list1) {
			System.out.println(student1.getName()+" "+student1.getCity());
		}
		
		
		s.close();
		factory.close();
		
	}

}
