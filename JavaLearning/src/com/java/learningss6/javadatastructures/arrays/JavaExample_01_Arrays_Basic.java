package com.java.learningss6.javadatastructures.arrays;

public class JavaExample_01_Arrays_Basic
{
	public static void main(String[] args) 
	{
		// declares an Array of integers. 
	    int[] arr; 
	          
	    // allocating memory for 5 integers. 
	    arr = new int[5]; 
    
	    arr[0] = 10; 
	    arr[1] = 20; 
	    arr[2] = 30; 
	    arr[3] = 40; 
	    arr[4] = 50; 
	          
	    // accessing the elements of the specified array 
	    for (int i = 0; i < arr.length; i++) 
	    {
		    System.out.println("Element at index " + i + " : "+ arr[i]);   
	    }
	 } 
}	         
