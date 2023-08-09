package com.assignment4;
//5. Write the Java Program to calculate total of five subject marks and average of it.

public class Assignment4Q5 {

	public static void main(String[] args) {

int math = 78;
		int science = 68;
		int english = 80;
		int physics = 60;
		int marathi = 70;
		
		int total = math + science + english + physics + marathi;
		System.out.println("total of five subject : "+ total);
		int average = total/5;
		System.out.println("average of subject :" + average);
		 

	}

}
