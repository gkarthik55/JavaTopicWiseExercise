package com.java.learning.oopsconcepts;

//Java program to demonstrate working of method overloading in Java. 

class Sum 
{ 
	 // Overloaded sum(). This sum takes two int parameters 
	 public int sum(int x, int y) 
	 { 
	     return (x + y); 
	 } 
	
	 // Overloaded sum(). This sum takes three int parameters 
	 public int sum(int x, int y, int z) 
	 { 
	     return (x + y + z); 
	 } 
	
	 // Overloaded sum(). This sum takes two double parameters 
	 public double sum(double x, double y) 
	 { 
	     return (x + y); 
	 } 
}

public class JavaExample_27_MethodOverloading 
{
	public static void main(String[] args) 
	{
		Sum s1 = new Sum();
		
		System.out.println("Sum of 2 Integers :"+ s1.sum(10, 15));
		System.out.println("Sum of 2 Integers :"+ s1.sum(10, 15, 25));
		System.out.println("Sum of 2 Integers :"+ s1.sum(7.34, 15.35));
	}
}
