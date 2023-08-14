//3.write a program to find out maximum number among three number(if else if ladder statement)


package com.Assignments.basic;
import java.util.Scanner;
public class MaxNum {

	public static void main(String[] args) {
		
		int num1,num2,num3;
		
		Scanner a=new Scanner(System.in);
		System.out.println("enter a number 1: ");
		num1= a.nextInt();
		
		Scanner b=new Scanner(System.in);
		System.out.println("enter a number 2: ");
		num2= b.nextInt();
		
		Scanner c=new Scanner(System.in);
		System.out.println("enter a number 3: ");
		num3= c.nextInt();
		
		if(num1 >= num2 && num1>=num3)
	System.out.println(num1 + " is max number ");
		
		else if(num2>=num1 && num2>=num3)
				System.out.println(num2 + " is max number ");
		
		else  
			System.out.println(num3 + "is max number");
		
		
		

	}

}
