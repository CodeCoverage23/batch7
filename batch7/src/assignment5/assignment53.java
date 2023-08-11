package assignment5;

import java.util.Scanner;

//  Write a program to check whether number is even or odd.

public class assignment53 {
 
	public static void main(String[] args) {
		Scanner Sc= new Scanner(System.in);
		System.out.println("enter a number:");
		int num=Sc.nextInt();
		
		 if(num%2==2)
		{
			 System.out.println("number is divide by 2 is even :" + num);
		}
		 else
		 {
			 System.out.println("number is not divide by 2 or not equals by 2 is odd :" + num);
		 }
	
	}
}
