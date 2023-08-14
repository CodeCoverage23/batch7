//WAP to reverse the number.
package com.Assignments.basic;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		
		//int num=3456, rev=0;
		int rev=0;
		Scanner number=new Scanner(System.in);
		System.out.println("Enter a number:");
	    int num = number.nextInt();
		while ( num!=0)
		{
	    int	rem=num%10;
		rev= rev*10+rem;
		num=num/10;
		}
		System.out.println("reverse number" + "=" + rev);
		
		
		

	}

}
