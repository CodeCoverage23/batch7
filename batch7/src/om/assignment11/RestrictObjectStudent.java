//1. I have student class now user restricts to create the object of that class from outside, write the code for it.

package om.assignment11;

class Student 
{
	static int age;
	static String name;
	//constructor to initialize variable
	public Student(int age, String name)
	{
		
		this.age = age;
		this.name = name;
	}
	static  void display()
	{    
		//creating object of student class inside the class
		Student s=new Student(25,"John");
		System.out.println("Student Name:"+name);
		System.out.println("Student age:"+age);
	}

}
public class RestrictObjectStudent
{
	public static void main(String[] args)
	{
		//calling display method of student class
	    Student.display();
	}
}