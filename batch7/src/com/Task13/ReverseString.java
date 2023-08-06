package com.Task13;

public class ReverseString {
	public static void main(String args[]) {
		int l;
		int i;
		String r = "Swati Parkhede";
		String r2 = " ";//reverse the string
		 l =r.length();//l is a varible 
		 for(i=l-1;i>=0;i--) 
		 {
			r2=r2+ r.charAt(i);
		 }
		 System.out.println("reverse string is:"+r2);
		 
		 
		
		
	
	
}}