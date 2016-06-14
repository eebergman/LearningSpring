package com.spring.tut.test;

public class Address {

	private String street;
	private String postCode;

	public Address(String street, String postCode) {
		this.street = street;
		this.postCode = postCode;
	}

	//methods 
	
	public void init() {
		System.out.println("Bean created " + this);
	}
	
	public void destroy() {
		System.out.println("Bean destroyed " + this);
	}
	
	@Override
	public String toString() {
		return "Address [street=" + street + ", postCode=" + postCode + "]";
	}

}
