package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		// Without generic
		ArrayList<Object> a = new ArrayList<>();
		a.add(12);
		a.add(13);
		a.add("abc");
		a.add(null);
		a.add(12);
		a.add(12);
		a.add(6, 40);
		
		ArrayList<Object> a2 = new ArrayList<>();
		a2.add(12);
		a2.add(13);
		//a2.add("abc");
		a2.add(null);
		a2.add(12);
		a2.add(12);
     	//a2.add(6, 40);
		a.addAll(a2);
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.set(2, 15));
		System.out.println(a);
		
		
		
//        System.out.println("Preserve insertion order");
//		System.out.println(a);
		for(Object i:a)
		{
			System.out.println(i);
	}
//		System.out.println("Using iterator cursor");
//		 Iterator t=a.iterator();
//		 while(t.hasNext())
//		 {
//			 System.out.println(t.next());
//		 }
//		 
//		
//
//		// With generic
//		ArrayList<Integer> a1 = new ArrayList<>();
//		a1.add(12);
//		a1.add(13);
//		//a.add("abc");
//		a1.add(null);
//		a1.add(12);
//		a1.add(12);
//
//		System.out.println(a1);
//		
//		System.out.println("Foreach loop");
//		for(Integer i:a1)
//		{
//			System.out.println(i);
//		}

	}

}
