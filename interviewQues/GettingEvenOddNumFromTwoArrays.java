package interviewQues;

public class GettingEvenOddNumFromTwoArrays {
	public int[] evenOdd(int a[], int b[]) {
		int c = a.length + b.length;
		int c1[] = new int[c];
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

			if (a[i] % 2 == 0) {
				c1[i] = a[i];
			} 
			for (Object o : c1) {
				System.out.println(o);
			}
		}
		return c1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 10, 12, 13, 16 };
		int b[] = { 3, 4, 8, 6, 3, 2, 1 };
		GettingEvenOddNumFromTwoArrays g = new GettingEvenOddNumFromTwoArrays();
		System.out.println(g.evenOdd(a, b));
	}
}
