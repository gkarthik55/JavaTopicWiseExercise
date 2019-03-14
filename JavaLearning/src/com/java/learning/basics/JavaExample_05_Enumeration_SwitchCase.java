package com.java.learning.basics;

//An Enum class 
enum Day 
{ 
	 SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY; 
} 

class Enumeration
{
	Day day; 
	  
    // Constructor 
    public Enumeration(Day day) 
    { 
        this.day = day; 
    } 
  
    // Prints a line about Day using switch 
    public void dayIsLike() 
    { 
        switch (day) 
        { 
        case MONDAY: 
            System.out.println("Mondays are bad."); 
            break; 
        case FRIDAY: 
            System.out.println("Fridays are better."); 
            break; 
        case SATURDAY: 
        case SUNDAY: 
            System.out.println("Weekends are best."); 
            break; 
        default: 
            System.out.println("Midweek days are so-so."); 
            break; 
        } 
    } 
 }

public class JavaExample_05_Enumeration_SwitchCase 
{
    public static void main(String[] args) 
    { 
        String str = "MONDAY"; 

        // Using the valueOf() method of Enum. 
        Enumeration t1 = new Enumeration(Day.valueOf(str)); 
        t1.dayIsLike(); 
    } 
}
