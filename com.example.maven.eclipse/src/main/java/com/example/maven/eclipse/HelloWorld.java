package com.example.maven.eclipse;

public class HelloWorld {

  public static void main(String[] args) {
    System.out.println("Hello World!");
    System.out.println("World says Hi~");
    
    // single line comment
    /*
     * multiple line comment
     */
    // Non-Primitive Integer Type/Reference Type
    // define a string variable (data-type) called name (identifier), to store a value;
    String name = "John Smith";
    // String Name = "Bob Pancake";
	// String $name = "John Smith";
	// String _name2 = "John Smith";
	// error String 1name = "John Smith";
	// error String -name= "Adam"
	// error String full name  = "John Smith";
     
    // Primitive Integer type
    // byte = 8 bits
    // short = 16 bits
    // int = 32 bits (2 to the power of 32-1)
    // long = 64 bits (2 to the power of 64-1)
    
    // Primitive floating point type
    // float - 32 bits
    // double - 64 bits
    
    // Primitive Char type
    // single quote open-close
   
    // Primitive Boolean type
    // true or false
    
    // Define variables
    // int is a default type
    int number = 999999999;
    // can use 'L' or 'l'
    long bignumber = 9L;
    // can use 'F' or 'f' for Float
    float price = 29.90F;
    // double is a default type
    double total = 39.90;
    
    float quantity = 2.0F;
    float totalamount = price * quantity;
    
    // double quote is reserved for string
    char colour = 'B';
    char newnline = '\n';
    char unicode = '\u0061';
    
    boolean flag = true;
    flag = false;
    
    System.out.println("Name: " + name);
    System.out.println("Integer Number: " + number);
  }
}
