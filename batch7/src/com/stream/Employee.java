package com.stream;

public class Employee 
{
	private int id;
	private String name;
	private int Empid;
	private String status;
	public Employee(int id, String name, int empid, String status, double sal) 
	{
		super();
		this.id = id;
		this.name = name;
		Empid = empid;
		this.status = status;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Empid=" + Empid + ", status=" + status + ", sal=" + sal
				+ "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpid() {
		return Empid;
	}
	public void setEmpid(int empid) {
		Empid = empid;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	private double sal;

}
