package com.java.learningss1.java8features;

import java.util.Optional;

public class JavaExample_63_OptionalClass 
{
	public static void main(String[] args) 
	{
		String[] str = new String[10]; 

		Optional<String> checkNull = Optional.ofNullable(str[5]);  
        	
        if(checkNull.isPresent())
        {  
        	// check for value is present or not  
            String lowercaseString = str[5].toLowerCase();  
            System.out.print(lowercaseString);  
        }
        else
        {
        	System.out.println("string value is not present");
        }
        
        String[] str1 = new String[10];        
        str1[5] = "JAVA OPTIONAL CLASS EXAMPLE";// Setting value for 5th index  
        Optional<String> checkIfNull = Optional.ofNullable(str1[5]);  
        if(checkIfNull.isPresent())
        {  // It Checks, value is present or not  
            String lowercaseString = str1[5].toLowerCase();  
            System.out.print(lowercaseString);  
        }
        else  
        {
        	 System.out.println("String value is not present"); 
        }
	}
}
