package com.basic;

public class DemoObject {

	int number = 20;

	String name = "Code";

	public void display() {
		System.out.println(name + number);
	}

	public static void main(String[] args) {

		DemoObject d = new DemoObject();

		d.display();

		System.out.println("**************");

		System.out.println(d.number + d.name);

		System.out.println(d);

	}

}
