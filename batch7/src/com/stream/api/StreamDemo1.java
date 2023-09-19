package com.stream.api;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo1 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(12, 49, 75, 54, 78, 32, 78, 96, 15, 46, 32, 11, 33, 33);

		// System.out.println(list);

		Set<Integer> set = list.stream().collect(Collectors.toSet());
		System.out.println(set);

//		for (Integer i : list) {
//			if (i % 2 == 0) {
//				System.out.println(i);
//			}
//		}

		List<Integer> list2 = list.stream().filter(e -> !(e % 2 == 0)).collect(Collectors.toList());
		System.out.println(list2);

		list.stream().filter(e -> !(e % 2 == 0)).collect(Collectors.toList()).forEach(e -> System.out.println(e));

		System.out.println("************");

		list.stream().filter(e -> e % 2 == 0).collect(Collectors.toList()).forEach(System.out::println);

	}

}
