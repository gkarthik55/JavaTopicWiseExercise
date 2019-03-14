package com.java.learnings9.collectioninjava;

import java.util.LinkedList;
import java.util.List;

public class JavaExample_70_List_LinkedList 
{
	public static void main(String[] args) 
	{
		List<String> names = new LinkedList<>();
		names.add("Java");
		names.add("C++");
		names.add("Java");
		names.add("C#");
		
		//Adding an element at the specific position  
		names.add(0, "Scala");
		
		System.out.println("Values of the List - Linked List\n");
		for(int i=0, n=names.size(); i<n; i++)
		{
			System.out.println(names.get(i));
		}
		
        LinkedList<String> AdvLang = new LinkedList<String>();  
        AdvLang.add("Servlets");  
        AdvLang.add("JSP");
        
        //Adding second list elements to the first list  
        names.addAll(AdvLang);  
        
		System.out.println("Values of the List after adding - Linked List\n");
		for(int i=0, n=names.size(); i<n; i++)
		{
			System.out.println(names.get(i));
		}
		
        //Adding an element at the first position  
		names.remove(0);
		
        //Adding an element at the last position 
		names.remove("JSP");
		
		System.out.println("Values of the List after Deleting - Linked List\n");
		for(int i=0, n=names.size(); i<n; i++)
		{
			System.out.println(names.get(i));
		}
	}
}
