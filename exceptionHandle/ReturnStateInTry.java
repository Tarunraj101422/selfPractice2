package exceptionHandle;

import java.util.Scanner;

public class ReturnStateInTry {
	public int m1() {
		Scanner s = new Scanner(System.in);
		try {
		System.out.println("PLease enter 1st num");
		int num = s.nextInt();
		System.out.println("Please enter 2nd num");
		int num2 = s.nextInt();
		
			int ans = num / num2;
			//System.out.println("Answer is: " + ans);
			return ans;
		} catch (Exception e) {
			//System.out.println("Invalid nums" + e.getMessage());
			return 5;
		} finally {
			//System.out.println("Finally");
			return 10;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnStateInTry rs = new ReturnStateInTry();
		rs.m1();
	}

}
