package com.TaskClass;

public class Task5 {
	int rollNo;
	  String name;
	   static String clgname;
	  String adress;
	  
public  Task5	( int r,String n, String c, String a) {
	rollNo = r;
	name = n;
	clgname  = c;
	adress = a;
	
}
public void  display() {
	
	System.out.println(rollNo + " " + name + " " + "MGICOET" + " " + adress + " ");
	
}
public static void main (String [] args) {
	Task5 t1 =new Task5(110,"Swati"," ","Khamgaon");
	Task5 t2 =new Task5(111,"Vaishnavi","","Nandura");
	Task5 t3 =new Task5(112,"Priya","","Amravti");
	Task5 t4 =new Task5(113,"Snehal","","Shegaon");
	Task5 t5 =new Task5(110,"Sampada","","Nagpur");
	t1.display();
	t2.display();
	t3.display();
	t4.display();
	t5.display();
}


}
	 
	 
	


