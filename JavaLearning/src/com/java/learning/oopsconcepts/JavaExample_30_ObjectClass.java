package com.java.learning.oopsconcepts;

// Object class is present in java.lang package. 
// Every class in Java is directly or indirectly derived from the Object class. 
// If a Class does not extend any other class then it is direct child class of Object and if extends other 
// class then it is an indirectly derived. Therefore the Object class methods are available to all
// Java classes. Hence Object class acts as a root of inheritance hierarchy in any Java Program.

class MyStudent 
{ 
    int rollNo; 
  
    MyStudent(int rollNo) 
    { 
        this.rollNo = rollNo; 
    } 
  
    @Override
    public String toString()
    {
    	return "Student is having the RollNo : "+ this.rollNo;
    }
    
    // Overriding hashCode() 
    @Override
    public int hashCode() 
    { 
        return rollNo; 
    } 
    
    
}    
public class JavaExample_30_ObjectClass 
{
	public static void main(String[] args) 
	{
		MyStudent obj = new MyStudent(10);
		System.out.println("Object class 'ToString' method: "+ obj.toString());
	}
}
