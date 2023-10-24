package com.assignment10;

import java.util.Scanner;

//Write java program to check whether number is Armstrong or not.
//(A positive number is called armstrong number if it is equal to the sum of cubes of its digits
//for example 0, 1, 153, 370, 371, 407 etc. Let's try to understand why 153 is an Armstrong number.


public class Armstrongnumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);//read the input from user
		System.out.println("enter the number");
		int number = sc.nextInt();
		int count = 0; int lastDigit=0; double total=0;
		
		int tempNumber = number;
		//Step1 = to count digit in number
		while (tempNumber>0) {
			
			tempNumber = tempNumber/10;
			count++;
		}
		
		int temp = number;
		//Step2= get the last digit and calculate the power and total
		while(temp>0) {
			
			lastDigit = temp % 10;
			double pow = Math.pow(lastDigit, count);
			
			total = total + pow;
			
			temp = temp/10;
			
		}
		if(total == number) {
			System.out.println("the given number is Armstrong number");
			
		}
		else
		{
			System.out.println("the given is not armstrong number");
			
		}

	}
}
