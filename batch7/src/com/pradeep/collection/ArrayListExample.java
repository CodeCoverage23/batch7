package com.pradeep.collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(15);
		list.add(30);
		list.add(50);
		list.add(10);
		list.add(30);
		list.add(null);
		list.add(null);
		System.out.println(list);
		list.add(4, 60);
		System.out.println(list);
		ArrayList<Integer> list2 =new ArrayList<>();
		list2.addAll(list);
		list2.add(96);
		list2.add(87);
		System.out.println(list2);
	   list2.addAll(9, list);
	   System.out.println(list2);
		System.out.println(list2.size());
		
	}

}
