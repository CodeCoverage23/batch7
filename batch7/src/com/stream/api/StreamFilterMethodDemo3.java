package com.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterMethodDemo3 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList(" Shyam", null, " Ram", null, " Kumar", "Sam");

		list.stream().filter(e -> e != null && e.length() > 3).collect(Collectors.toList()).forEach(System.out::print);

	}

}
