package com.Assign7;

import java.util.Scanner;

//Design method public int getNumberCube(int num), return int value to that method and result should be into main method.

public class Que2 {
	public int getNumberCube(int num) {
		int cube=num*num*num;
		return  cube;
	}
	

	public static void main(String[] args) {
	 Scanner sc =new Scanner(System.in);
	 System.out.println("enter the number");
	int n= sc.nextInt();
	 Que2 obj = new Que2 ();
	 int c =obj.getNumberCube(n);
	 System.out.print("cube:"+c);
	 

	}

}
