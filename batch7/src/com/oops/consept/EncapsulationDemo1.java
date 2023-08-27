package com.oops.consept;

public class EncapsulationDemo1 {

	public static void setValues() {
		Employee employee = new Employee();

		employee.setEmpId(101);
		employee.setEmpName("Sam");
		employee.setEmpAddress("Pune");

		System.out.println(employee.getEmpId());

		System.out.println(employee);

		Employee emp = new Employee();
		emp.setEmpId(102);
		emp.setEmpName("John");
		emp.setEmpAddress("Delhi");

		System.out.println(emp);

	}

	public static void main(String[] args) {
		setValues();
	}
}
