//1 Design the Employee class which contain firstName, lastName, city and mobileNumber and  country.


package Assignment8;

public class Employee {
	
	//initialization of variable
	
	String first_name;
	String last_name;
	String city;
	long mobile_number;
	String country;
	
	
	//Constructor for class Employee
	public Employee(String first_name, String last_name, String city, long mobile_number, String country) {
		
		this.first_name = first_name;
		this.last_name = last_name;
		this.city = city;
		this.mobile_number = mobile_number;
		this.country = country;
	}
	
	public Employee(String first_name, String last_name, String city, long mobile_number) {
		
		this.first_name = first_name;
		this.last_name = last_name;
		this.city = city;
		this.mobile_number = mobile_number;
		this.country="INDIA";
		
	}



	@Override
	public String toString() {
		return "Employee [first_name=" + first_name + ", last_name=" + last_name + ", city=" + city + ", mobile_number="
				+ mobile_number + ", country=" + country + "]";
	}



	
	


}