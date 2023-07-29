package com.Assignmen4;
//2. Write the java program to design method for substraction of two number which returns int value to that method and result should be print into main method.

public class Assignment4que2 { 
	public int subtraction(int j, int k) {
		int subtraction = k - j;
		return subtraction;
	}

	public static void main(String[] args) {
		int num1 = 65;
		int num2 = 98;
		Assignment4que2 obj = new Assignment4que2();
		System.out.println("Subtraction : "+obj.subtraction(num1, num2));
		
	}

}
