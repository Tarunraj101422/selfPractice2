package exceptionHandle;

import java.util.Scanner;

public class SecondException {
	public int m1() {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter your age");
		int age = s.nextInt();
		System.out.println("Your age is :: "+age);
		if (age<18) {
			System.out.println("Access denied");
		} else {
			System.out.println("Login Success");
		}
		try {
		if (age<0) {
			throw new UserDefinedException(age, "Not suitable age");
		} else {
			System.out.println("Congrats");
		}
		} catch (UserDefinedException u) {
			System.out.println(u.getCode()+ u.getMessage());
			//System.exit(0); is used to terminate the finally block.
		} finally {
			System.out.println("Thank you");
		}
		return age;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondException se = new SecondException();
		se.m1();
		
	}

}
