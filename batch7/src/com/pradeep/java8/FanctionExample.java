package com.pradeep.java8;

import java.util.function.Function;

public class FanctionExample {

	public static void main(String[] args) {
		
		Function<String,Integer> f= t->t.length();
		
	          System.out.println( f.apply("pradeep"));
	
	}

}
