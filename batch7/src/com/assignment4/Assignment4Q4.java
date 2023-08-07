package com.assignment4;

//4. Write the java program to design method for division of two number

//which returns int value to that method and result should be print into main method.

public class Assignment4Q4 {

	public int division(int s, int d) {

		return s / d;
	}

	public static void main(String[] args) {
		Assignment4Q4 v = new Assignment4Q4();
		int u = v.division(60, 30);
		System.out.println("division>>" + u);

	}
}
