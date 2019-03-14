package com.java.learnings4.arraysinjava;

public class JavaExample_38_MultiDimensionalArray
{
	public static void main(String[] args) 
	{
		int multiArr[][]= new int[][]
				{
					{45,25,30},
					{18,36,90,85},
					{33,75}
				};
		
		System.out.println("Jagged Array :");
		
		for(int i=0, rows=multiArr.length; i<rows; i++)
		{
			for(int j=0, cols=multiArr[i].length ; j<cols; j++)
			{
				System.out.print(" " + multiArr[i][j]);
			}
			System.out.println("");
		}

	 } 
}	         
