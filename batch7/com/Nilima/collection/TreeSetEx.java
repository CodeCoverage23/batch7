package com.Nilima.collection;
import java.util.TreeSet;


public class TreeSetEx {
	
	
	public static void main(String[] args) {
		TreeSet<Integer> list=new TreeSet<>();
		list.add(40);
		list.add(60);
		list.add(10);
		list.add(50);
		list.add(10);
		
		System.out.println(list.descendingSet());
		
	}

}
