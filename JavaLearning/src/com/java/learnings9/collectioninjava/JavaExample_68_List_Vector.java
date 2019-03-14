package com.java.learnings9.collectioninjava;

import java.util.List;
import java.util.Vector;

public class JavaExample_68_List_Vector 
{
	public static void main(String[] args) 
	{
		List<String> names = new Vector<>();
		names.add("Java");
		names.add("C++");
		names.add("Java");
		names.add("C#");
		
		System.out.println("Values of the List - Vector\n");
		for(int i=0, n=names.size(); i<n; i++)
		{
			System.out.println(names.get(i));
		}
	}
}
