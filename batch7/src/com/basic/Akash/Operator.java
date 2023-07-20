package com.basic.Akash;

public class Operator {
	public static void main(String[] args) {
		int a = 15;
		int b = 10;
		int c = 20;
		int d = -25;
//unary operator
		//System.out.println(a++);
		//System.out.println(a);
		//System.out.println(++a);
		//System.out.println(a);
		//System.out.println(a++ + a++ + a++);
		//System.out.println(b--);
		//System.out.println(b);
		//System.out.println(--b);
		//System.out.println(~c);
		//System.out.println(~d);
		//arithmatic operator
		//System.out.println(a+b);
		//System.out.println(a-b);
		//System.out.println(a*b);
		//System.out.println(a/b);
		//System.out.println(a%c);
		//bitwise operator
		// 1= true; 0= false
		// and operator
		System.out.println(a<b & a>b);
		System.out.println(a<c & a>b);
		//or operator
		System.out.println(a<b | a>b);
		System.out.println(a<c | a<b );
		// logical operator
		//AND operator (&&)
// 1. if the first condition is true then it will check the second condition
		System.out.println(a<c && a<++b);
		System.out.println(b);
//2. if the first condition is false then it will not check the second condition
		System.out.println(a>c && ++a>b);
		System.out.println(a);
		//or operator
		System.out.println(a<c || a<++c);
		System.out.println(c);
		System.out.println(a>c || a<++c);
		System.out.println(c);
		
		
		
		
	}
}
