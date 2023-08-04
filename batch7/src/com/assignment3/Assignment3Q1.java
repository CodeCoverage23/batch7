package com.assignment3;

//Design separate method as string getstudentName(string name)
//which return student name to that method and print it on console.

public class Assignment3Q1 {

	public String getstudentName(String name) {

		return name;

	}

	public static void main(String[] args) {

		Assignment3Q1 c = new Assignment3Q1();
		String a = c.getstudentName("Prajakta");

		System.out.println("Student name>>"+a);
	}
}