package com.oops.consept;

import java.util.UUID;

class SuperClass {

	public void calculation(int a, int b) {
		System.out.println(a + b);
	}

	public String getRandonString() {
		return "I am learning OOPS";
	}

	public String getString() {
		return "I am learning JAVA";
	}

}

public class MethodOverridingDemo extends SuperClass {

	int number;

	public MethodOverridingDemo(int number) {
		super();
		this.number = number;
	}

	public MethodOverridingDemo() {
	}

	@Override
	public void calculation(int a, int b) {
		System.out.println(a - b);
	}

	@Override
	public String getRandonString() {
		String randomString = UUID.randomUUID().toString();
		return randomString;
	}

	public String getGroupOfChar() {

		return "I am learning JAVA";
	}

	public static void main(String[] args) {

		MethodOverridingDemo m = new MethodOverridingDemo();
		m.calculation(11, 5);
		String randonString = m.getRandonString();
		System.out.println(randonString);
		System.out.println(m.getGroupOfChar());

		SuperClass s = new MethodOverridingDemo();

		s.calculation(50, 25);

	}

}
