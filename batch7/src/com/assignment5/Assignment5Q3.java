package com.assignment5;
//3.write a program to find out maximum number among three number(if else if ladder statement)
public class Assignment5Q3 {

	public static void main(String[] args) {
		int num1 = 23;
		int num2 = 45;
		int num3 = 28;
		System.out.println("num1 = 23, num2 = 45 ,num3 =28 ");
		if(num1 >= num2 && num1 >= num3 )
		{
			System.out.println("maximum is number :" +num1);
		}
		else if(num2>num3 && num2>num1) {
			System.out.println( " maximum is number :" + num2);
		}
		else
		{
			System.out.println(" maximum is number :" +num3);
		}
		

	}

}
