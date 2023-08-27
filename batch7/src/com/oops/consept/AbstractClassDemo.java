package com.oops.consept;

abstract class AbstractionDemo {

	public abstract void printData();

	public void display() {
		System.out.println("Code Coverage");
	}

}

public class AbstractClassDemo extends AbractionDemo2 {
	@Override
	public void display(String string) {
		System.out.println("String : " + string);
	}

}
