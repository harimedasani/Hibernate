package com.WorkFusion.HibSLC;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class App 
{
	public static void main( String[] args )
    {
       
		
		Alien a= new Alien();
//        a.setAid(101);
//        a.setColor("Green");
//        a.setAname("Hari");
//        
        
        Configuration con=new Configuration().configure().addAnnotatedClass(Alien.class);
        
        
        ServiceRegistry reg= new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        
        SessionFactory sf=con.buildSessionFactory(reg);
        
        Session session1=sf.openSession();
        session1.beginTransaction();
        a=(Alien) session1.get(Alien.class, 103);
        System.out.println(a);
        session1.getTransaction().commit();
        session1.close();
       
        Session session2=sf.openSession();
        session2.beginTransaction();
        a=(Alien) session2.get(Alien.class, 103);
        System.out.println(a);
        session2.getTransaction().commit();
        session2.close();        
    }
}