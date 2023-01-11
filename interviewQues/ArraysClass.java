package interviewQues;

import java.util.Arrays;

public class ArraysClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,5,3,6,9,7,8};
		Arrays.sort(a);              // will get ascending order
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		Arrays.copyOf(a, 5);
		for(Object o:a) {
			System.out.println(o);
		}
	}

}
