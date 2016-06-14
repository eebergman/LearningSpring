package com.spring.tut.test2;

import java.util.List;

public class FruitBasket {
	
	//Notes C
	
	
	private String name;
	private List<String> fruits;

	public FruitBasket(String name, List<String> fruits) {
		this.name = name;
		this.fruits = fruits;
	}

	@Override
	public String toString() {
		
		StringBuilder 	sb = new StringBuilder();
		
		sb.append(name);
		sb.append(" contains:\n");
		
		for(String fruit: fruits) {
			sb.append(fruit);
			sb.append("\n");
		}
		
		return sb.toString();
	}

	
	
}
