package com.java.learning.oopsconcepts;

//Base Class 
class Animal 
{ 
	String color;
	
	protected void move()
	{
		 System.out.println("Animal's Move method"); 
	}
	
	protected void eat()
	{
		System.out.println("Animal's Eat method");
	}
} 

//Derived class 
class Doggy extends Animal 
{ 
	// This method overrides move() of Parent 
		
	@Override
	protected void move()
	{
		System.out.println("I am Dog, I move differntly"); 
	}
	
	protected void bark()
	{
		System.out.println("Dog's Bark method");
	}
} 

public class JavaExample_28_MethodOverriding 
{
	public static void main(String[] args) 
	{
		Animal obj  = new Doggy();
		obj.eat();
		obj.move();
		//obj.bark();
	}
}
