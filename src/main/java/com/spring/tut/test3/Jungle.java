package com.spring.tut.test3;

import java.util.HashMap;
import java.util.Map;

public class Jungle {
	
	
	private Map<String, String> foods = new HashMap<String, String>();

	public void setFoods(Map<String, String> foods) {
		this.foods = foods;
	}

	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		for(Map.Entry<String, String> entry: foods.entrySet()) {
			sb.append(entry.getKey() + ": " + entry.getValue() + "\n");
		}
		
		return sb.toString();
	}
	
	
	
	
	
	

//	private Animal largest;
//	private List<Animal> animals;
//
//	public Animal getLargest() {
//		return largest;
//	}
//
//	public void setLargest(Animal largest) {
//		this.largest = largest;
//	}
//
//	public List<Animal> getAnimals() {
//		return animals;
//	}
//
//	public void setAnimals(List<Animal> animals) {
//		this.animals = animals;
//	}
//
//	@Override
//	public String toString() {
//		
//		StringBuilder sb = new StringBuilder();
//		
//		sb.append("Largest: " + largest);
//		sb.append("\n");
//		sb.append("Others:\n");
//		
//		for(Animal animal: animals) {
//		sb.append(animal);
//		sb.append("\n");
//		}
//		
//		return sb.toString();
//	}

	
	
}
