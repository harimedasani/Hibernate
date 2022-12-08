package com.WorkFusion.HibDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Laptop l=new Laptop();
		l.setLid(101);
		l.setLname("Dell");
		
		
		
		Student s=new Student();
		s.setMarks(85);
		s.setName("Kiran");
		s.setRollno(1);
		s.setLaptop(l);
		
		//l.getStudent().add(s);
		
		Configuration con=new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        
        SessionFactory sf=con.buildSessionFactory();
        
        Session session = sf.openSession();
        
        session.beginTransaction();
        
        session.persist(l);
        session.persist(s);
        
        session.getTransaction().commit();
        
	}

}
