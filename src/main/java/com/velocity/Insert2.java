package com.velocity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Insert2 {

	public static void main(String[] args) {
		 Configuration cfg =new Configuration();
	        cfg.configure("com/velocity/hibernate.cfg.xml");
	        
	        SessionFactory sessionFactory=cfg.buildSessionFactory();
	        Session session = sessionFactory.openSession();
	        
	        Transaction transaction = session.beginTransaction();
	        
	        // 1st level of cache
	   //     Employee2 employee2 = session.get(Employee2.class,1);
	    //    System.out.println(employee2);
	    //    Employee2 employee22 =session.get(Employee2.class,1);
	    //    System.out.println(employee22);
	    //    Employee2 employee23 = session.get(Employee2.class,3);
	    //    System.out.println(employee23);
	      
	        
	        //second level of cache
	    //   Employee2 employee2 = session.get(Employee2.class,1);
	     //  System.out.println(employee2);
	       
	     //  Session session2=sessionFactory.openSession();
	     //  Employee2 employee21 =session2.get(Employee2.class,1);
	     //  System.out.println(employee21);
	       
	       
	      //select
	        Query query =session.createQuery("from Employee");
	        List<Employee2>empList=query.list();
	        query.setCacheable(true);
	        System.out.println(emplist);
	        
	        Session session2=sessionFactory.openSession();
	        Query query = session2.createQuery("from Employee");
	        query.setCacheable(true);
	        List<Employee2> empList1=query1.list();
	        System.out.println(empList1);
	        
	        transaction.commit();
	        session.close();
	        sessionFactory.close();
	        System.out.println("All records added");
	        }




	}


