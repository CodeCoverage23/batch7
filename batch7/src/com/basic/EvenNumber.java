package com.basic;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=50;
		System.out.println("the list of even number from 1 to 50");
		for (int i=1; i<= a; i++) {
			if(i%2 ==0) {
				System.out.print(i + " ");
			}
		}
	}

}
