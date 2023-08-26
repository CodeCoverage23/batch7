package com.pradeep.basic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowWithChecked {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			m1();
		} catch (Exception ex) {
			System.out.println("exception handled");
		}

		System.out.println("normal flow");

	}

	public static void m1() throws Exception {

		FileReader file = new FileReader("c:\\user\\abc.text");

		BufferedReader fileinput = new BufferedReader(file);
	}
	
	
	
}
