package com.collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) 
	{
		Map m=new HashMap();
		m.put(101, "rabiya");
		m.put(102, "rabia");
		m.put(103, "eshrat");
		
		//m.clear();
		
		System.out.println(m);
		System.out.println(m.containsKey(101));
		System.out.println(m.containsValue("rabia"));
		
		m.put(null,null);
		m.put(102,"abc");
		System.out.println(m);
		
		//iteration over map using forEach() method  
		m.forEach((k,v) -> System.out.println("Number: "+ k + ", Name: " + v));   
	}
	
	

}
