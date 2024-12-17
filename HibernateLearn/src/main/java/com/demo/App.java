package com.demo;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hibernate Project started..." );
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

    //Create student
        Student st = new Student();
        st.setId(103);
        st.setName("Aman");
        st.setCity("Jaipur");
        
        System.out.println(st);
        
        
        
        Address ad = new Address();
        ad.setStreet("Street 1");
        ad.setCity("DELHI");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        ad.setX(100.001);

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(st);
        session.save(ad);
        tx.commit();
        session.close();
        System.out.println("Done...");
    }
}
