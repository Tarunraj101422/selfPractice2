package bankingException;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		try {
		Transactions ts = new Transactions();
		try (Scanner sc = new Scanner(System.in)) {
			int option;
			String con = "";
			do {
				System.out.println("Please select transaction:: ");
				System.out.println("Press 1 for deposit ");
				System.out.println("Press 2 for withdraw ");
				System.out.println("Press 3 for checkBalance ");
				option = sc.nextInt();

				switch (option) {
				case 1: {
					System.out.println("Please enter deposit amount");
					//String s = sc.next();
					double amt = sc.nextDouble();
					ts.deposit(amt);
				}
					break;
				case 2: {
					System.out.println("Please enter withdraw amount");
					double withdrawAmt = sc.nextDouble();
					ts.withdraw(withdrawAmt);
				}
					break;
				case 3: {
					ts.checkBalance();

				}
					break;

				default:
					System.out.println("default");
				}
				System.out.println("Another transaction");
				con = sc.next();
			} while (con.equalsIgnoreCase("Yes"));
		}
		} catch (InvalidAmountException ia) {
			System.out.println("Please enter valid amount ");
			ia.printStackTrace();
		} catch(InsufficientFundsException is) {
			System.out.println("In sufficient funds");
			is.printStackTrace();
		}
	}
}
