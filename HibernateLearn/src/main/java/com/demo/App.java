package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hibernate Project started..." );
        SessionFactory factory = new Configuration().configure().buildSessionFactory();

//    //Create student
//        Student st = new Student();
//        st.setId(103);
//        st.setName("Aman");
//        st.setCity("Jaipur");
//        
//        System.out.println(st);
        
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
//        session.save(st);
        tx.commit();
        session.close();
    }
}
