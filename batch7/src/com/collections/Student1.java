package com.collections;

public class Student1 {

	private int rollNo;
	private String name;
	private String adds;

	public Student1(int rollNo, String name, String adds) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.adds = adds;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdds() {
		return adds;
	}

	public void setAdds(String adds) {
		this.adds = adds;
	}

	@Override
	public String toString() {
		return "Student1 [rollNo=" + rollNo + ", name=" + name + ", adds=" + adds + "]";
	}

}
