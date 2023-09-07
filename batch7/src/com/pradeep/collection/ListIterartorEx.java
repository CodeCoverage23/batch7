package com.pradeep.collection;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIterartorEx {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>();
		list.add("shweta");
		list.add("anup");
		list.add("kiran");
		list.add("priti");
		list.add("akshay");
		System.out.println(list);
		ListIterator<String> lst = list.listIterator();
		while (lst.hasNext()) {
			String next = lst.next();
			if (next.equals("priti")) {
				lst.remove();
			} else if (next.equals("akshay")) {

				lst.add("sneha");

			} else if (next.equals("kiran")) {
				lst.set("rahul");

			}

		}

		System.out.println(list);

	}

}
