package com.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo2 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Pavan", "Kishor", "Mohan", "Akshay", "Ashutosh");

		List<String> collect = list.stream().filter(e -> e.length() > 5).collect(Collectors.toList());
		System.out.println(collect);

		list.stream().filter(e -> e.length() > 5).collect(Collectors.toList()).forEach(e -> System.out.println(e));
		System.out.println("-------------------------------------------");
		list.stream().filter(e -> e.length() > 5).collect(Collectors.toList()).forEach(System.out::println);

	}

}
