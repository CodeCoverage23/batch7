package com.Assignmen4;
//1. Write the java program to design method for addition of two number which returns int results to that method and result should be print into main method.

public class Assignment4Quen1 { 
	public int add(int a, int b) {
		int add = a+ b;
		return add;
	}

	public static void main(String[] args) {
		int j =20;
		int k = 25;
		Assignment4Quen1 obj= new Assignment4Quen1();
		obj.add(j, k);
      System.out.println("Addition : "+obj.add(j, k));
	}

}
