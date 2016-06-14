package com.spring.tut.test;

public class Person {

	private int id;
	private String name;

	private int taxId;
	private Address address;

	public Person() {

	}

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTaxId() {
		return taxId;
	}

	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	//Methods
	
	public void onCreate() {
		//the name of this method is arrb
		System.out.println("Person created " + this);
	}
	
	public void onDestroy() {
		//name of method is arrb
		System.out.println("Person destroyed.");
	}

	public void speak() {
		System.out.println("Hello, I'm a person.");
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", taxId=" + taxId + ", address=" + address + "]";
	}

}
