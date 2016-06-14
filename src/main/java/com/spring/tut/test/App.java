package com.spring.tut.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/tut/test/beans/beans.xml");

		
		Person person = (Person)context.getBean("person");
		person.speak();
		
		Address address = (Address)context.getBean("address");
		
		System.out.println(person);
		System.out.println(address);
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
