package assignment7;

import java.util.Scanner;

// Design method public int getNumberCube(int num),
//return int value to that method and result should be into main method.

public class assignment72 {
	public int getNumber(int num) {
		int cube = num*num*num;
	return cube;
	}
	
	public static void main(String[] arge) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int num = sc.nextInt();
		
		assignment72 a = new assignment72();
		System.out.println("cube of" + num + " is "+ a.getNumber(num));
	}

}
