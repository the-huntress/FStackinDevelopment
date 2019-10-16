package com.myFruitSeason.fruitBasket_fruit;

import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import lombok.Data;

@Entity
@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "fruit_type")
@DiscriminatorValue("Fruit")

public class Fruit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	private Date purchaseDate;
	private double cost;
	
	public Fruit(String name, Date purchaseDate, double cost) {
		this.name = name;
		
		this.purchaseDate = purchaseDate;
		this.cost = cost;
	}

}
