package com.java.learningss5.javacodinginterviewquestions;

//This is one of the most frequently asked java program in the technical 
//round of java fresher’s interview. Interviewer may ask you to write
//different ways to reverse a string or he may ask you to reverse a string 
//without using in-built methods or he may ask you to reverse a string 
//using recursion.


public class JavaExample_01_ReverseAString
{
    //Recursive method to reverse string
	public static String recursiveMethod(String str)
	{
		if(str == null || str.length() <= 1)
		{
			return str;
		}
		else
		{
			return (recursiveMethod(str.substring(1)) + str.charAt(0));
		}
	}
	
	public static void main(String[] args) 
	{
		//Using StringBuffer class
		StringBuffer str = new StringBuffer("MyJava");
		str.reverse();
        System.out.println(str); 
        
        //Using iterative method
        String str1= "MyJava";
        char charArr[] = str1.toCharArray();
        for(int i=charArr.length-1; i>=0 ; i--)
        {
        	System.out.print(charArr[i]);
        }
        System.out.println(""); 
        
        //Using Recursive method to reverse string
        String strRev = recursiveMethod(str1);
        System.out.println(strRev);    
	}
}
