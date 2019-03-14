package com.java.learnings8.interfacesandabstractclasses;

abstract class Write 
{ 
	Write()
	{
		System.out.println("Constrcutor of Writer"); 
	}

	// static method 
	static void display() 
	{ 
		System.out.println("I am a Writer"); 
	} 
} 

// If we remove implementation of default method from “TestClass”, 
// we get compiler error. 

public class JavaExample_48_AbstractClassesExample 
{
	public static void main(String[] args) 
	{
		Write.display();
	}
}
