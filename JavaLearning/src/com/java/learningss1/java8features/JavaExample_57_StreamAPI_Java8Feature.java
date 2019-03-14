package com.java.learningss1.java8features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaExample_57_StreamAPI_Java8Feature 
{
    public static void main(String[] args) 
	{
		List<Integer> values = Arrays.asList(1,2,3,4,5);
		
		System.out.println("Values of the List using forEach Method :");
		
		//Printing the values using the Method Reference.
		System.out.println();
		values.forEach(System.out::println);
		
		//Stream API
		System.out.println();
		values.stream().forEach(System.out::println);
		
		//Parallel Stream API 
		// It creates different threads and process the data.
		System.out.println();
		values.parallelStream().forEach(System.out::println);
	}
}
