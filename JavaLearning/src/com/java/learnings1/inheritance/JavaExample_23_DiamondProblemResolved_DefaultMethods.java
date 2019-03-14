package com.java.learnings1.inheritance;

//A simple Java program to demonstrate multiple inheritance through default methods. 
interface MyWriter 
{ 
	 // default method 
	 default void show() 
	 { 
	     System.out.println("I am the Writer"); 
	 } 
} 
 
interface MyBoldWriter extends MyWriter
{ 
	 // Default method 
	 default void show() 
	 { 
	     System.out.println("I am the Bold Writer"); 
	 } 
} 

interface MyItalicWriter extends MyWriter
{ 
	 // Default method 
	 default void show() 
	 { 
	     System.out.println("I am the Italic Writer"); 
	 } 
} 

//Implementation class code 
class MyPen implements MyBoldWriter, MyItalicWriter 
{ 
	 // Overriding default show method 
	 public void show() 
	 { 
	     // use super keyword to call the show method of MyBoldWriter interface 
		 MyBoldWriter.super.show();
		 
		 //Using the above statement the Diamond problem is solved.
	 } 
}

public class JavaExample_23_DiamondProblemResolved_DefaultMethods 
{
	public static void main(String[] args) 
	{
		MyPen p = new MyPen();
		p.show();
	}
}
