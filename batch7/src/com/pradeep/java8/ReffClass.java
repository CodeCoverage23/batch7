package com.pradeep.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class StudentM{
	String id;
	String SName;
	String grade;
	public StudentM(String id, String sName, String grade) {
		super();
		this.id = id;
		SName = sName;
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "StudentM [id=" + id + ", SName=" + SName + ", grade=" + grade + "]";
	}
	
	
	
}


public class ReffClass {
public static void main(String[] args) {
	
	List<StudentM> student1 =new ArrayList<StudentM>();
	student1.add(new StudentM("101", "smith", "A"));
	student1.add(new StudentM("102", "john", "B"));
	student1.add(new StudentM("103", "sumit", "C"));

	List<StudentM> student2 =new ArrayList<StudentM>();
	student1.add(new StudentM("104", "marry", "A"));
	student1.add(new StudentM("105", "david", "B"));
	student1.add(new StudentM("106", "forster", "C"));
	
	List<List<StudentM>> asList = Arrays.asList(student1,student2);
//                                               10s + 10s =20s 
//	for(List<StudentM> s :asList) {               10s=10s
//		for(StudentM st:s) {
//			
//			System.out.println("student name :"+st.SName);
//			
//		}
//		
//	}
//	
	List<StudentM> collect = asList.stream().flatMap(student->student.stream().filter(s->s.grade.equals("B"))).collect(Collectors.toList());
	System.out.println(collect);
	
	
}
	
	
	
}
