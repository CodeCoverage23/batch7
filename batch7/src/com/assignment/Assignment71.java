package com.assignment;
import java.util.Scanner;
public class Assignment71 {

	public static void main(String[] args) {
		Scanner r=new Scanner(System.in);
		char ch;
		System.out.print("Enter a character:");
		ch=r.next().charAt(0);
		System.out.println(ch>='a'&&ch<='z'?"small case alphabet"
				        :ch>='A'&&ch<='Z'?"Capital Alphabet"
				        		:ch>='0'&&ch<='9'?"Digit"
				        				          :"Symbol");
		
		// TODO Auto-generated method stub

	}

}
