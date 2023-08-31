package com.pradeep.basic;

import java.io.FileNotFoundException;
import java.io.IOException;
// when parent class throws any exception the child class throw same,child or no exception
class Bird{
	
	public void fly() throws IOException {
		
		System.out.println("bird is flying");
	}	
}
 class Parrot extends Bird{
	 
	 public void fly() throws FileNotFoundException {
		 
		 
		 System.out.println("parrot is flying");
	 }
	 
	 
 }

public class OverridingException2 {

	public static void main(String[] args) throws IOException {

		Bird b= new Parrot();
		b.fly();
		
	}

}
