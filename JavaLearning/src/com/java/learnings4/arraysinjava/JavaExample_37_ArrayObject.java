package com.java.learnings4.arraysinjava;

class Person 
{
	private int personId;
	private String personName;
	
	Person(int pId, String pName)
	{
		this.personId = pId;
		this.personName = pName;
	}
	
	@Override
	public String toString()
	{
		return "Person Id :"+ personId + "| Person Name :" +personName;
	}
}

public class JavaExample_37_ArrayObject
{
	public static void main(String[] args) 
	{
		Person p1 = new Person(10, "Karthik");
		Person p2 = new Person(20, "Srikanth");
		Person p3 = new Person(30, "Raghu");
		
		Person personArray[] = new Person[] {p1,p2, p3};

		System.out.println("Person Details :");
		
		for(Person p :personArray)
		{
			System.out.println(p.toString());
		}
	 } 
}	         
