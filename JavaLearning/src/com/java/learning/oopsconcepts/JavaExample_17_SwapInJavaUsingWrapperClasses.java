package com.java.learning.oopsconcepts;

// A Java program to demonstrate that we can use wrapper classes to swap to objects.
// We have discussed in a previous post that parameters are passed by value in Java. 
// So when we pass c1 and c2 to swap(), the function swap() creates a copy of these references.

// Solution is to use Wrapper Class: If we create a wrapper class that contains references of Car, 
// we can swap cars by swapping references of wrapper class.

//A car with model and no. 
class Car 
{ 
	 int model, no; 
	
	 // Constructor 
	 Car(int model, int no) 
	 { 
	     this.model = model; 
	     this.no = no; 
	 } 
	
	 // Utility method to print object details 
	 void print() 
	 { 
	     System.out.println("Car no = " + no + ", Car model = " + model); 
	 } 
} 

//A Wrapper over class that is used for swapping 
class CarWrapper 
{ 
	Car c; 
	
	// Constructor 
	CarWrapper(Car c)   
	{
		this.c = c;
	} 
} 

//A Class that use Car and swaps objects of Car using CarWrapper 
public class JavaExample_17_SwapInJavaUsingWrapperClasses 
{
	// This method swaps car objects in wrappers cw1 and cw2 
    public static void swap(CarWrapper cw1, CarWrapper cw2) 
    { 
        Car temp = cw1.c; 
        cw1.c = cw2.c; 
        cw2.c = temp; 
    } 
  
    // Driver method 
    public static void main(String[] args) 
    { 
    	//Create 2 objects of Car.
        Car c1 = new Car(101, 1); 
        Car c2 = new Car(202, 2); 
        
      //Create 2 objects of CarWrapper.
        CarWrapper cw1 = new CarWrapper(c1); 
        CarWrapper cw2 = new CarWrapper(c2); 
        
        //Call the Swap
        swap(cw1, cw2); 
        
        cw1.c.print(); 
        cw2.c.print(); 
    } 
}
