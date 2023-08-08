package com.Assignment4;
//write the java program to design method for multiplication of two numbers which return int valueto that method and result
//should be print into main method
public class Assignment43 {
	
public int multiplication(int a,int b) {
	return a*b;
}
    public static void main(String[] args) {
		Assignment43 d=new Assignment43();
		int c =d.multiplication(44, 34);
		
		System.out.println("multiplication of two numbers:"+c);
	}
}
