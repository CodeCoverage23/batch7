package com.collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LinkedListRemoveDuplicates {

	public static void main(String[] args)
	{
		List<Integer> l  =new ArrayList<>();
		l.add(10);
		l.add(14);
		l.add(50);
		l.add(80);
		l.add(103);
		l.add(105);
		l.add(150);
		l.add(160);
		l.add(80);
		l.add(150);
		System.out.println("with Duplicates:"+l);
		//convert list to set--because set not accept the duplicates value
		Set<Integer> s=new LinkedHashSet<Integer>(l);
		
		System.out.println("without Duplicates:"+s);
		

	}

}
