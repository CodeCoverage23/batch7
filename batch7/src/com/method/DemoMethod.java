package com.method;

//Scanner class

import java.util.Scanner;

public class DemoMethod {
	
public int add(int a, int b) {
	int add = a + b;
	return add;
	}

  public int sub(int a, int b) {
	int sub = a - b;
	return sub;
	}
  
  public int mul(int a, int b) {
  	int mul = a * b;
  	return mul;
  }
  
  public int div(int a, int b) {
  	int div = a / b;
  	return div;
  }
  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a value");
		int s = sc.nextInt();
		int j = sc.nextInt();
		 DemoMethod obj = new DemoMethod ();
		System.out.println("Addition = "+obj.add(s, j));
		System.out.println("Subtraction = "+obj.sub(s, j));
		System.out.println("Multiplication = "+obj.mul(s, j));
		System.out.println("Division = "+obj.div(s, j));
		
	}
	
}

