package scannerDemo;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner scn = new Scanner(System.in);
       System.out.println("Enter ur name");
       String userName = scn.nextLine();
       System.out.println("User name is "+userName);
	}

}
