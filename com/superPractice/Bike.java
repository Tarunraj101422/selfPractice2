package com.superPractice;

public class Bike extends Company{
	int a;
	Bike(){
		System.out.println("Child constructor");
	}
	Bike(int a){
		this.a=a;
		System.out.println("Child one arg constructor");
	}
	
	Bike(int e, int d){
		super();
		int f = e+d;
		System.out.println("Child two args");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Bike b = new Bike(10,20);
          //System.out.println(b.a);
     
	}

}
