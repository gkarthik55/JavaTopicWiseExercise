package com.java.learning.oopsconcepts;

//Java program to illustrate the concept of Association.

class Bank  
{ 
	 private String name; 
	   
	 Bank(String name) 
	 { 
	     this.name = name; 
	 } 
	   
	 public String getBankName() 
	 { 
	     return this.name; 
	 } 
}  

class Employee 
{ 
	 private String name; 
	   
	 Employee(String name)  
	 { 
	     this.name = name; 
	 } 
	   
	 public String getEmployeeName() 
	 { 
	     return this.name; 
	 }  
} 

public class JavaExample_24_AssociationExample 
{
	public static void main(String args[])
	{
		Bank bankObj = new Bank("Axis"); 
	    Employee empObj = new Employee("Neha"); 
	      
	    System.out.println(empObj.getEmployeeName() + " is employee of " + bankObj.getBankName()); 

		// In above example two separate classes Bank and Employee are associated 
		// through their Objects. Bank can have many employees, 
		// So it is a one-to-many relationship.
	}
}
