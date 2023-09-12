package com.oopsConcepts;

import java.util.Scanner;

class Parent
{
	int num1;
	int num2;
	void show()
	{
		System.out.println("Parent class Show method");
	}
	void  cal(int num1,int num2)
	{
		/*
		 * this.num1=num1; this.num2=num2;
		 */
	  int c=num1+num2;	
	  System.out.println("Addition is:"+c);
	}
}
class MethodOverriding extends Parent
{
	
	@Override
	void  cal(int a,int b)
	{
	  super.cal(a, b);
	  int c=a-b;	
	  System.out.println("Substraction is:"+c);
	}
	@Override
	void show()
	{
		
		System.out.println("Child class show function");
		super.show();
	}
	public static void main(String[] args)
	{
		//MethodOverriding m=new MethodOverriding();
		Parent m=new MethodOverriding();
		/*
		 * Scanner sc=new Scanner(System.in); System.out.println("Enter first number");
		 * int a=sc.nextInt(); System.out.println("Enter second number"); int
		 * b=sc.nextInt();
		 */
		m.show();
		m.cal(60, 20 );
	}

}

