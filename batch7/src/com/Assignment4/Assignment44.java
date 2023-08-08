package com.Assignment4;
//write the java program to design method for Division of two numbers which return int value to that method and result
//should be print into main method
public class Assignment44 {
	public int division(int a, int b) {
		return a/b;
	}
	public static void main(String[] args) {
		Assignment44 d=new Assignment44();
		int c=d.division(77, 35);
		
		System.out.println("division of two numbers:"+c);
	}	
	

}
