package com.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListSortingByStream {

	public static void main(String[] args) {
		List<String> a = new ArrayList<String>();
		a.add("Mango");
		a.add("Apple");
		a.add("Banana");
		a.add("Grapes");
		a.add("Watermelon");

		// Ascending sorting
		List<String> l = a.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
		System.out.println(l);

		// Ascending sorting
		a.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);

		// Descending sorting
		List<String> ll = a.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(ll);

		
		

	}

}
