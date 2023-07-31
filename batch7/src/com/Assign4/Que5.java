package com.Assign4;
//Write the Java Program to calculate total of five subject marks and average of it.

public class Que5 {
	
	public int marks(int a ,int b , int c,int d,int e) {
		int totalmark = a+b+c+d+e;
		return totalmark;
		
	}
	
	public static void main(String[] args) {
		Que5 s = new Que5();
		System.out.println("Total of a five subject marks : "+s.marks(80, 90, 70, 70, 90));
		
		int average= s.marks(80, 90, 70, 70, 90)/5;
		
		System.out.println("Average marks : "+average);
		
		
	}

}
