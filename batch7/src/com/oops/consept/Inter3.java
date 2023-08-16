package com.oops.consept;

public interface Inter3 {

	void play();

	public static void staticMethod() {
		System.out.println("I am static method");
	}

	default void defaultMethod() {
		System.out.println("I am default method");
	}
}
