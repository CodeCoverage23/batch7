//1.2 Design the class as EmployeeInformation which takes the input for multiple students
//from user and Design method public void getUserInput(),country is same for all the students.
//1.3 Pass the input to getStudentInformation() method
//1.4 Print the multiple student information into getStudentInformation () method.


package Assignment8;
import java.util.Scanner;

public class EmployeeInformation {
	
	Employee[] emp;
	
	public static void main(String[] args) {
			
		EmployeeInformation ei=new EmployeeInformation();
		ei.getStudentInformation();
		
	}
	
	
	public void getUserInput() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Employees: ");
	     int num= sc.nextInt();
		
		emp= new Employee[num];
		
		for(int i=0; i<emp.length;i++) {

		System.out.println("Enter your first name:");
		String first_name = sc.next();
	
		System.out.println("Enter your last name:");
		String last_name = sc.next();
		
		System.out.println("Enter your city:");
		String city = sc.next();
		

		System.out.println("Enter your mobile number:");
		long mobile_number = sc.nextLong();
		
		String country="India";
		
		emp[i]=new Employee(first_name, last_name, city, mobile_number, country);
	
			
		}
	}
	
	
	public void getStudentInformation() {
		
		getUserInput();
		
		for(int i=0; i<emp.length;i++) {

			System.out.println(emp[i]);
		}
		
		
	}
	
	
		
}

	
			
		
		
		
		

	