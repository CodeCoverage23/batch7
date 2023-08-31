package com.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	Object o;
	
	public static void main(String[] args) {

		Set s = new HashSet();
		s.add(10);
		s.add(11);
		s.add(10);
		s.add("Java");
		s.add(null);
		s.add("Java");
		s.add(12.21);
		s.add(null);

		System.out.println(s.add(11));
		System.out.println(s.add(48));
		System.out.println(s.hashCode());

	}

}
