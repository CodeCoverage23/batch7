package com.functioninterfaces;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

	public static void main(String[] args) 
	{
		BiPredicate<Integer, Integer> bipredicate=(a,b)->a==b;
		System.out.println(bipredicate.test(20, 20));//true
		System.out.println(bipredicate.test(20, 30));//false
		
		//for string
		BiPredicate<String, String> bipredicate1=(a,b)->a.equals(b);
		System.out.println(bipredicate1.test("abc", "abc"));//true
		System.out.println(bipredicate1.test("xyz","abc"));//false
		//and for comapairing two condition return true if both conditions is true
		BiPredicate<Integer, Integer> bipredicate3=(a,b)->a==b;
		BiPredicate<Integer, Integer> bipredicate4=(a,b)->a>b;
		boolean result=bipredicate3.and(bipredicate4).test(20, 20);
		System.out.println(result);//false
		//or for comapairing two condition return true if any one  conditions is true
		boolean result1=bipredicate3.or(bipredicate4).test(20, 20);
		System.out.println(result1);//true
		//negate for comapairing two condition return true if and or or is false and wise versa conditions is true
		boolean result2=bipredicate3.negate().test(20, 20);
		System.out.println(result2);//false
		
		boolean result21=bipredicate3.negate().test(20, 30);
		System.out.println(result21);//true
		
		boolean result22=bipredicate4.negate().test(20, 30);
		System.out.println(result22);//true
		
		boolean result23=bipredicate4.negate().test(40, 20);
		System.out.println(result23);//false
	}
	}


