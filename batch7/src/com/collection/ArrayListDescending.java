package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDescending {

	public static void main(String[] args) 
	{
		
		ArrayList<String> list = new ArrayList<String>();    
		list.add("Data Science");   
		list.add("Testing");   
		list.add("C#");   
		list.add("Basic Language");   
		list.add("UML");   
		list.add("Algorithms ");   
		list.add("Computer Networks");  
		list.add("Python");  
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
	}

}
