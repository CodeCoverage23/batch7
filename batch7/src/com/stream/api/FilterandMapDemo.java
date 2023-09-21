package com.stream.api;

import java.util.Arrays;
import java.util.List;

public class FilterandMapDemo {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(12, 49, 75, 54, 78, 32, 78, 96, 15, 46, 32, 11, 33, 33);

		list.stream().filter(e -> !(e % 2 == 0)).map(e -> e * e).forEach(System.out::println);

	}

}
