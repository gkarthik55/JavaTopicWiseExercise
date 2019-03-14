package com.java.learnings9.collectioninjava;

import java.util.Stack;

public class JavaExample_67_List_Stack 
{
	public static void main(String[] args) 
	{
		Stack<String> names = new Stack<String>();  
		names.push("Java");  
		names.push("C++");  
		names.push("Java");  
		names.push("C#");  
		names.push("Scala");
		names.pop();  
		
		System.out.println("Values of the List - Stack\n");
		for(int i=0, n=names.size(); i<n; i++)
		{
			System.out.println(names.get(i));
		}
	}
}
