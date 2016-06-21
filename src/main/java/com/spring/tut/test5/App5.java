package com.spring.tut.test5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App5 {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/tut/beans/beans5.xml");
		
		Robit bender = (Robit)context.getBean("robit");
		
		bender.speak();
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
