package com.pradeep.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreaApi {

	public static void main(String[] args) {

		ArrayList<Employee> list= new ArrayList<>();
		list.add(new Employee(101, "pranesh", 26, 80000));
		list.add(new Employee(102, "pratima", 29, 75000));
		list.add(new Employee(103, "shweta", 22, 54000.50));
		list.add(new Employee(104, "ravi", 23, 45000.80));
		list.add(new Employee(105, "surekha", 32, 25000));
		 List<Employee> collect = list.stream().filter(e->e.empAge>26).collect(Collectors.toList());	
		System.out.println(collect);
        long count = list.stream().filter(e->e.empAge>26).count();	
        System.out.println(count);
		List<Double> collect2 = list.stream().map(e->e.empSalary+5000).collect(Collectors.toList());
		List<Employee> collect3 = list.stream().sorted((i1,i2)->-i1.empName.compareTo(i2.empName)).collect(Collectors.toList());
		System.out.println(collect2);
		System.out.println(collect3);
       list.stream().filter(e->e.empAge>26).forEach(System.out::println);	
		
		
	}

}
