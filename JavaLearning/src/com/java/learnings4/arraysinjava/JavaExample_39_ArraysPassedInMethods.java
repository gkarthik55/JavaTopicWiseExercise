package com.java.learnings4.arraysinjava;

import java.util.Scanner;

public class JavaExample_39_ArraysPassedInMethods
{
	//Calculate the Sum of Array Elements
	public int sum(int arr[])
	{
		int sum = 0;
		for(int i:arr)
		{
			sum += i;
		}
		
		return sum;
	}

	public static void main(String[] args) 
	{
		JavaExample_39_ArraysPassedInMethods obj = new JavaExample_39_ArraysPassedInMethods();
		
		int size=0;
		System.out.println("Enter the size of Array :");
		Scanner sc= new Scanner(System.in);
		size = sc.nextInt();
		
		int singleArr[] = new int[]{10, 58, 35, 46, 8};
		
		System.out.println("Single Dimension Array :");
		System.out.println("Sum of Array is "+ obj.sum(singleArr));
		
	 } 
}	         
