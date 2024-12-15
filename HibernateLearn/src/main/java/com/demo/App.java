package com.demo;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hibernate Project started..." );
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        System.out.println(factory);
    }
}
