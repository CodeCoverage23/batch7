package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Test implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {

		if (o1 < o2) {
			return 1;
		} else if (o1 > o2) {
			return -1;
		} else {
			return 0;
		}
	}

}

class Test2 implements Comparator<Student1> {

	@Override
	public int compare(Student1 s1, Student1 s2) {

		if (s1.getRollNo() < s2.getRollNo()) {
			return 1;
		} else if (s1.getRollNo() > s2.getRollNo()) {
			return -1;
		} else {
			return 0;
		}
	}

}

public class MyComparator {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(11);
		al.add(9);
		al.add(8);
		al.add(4);
		al.add(15);
		al.add(12);
		Collections.sort(al, new Test());
		System.out.println(al);

		ArrayList<Student1> l = new ArrayList<>();

		l.add(new Student1(101, "Sam", "Amt"));
		l.add(new Student1(102, "John", "Pune"));
		l.add(new Student1(103, "Kishor", "Akola"));
		l.add(new Student1(104, "Pavan", "Delhi"));
		l.add(new Student1(105, "Manish", "Ngp"));

		Collections.sort(l, new Test2());

		System.out.println(l);

		// -> lambda expression
	}

}
