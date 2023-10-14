package com.Nilima.collection;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {
	
	public static void main(String[] args) {
		
		
		LinkedHashSet<Object> set = new LinkedHashSet<>();
		
		set.add(50);
		set.add("sneha");
		set.add(89.50);
		set.add("sneha");
		set.add(20.1f);
		set.add('f');
		set.add('f');
		System.out.println(set);
		
		set.add(null);
		set.add(null);
		System.out.println(set);
	}

}
