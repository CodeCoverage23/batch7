package com.Nilima.collection;

import java.util.LinkedList;

public class LinkedListEx {
	
	
	public static void main(String[] args) {
		
		LinkedList<Object>list = new LinkedList<>();
		
		list.add(10);
		list.add("sneha");
		list.add(45.6f);
		list.add(60);
		list.add("pradeep");
		System.out.println(list);
		
		list.add(2,70);
		System.out.println(list);
		
		list.addFirst("aks");
		list.addLast("last");
		
		System.out.println(list);
		System.out.println(list.contains(20));
		System.out.println(list.element());
		
		System.out.println(list.get(0));
		
	}

}
