package arrays;

public class HighestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 5, 8, 6, 3, 9, 4, 1 };
		int high = a[0];
		for (int i = 0; i < a.length; i++) {
			if (high < a[i]) {                    // if(high>a[i]) will get small number
				high = a[i];
			}

		}
		System.out.println("Max value is " + high);

	}

}
