package com.example.maven.eclipse;

//SubStudent is a subclass of Student
public class SubStudent extends Student {
public String address;
public void getdetails() {
	System.out.println("Id: " + id + ", Name: " + name
			+ ", Email: " + email);
	System.out.println("Address: " + address);
	}
}
