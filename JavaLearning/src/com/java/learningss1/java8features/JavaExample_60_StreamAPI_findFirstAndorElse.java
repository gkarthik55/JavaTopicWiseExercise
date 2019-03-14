package com.java.learningss1.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class JavaExample_60_StreamAPI_findFirstAndorElse 
{
    public static void main(String[] args) 
	{
    	//Logic to add the elements divisible by 5 
		List<Integer> values = Arrays.asList(8 ,12, 32);
		
		int result = 0;
		for (int i:values)
		{
			if(i % 5 == 0)
			{
				result = result + i;
			}
		}
		System.out.println("Total of Elements divisible by 5 :\n" + result);
		
		//Using the Stream API Filter method to add elements divisible by 5.
		Integer res = values.stream()
				            .filter(i -> i%5 == 0)
				            .findFirst()
				            .orElse(0);
				            
		
		System.out.println("Result using the Stream API Filter method :\n"+ res);
		
	}
}
