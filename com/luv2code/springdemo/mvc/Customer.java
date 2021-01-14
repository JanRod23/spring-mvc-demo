package com.luv2code.springdemo.mvc;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {
	
	@NotNull(message="First name is required")
	@Size(min=1, message="At least 1 character is required")
	private String firstName;
	
	@NotNull(message="Last name is required")
	@Size(min=1, message="At least 1 character is required")
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
