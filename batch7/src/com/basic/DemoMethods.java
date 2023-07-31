package com.basic;

public class DemoMethods {

	public static void main(String[] args) {

		DemoMethods d = new DemoMethods();

		float a = d.add(20, 11.7f);
		System.out.println(a);

		System.out.println(d.add(44, 78.1f));

		String name = d.returnName();

		System.out.println(d.returnName());

	}

	public float add(int a, float b) {
		return a + b;
	}

	String returnName() {
		return "Code Coverage";
	}

}
