package com.sqlquery;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class SQLExample {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();
		//SQL Query
		String q = "select * from student";
		
		// this is used to fire sql query
		NativeQuery nq = s.createSQLQuery(q); 
		
		List<Object[]>list = nq.list();
		
		for(Object[] std : list) {
			System.out.println(std[3]+" "+std[4]);
		}
		
		
		s.close();
		factory.close();
	}
}
