package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamDemo {

	public static void main(String[] args) 
	{
		List<Integer> l=Arrays.asList(1,2,3,4,5);
		System.out.println("Sequential stream");
		l.stream().forEach(System.out::println);
		
		List<Integer> l1=Arrays.asList(1,2,3,4,5);
		System.out.println("Parallel stream");
		
		l1.stream().parallel().forEach(System.out::println);

		
		IntStream r=IntStream.rangeClosed(1, 10);
		System.out.println("Sequential stream");
		r.forEach(System.out::println);

		
		IntStream r1=IntStream.rangeClosed(1, 10);
		System.out.println("Paralle stream");
		r1.parallel().forEach(System.out::println);

		List<Integer> l2=Arrays.asList(1,2,3,4,5);
		System.out.println("Parallel stream");
		
		l2.parallelStream().forEach(System.out::println);
		

	    System.out.println("In Normal");  
	  
	    IntStream rs= IntStream.rangeClosed(1, 5);  
	      
	    // it will give a false value  
	    if(rs.isParallel())  
	    {  
	        System.out.println("The stream is running parallelly.");  
	    }  
	    else  
	    {  
	        System.out.println("The stream is not running parallelly.");  
	    }  
	    rs.forEach(System.out::println);  
	  
	    System.out.println("In Parallel");  
	  
	    IntStream r2 = IntStream.rangeClosed(1, 5);  
	    IntStream r2Parallel = r2.parallel();  
	      
	    // it will give a true value  
	    if(r2.isParallel())  
	    {  
	        System.out.println("The stream is running parallellys.");  
	    }  
	    else  
	    {  
	        System.out.println("The stream is not running parallelly.");  
	    }  
	      
	    r2Parallel.forEach(System.out::println);  
	  
	}  

	}


