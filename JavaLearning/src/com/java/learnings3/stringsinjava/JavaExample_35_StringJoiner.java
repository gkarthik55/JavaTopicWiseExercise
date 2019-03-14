package com.java.learnings3.stringsinjava;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class JavaExample_35_StringJoiner 
{
	public static void main(String[] args) 
	{
		List<String> arrList = new ArrayList<>();
		
		arrList.add("Ram");
		arrList.add("Rakshman");
		arrList.add("Sita");
		arrList.add("Hanuman");
		
		StringJoiner strJoiner = new StringJoiner(",");
		
		StringJoiner strJoinerWithPrefixAndPostfix = new StringJoiner(",", "Hindu", "Darma");
		strJoinerWithPrefixAndPostfix.add("| Ram");
		strJoinerWithPrefixAndPostfix.add("Sita |");
		 System.out.println(strJoinerWithPrefixAndPostfix); 
		
		// setEmptyValue() method 
		strJoiner.setEmptyValue("strJoiner is empty"); 
	    System.out.println(strJoiner); 
	
	    // add() method 
		// for (String arr: arrList)
		// {
		//	  strJoiner.add(arr);
		// }
	    strJoiner.add(arrList.get(0)).add(arrList.get(1)); 
		System.out.println(strJoiner.toString());

		// length() method 
	    System.out.println("Length of strJoiner : " + strJoiner.length()); 
	         
	    StringJoiner strJoiner2 = new StringJoiner(":"); 
	    strJoiner2.add(arrList.get(2)).add(arrList.get(3)); 
	         
	    //merge() method 
	    strJoiner.merge(strJoiner2); 
	         
	    // toString() method 
	    System.out.println(strJoiner.toString()); 
	         
	    System.out.println("Length of new sj1 : " + strJoiner.length()); 
	}
}
