package com.pradeep.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MinMAxEx {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(15);
		list.add(30);
		list.add(50);
		list.add(10);
		list.add(30);
		System.out.println(list);
		List<Integer> collect = list.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println(collect);
		//for ascending order
        Integer minasc = list.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("min : "+minasc);
		Integer maxasc = list.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("max : "+maxasc);
		
		//for descending order
		List<Integer> collect1 = list.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println(collect1);
        
		Integer mindesc = list.stream().min((i1,i2)->-i1.compareTo(i2)).get();
		System.out.println("min : "+mindesc);
		
		Integer maxdesc = list.stream().max((i1,i2)->-i1.compareTo(i2)).get();
		System.out.println("max : "+maxdesc);
	}

}
