package com.assignment4;

//2. Write the java program to design method for substraction of two number
//which returns int value to that method and result should be print into main method.

public class Assignment4Q2 {

	public int substraction(int d, int g) {

		return d - g;

	}

	public static void main(String[] args) {

		Assignment4Q2 r = new Assignment4Q2();
		int q = r.substraction(40, 60);

		System.out.println("Substraction of two number:" + q);
	}

}
