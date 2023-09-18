package com.pradeep.java8;

public class Employee {

	int empId;
	String empName;
	int empAge;
	double empSalary;
	public Employee(int empId, String empName, int empAge, double empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", empSalary=" + empSalary
				+ "]";
	}
	
	
	
	
	
}
