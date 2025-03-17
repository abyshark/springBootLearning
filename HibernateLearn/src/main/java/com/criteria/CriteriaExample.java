package com.criteria;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.demo.Student;

public class CriteriaExample {

	public static void main(String[] args) {
		Session s = new Configuration().configure().buildSessionFactory().openSession();
//		CriteriaBuilder ss = s.getCriteriaBuilder();
//		CriteriaQuery<Student> criteria = ss.createQuery(Student.class);
		
		Criteria c= s.createCriteria(Student.class);
		List<Student> list = c.list();
		
		for(Student st: list) {
			System.out.println(st);
		}
		
	}
}
