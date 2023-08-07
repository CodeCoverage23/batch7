package com.swapniltask;

import java.util.Scanner;

//Create four methods with return types for addition, subtraction,
//division(float), multiplication, and create object of the class to call each method.

public class Dailytask1 {
	
	public int addition(int a,int b) {
		int add = a + b;
		return add;
		
	}
    public int subtraction(int d,int e) {
    	int sub = d - e;
    	return sub;
    }
    public int multiplication(int g, int h) {
    	int mul = g * h;
    	return mul;
    }
    
    public int division(int i, int j) {
    	int div = i / j;
    	return div;
    			
    }
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("enter a value :");
    	int r = sc.nextInt();
    	int t = sc.nextInt();
    	Dailytask1 obj = new Dailytask1();
    	int s = obj.addition(r, t);
    	System.out.println("addtion :" + s);
    	int sub = obj.subtraction(r, t);
    	System.out.println("sbstraction :" + sub);
    	int mul = obj.multiplication(r, t);
    	System.out.println("multiplication :" + mul);
    	int div = obj.division(r, t);
    	System.out.println("division :" + div);
    }
    
}
