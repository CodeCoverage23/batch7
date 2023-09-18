package com.oops.consept;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DemoListToSet {
	public static void main(String[] args) {

		List<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(22);
		l.add(12);
		l.add(19);
		l.add(10);
		l.add(22);
		l.add(15);
		l.add(12);
		System.out.println(l);

		Set<Integer> s = new LinkedHashSet<Integer>(l);
		System.out.println("Set Object : " + s);

	}

}
