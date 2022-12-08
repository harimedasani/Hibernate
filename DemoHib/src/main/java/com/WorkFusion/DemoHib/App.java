package com.WorkFusion.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
//import org.hibernate.service.ServiceRegistry;

/**
 * Hello world!
 *
 */

public class App 
{
	public static void main( String[] args )
    {
       
//		AlienName an=new AlienName();
//		an.setFname("Hari");
//		an.setMname("Kumar");
//		an.setLname("Medasani");
//		
		
		Alien a= new Alien(); //we can assign the null value. 
        a.setAid(101);
        a.setColor("Green");
        a.setAname("Hari");
        
        /*
        a.setAid(101);
        a.setAname("Hari");
        a.setColor("SkyBlue");
        
        Configuration con=new Configuration().configure().addAnnotatedClass(Alien.class);
        
        SessionFactory sf=con.buildSessionFactory();
        
        Session session = sf.openSession();
        
        Transaction tx=session.beginTransaction();
        
        session.persist(a);  //Used to push values in the table(Saving Data in the table)
        
       // a=session.get(Alien.class, 101); //used to fetch the data
        
        tx.commit();
        
        
        System.out.println(a); */
        
        Configuration con=new Configuration().configure().addAnnotatedClass(Alien.class);
        
        SessionFactory sf=con.buildSessionFactory();
        
        Session session1=sf.openSession();
        session1.beginTransaction();
        a=session1.get(Alien.class, 101);
        System.out.println(a);
        session1.getTransaction().commit();
        session1.close();
        
        
        
        Session session2=sf.openSession();
        session2.beginTransaction();
        a=session2.get(Alien.class, 101);
        System.out.println(a);
        session2.getTransaction().commit();
        session2.close();
        
    }
}
