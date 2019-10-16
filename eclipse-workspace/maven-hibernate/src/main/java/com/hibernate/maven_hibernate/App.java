package com.hibernate.maven_hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.maven_hibernate.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try {
     	   
     	   SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").
     			   addAnnotatedClass(Student.class).buildSessionFactory();
     	   Session session=factory.openSession();
     	   Student student=new Student();
     	   
     	   student.setFirstName("John");
     	   student.setLastName("Doe");
     	   student.setEmail("john@luv2code.com");
     	   session.getTransaction().begin();
     	   session.save(student);
     	   session.getTransaction().commit();
     	   System.out.println("success");
     	   session.close();
     	   
    
 		
 	} catch (Exception e) {
 		// TODO: handle exception
 	}
    }
}
