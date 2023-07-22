package com.basic.control.stmt;

import java.util.Scanner;

public class DemoIfElseEvenOdd {

	public static void main(String[] args) {
Scanner s= new Scanner (System.in);
System.out.println("Enter the number :");
int number = s.nextInt();
if (number%2==0)
{
	System.out.println("no.is even");
}
else {
	System.out.println("no. is odd");
}
	}

}
