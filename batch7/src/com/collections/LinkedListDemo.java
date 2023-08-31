package com.collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList l = new LinkedList();

		l.add(10);
		l.add(14);
		l.add(10);
		l.add("Java");
		l.add(20.00);
		l.add(null);
		l.addFirst("First");
		l.addLast(100);

		System.out.println(l);

		ListIterator itr = l.listIterator();

		while (itr.hasNext()) {
			Object next = itr.next();
			System.out.println(next);
		}

	}

}
