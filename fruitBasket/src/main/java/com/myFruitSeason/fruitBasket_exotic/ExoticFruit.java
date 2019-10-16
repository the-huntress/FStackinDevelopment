package com.myFruitSeason.fruitBasket_exotic;

import java.util.Date;

import com.myFruitSeason.fruitBasket_fruit.Fruit;
import java.util.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@DiscriminatorValue("Exotic Fruit")

public class ExoticFruit extends Fruit {
	private String countries;
	private int rating;


	public ExoticFruit(String name, Date purchaseDate, double cost, String country, int rating) {
		super(name, purchaseDate, cost);
		// TODO Auto-generated constructor stub
		countries = country;
		this.rating = rating;
	}

}
