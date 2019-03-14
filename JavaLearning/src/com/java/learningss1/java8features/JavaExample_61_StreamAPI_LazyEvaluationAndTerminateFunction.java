package com.java.learningss1.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class JavaExample_61_StreamAPI_LazyEvaluationAndTerminateFunction 
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
				result = i*2;
				break;
			}
		}
		System.out.println("First Element divisble by 5 and multiply it with 2 :\n" + result);
		
		// Using the Stream API Filter method to first element divisible by 5 
		// and multiply it with 2.
		Integer res = values.stream()
				            .filter(i -> i%5 == 0)
				            .map(i -> i*2)
				            .findFirst()
				            .orElse(0);
		
		//Thing to note here is that Stream API is Lazy Evaluation. Though 
		//it looks we are filtering 5 divisible and multiplying all the element by 2
		// since we have the findFirst() method, only first value is evaluated.
				            
		
		System.out.println("Result using the Stream API Filter method to first element divisible by 5 and multiply it with 2.:\n"+ res);
		
	}
}
