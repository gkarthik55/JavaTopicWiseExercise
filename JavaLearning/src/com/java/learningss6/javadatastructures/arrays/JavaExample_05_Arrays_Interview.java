package com.java.learningss6.javadatastructures.arrays;

import java.util.Arrays;

//How do you find all pairs of an integer array whose sum is equal to a given number?
//
//	Algorithm :
//  hasArrayTwoCandidates (A[], ar_size, sum)
//
//1) Sort the array in non-decreasing order.
//2) Initialize two index variables to find the candidate 
//   elements in the sorted array.
//       (a) Initialize first to the leftmost index: l = 0
//       (b) Initialize second  the rightmost index:  r = ar_size-1
//3) Loop while l < r.
//       (a) If (A[l] + A[r] == sum)  then return 1
//       (b) Else if( A[l] + A[r] <  sum )  then l++
//       (c) Else r--    
//4) No candidates in whole array - return 0


public class JavaExample_05_Arrays_Interview
{
	// Function to check if array has 2 elements 
	// whose sum is equal to the given value.
    static boolean hasArrayTwoCandidates(int arr[], int size, int sum) 
    { 
        int l, r; 
      
        /* Sort the elements */
        Arrays.sort(arr); 
      
        /* Now look for the two candidates in the sorted array*/
        l = 0; 
        r = size-1;  
        
        while (l < r) 
        { 
            if(arr[l] + arr[r] == sum) 
                return true;  
            else if(arr[l] + arr[r] < sum) 
                l++; 
            else // A[i] + A[j] > sum 
                r--; 
        }  
        return false; 
    } 
    
	public static void main(String[] args) 
	{
		 int arr[] = {1, 4, 45, 6, 10, -8}; 
	     int n = 16; 
	     int size = arr.length; 
	          
	        // Function calling 
	        if(hasArrayTwoCandidates(arr, size, n)) 
	            System.out.println("Array has two " +  
	                               "elements with given sum"); 
	        else
	            System.out.println("Array doesn't have " + 
	                               "two elements with given sum");
	} 
}	         
