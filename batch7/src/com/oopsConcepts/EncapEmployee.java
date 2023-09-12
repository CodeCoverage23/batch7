package com.oopsConcepts;

public class EncapEmployee 
{
     private int empid;
     private String empname;
     private String empaddr;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
		
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpaddr() {
		return empaddr;
	}
	public void setEmpaddr(String empaddr) {
		this.empaddr = empaddr;
	}
//	@Override
//	public String toString() {
//		//return "empid=" + empid + ", empname=" + empname + ", empaddr=" + empaddr + "";
//		return "Employee id:"+empid+"\nEmployee Name:"+empname+"\nEmployee Address:"+empaddr;
//		
//	}
//     
	@Override
	public String toString() {
		return "EncapEmployee [empid=" + empid + ", empname=" + empname + ", empaddr=" + empaddr + "]";
	}
     
    
}
