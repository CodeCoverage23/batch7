package com.functioninterfaces;

import java.util.function.Consumer;

public class ConsumerDemo
{

	public static void main(String[] args)
	{
		//consumer function for printing purpose which does not return any thing.
		Consumer<String> c=e->System.out.println(e);
		c.accept("hello");
		
		
		Consumer<Integer> c1=e->System.out.println(e);
		c1.accept(34);
		
		
		
		
		
//		Consumer<String> c2 = e -> {
//			String d = e.toUpperCase();
//			System.out.println(d);
//		};
//		c2.accept("Code Coverage");
		
		
		
		Consumer<String> c2 = e ->System.out.println(e.toUpperCase());
		c2.accept("Code Coverage");
		
			
		
		

		
	}
}
