package com.StringMethods;

import java.util.Scanner;

public class VowelsConsonants {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.nextLine();
		
		int vcount=0;
		int consonant=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
			{
				vcount++;
			}
			else
			{
				consonant++;
			}
			
		}
		System.out.println("No of Vowels are:"+vcount);
		System.out.println("No of Consonants are:"+consonant);
		

	}

}
