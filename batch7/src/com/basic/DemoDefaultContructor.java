package com.basic;

public class DemoDefaultContructor {

	int a;
	String b;

	public void display() {
		System.out.println(a + b);
	}

	public static void main(String[] args) {

		DemoDefaultContructor d = new DemoDefaultContructor();

		d.display();
	}

}
