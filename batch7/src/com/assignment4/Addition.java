//1. Write the java program to design method for addition of two number which returns int results to that method and result should be print into main method.

package com.assignment4;

public class Addition {

	public int addition(int num1,int num2)
	{
		int c=num1+num2;
		return c;
	}
	public static void main(String[] args) {

		Addition add =new Addition();
		int result=add.addition(20, 50);
		System.out.println("Addition is:"+result);

	}

}
