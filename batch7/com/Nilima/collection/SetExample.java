package com.Nilima.collection;

import java.util.HashSet;

public class SetExample {
	
	
	public static void main(String[] args) {
		
		HashSet<Object>Set = new HashSet<>();
		
		Set.add(10);
		Set.add(73);
		Set.add("Nilima");
		Set.add(56.8f);
		Set.add(88.90);
		Set.add('e');
		Set.add("Nilima");
		Set.add(null);
		Set.add(null);
		
		System.out.println(Set);
		Set.remove(10);
		
		System.out.println(Set);
		
		
	}

}
