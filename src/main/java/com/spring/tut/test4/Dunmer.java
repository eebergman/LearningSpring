package com.spring.tut.test4;

public class Dunmer implements Behavior {

	private String race;

	public Dunmer(String race) {
		super();
		this.race = race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public void whereAreYouFrom(String text) {
		System.out.println("I'm from " + text);
	}

	public void whatRaceAreYou() {
		System.out.println("I am a " + race);
	}

}
