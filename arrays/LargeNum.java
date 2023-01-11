package arrays;

public class LargeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 2, 5, 3, 6, 9, 7, 8 };
		int large = a[0];
		for (int i = 0; i < a.length; i++) {
			if (large < a[i]) {
				large = a[i];
			}
		}
		System.out.println("Large num is: " + large);
	}
}
