package com.java.learningss6.javadatastructures.arrays;

import java.util.Arrays;

//How to find largest and smallest number from integer array - Java Solution

public class JavaExample_04_Arrays_Interview
{
	public static void largestAndSmallest(int[] numbers) 
	{ 
		int smallest = numbers[0];
		int largest = numbers[0];
		
		for(int i:numbers)
		{
			if(i > largest)
			{
				largest = i;
			}
			else if(i < smallest)
			{
				smallest = i;
			}
		}
		
		System.out.println("Given integer array : " + Arrays.toString(numbers)); 
		System.out.println("Largest number in array is : " + largest); 
		System.out.println("Smallest number in array is : " + smallest);
	}
	
	public static void main(String[] args) 
	{
		largestAndSmallest(new int[] {6554, 311, 50, 125, -356, -234781, 0, 18});
	} 
}	         
