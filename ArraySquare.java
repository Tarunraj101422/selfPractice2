import java.util.Scanner;

public class ArraySquare {
	public static int arrayDouble(int[] a) {
		int n1=0, n2 = 0;
		for(int i=0; i<a.length; i++) 
			if(i%2 == 0) {
				n1 = (a[i]*a[i]*a[i]);
			System.out.println("n1 "+n1);
			}
		 else {
				n2 = (a[i]*a[i]);
			System.out.println("n2 "+n2);
		 }
		
		return n1+n2;
	}
	
	public static String countChar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String s1 = sc.nextLine();
		String words[] = s1.trim().split(" ");
		System.out.println("Total length: " +words.length);
		return s1;
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,3};
		System.out.println(arrayDouble(a));
		countChar();
		

	}

}
