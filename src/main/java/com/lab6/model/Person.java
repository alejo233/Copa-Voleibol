/**
 * 
 */
package com.lab6.model;

import java.util.Date;

public abstract class Person  {
	

	public Person(int id, String firstName, String lastName, String email, String gender, String country, String photo,
			Date birthday) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.country = country;
		this.photo = photo;
		this.birthday = birthday;
	}

	/**
	 * 
	 */
	protected int id;
	
	/**
	 * 
	 */
	protected String firstName;
	
	/**
	 * 
	 */
	protected String lastName;
	
	/**
	 * 
	 */
	protected String email;
	
	/**
	 * 
	 */
	protected String gender;
	
	/**
	 * 
	 */
	protected String country;
	
	/**
	 * 
	 */
	protected String photo;
	
	/**
	 * 
	 */
	protected Date birthday;

}
