package com.Loop;

public class Task{
	public static void main(String[] args) {
		for(int i = 1; i<=100; i++) {
//			System.out.println(i);
			if(i%5==0) {
				System.out.println(i + " love");
			}if(i%7==0) {
				System.out.println(i + " raut");
			}if(i%5==0 &  i%7==0) {
				System.out.println(i + " Lovekesh Raut");
			}
		}
	}
}
	



