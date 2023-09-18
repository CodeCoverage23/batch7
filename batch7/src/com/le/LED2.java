package com.le;

import java.util.function.Predicate;

public class LED2 {

	public static void main(String[] args) {

		//int a = 10;

		Predicate<Integer> t = e -> (e % 2 == 0);
		
		boolean test = t.test(88);
		System.out.println(test);
		
		System.out.println(t.test(15));

	}
}
