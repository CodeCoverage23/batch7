//4. Write the java program to design method for division of two number which returns int results to that method and result should be print into main method.

package com.assignment4;

public class Division
{
	public int division(int num1,int num2)
	{
		int c=num1/num2;
		return c;
	}
	public static void main(String[] args) {

		Division s =new Division();
		int result=s.division(50, 5);
		System.out.println("Division is:"+result);

	}
}
