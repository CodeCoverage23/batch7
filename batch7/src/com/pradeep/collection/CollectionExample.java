package com.pradeep.collection;

import java.util.ArrayList;

public class CollectionExample {

	public static void main(String[] args) {
		
	ArrayList<Object> list= new ArrayList<>();
	list.add("pradeep");
	list.add("sameer");
	list.add(10);
	list.add(10.0f);
	list.add(45.56);
	list.add('s');
		System.out.println(list);
		for(Object s:list) {
			System.out.println(s);
		}
		
	}
	
}
