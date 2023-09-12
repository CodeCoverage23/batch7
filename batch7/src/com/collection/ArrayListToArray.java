package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {

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
		
		//ArrayList to array
		String[] arr= list.toArray(new String[list.size()]);
		for(String s:arr)
		{
			System.out.println(s);
		}
		//Array to ArrayList
		List<String> list1 = new ArrayList<String>();   
		list1=Arrays.asList(arr);
		for(String st:list1)
		{
			System.out.println(st);
		}
	}

}
