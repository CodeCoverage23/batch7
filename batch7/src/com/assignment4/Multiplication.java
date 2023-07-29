//3. Write the java program to design method for multiplication of two number which returns int value to that method and result should be print into main method.

package com.assignment4;

public class Multiplication {

	public int multiplicationn(int num1,int num2)
	{
		int c=num1*num2;
		return c;
	}
	public static void main(String[] args) {

		Multiplication s =new Multiplication();
		int result=s.multiplicationn(20,50);
		System.out.println("Multiplication is:"+result);

	}

}
