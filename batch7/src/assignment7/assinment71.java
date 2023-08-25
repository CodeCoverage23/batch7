package assignment7;

import java.util.Scanner;

// . Design method to check whether the character is alphabet, digit and special symbol.

public class assinment71 {
	public static void main(String[]arge) {
		char ch;
		Scanner sc= new Scanner(System.in);
		System.out.println(" charecter is alphabet, digit and symbol");
		ch = sc.next().charAt(0);
		
		if(ch >=97 && ch <=122)
		{
			System.out.println("it a small letter alphabet");
		}
		else if (ch >=65 && ch <=90)
		{
			System.out.println("it is a number");
		}
		else if(ch >=48 && ch >=57)
		{
			System.out.println("it is a number");
		}
		else if (ch >=33 && ch <=47 || ch>=58 && ch<= 64 || ch>=91 && ch<=96 || ch>=123 && ch<=126);
		{
			System.out.println("it is a special symbol");
		}
		
	}

}
