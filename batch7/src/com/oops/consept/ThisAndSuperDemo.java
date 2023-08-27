package com.oops.consept;

class Super {

	Super() {
		System.out.println("Super class constructor");
	}

	public void superClassMethod() {
		System.out.println("I am from super class...");
	}

}

public class ThisAndSuperDemo extends Super {

	ThisAndSuperDemo() {
		System.out.println("Sub class constructor");
		super.superClassMethod();
	}

	public static void main(String[] args) {

		ThisAndSuperDemo t = new ThisAndSuperDemo();

	}
}
