package com.assignment4;

//3. Write the java program to design method for multiplication of two number 
//which returns int value to that method and result should be print into main method.
public class Assignment4Q3 {

	public int multiplication(int r, int p) {

		return r * p;
	}

	public static void main(String[] args) {

		Assignment4Q3 y = new Assignment4Q3();
		int e = y.multiplication(20, 30);
		System.out.println("multiplication of two number>>" + e);
	}
}
