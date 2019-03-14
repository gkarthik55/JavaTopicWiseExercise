package com.java.learning.oopsconcepts;

public class JavaExample_16_ClassesAndObject 
{
	public static void main(String args[])
	{
		// I have declared the 'Dog' class outside the file to show that the Classes can be in different file and
		// same package.
		Dog tuffy = new Dog("tuffy","papillon", 5, "white"); 
	    System.out.println(tuffy.toString());
	    
	    //Create a Tuffy clone object.
	    
	    Dog cloneTuffy = (Dog)tuffy;
	    System.out.println(cloneTuffy.toString());
	}
}
