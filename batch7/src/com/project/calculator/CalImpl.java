package com.project.calculator;

import java.util.Scanner;

public class CalImpl {
	Scanner sc = new Scanner(System.in);
public void add(int x,int y) {
	int z = x+y;
	System.out.println("Addition is = "+z );
}

public void sub(int x, int y) {
	int z = x-y;
	System.out.println("Substration is = "+z );
}
	
public void mul(int x, int y) {
	int z = x*y;
	System.out.println("Multiplication is = "+z );
}
public void div(int x, int y) {
	if(y == 0) {
		System.out.println("2nd no should be greater than 0");
	}else {
		int z = x/y;
		System.out.println("Division is = "+z );
	}
	
}

public String opration(String choice,int x, int y) {
	
	switch(choice) {
	case "1":{
		add(x,y);
		break;
	}
	case "2":{
		sub(x,y);
		break;
	}
	case "3":{
		mul(x,y);
		break;
	}
	case "4":{
		div(x,y);
		break;
	}
	case "0":{
		System.out.println("Application Exited");
		System.exit(0);
	}
	case "5":{
		add(x,y);
		sub(x,y);
		mul(x,y);
		div(x,y);
		break;
	}
	default : System.out.println("invalid menu "+ choice + " please enter valid menu");
	}
	System.out.println(" press 9 for continue, press 0 exit, press 8 for main menu");
	String nc = sc.nextLine();
	return nc;
	
}

public String menu() {
	System.out.println("Welcome to my Application");
	System.out.println("press 1 for Add");
	System.out.println("press 2 for sub");
	System.out.println("press 3 for mul");
	System.out.println("press 4 for div");
	System.out.println("press 5 for all calculations");
	
	String input = sc.nextLine();
	return input;
}

}
