package com.java.learningss1.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class JavaExample_59_StreamAPI_FilterMethod 
{
    public static void main(String[] args) 
	{
    	//Logic to add the elements divisible by 5 
		List<Integer> values = Arrays.asList(12,20,35,46,55,68,75);
		
		int result = 0;
		for (int i:values)
		{
			if(i % 5 == 0)
			{
				result = result + i;
			}
		}
		System.out.println("Total of Elements divisible by 5 :" + result);
		
		//Using the Stream API Filter method to add elements divisible by 5.
		Integer res = values.stream()
							.filter(i -> i%5 == 0)
							.reduce(0,(c,e) -> c+e);
		
		System.out.println("Result using the Stream API Filter method :"+ res);
		
		//Creating the Object of Predicate Interface to use it in the Filter method.
		Predicate<Integer> p = new  Predicate<Integer>()
		{
			@Override
			public boolean test(Integer i) 
			{
					return i % 5 == 0;
			}
		};
		
		System.out.println("Result using the Predicate Interface for Filter method: ");
		System.out.println(values.stream()
				                 .filter(p)
				                 .reduce(0, (c,e) -> c+e));
		
	}
}
