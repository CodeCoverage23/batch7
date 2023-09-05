package com.collections;

import java.util.ArrayList;
import java.util.List;

public class StudentArrayList {

	public static void main(String[] args) {

		List<Student1> l = new ArrayList<>();

		l.add(new Student1(101, "Sam", "Amt"));
		l.add(new Student1(102, "John", "Pune"));
		l.add(new Student1(103, "Kishor", "Akola"));
		l.add(new Student1(104, "Pavan", "Delhi"));
		l.add(new Student1(105, "Manish", "Ngp"));

		Student1 student1 = new Student1(101, "Sam", "Amt");
		l.add(student1);
		
		System.out.println(l);
		
		System.out.println(student1.getAdds());

	}

}
