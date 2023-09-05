package com.assegment6;

//write a program to print 25 to 50 numbers using while loop.
public class NumberUsingWhileLoop {
	public static void main(String[] args) {

		for (int i = 50; i < 75; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

}
