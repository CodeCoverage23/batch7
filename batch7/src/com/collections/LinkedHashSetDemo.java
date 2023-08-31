package com.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {

		LinkedHashSet s = new LinkedHashSet();

		s.add(14);
		s.add(20);
		s.add(14);
		s.add(85);
		s.add(90);
		s.add(41);
		s.add(100);
		s.add(100);

		System.out.println(s);

		Iterator itr = s.iterator();

		while (itr.hasNext()) {
			Object next2 = itr.next();
			int next = (int) itr.next();

			if (next % 2 == 0) {
				System.out.println(next);
			}
		}

	}

}
