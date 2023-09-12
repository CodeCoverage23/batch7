package com.StringMethods;

import java.util.Scanner;

public class DivideString {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=sc.nextLine();
		System.out.println("Enter how many equal parts you want");
		int n=sc.nextInt();
		int len=s.length();
		int elen=len/n;
	    String[] arr=new String[n];
	    int temp=0;
	    for(int i=0;i<len;i+=elen)
	    {
	    	String str=s.substring(i, i+elen);
	    	arr[temp]=str;
	    	
	    	temp++;
	    }
	    System.out.println("String equals part are");
	    for(String s1:arr)
	    {
	    	System.out.println(s1);
	    }
	}

}
