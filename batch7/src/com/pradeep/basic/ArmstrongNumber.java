package com.pradeep.basic;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number = sc.nextInt();
		int count=0; int lastDigit=0; double total=0;
		
		int tempNumber=number;
		//  step=1 : to count digit in number
		while(tempNumber>0) {
			
			tempNumber=tempNumber/10;
			count++;
		}
	  int temp=number;
	  // step->2 : get the last digit and calculate the power and total
	  while(temp>0){
		  
		  lastDigit=temp%10;
	double pow = Math.pow(lastDigit, count);
		  
		total=total+pow;
		  
		  
		  temp=temp/10;
		  
	  }
		
		if(total==number) {
			
			System.out.println("the given number is Armstrong number");
			
		}
		
		else
		{
			System.out.println("the given number is not armstroong number");
			
		}
		
	}

}
