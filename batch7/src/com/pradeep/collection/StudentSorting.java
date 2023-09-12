package com.pradeep.collection;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSorting {

	public static void main(String[] args) {

		ArrayList<Student> list=new ArrayList<>();
		
		 
		
		list.add( new Student(106,"pradeep",28,60));
		list.add( new Student(101,"shweta",26,70));
		list.add( new Student(103,"pranesh",30,64));
		list.add( new Student(105,"swapnil",22,80));
		list.add( new Student(102,"dinesh",29,56));
		System.out.println(list);
//		Collections.sort(list, new IdComparator());
//		System.out.println(list);
		Collections.sort(list, new NameComparator());
		System.out.println(list);
		
	}

}
