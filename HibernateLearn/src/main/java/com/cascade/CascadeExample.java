package com.cascade;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.map.Answer;
import com.map.Question;

public class CascadeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		Question q1 = new Question();
		q1.setQuestionId(3115);
		q1.setQuestion("What is cascading?");
		
		Answer a1 = new Answer(4567, "It is an important concept",q1);
		Answer a2 = new Answer(3981, "Auto save entity on save",q1);
		Answer a3 = new Answer(5671, "Java concept in hibernate",q1);
		
		List<Answer> list = new ArrayList<Answer>();
		
		list.add(a1);
		list.add(a2);
		list.add(a3);
		
		q1.setAnswers(list);
		
		Transaction tx = session.beginTransaction();
		
		session.save(q1);
		session.save(a1);
		session.save(a2);
		session.save(a3);
		
		
		tx.commit();
		session.close();
		factory.close();

	}

}
