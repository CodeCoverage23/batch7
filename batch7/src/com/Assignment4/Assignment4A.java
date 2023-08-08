package com.Assignment4;
//Write the java program to design method for addition of two number which returns int results to that method and result should be print into main method.

public class Assignment4A {
	public int add(int a,int b) {
		return a+b;
	}
	

	public static void main(String[] args) {
		Assignment4A N=new Assignment4A();
		int c = N.add(20,30);
		System.out.println("Addition of two number is:"+c);

	}

}
