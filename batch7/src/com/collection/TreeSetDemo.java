package com.collection;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args)
	{
		TreeSet ts=new TreeSet();
		//follow sorting order
		ts.add(10);
		//store only homogeneous data
		//ts.add("abc");
		ts.add(20);
		ts.add(30);
		ts.add(60);
		//ts.add(null)cannot store null values
		
		System.out.println(ts);
	}

}
