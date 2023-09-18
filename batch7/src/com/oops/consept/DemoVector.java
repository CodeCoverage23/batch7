package com.oops.consept;

import java.util.Enumeration;
import java.util.Vector;

public class DemoVector {

	public static void main(String[] args) {

		Vector<String> v = new Vector<String>();
		v.add("Java");
		v.add("Java");
		v.add("Code");
		v.add("Coverage");
		v.add("Program");

		System.out.println(v);

		Enumeration<String> elements = v.elements();

		while (elements.hasMoreElements()) {
			System.out.println(elements.nextElement());
		}

	}

}
