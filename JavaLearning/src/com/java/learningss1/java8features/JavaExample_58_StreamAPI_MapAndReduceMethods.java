package com.java.learningss1.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class JavaExample_58_StreamAPI_MapAndReduceMethods 
{
    public static void main(String[] args) 
	{
		List<Integer> values = Arrays.asList(1,2,3,4,5);
		
		System.out.println("Values of the List using forEach Method :");
		
		//Printing the values using the Method Reference.
		System.out.println();
		values.forEach(System.out::println);
		
		//Stream API, Map and Reduce method. 
		System.out.println("Printing the values of Stream using Map and Reduce");
		System.out.println(values.stream().map(i -> i*2).reduce(0, (c,e) -> c+e));
		
		// This one line is expanded in the below code:
		
		//Creating the Object of Function Interface to use it in the Map method.
		Function<Integer, Integer> f= new Function<Integer, Integer>()
		{
			@Override
			public Integer apply(Integer i) 
			{
				//For every element of Integer multiply by 2. 
				return i*2;
			}
		};
		
		//Creating the Object of BinaryOperation Interface to use it in the Reduce method.
		BinaryOperator<Integer> b = new BinaryOperator<Integer>()
		{
			@Override
			public Integer apply(Integer t, Integer u) 
			{
				return t + u;
			}
		};
		
		Stream s = values.stream();
		Stream s1 = s.map(f);
		Integer result = (Integer)s1.reduce(0, b);
		System.out.println("Result after expanding the Lambda Expression: "+ result);
	}
}
