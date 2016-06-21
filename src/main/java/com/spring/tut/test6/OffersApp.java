package com.spring.tut.test6;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OffersApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/tut/beans/beans6.xml");

		OffersDAO offersDao = (OffersDAO) context.getBean("offersDAO");

		List<Offer> offers = offersDao.getOffers();
		
		for (Offer offer : offers) {
			System.out.println(offer);
		}

		((ClassPathXmlApplicationContext) context).close();
	}

}
