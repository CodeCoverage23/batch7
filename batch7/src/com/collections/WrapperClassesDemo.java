package com.collections;

public class WrapperClassesDemo {

	public static void main(String[] args) {

		int a = 10;
		// manual auto boxing
		Integer b = Integer.valueOf(a);

		// automatic auto boxing
		Integer c = a;

		System.out.println(b);
		System.out.println(c);

		Integer d = 15;

		// manual unboxing
		int e = d.intValue();

		// automatic unboxing
		int f = d;

		System.out.println(e);
		System.out.println(f);

		String s = "10";
		int int1 = Integer.parseInt(s);

		Double d1 = 12.24d;

		Integer valueOf = Integer.valueOf(s);

	}

}
