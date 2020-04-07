package com.mario.jsonproblemvaadin15;

public class Entity {
	@SuppressWarnings("unused")
	private String codeNumber = "007";
	private String name = "Bond";
	private String firstName = "James";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected String getFirstName() {
		return firstName;
	}

	protected void setFirstName(String firstName) {
		this.firstName = firstName;
	}
}
