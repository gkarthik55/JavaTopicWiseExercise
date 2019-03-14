package com.java.learning.basics;

// Instance Variables: Instance variables are non-static variables and are declared in a class outside any method, 
// constructor or block.
class Employee 
{    
    // These variables are instance variables. These variables are in a class and are not inside any function 
    int empId; 
    String empName; 
} 

class Emp 
{ 
	   // static variable salary 
	   public static String CEO = "Rama"; 
} 
	  

public class JavaExample_09_Variables 
{
	public static void main(String[] args) 
	{
		//Local Variables: A variable defined within a block or method or constructor is called local variable
		 //local variable age 
        int empAge = 0; 
        empAge = empAge + 5; 

        // Final variable in Java can be assigned a value only once, we can assign a value either in declaration or later.
        final int i = 10;
        //i = 30; // Error because i is final.
		
		//Static Variables: Static variables are also known as Class variables.
		System.out.println(Emp.CEO);
	}

}
