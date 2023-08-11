package com.Task;
//WAP to print String and int array.

public class PrintArray {

	public static void main(String[] args) {
		
		//to print integer array
		int arr[] = new int[5];
		
		arr[0]=10;
		arr[1]=30;
		arr[2]=50;
		arr[3]=70;
		arr[4]=90;

		
		System.out.println("Int array is : ");

		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		
		
		//to print string
		
String str[] = new String[5];
		
		str[0]="you";
		str[1]="will";
		str[2]="win";
		str[3]="have";
		str[4]="patience";

		
		System.out.println("Int array is : ");

		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]+ " ");
		}

	}

}
