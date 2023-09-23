package com.functioninterfaces;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
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
		
		Function<String, String> f4=String::toUpperCase;
		System.out.println(f4.apply("Rabiya"));
		
		
		List<String> l=new ArrayList<String>();
		l.add("mango");
		l.add("banana");
		l.add("apple");
		l.add("watermelon");
		l.add("grapes");
		
		//convert list to set using lamda expresion by Function interface
		Function<List<String>,Set<String>> fls=fruitList->new HashSet<>(l);
		System.out.println(fls.apply(l));
		
		//using method reference to a contructor
		Function<List<String>,Set<String>> flsm=HashSet::new;
		System.out.println(flsm.apply(l));
		
		
	}
}
