package com.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {

	public static void main(String[] args)
	{
		ArrayList<Integer> a1 = new ArrayList<>();
		a1.add(12);
		a1.add(13);
		a1.add(14);
		a1.add(16);
		a1.add(100);

		System.out.println(a1);
		
		System.out.println("Foreach loop");
		for(Integer i:a1)
		{
			System.out.println(i);
		}

		
		Collections.sort(a1);
		System.out.println(a1);
		for(Integer i:a1)
		{
			System.out.println(i);
		}
        a1.remove(2);
        System.out.println(a1);
        
        ArrayList<Integer> a2 = new ArrayList<>();
		a2.add(12);
		a2.add(13);
		a2.add(14);
		a2.add(16);
		
		
		a1.removeAll(a2);//remove elemnet which are same in both array list
		System.out.println(a1);
		System.out.println(a2);
		
		
//		a2.clear();//clear array list
//		System.out.println(a2);
		
		System.out.println(a2.contains(12));
		System.out.println(a2.get(2));
		System.out.println(a2.indexOf(16));
		
	}
	
	

}
