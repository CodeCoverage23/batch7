package com.Task;

public class TaskMethod {

	public void simple() { //simple method

		System.out.println("Operations : ");

	}

	public int add(int a, int b) { //parameterized method
		System.out.println("the sum of " + a + " and " + b + " is : ");
		return a + b;

	}

	public int sub(int c, int d) {
		System.out.println("the difference between " + c + " and " + d + " is : ");
		return c + d;

	}

	public int mul(int e, int f) {
		System.out.println("the multiplication between " + e + " and " + f + " is : ");
		return e * f;

	}

	public float div(float g, float h) {

		System.out.println("the division between " + g + " and " + h + " is : ");
		return g / h;

	}

	

	public static void main(String[] args) {

		TaskMethod s = new TaskMethod();
		s.simple();

		System.out.println(s.add(23, 23));

		System.out.println(s.sub(23, 20));
		
		System.out.println(s.mul(23, 20));
		
		System.out.println(s.div(15.0f, 4.0f));
		

	}

}
