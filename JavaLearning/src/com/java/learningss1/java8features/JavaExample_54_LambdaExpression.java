package com.java.learningss1.java8features;

@FunctionalInterface  
interface MyWriteable
{  
    void writeSomething(int i);  
}  

public class JavaExample_54_LambdaExpression 
{
	public static void main(String[] args) 
	{
		//Without Lambda expression, MyWriteable implementation using Anonymous class  
		MyWriteable obj1 = new MyWriteable()
		{  
			@Override
			public void writeSomething(int i) 
			{
				System.out.println("I am writing using Anonymous Class " + i);
			}  
		};  
		
		obj1.writeSomething(5);
        
		//Using Lambda Expression
		MyWriteable obj2 = (i)->
		{
			System.out.println("I am writing using Lambda Expression " + i);
		};  
		
		obj2.writeSomething(10);
	}
}
