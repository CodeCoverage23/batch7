package com.functioninterfaces;

import java.util.function.Function;

public class FunctionInterfaceDemo 
{

	public static void main(String[] args)
	{
		
		Function<Integer, Integer> f=t->t*6;
		System.out.println(f.apply(9));
		
		Function<String, Integer> f1=t->t.length();
		System.out.println(f1.apply("Rabiya"));
		
		Function<String, String> f3=t->t.toUpperCase();
		System.out.println(f3.apply("Rabiya"));
		
	}
}
