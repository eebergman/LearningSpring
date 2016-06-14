package com.spring.tut.test4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App4 {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/tut/beans/beans4.xml");
		
		Tamriel tamriel = (Tamriel)context.getBean("tamriel");
		
		tamriel.altmerRace();
		tamriel.altmerHome("Summerset Isle");
		tamriel.dunmerRace();
		tamriel.dunmerHome("Morrowind");
		
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
