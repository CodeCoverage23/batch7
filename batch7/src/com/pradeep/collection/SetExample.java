package com.pradeep.collection;

import java.util.HashSet;

public class SetExample {

	public static void main(String[] args) {

		HashSet<Object> set= new HashSet<>();
		 set.add(10);
		 set.add(73);
		 set.add("pradeep");
		 set.add(56.8f);
		 set.add(88.90);
		 set.add('e');
		 set.add(10);
		 set.add("pradeep");
		 set.add(null);
		 set.add(null);
		 System.out.println(set);
		set.remove(10);
		System.out.println(set);
		
		
		
		
		
		
		
		
			
		
	}

}
