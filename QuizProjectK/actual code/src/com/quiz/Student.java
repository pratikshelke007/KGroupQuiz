package com.quiz;

public class Student {

	int id;
	String firstName;
	String lastName;

	public Student(String firstName, String lastName,int id) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Student() {

	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]\n";
	}






}
