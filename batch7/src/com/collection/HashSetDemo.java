package com.collection;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) 
	{
		
		ArrayList<Object> a = new ArrayList<>();
		a.add(12);
		a.add(13);
		a.add("abc");
		a.add(null);
		a.add(12);
		a.add(12);
		a.add(6, 40);
		
		HashSet hs=new HashSet(a);
		hs.add("aa");
		hs.add("ab");
		hs.add("ac");
		hs.add("aa");
		hs.add("aa");
		hs.add(10);
		hs.add(12.4);
		hs.add(null);
		hs.add(null);
		
		
		System.err.println(hs);

	}

}
