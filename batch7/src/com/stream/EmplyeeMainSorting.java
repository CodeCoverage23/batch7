package com.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


import com.sun.tools.javac.util.List;

public class EmplyeeMainSorting {

	public static void main(String[] args)
	{
		ArrayList<Employee> l=new ArrayList<Employee>();
		l.add(new Employee(101, "rabiya", 201, "Active", 5000));
		l.add(new Employee(102, "Eshrat", 201, "Active", 50300));
		l.add(new Employee(103, "Tauqeer", 203, "Inactive", 50020));
		l.add(new Employee(104, "Ashshu", 202, "Active", 51000));
		l.add(new Employee(105, "sufi", 202, "Inactive", 25000));
		
		
		System.out.println("Sorting Ascending by empid");
		l.stream().sorted(Comparator.comparing(Employee::getEmpid)).forEach(System.out::println);
		
		System.out.println("Sorting Descending by empid");
		l.stream().sorted(Comparator.comparing(Employee::getEmpid).reversed()).forEach(System.out::println);
		
		System.out.println("Sorting Ascending by empname");
		l.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
		
		System.out.println("Sorting Descending by empname");
		l.stream().sorted(Comparator.comparing(Employee::getName).reversed()).forEach(System.out::println);
		
		
		long ac=l.stream().filter(e->"Active".equals(e.getStatus())).count();
		System.out.println("Number of active Employee count:"+ac);
		
		long Ic=l.stream().filter(e->"Inactive".equals(e.getStatus())).count();
		System.out.println("Number of Inactive Employee count:"+Ic);
		
		System.out.println("Active employee data");
		l.stream().filter(e->"Active".equals(e.getStatus())).collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("Grouping emp by empid");
		Map<Integer, java.util.List<Employee>> map = l.stream().collect(Collectors.groupingBy(Employee::getEmpid,Collectors.toList()));
		map.forEach((k,v)->System.out.println(k+"="+v));
	

	}

}
