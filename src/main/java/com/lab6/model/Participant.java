package com.lab6.model;

import java.util.Date;

public class Participant extends Person{

	private Participant next;
	private Participant prev;
	
	public Participant(int id, String firstName, String lastName, String email, String gender, String country,
			String photo, Date birthday) {
		super(id, firstName, lastName, email, gender, country, photo, birthday);
	}

}
