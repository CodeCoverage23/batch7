package com.nitin.basic;
//Pradip sir morning class session on swapnil sir assignment 02-08-23
public class Assignment31 {
	
	int rollNo;
	String name;
	String address;
	public Assignment31(int rollNo,String name,String address) {
		this.rollNo=rollNo;
		this.address=address;
		this.name=name;
	}
	public static void collegeName(String collegeName) {
		System.out.println("collegeNmae ="+collegeName);
		
	}
	public  void display() {
		System.out.println("rollNo ="+rollNo +" name =" +name+" address =" +address);
		}

	public static void main(String[] args) {
		Assignment31.collegeName("YCCE");
		Assignment31 Assignment31=new Assignment31(101,"Nitin","Nagpur");
		Assignment31.display();
		Assignment31 Assignment32=new Assignment31(102,"Pavan","Ambazari road,Nagpur");
		Assignment31 Assignment33=new Assignment31(103,"Vinod","Chatrapati chowk,Nagpur");
		Assignment31 Assignment34=new Assignment31(104,"Rahul","Ram nagar chowk,Nagpur");
		Assignment31 Assignment35=new Assignment31(105,"Mama","Shankar Nagar,Nagpur");
		Assignment32.display();
		Assignment33.display();
		Assignment34.display();
		Assignment35.display();
		

	}

}
