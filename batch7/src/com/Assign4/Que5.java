package com.Assign4;

//write the java program to calculate total of five subject marks and average of it.



public class Que5 {
	public int marks (int a,int b,int c,int d,int e) {
		int totalmark = a+b+c+d+e;
		return totalmark;
	}

	public static void main(String[] args) {
		Que5 s = new Que5();
		System.out.println("Total of five subject marks: "+s.marks(60 ,80, 50, 50, 80));
		int average= s.marks(60, 80, 50, 50, 80)/5;
		System.out.println("Average marks : "+average);
	}

	
	}

