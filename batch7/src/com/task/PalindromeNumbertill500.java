package com.task;

import java.util.Scanner;

public class PalindromeNumbertill500 {

	public static void main(String[] args)
	{
		
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Palindrome number:");
			int num = sc.nextInt();
			System.out.print("Palindrome numbers from 1 to "+num+": ");
			int num2, rem, rev = 0;
			for (int i = 1; i<=num; i++)
			{
				num2 = i;
				while (num2 > 0)
				{
					rem= num2 % 10;
					rev = rev * 10 + rem;
					num2 = num2 / 10;
				}
				if (rev == i)
				{
					System.out.print(rev + " ");
				}
				rev = 0;
			}
		}
			
		}
	

	

