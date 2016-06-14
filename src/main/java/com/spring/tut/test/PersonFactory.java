package com.spring.tut.test;

public class PersonFactory {

	//This cannot be static!!
	public Person createPerson(int id, String name){
//		System.out.println("Using factory to create person");
		return new Person(id, name);
	}
	
}
