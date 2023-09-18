package com.demo.java8;

import java.util.Scanner;

@FunctionalInterface
interface Draw{
	public int circle(int a,int b);
}
public class DemoLambda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		Draw ex =(a,b)-> {System.out.println("circle");
			return a+=b;
			
			};
		System.out.println(ex.circle(x,y));

	}

}
