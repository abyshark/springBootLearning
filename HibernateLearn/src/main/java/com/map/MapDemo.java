package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		//Create question 1
		Question q1 = new Question();
		q1.setQuestionId(212);
		q1.setQuestion("What is java?");
		
		Question q2 = new Question();
		q2.setQuestionId(214);
		q2.setQuestion("What is Collection framwork?");
		
		//Create Answer 
		Answer ans1 = new Answer();
		ans1.setAnswerId(343);
		ans1.setAns("A programming language.");
		ans1.setQuestion(q1);
		
		Answer ans2 = new Answer();
		ans2.setAnswerId(345);
		ans2.setAns("An api to work with objects in java");
		ans2.setQuestion(q2);
		
		q1.setAnswer(ans1);
		q2.setAnswer(ans2);
		
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		
		
		s.save(ans1);
		s.save(ans2);
		s.save(q1);
		s.save(q2);
		
		
		tx.commit();
		
		//fetching...
		
		Question newQ = s.get(Question.class, 212);
		System.out.println(newQ.getQuestion());
		System.out.println(newQ.getAnswer().getAns());
		
	}

}
