package com.oops.consept;

public class InterfaceImpl implements Inter1, Inter2 {

	@Override
	public void display() {
		System.out.println("I am from Inter");
	}

	@Override
	public void printData() {

	}

	public static void main(String[] args) {

		InterfaceImpl i = new InterfaceImpl();

		i.display();
	}

}
