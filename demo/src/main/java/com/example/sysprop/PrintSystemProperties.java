package com.example.sysprop;

import java.util.Properties;

public class PrintSystemProperties {

  public static void main(String[] args) {
    
	  // get all system properties
	  Properties props = System.getProperties();

	  // display properties in console
	  props.list(System.out);
	  
	  // print empty line
	  System.out.println();	
	  
	  // print empty line
	  System.out.println("--- GET A PROPERTY ---");
	  System.out.println("java.runtime.version = " + System.getProperty("java.runtime.version"));
	  System.out.println("\n" + "java.version = " + System.getProperty("java.version"));
	  System.out.println("\n" + "java.library.path = " + System.getProperty("java.library.path"));
	  System.out.println("\n" + "User.name = " + System.getProperty("user.name"));
	  
	  // set a new custom property
	  System.setProperty("custom.key", "123456789");
	  
	  // retrieve updated list
	  System.out.println("\n--- UPDATED LIST ---");
	  props = System.getProperties();
	  props.list(System.out);
  }
}
