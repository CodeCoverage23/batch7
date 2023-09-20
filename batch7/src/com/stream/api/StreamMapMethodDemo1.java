package com.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapMethodDemo1 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Pavan", "Kishor", "Mohan", "Akshay", "Ashutosh");

//		ArrayList<String> arrayList = new ArrayList<String>();
//
//		for (String l : list) {
//			arrayList.add(l.toUpperCase());
//		}
//		System.out.println(arrayList);
		
		list = list.stream().map(e -> e.toUpperCase()).collect(Collectors.toList());
		
	}

}
