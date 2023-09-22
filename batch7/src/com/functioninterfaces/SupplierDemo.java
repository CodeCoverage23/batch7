package com.functioninterfaces;

import java.time.LocalDateTime;
import java.util.function.Supplier;

public class SupplierDemo
{

	public static void main(String[] args) {
		
	
	
	//it return the output only
	Supplier<LocalDateTime> s=()->LocalDateTime.now();
	System.out.println(s.get());
	
}
}

