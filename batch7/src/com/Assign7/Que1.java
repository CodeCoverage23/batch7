package com.Assign7;
import java.util.Scanner;
//design method public int getNumberCube(int num),
//return int value to that method and result should be into main method.


public class Que1 {
	
	public int getNumberCube(int num) {
		int cube = num*num*num;
		return cube;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		
		int num = sc.nextInt();
		
		Que1 a = new Que1();
		System.out.println("cube of"+ num +"is"+a.getNumberCube(num));
	}
}
