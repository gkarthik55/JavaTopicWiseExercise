package com.java.learningss6.javadatastructures.arrays;

import java.util.Arrays;

public class JavaExample_02_Arrays_Interview
{
	 /**
	 * Java method to find missing number in array of size n containing
	 * numbers from 1 to n only.
	 * can be used to find missing elements on integer array of
	 * numbers from 1 to 100 or 1 - 1000
	 */
	private static int getMissingNumber(int[] numbers, int totalCount)
	{
		//1) Sum of the series: Formula: n*(n+1)/2( but only work for one missing number)

		int expectedSum = totalCount * ((totalCount+1)/2);
		int actualSum = 0;
		
		for(int n:numbers)
		{
			actualSum = actualSum + n;
		}
		
		return (expectedSum - actualSum);
	}
	
	public static void main(String[] args) 
	{
		// 1.How do you find the missing number in a given integer array of 1 to 100? 
	    
		/**
		* Java method to find missing number in array of size n containing
		* numbers from 1 to n only.
		* can be used to find missing elements on integer array of 
		* numbers from 1 to 100 or 1 - 1000
		*/
		
		// When only one missing number in array
        int[] iArray = new int[]{1, 2, 3, 5};
        int missing = getMissingNumber(iArray, 5);
        System.out.printf("Missing number in array %s is %d %n", Arrays.toString(iArray), missing);
	 } 
}	         
