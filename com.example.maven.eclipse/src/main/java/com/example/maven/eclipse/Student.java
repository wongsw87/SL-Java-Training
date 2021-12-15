package com.example.maven.eclipse;

public class Student {
	// default access modifier
	int email;

	// define instance (object) variables
	protected int id;
	public String name;
	// private String address;

	 // define class (static) variables
	// static variables can only be access from another static methods
	public static int count;

	 // no-arg constructor - initialization
	public Student() {

	 }

	 // overloaded constructor
	public Student(int id, String name) {
	System.out.println("int");
	this.id = id;
	this.name = name;
	}
	public Student(String name, int id) {
	this.id = id;
	this.name = name;
	}
	public Student(long id, String name) {
	System.out.println("long");
	this.id = (int) id;
	this.name = name;
	}

	 // method to display student's details
	public void display() {
	System.out.println("Id: " + id + "\nName: " + name);
	}

	 public static void getCount() {
	System.out.println("Count: " + count);
	// System.out.println("Id: " + id + "\nName: " + name); // error
	}
	}
