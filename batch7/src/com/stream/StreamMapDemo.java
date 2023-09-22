package com.stream;

import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamMapDemo
{

	public static void main(String[] args)
	{
		List<String> list = Arrays.asList("Pavan", "Kishor", "Mohan", "Akshay", "Ashutosh");

//		ArrayList<String> arrayList = new ArrayList<String>();
//
//		for (String l : list) {
//			arrayList.add(l.toUpperCase());
//		}
//		System.out.println(arrayList);
		
	 list.stream().map(e -> e.toUpperCase()).collect(Collectors.toList()).forEach(System.out::println);
	 System.out.println(list);
		
		
		
		
		

	}

}
