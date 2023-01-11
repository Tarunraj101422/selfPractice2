package exceptionHandle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		try {
		System.out.println("Please enter 1st number");
        int n1 = s.nextInt();
        System.out.println("Please enter 2nd number");
        int n2 = s.nextInt();
        
        int m = n1/n2;
        System.out.println("Answer is: " +m);
        } catch(ArithmeticException ae) {
        	System.out.println("2nd num should not be zero "+ae.getMessage());
        } catch (InputMismatchException ime) {
        	System.out.println("Enter only numbers "+ime.getMessage());
        }
	}

}
