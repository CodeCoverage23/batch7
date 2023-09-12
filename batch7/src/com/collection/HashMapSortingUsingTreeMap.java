package com.collection;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapSortingUsingTreeMap {

	public static void main(String[] args)
	{
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(23, "Yash");  
		hm.put(17, "Arun");  
		hm.put(15, "Swarit");  
		hm.put(9, "Neelesh");  
		//iteration over map using forEach() method  
				 
		System.out.println("Before sorting");
		hm.forEach((k,v)->System.out.println(k+","+v));
		
		TreeMap<Integer,String>t=new TreeMap<Integer,String>(hm);
		System.out.println("After sorting");
		t.forEach((k,v)->System.out.println(k+","+v));

	}

}
