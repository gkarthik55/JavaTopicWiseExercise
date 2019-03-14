package com.java.learningss6.javadatastructures.arrays;

import java.util.Set;
import java.util.LinkedHashSet;

public class JavaExample_03_Arrays_Interview
{
	// To Preserve the ordering and to remove duplicates in the integer array 
	// using LinkedHashSet
	private static void removeDuplicates(int[] numbers)
	{
		Set<Integer> integerArray = new LinkedHashSet<Integer>();

		for(int i:numbers)
		{
			integerArray.add(i);
		}
		
		System.out.println("Elements after removing the Duplicate values:"
				+ integerArray);
	}
	
	//To remove duplicates from integer array without Collection.
	public static int[] removeDuplicate(int[] arr)
	{
		int result[] = new int [arr.length];
		int j=0;
		
		for(int i:arr)
		{
			if(!isExists(result,i))
			{
				result[j++] = i;
			}
		}
		
	    return result;
	}

	//To check if the order exists.
	private static boolean isExists(int[] array, int value)
	{
	    for (int i : array) 
	    {
	        if(i==value)
	            return true;
	    }
	    return false;
	}
	
	public static void main(String[] args) 
	{
		//	Java Program to remove duplicates from integer array 
        int[] iArray = new int[]{4, 3, 3, 4, 5, 2, 4};
        removeDuplicates(iArray);
        
        int[] result = removeDuplicate(iArray);
        System.out.println("Removed duplicates from integer array without Collection.");
        for(int i:result)
        {
        	  System.out.print(" " + i);
        }
	 } 
}	         
