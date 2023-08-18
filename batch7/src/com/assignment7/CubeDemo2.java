//2. Design method public int getNumberCube(int num), return int value to that method and result should be into main method.

package com.assignment7;

import java.util.Scanner;

public class CubeDemo2
{
	public  static int getNumberCube(int num)
	{
		
		return num*num*num;
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		int cube=getNumberCube(num);
		System.out.println("Cube of "+num+" is :"+cube);
		
			

	}

}
