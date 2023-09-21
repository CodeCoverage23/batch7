package com.pradeep.java8;

import java.util.function.Function;

public class FunctionChaining {

	public static void main(String[] args) {
          
		Function<Integer,Integer> f1=(s)->s*2;
		Function<Integer,Integer> f2=(s)->s*s;
		
	System.out.println(	f1.andThen(f2).apply(10));
	System.out.println(f1.compose(f2).apply(10));
		
		
		
	}

}
