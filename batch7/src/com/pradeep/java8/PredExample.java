package com.pradeep.java8;

import java.util.function.Predicate;

public class PredExample {

	public static void main(String[] args) {
		

		Predicate<Integer> p=t->t>10;
		
		System.out.println(p.test(15));
		
		
	}

}
