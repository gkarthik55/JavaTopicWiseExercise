package com.java.learnings8.interfacesandabstractclasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student 
{ 
	 int rollno; 
	 String name, address; 
	
	 public Student(int rollno, String name, String address) 
	 { 
	     this.rollno = rollno; 
	     this.name = name; 
	     this.address = address; 
	 } 
	
	 public String toString() 
	 { 
	     return this.rollno + " " + this.name + " " + this.address; 
	 } 
} 

class SortbyRollNo implements Comparator<Student> 
{ 
	 // Used for sorting in ascending order of roll number 
	 @Override
	 public int compare(Student a, Student b) 
	 { 
	     return a.rollno - b.rollno; 
	 } 
} 

class SortbyName implements Comparator<Student> 
{ 
 // Used for sorting in ascending order of roll name 
 public int compare(Student a, Student b) 
 { 
     return a.name.compareTo(b.name); 
 } 
} 

public class JavaExample_51_ComparatorInterface_StudentClass 
{
	public static void main(String[] args) 
	{
		ArrayList<Student> ar = new ArrayList<Student>(); 
        ar.add(new Student(111, "bbbb", "london")); 
        ar.add(new Student(131, "aaaa", "nyc")); 
        ar.add(new Student(121, "cccc", "jaipur")); 
  
        System.out.println("Unsorted"); 
        for (int i=0; i<ar.size(); i++) 
            System.out.println(ar.get(i)); 
  
        Collections.sort(ar, new SortbyRollNo()); 
  
        System.out.println("\nSorted by rollno"); 
        for (int i=0; i<ar.size(); i++) 
            System.out.println(ar.get(i)); 
  
        Collections.sort(ar, new SortbyName()); 
  
        System.out.println("\nSorted by name"); 
        for (int i=0; i<ar.size(); i++) 
            System.out.println(ar.get(i)); 
	}
}
