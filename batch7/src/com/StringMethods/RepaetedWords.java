package com.StringMethods;

import java.util.Scanner;

public class RepaetedWords {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		String[] arr=s.split(" ");
		int count;
		for(int i=0;i<arr.length;i++)
		{
			count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].equals(arr[j]))
				{
					count++;
					arr[j]="0";
				}
			}
			if(arr[i]!="0")
			{
				System.out.println(arr[i]+count);
			}
		}
		

	}

}
