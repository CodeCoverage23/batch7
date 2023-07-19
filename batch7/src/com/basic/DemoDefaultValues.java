package com.basic;

public class DemoDefaultValues {

	static int a;
	static long b;
	static float f;
	static double d;
	static boolean n;
	static char c;
	static byte e;
	static short s;

	public static void main(String[] args) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(f);
		System.out.println(d);
		System.out.println(n);
		System.out.println(c);
		System.out.println(e);
		System.out.println(s);

		DemoDefaultValues d = new DemoDefaultValues();
		d.returnTypeDemo();
	}

	public void returnTypeDemo() {

		int b = 100;

		System.out.println(b);
	}

}
