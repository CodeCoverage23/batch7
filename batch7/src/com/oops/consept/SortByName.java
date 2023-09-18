package com.oops.consept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.collections.Student1;

class Test3 implements Comparator<Student1> {

	@Override
	public int compare(Student1 o1, Student1 o2) {
		return o1.getName().compareTo(o2.getName());
	}
}

public class SortByName {

	public static void main(String[] args) {

		List<Student1> l = new ArrayList<Student1>();

		l.add(new Student1(105, "Sam", "Akola"));
		l.add(new Student1(104, "Amit", "Pune"));
		l.add(new Student1(103, "Pavan", "Akola"));
		l.add(new Student1(102, "Zampya", "Akola"));
		l.add(new Student1(101, "Samir", "Nagpur"));

		for (Student1 s : l) {
			System.out.println(s);
		}
		Collections.sort(l, new Test3());
		Collections.reverse(l);
		System.out.println("After sorting");
		for (Student1 s : l) {
			System.out.println(s);
		}

	}

}
