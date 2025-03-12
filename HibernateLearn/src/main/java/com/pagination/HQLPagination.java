package com.pagination;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.demo.Student;

public class HQLPagination {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();
		
		Query q = s.createQuery("from Student");
		
		//implementing pagination using Hibernate
		q.setFirstResult(0);
		
		q.setMaxResults(2);
		
		List<Student> list = q.list();
		
		for(Student st:list) {
			System.out.println(st.getName()+" "+st.getCity()+" "+st.getCertificate());
		}
		
		s.close();
		factory.close();
	}
}
