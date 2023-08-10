package com.Assign5;
import java.util.Scanner;
public class Que6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
                int num =sc.nextInt();
                if(num%100!=0) {
                	System.out.println("number is  not greater than 100");
                }else {
                	System.out.println("number is  greater than 100");
                }
	}

}
