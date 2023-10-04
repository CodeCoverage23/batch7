package com.pradeep.collection;

public class Student implements Comparable<Student> {
	 private int rollNo;
	 private String studentName;
	private int age;
private	int Marks;

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

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getMarks() {
		return Marks;
	}

	public void setMarks(int marks) {
		Marks = marks;
	}
	

	// compare to
// if i1<i2 then return -1  10<20  -1 20 10  10 20
// if i1>i2 then return +1   20>10 +1 20 10  10 20 
// if i1=i2 then return 0    10=10 0  10 10   10 10


	
}
