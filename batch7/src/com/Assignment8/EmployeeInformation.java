//1.1 Design the Employee class which contain
//firstName, lastName, city and mobileNumber and  country.
//1.2 Design the class as EmployeeInformation which takes the input for multiple students
//from user and Design method public void getUserInput(),country is same for all the students.
//1.3 Pass the input to getStudentInformation() method
//1.4 Print the multiple student information into getStudentInformation () method.



package com.Assignment8;
import java.util.*;

class Employee {
    private String firstName;
    private String lastName;
    private String city;
    private String mobileNumber;
    private String country;

    public Employee(String firstName, String lastName, String city, String mobileNumber, String country) {
       this.firstName = firstName;
       this.lastName = lastName;
       this.city = city;
       this.mobileNumber = mobileNumber;
       this.country = country;
    }

    @Override
    public String toString() {
        return "First Name: " + firstName + "\nLast Name: " + lastName + "\nCity: " + city
                + "\nMobile Number: " + mobileNumber + "\nCountry: " + country;
    }
}

class EmployeeInformation {
    private ArrayList<Employee> employees = new ArrayList<>();

    public void getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int numEmployees = scanner.nextInt();

        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter details for Employee #" + (i + 1));
            scanner.nextLine(); // Consume the newline character left by nextInt()

            System.out.print("First Name: ");
            String firstName = scanner.nextLine();

            System.out.print("Last Name: ");
            String lastName = scanner.nextLine();

            System.out.print("City: ");
            String city = scanner.nextLine();

            System.out.print("Mobile Number: ");
            String mobileNumber = scanner.nextLine();

            // Assuming the country is the same for all employees as per your requirement
            String country = "India"; 

           Employee employee = new Employee(firstName, lastName, city, mobileNumber, country);
           employees.add(employee);
        }
    }

    public void getEmployeeInformation() {
        for (Employee employee : employees) {
            System.out.println("\nEmployee Information:\n" + employee);
        }
    }

    public static void main(String[] args) {
        EmployeeInformation empInfo = new EmployeeInformation();
        empInfo.getUserInput();
        empInfo.getEmployeeInformation();
    }
}


