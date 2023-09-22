package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) 
	{
		List<Integer> l=Arrays.asList(13,45,6,7,9,8,8,12);
		System.out.println("List:"+l);
		
		//converting list into  set for removing duplicates
		Set<Integer> s=l.stream().collect(Collectors.toSet());
		System.out.println("After removing duplicates:"+s);
		
		//get onlu odd numbers by stream
		
		
	   List<Integer>list=	l.stream().filter(e->!(e%2==0)).collect(Collectors.toList());
	   System.out.println("Odd numbers:"+list);
	   
	   //iterarting list by foreach method
	   l.stream().filter(e->!(e%2==0)).collect(Collectors.toList()).forEach(e -> System.out.println(e));
	 
	    //by method reference
	   System.out.println("Even Numbers:");
	   l.stream().filter(e->e%2==0).collect(Collectors.toList()).forEach(System.out::println);
	  
	   
	  List<String> li=Arrays.asList("Rabiya","eshrat","ishu","touqeer");
	  li.stream().filter(e->e.length()>5).collect(Collectors.toList()).forEach(System.out::println);


	   List<String> liststr=Arrays.asList("abc",null,"defg",null," xcv");
	   liststr.stream().filter(e->e!=null && e.length()>3).collect(Collectors.toList()).forEach(System.out::println);

	}

}
