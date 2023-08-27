package com.oops.consept;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsDemo {

	public static void main(String[] args) throws FileNotFoundException {

		File f = new File("D:\\Java Batches\\Eclipse workspace");

		FileReader reader = new FileReader(f);
		System.out.println(reader);

		System.out.println("Rest of the code");

	}

}
