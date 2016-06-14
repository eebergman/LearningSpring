package com.spring.tut.test4;

public class Altmer implements Behavior {

	private String race;

	public Altmer(String race) {
		super();
		this.race = race;
	}

	// getters and setters
	public void setRace(String race) {
		this.race = race;
	}

	// methods
	public void whereAreYouFrom(String text) {
		System.out.println("I'm from " + text);
	}

	public void whatRaceAreYou() {
		System.out.println("I am a " + race);
	}

}
