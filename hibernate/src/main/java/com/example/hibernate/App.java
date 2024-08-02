package com.example.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    @SuppressWarnings("deprecation")
	public static void main( String[] args )
    {
//    	Configuration config = new Configuration().configure("hibernate.cfg.xml"); //connecting mySql
//    	SessionFactory sf = config.buildSessionFactory(); // starts creating database & and start build
//    	Session ss = sf.openSession(); //open the database
//    	ss.beginTransaction(); // responsible for creating tables (begin transaction)
//    	ss.save(ss); //save output (enter details)
//    	ss.getTransaction().commit(); //gives the output (get reciept)
    	
    	
    	Configuration conn = new Configuration().configure("hibernate.cfg.xml");
    	SessionFactory sf= conn.buildSessionFactory();
    	Session s =sf.openSession();
    	Transaction t = s.beginTransaction();
    	logdata lo =new logdata();
    	lo.setName("gayu");
    	lo.setEmail("qwerty@gmail.com");
    	lo.setPassword("qwerty");
    	lo.setPhno(1234567890);
    	s.save(lo);
    	t.commit();
    	System.out.println("successfully inserted");
    	sf.close();
    	s.close();
    }
}
