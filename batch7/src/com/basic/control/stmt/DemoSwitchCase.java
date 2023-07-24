package com.basic.control.stmt;

public class DemoSwitchCase {

	public static void main(String[] args) {
		int number = 10;

		switch (number) {

		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("THree");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;

		default:
			System.out.println("Please give valid input");

		}

		System.out.println("Outside the loop");

	}

}
