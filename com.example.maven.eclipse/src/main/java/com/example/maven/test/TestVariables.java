package com.example.maven.test;

import com.example.maven.eclipse.Student;

public class TestVariables {

	public int number = 8;
	// main's arguments - string array []
	public static void main(String[] args) {
	// retrieve program arguments
	System.out.println("First: " + args[0]);
	System.out.println("Second: " + args[1]);
	System.out.println(args[0] + args[1]);
	// to add the two numbers, first need to convert to int
	try {
	int first = Integer.parseInt(args[0]);
	int second = Integer.parseInt(args[1]);
	System.out.println(first + second);
	} catch (Exception ex) {
	System.out.println("Error converting: " + ex.getMessage());
	}
	// local variables
	String greeting = "Good morning everyone!";
	System.out.println(greeting);
	// call method greet()
	greet(greeting);
	// create object (instance) of type Student
	// syntax to create object in Java
	// class identifier = new constructor()
	Student stud1 = new Student();
	// access the instance variables from stud1 using dot notation
	// stud1.id = 1;
	stud1.name = "John Smith";
	// access method on stud1 using dot notation
	stud1.display();
	// access the static variable - using the classname
	Student.count = 1;
	System.out.println("Count: " + Student.count);
	Student.getCount();
	// System.out.println("The number is " + number);
	int number = 0;
	// create another student object using overloaded constructor
	Student stud2 = new Student(2, "Bob Taylor");
	stud2.display();
	Student stud3 = new Student("Tom Cruise", 3);
	stud3.display();
	// try access email from stud3
	// stud3.email = "tom@example.com"; // error
	}
	// add an argument/parameter for this method
	// method's argument is also local to method
	public static void greet(String greeting) {
	// greeting is local in main
	// greeting is not accessible from greet()
	System.out.println(greeting);
	// define another local variable here
	int number = 9;
	System.out.println("The number is " + number);
	}
	}
