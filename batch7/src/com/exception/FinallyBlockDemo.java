package com.exception;

public class FinallyBlockDemo {

	public static void main(String[] args) {

		try {
			String s1 = "Code";
			char at = s1.charAt(4);
			System.out.println(at);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println(e);
		} finally {
			System.out.println("Finally block is executed...");
		}
		
		System.out.println("Rest of the code...");

	}

}
