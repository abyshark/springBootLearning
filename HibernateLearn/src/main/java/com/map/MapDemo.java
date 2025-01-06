package com.map;

import java.util.ArrayList;
import java.util.List;

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
		q1.setQuestionId(216);
		q1.setQuestion("What is java?");
		
		Question q2 = new Question();
		q2.setQuestionId(218);
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
		
		Answer ans3 = new Answer();
		ans3.setAnswerId(347);
		ans3.setAns("Java has many frameworks!!");
		ans3.setQuestion(q1);
		
		Answer ans4 = new Answer();
		ans4.setAnswerId(349);
		ans4.setAns("Java has collection framework!!");
		ans4.setQuestion(q1);
		
		Answer ans5 = new Answer();
		ans5.setAnswerId(351);
		ans5.setAns("Collection frameworks helps a lot with working large objects!!");
		ans5.setQuestion(q2);
		
//		q1.setAnswer(ans1);
//		q2.setAnswer(ans2);
		
		List<Answer> list1 = new ArrayList<>();
		List<Answer> list2 = new ArrayList<>();
		
		list1.add(ans1);
		list1.add(ans3);
		list1.add(ans4);
		
		list2.add(ans2);
		list2.add(ans5);
		
		q1.setAnswers(list1);
		q2.setAnswers(list2);

		
		Session s = factory.openSession();
		Transaction tx = s.beginTransaction();
		
		
//		s.save(ans1);
//		s.save(ans2);
//		s.save(q1);
//		s.save(q2);
		
//		s.save(q1);
//		s.save(q2);
//		
//		s.save(ans1);
//		s.save(ans2);
//		s.save(ans3);
//		s.save(ans4);
//		s.save(ans5);
//		
		
		tx.commit();
		
		
		//fetching...
		
//		Question newQ = s.get(Question.class, 212);
//		System.out.println(newQ.getQuestion());
//		System.out.println(newQ.getAnswer().getAns());
		
		Question q = s.get(Question.class, 216);
		System.out.println(q.getQuestion());
		
		for(Answer ans : q.getAnswers()) {
			System.out.println(ans.getAns());
		}
		
		s.close();
		factory.close();
	}

}
