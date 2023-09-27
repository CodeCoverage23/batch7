package com.pradeep.java8;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
	
		ArrayList<Employee> list=new ArrayList<>();
		Employee emp=new Employee(101, "rekha", 25, 30000.75);
		list.add(emp);
		list.add(new Employee(102, "pratima", 29, 750000));
		list.add(new Employee(103, "shweta", 22, 54000.50));
		list.add(new Employee(104, "ravi", 23, 45000.80));
		list.add(new Employee(105, "surekha", 32, 25000));
		System.out.println(list);
		Predicate<Employee> p=e->e.empSalary>30000;
		for(Employee s:list) {
			if(p.test(s))
			{
				System.out.println(s);
				
			}
			
		}


		
		
		
		
		
		
		
		
		

	}

}
