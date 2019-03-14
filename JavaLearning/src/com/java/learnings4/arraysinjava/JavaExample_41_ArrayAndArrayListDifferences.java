package com.java.learnings4.arraysinjava;

import java.util.ArrayList;
import java.util.List;

public class JavaExample_41_ArrayAndArrayListDifferences
{
	public static void main(String[] args) 
	{
		//Declare Array
		int	arr[] = new int[5];
		
		arr[0] = 5;
		arr[1] = 10;
		arr[2] = 15;
		arr[3] = 20;
		arr[4] = 25;
		
		System.out.println("Normal Array: ");
		for (int i=0; i<4;i++)
		{
			System.out.print(" "+ arr[i]);
		}
		
		//Array List in Java
		List<Integer> arrList = new ArrayList<>();
		arrList.add(2);
		arrList.add(4);
		arrList.add(6);
		
		System.out.println("\nArray List in Java");
		for (int i=0;i<arrList.size(); i++)
		{
			System.out.print(" "+ arrList.get(i));
		}
		
	 } 
}	         
