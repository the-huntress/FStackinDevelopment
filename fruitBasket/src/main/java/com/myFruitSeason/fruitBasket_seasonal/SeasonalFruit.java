package com.myFruitSeason.fruitBasket_seasonal;

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
@DiscriminatorValue("Seasonal Fruit")

public class SeasonalFruit extends Fruit {
	private String newfeatures;

	public SeasonalFruit(String name, Date purchaseDate, double cost, String features) {
		super(name, purchaseDate, cost);
		// TODO Auto-generated constructor stub
		newfeatures = features;
	}
	
}
