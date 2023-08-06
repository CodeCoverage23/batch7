package com.DailyTasks;

public class StringConcatCompare {
	
	    public static void main(String[] args) {
	       
	        String s1 = "java";
	        String s2 = "programming";


			System.out.println(s1==s2);
			System.out.println(s1.equals(s2));
			
			
	       
	        String concatenatedString = s1.concat(" ").concat(s2);
	        
	        System.out.println("Concatenated string: " + concatenatedString);
	        
	       
	        
			System.out.println(s2.concat(s1));

	    }
	}



