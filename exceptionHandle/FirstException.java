package exceptionHandle;

public class FirstException {
	static int a = 10;
	static int b = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c = 0;
		try {
			c = a / b;
			System.out.println(c);
		} catch (ArithmeticException a) {
			System.out.println("PLease enter valid numbers");
		}

		System.out.println("program is running");
	}

}
