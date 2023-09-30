package com.pradeep.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapReff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> asList1 = Arrays.asList(1,2,3,4,5,6,7,8);
		  //using map
	List<Integer> list=	asList1.stream().map(s->s+10).collect(Collectors.toList());
		System.out.println(list);
		
		List<Integer> asList2 = Arrays.asList(10,20,30,60,40);
		List<Integer> asList3 = Arrays.asList(15,72,45,12,30);
	
		List<List<Integer>> asList = Arrays.asList(asList1,asList2,asList3);
		//flatMap
		 List<Integer> collect = asList.stream().flatMap(ele->ele.stream().map(s->s+5)).collect(Collectors.toList());
		 
	    System.out.println(collect);
	}

}
