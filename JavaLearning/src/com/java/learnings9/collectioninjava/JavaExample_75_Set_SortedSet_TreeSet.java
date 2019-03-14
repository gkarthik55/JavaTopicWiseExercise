package com.java.learnings9.collectioninjava;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class JavaExample_75_Set_SortedSet_TreeSet 
{
	public static void main(String[] args) 
	{
		//Creating and adding elements  
		Set<Integer> set = new TreeSet<>();  
		set.add(12);  
		set.add(65);  
		set.add(26);  
		set.add(42);
		set.add(33);
		
		//Traversing elements  
		Iterator<Integer> itr=set.iterator();  
		while(itr.hasNext())
		{  
			System.out.println(itr.next());  
		}  
		
	}  
}

