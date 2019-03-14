package com.java.learning.basics;

enum Colors
{
	RED, GREEN, BLUE;
}

//Java program to demonstrate working of values(), ordinal() and valueOf()

public class JavaExample_06_Enumeration_PredefinedMethods 
{
	public static void main(String[] args) 
	{
		// Calling values() 
        Colors arr[] = Colors.values(); 
        
        // Looping through the Enum values.
        for (Colors color : arr) 
        { 
            // Calling ordinal() to find index of color. 
            System.out.println(color + " at index " + color.ordinal()); 
        } 
  
        // Using valueOf(). Returns an object of Colors with given constant.  
        System.out.println(Colors.valueOf("RED")); 
      
        //Uncommenting second line causes exception IllegalArgumentException
        // System.out.println(Color.valueOf("WHITE")); 
	}
}
