package com.pradeep.java8;

import java.util.ArrayList;
import java.util.Optional;

import com.pradeep.collection.Student;

public class Sample2 {

	public static void main(String[] args) {

		ArrayList<Student> list= new ArrayList<>();
		
		list.add(new Student(101,null,26,83));
		list.add(new Student(106, "suresh", 28, 30));
     
//		System.out.println(list.get(1).getStudentName().length());
				Optional<String> of = Optional.ofNullable(list.get(0).getStudentName());
		System.out.println(of);
		
		
	}

}
