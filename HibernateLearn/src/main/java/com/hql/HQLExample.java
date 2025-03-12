package com.hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

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
		
		String query1= "from Student as s where s.city=:x and s.name=: n";
		Query q = s.createQuery(query);
		Query q1 = s.createQuery(query1);
		
		q1.setParameter("x", "LKO");
		q1.setParameter("n", "John");
		
		List<Student> list = q.list();
		for(Student student : list) {
			System.out.println(student.toString());
		}
		
		List<Student> list1 = q1.list();
		for(Student student1 : list1) {
			System.out.println(student1.getName()+" "+student1.getCity());
		}
		
		System.out.println("__________________________________________");
		Transaction tx =s.beginTransaction();
		//Delete query 
		Query q2 = s.createQuery("delete from Student s where s.city=:c");
		q2.setParameter("c", "Jaipur");
		int r = q2.executeUpdate();
		System.out.println("Deleted: ");
		System.out.println(r);
		System.out.println("__________________________________________");
		
		//update query 
		Query q3 = s.createQuery("update Student s set s.city=:c where s.name=:n  ");
		q3.setParameter("c","Jaipur");
		q3.setParameter("n","Sam");
		int r1 = q3.executeUpdate();
		System.out.println("Updated DB!!!");
		System.out.println(r1);
		System.out.println("__________________________________________");
		
//how to execute join query in HQL 
		
		Query q4 = s.createQuery("select q.questionId,q.question,a.ans from Question q INNER JOIN q.answers as a");
		List<Object []> list2=q4.getResultList();
		for(Object[] arr: list2) {
			System.out.println(Arrays.toString(arr));
		}
		
		System.out.println("__________________________________________");
		tx.commit();
		s.close();
		factory.close();
		
	}

}
