//WAP to print  FS.

package com.Assignments.basic;
import java.util.Scanner;

public class FabonanciSeries {
	

	public static void main(String[] args) {
		
		int num1=0, num2=1, count=20, num3;
		
		Scanner count1=new Scanner(System.in);
		System.out.println("enter a number of which you want to know fabonanci series: ");
		count=count1.nextInt();
		
	
		
		System.out.println(num1 );
		System.out.println(num2 );
		
		for (int i=2; i<=count;i++)
		
		{
			num3=num1+num2;
			 System.out.println( num3);
			num1=num2;
			num2=num3;
			
			
			
		}
		
		
	

	

	
	}

}
