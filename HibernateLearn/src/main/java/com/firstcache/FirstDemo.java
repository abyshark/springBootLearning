package com.firstcache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.Student;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

public class FirstDemo {

	public static void main(String[] args) throws InterruptedException, JsonProcessingException {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s = factory.openSession();
		Gson gson = new Gson();
		ObjectMapper mapper = new ObjectMapper();
		Student std = s.get(Student.class, 9);
		String jsonString = gson.toJson(std);
		System.out.println("Student Data: "+ jsonString);
		
		System.out.println("Working!!!");
		Thread.sleep(3000);
		Student std1 = s.get(Student.class, 9);
		Thread.sleep(3000);
		Student std2 = s.get(Student.class, 4);
		
		String jsonString2 = mapper.writeValueAsString(std1);
		String jsonString3 = mapper.writeValueAsString(std2);
		
		System.out.println("After wait std1: "+jsonString2);
		System.out.println("After wait std2: "+jsonString3);
		
		s.close();
		
	}
}
