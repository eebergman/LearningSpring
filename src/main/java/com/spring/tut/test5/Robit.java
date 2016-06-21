package com.spring.tut.test5;

public class Robit {
	
	private String id = "Robit 1246876324658";
	private String speech = "Hello, I am Robit";

	public void speak() {
		System.out.println(id + "; " + speech);
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setSpeech(String speech) {
		this.speech = speech;
	}

}
