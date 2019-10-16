package com.myProject.trial;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").
    			   addAnnotatedClass(inst.class). addAnnotatedClass(inst_detail.class).buildSessionFactory();
    	Session session = factory.getCurrentSession();
    	inst_detail det = new inst_detail();
    	det.setYoutube("helloWorld");
    	det.setTwitter("rahul.official");
    	inst i = new inst();
    	i.setFirstName("winnie");
    	i.setLastName("the_Pooh");
    	i.setEmail("pooh@honey.com");
    	i.setDetails(det);
    	
    	session.getTransaction().begin();
    	session.persist(det);
    
    	session.getTransaction().commit();
    	session.close();
    	
    	
    			
     	  
    }
}
