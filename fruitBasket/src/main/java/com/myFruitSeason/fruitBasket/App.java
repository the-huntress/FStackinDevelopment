package com.myFruitSeason.fruitBasket;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.myFruitSeason.fruitBasket_exotic.ExoticFruit;
import com.myFruitSeason.fruitBasket_fruit.Fruit;
import com.myFruitSeason.fruitBasket_seasonal.SeasonalFruit;

/**
 * Hello world!
 *
 */
public class App 
{
    
    	public static void main(String[] args) {
    		try {
    			SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Fruit.class)
    					.addAnnotatedClass(SeasonalFruit.class)
    					.addAnnotatedClass(ExoticFruit.class).buildSessionFactory();
    			Session session = factory.openSession();
    			Fruit fruit = new Fruit("Chikku", new Date(), 9.99);
    			SeasonalFruit sea_fruit = new SeasonalFruit("Mango", new Date(), 9.99,
    					"National fruit of India");
    			ExoticFruit exo_fruit = new ExoticFruit("Kiwi", new Date(), 9.99, "Spanish", 4);
    			session.getTransaction().begin();
    			session.save(fruit);
    			session.save(sea_fruit);
    			session.save(exo_fruit);
    			session.getTransaction().commit();
    			System.out.println("Successfully updated the fruitsBasket");

    		} catch (Exception e) {
    			e.printStackTrace();
    		}
    	}
    }

