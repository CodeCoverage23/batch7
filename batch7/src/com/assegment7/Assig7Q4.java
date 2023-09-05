
package com.assegment7;

import java.util.Scanner;

//Design method public int getReverseNumber(int num) which return int value 
//to that method and result print into main method.
public class Assig7Q4 {

	int rev = 0;

	public int getReverseNumbe(int num) {
		int rev = 0;

		while (num > 0) {
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		return rev;
	}

	public static void main(String[] args) {
		Assig7Q4 W = new Assig7Q4();
		Scanner SC = new Scanner(System.in);
		System.out.println("enter the number to reverse");

		int num = SC.nextInt();

		int result = W.getReverseNumbe(num);

		System.out.println(+result);
	}

}
