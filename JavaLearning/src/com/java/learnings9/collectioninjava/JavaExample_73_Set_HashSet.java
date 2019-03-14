package com.java.learnings9.collectioninjava;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JavaExample_73_Set_HashSet 
{
	public static void main(String[] args) 
	{
		//Creating HashSet and adding elements  
		Set<String> set=new HashSet<String>();  
		set.add("Java");  
		set.add("C++");  
		set.add("Java");  
		set.add("C#");  
		
		//Traversing elements  
		Iterator<String> itr=set.iterator();  
		while(itr.hasNext())
		{  
			System.out.println(itr.next());  
		}  
		
		//Removing specific element from HashSet  
        set.remove("C++");  
        System.out.println("After invoking remove(object) method: "+set);  
        
        HashSet<String> set1=new HashSet<String>();  
        set1.add("Servlets");  
        set1.add("JSP");  
        set.addAll(set1);  
        System.out.println("Updated List: "+set);  
        
        //Removing all the new elements from HashSet  
        set.removeAll(set1);  
        System.out.println("After invoking removeAll() method: "+set);  
        
        //Removing elements on the basis of specified condition  
        set.removeIf(str->str.contains("C#"));    
        set.removeIf(str -> str.contains("Java"));
        
        System.out.println("After invoking removeIf() method: "+set);  
	}  
}

