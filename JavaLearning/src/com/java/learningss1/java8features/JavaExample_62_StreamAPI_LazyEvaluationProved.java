package com.java.learningss1.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class JavaExample_62_StreamAPI_LazyEvaluationProved 
{
	//Calling Method Reference instead of Lambda Expression
	public static boolean isDivisble(int i)
	{
		System.out.println("In isDivisble method :" +i);
		return i%5 ==0;
	}
	
	public static int doubleIt(int i)
	{
		System.out.println("In doubleIt method :" +i);
		return i*2;
	}
	
    public static void main(String[] args) 
	{
    	//Logic to add the first element divisible by 5 and multiply by 2.  
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
		System.out.println("Find the First Element divisble by 5 and multiply it with 2 :\n" + result);
		
		// Using the Stream API Filter method to first element divisible by 5 
		// and multiply it with 2.
		
		//      Integer res = values.stream()
		//							.filter(i -> i%5==0)
		//							.map(i -> i*2)
		//							.findFirst()
		//							.orElse(0);
		
		//Proving the Lazy Evaluation
		
		//Calling Method Reference instead of Lambda Expression
		Integer res = values.stream()
							.filter(JavaExample_62_StreamAPI_LazyEvaluationProved::isDivisble)
							.map(JavaExample_62_StreamAPI_LazyEvaluationProved::doubleIt)
							.findFirst()
							.orElse(0);
		
		System.out.println("Result using the Stream API Filter method to first element divisible by 5 and multiply it with 2.:\n"+ res);
		
	}
}
