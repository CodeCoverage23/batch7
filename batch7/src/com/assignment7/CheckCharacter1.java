//1. Design method to check whether the character is alphabet, digit and special symbol.
package com.assignment7;

import java.util.Scanner;

public class CheckCharacter1 
{
	/*
	 * a=97 z=122
	 * A=65 Z=90
	 */

	public void check(char c)
	{

		if(c>=97 && c<=122 ||c>=65 && c<=90)    //By using Ascii value 
		//if(c>='a' && c<='z' || c>='A' && c<='Z')
		{
			System.out.println(c+" is a Alphabet");
		}
		else if(c>='0' &&  c<='9')                 //digit between 0-9
		{
			System.out.println(c+" is a digit");
		}
		else
		{
			System.out.println(c+" is a special symbol");
		}
			
		
	}

	public static void main(String[] args) 
	{
		CheckCharacter1 cc=new CheckCharacter1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character");
		
		 String str=sc.next();
		 char ch=str.charAt(0);//Reading Character
		 
		 
		 cc.check(ch);
	}

}
