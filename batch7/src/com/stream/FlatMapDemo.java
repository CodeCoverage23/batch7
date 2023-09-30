package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {

	public static void main(String[] args)
	{
		List<Integer> list=Arrays.asList(2,3,4,5,6);
		//map
		list.stream().map(s->s+5).collect(Collectors.toList()).forEach(System.out::println);
		
		List<Integer> list1=Arrays.asList(20,30,40,50,60);
		List<Integer> list2=Arrays.asList(21,31,41,51,61);
		
		
		List<List<Integer>> asList=Arrays.asList(list,list1,list2);
		//flatmap
		
		List<Integer> collect = asList.stream().flatMap(e->e.stream().map(s->s+5)).collect(Collectors.toList());

	    System.out.println(collect);

//		 List<Integer> collect = asList.stream().flatMap(ele->ele.stream().map(s->s+5)).collect(Collectors.toList());
//		 
//		    System.out.println(collect);
	}

}
