package com.DailyTasks;

import java.util.Scanner;


public class MethodCall {
	
	public int add(int a, int b) {
		int c=a+b;
		return c;
	}
	public int sub(int num1,int num2) {
		int sub=num2-num1;
		return sub;
	}
	public int mul(int d, int s) {
		int mul=s*d;
		return mul;
	}
	public static double div(int s1, int s2) {
		int div=s1/s2;
		return div;
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a values :");
		int s=sc.nextInt();
		int j = sc.nextInt();
            MethodCall obj= new MethodCall();
           int a=obj.add(s,j);
           System.out.println("addition : "+a);
           int sub = obj.sub(s, j);
           System.out.println("Substraction : "+sub);
           int mul = obj.mul(s,j);
           System.out.println("Multiplication : "+mul);
            double div = div(s,j);
            System.out.println("Division : "+div);
	}


}
