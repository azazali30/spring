package com.azaz.rest.webservices.restfulwebservices.versoning;

public class PersonV2 {
	private Name name;
	private int id;
	
	public PersonV2(Name name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
