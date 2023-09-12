package com.pradeep.collection;

public class Student implements Comparable<Student> {
	int rollNo;
	String studentName;
	int age;
	int Marks;

	public Student(int rollNo, String studentName, int age, int marks) {
		super();
		this.rollNo = rollNo;
		this.studentName = studentName;
		this.age = age;
		Marks = marks;

	}

	@Override
	public int compareTo(Student o) {
		return this.rollNo - o.rollNo;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", studentName=" + studentName + ", age=" + age + ", Marks=" + Marks + "]";
	}

	// compare to
// if i1<i2 then return -1  10<20  -1 20 10  10 20
// if i1>i2 then return +1   20>10 +1 20 10  10 20 
// if i1=i2 then return 0    10=10 0  10 10   10 10


	
}
