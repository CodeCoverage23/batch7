package com.collections;

import java.util.TreeSet;

public class DemoTreeSet {

	public static void main(String[] args) {

		TreeSet<Float> t = new TreeSet<>();
		t.add(14.7f);
		t.add(7.7f);
		t.add(4.9f);
		t.add(10.7f);
		t.add(18.7f);
		t.add(14.7f);

		for (Float f : t) {
			System.out.println(f);
		}

	}

}
