//2. Write the java program to design method for substraction of two number which returns int value to that method and result should be print into main method.

package com.assignment4;

public class Substraction {


		public int substraction(int num1,int num2)
		{
			int c=num1-num2;
			return c;
		}
		public static void main(String[] args) {

			Substraction s =new Substraction();
			int result=s.substraction(50,20);
			System.out.println("Substraction is:"+result);

		}

	}


