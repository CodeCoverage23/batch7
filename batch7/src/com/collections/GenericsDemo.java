package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericsDemo {

	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>();

		l.add(10);
		l.add(100);
		l.add(101);
		l.add(110);
		l.add(15);
		l.add(115);
		l.add(75);

		Collections.sort(l);

		for (Integer a : l) {
			System.out.println(a);
		}

		List<String> al = new ArrayList<String>();

		al.add("Java");
		al.add("Code");
		al.add("Program");

		Collections.sort(al);

		for (String s : al) {
			System.out.println(s);
		}

	}

}
