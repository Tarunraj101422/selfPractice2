package exceptionHandle;

public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = a/b;
		
		System.out.println(c);
		} catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println("Please enter valid numbers " +ai.getMessage());
		} catch(NumberFormatException ne) {
			System.out.println("PLease enter correct numbers " +ne.getMessage());
		}
	}

}
