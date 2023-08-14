//WAP to print String and int array.


package com.DailyTasks;

public class Array {
	
	    public static void main(String[] args) {
	       
	        String[] stringArray = { "Java", "Programming"};

	        System.out.println("String Array:");
	        for (String str : stringArray) {
	            System.out.print(str + " ");
	        }
	        System.out.println();  

	      
	        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

	        System.out.println("Integer Array:");
	        for (int num : intArray) {
	            System.out.print(num + " ");
	        }
	    }
	}



