package Dailytask;

import java.util.Scanner;

//Create four methods with return types for addition, subtraction, division(float), multiplication, and create object of the class to call each method.

public class DailyTask1 {
	public int addition(int a, int b) {
		int add = a + b;
		return add;
		
	}
	public int subtraction(int c, int d) {
		int sub = c - d;
		return sub;
	}
	public int multiplication(int e, int f) {
		int multi = e * f;
		return multi;
	}
	public int division(int g, int h) {
		int div = g / h;
		return div;
	}
	public static void main(String[] arge) {
		Scanner sc = new Scanner(System.in);
		System.out.println( "enter a value :");
		int r = sc.nextInt();
		int t = sc.nextInt();
		DailyTask1 obj = new DailyTask1();
		int s = obj.addition(r, t);
		System.out.println("addition :" + s);
		int sub = obj.subtraction(r, t);
		System.out.println("subtraction :" + sub);
		int multi = obj.multiplication(r, t);
		System.out.println("multiplication :" + multi);
		int div = obj.division(r, t);
		System.out.println("division :" + div);
		
		
		
	}
	

}
