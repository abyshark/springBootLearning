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
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		
		Question q1 = new Question();
		q1.setQuestionId(3125);
		q1.setQuestion("What is Swing?");
		
		Answer a1 = new Answer(4577, "It is an important concept",q1);
		Answer a2 = new Answer(3989, "Framwork in java",q1);
		
		List<Answer> list = new ArrayList<>();
		
		list.add(a1);
		list.add(a2);
		
		q1.setAnswers(list);
		
		Transaction tx = session.beginTransaction();
		
		session.save(q1);
		
		tx.commit();
		session.close();
		factory.close();

	}

}
