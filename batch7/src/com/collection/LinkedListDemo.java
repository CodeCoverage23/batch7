package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) 
	{
		
		
		ArrayList<Object> a = new ArrayList<>();
		a.add(12);
		a.add(13);
		a.add("abc");
		a.add(null);
		a.add(12);
		a.add(12);
		a.add(6, 40);
		
		LinkedList l=new LinkedList(a);
		l.add("aa");
		l.add("ab");
		l.add("ac");
		l.add("aa");
		l.add("aa");
		l.add(10);
		l.add(12.4);
		l.add(null);
		l.add(null);
		
		System.out.println(l);
		l.addLast("cc");
		l.addFirst("abab");
		System.out.println(l);
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		l.removeFirst();
		l.removeLast();
		System.out.println(l);
		
		
	}

}
