package com.oopsConcepts;

public class EncapsulationDemo 
{
   public static void setValues()
   {
	   EncapEmployee e=new EncapEmployee();
	   e.setEmpid(102);
	   e.setEmpname("john");
	   e.setEmpaddr("solapur");
	   
	   System.out.println(e);
   }
	public static void main(String[] args) 
	{
		setValues();

	}

}
