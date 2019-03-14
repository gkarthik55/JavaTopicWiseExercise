package com.java.learnings9.collectioninjava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class JavaExample_66_CollectionExample 
{
	public static void main(String[] args) 
	{
		Collection values = new ArrayList();
		values.add(45);
		values.add(80);
		values.add(20);
		
		Iterator it = values.iterator();
		System.out.println("Values of the Collection");
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
}
