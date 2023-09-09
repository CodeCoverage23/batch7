package com.Assign5;

import java.util.Scanner;
//write a program to swap the two numbers.

public class Que8 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the numbers to be swap:");
		
		int x= sc.nextInt();
		int y= sc.nextInt();
		
       System.out.println("the numbers to be swap are"+ x +" and"+y);
       
       int temp;
       
       temp = x;
       x=y;
       y=temp;
       
       System.out.println("the number after swaping are"+ x +"and"+ y);
	}

}
