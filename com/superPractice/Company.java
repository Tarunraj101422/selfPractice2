package com.superPractice;

public class Company {
	String name = "Yamaha";
	Company(){
		System.out.println("Zero args constructor");
	}
	Company(int x, int y){
		int z = x+y;
		System.out.println("Two args constructor"+z);
	}
	
	Company(int a, int b, int c){
		this();
		int d = a+b+c;
		System.out.println("3 args constuctor"+d);
	}

}
