package com.java.learnings9.collectioninjava;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class JavaExample_72_Dequeue_ArrayQueue 
{
	public static void main(String[] args) 
	{
		//Creating Deque and adding elements  
		Deque<String> deque = new ArrayDeque<String>();  
		deque.add("Gautam");  
		deque.add("Karan");  
		deque.add("Ajay");  
		
		//Traversing elements  
		for (String str : deque)
		{  
			System.out.println(str);  
		}  
	}  
}

