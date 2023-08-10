package com.oops.consept;

/**
 * Can not extends final class
 */
final class ParentClass {

	public final void display() {
		System.out.println("I am final method");
	}

	// Method overloading is possible but not overriding
	public final void display(String str) {
		System.out.println("I am final method");
	}

}

//extends ParentClass
public class DemoFinalKeywords {

	final double pi = 3.14d;

	public static final String PANCARD_NUMBER = "WZR1289EHJ";

	public void changeValue() {
		// pi = 50;
	}

	public static void main(String[] args) {
		DemoFinalKeywords demoFinalKeywords = new DemoFinalKeywords();

		System.out.println(demoFinalKeywords.pi);

		demoFinalKeywords.changeValue();

		System.out.println(demoFinalKeywords.pi);

	}

}
