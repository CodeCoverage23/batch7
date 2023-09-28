package com.functioninterfaces;

import java.util.function.BiConsumer;

public class BiConsumerDemo {

	public static void main(String[] args)
	{
		BiConsumer<Integer, Integer> add=(a,b)->System.out.println(a+b);
		add.accept(20, 30);
		
		BiConsumer<Integer, Integer> sub=(a,b)->System.out.println(a-b);
		sub.accept(40, 30);
		
		BiConsumer<Integer, Integer> mul=(a,b)->System.out.println(a*b);
		mul.accept(20, 30);
		
		BiConsumer<Integer, Integer> div=(a,b)->System.out.println(a/b);
		div.accept(60, 30);
		

	}

}
