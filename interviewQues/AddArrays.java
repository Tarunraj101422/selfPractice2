package interviewQues;

import java.util.Arrays;
import java.util.Collections;

public class AddArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,6,9,4};
		int b[] = {5,9,6,3,4,8,5};
		Arrays.sort(a);
		Arrays.sort(b);
		
		int c = (a[0]+b[b.length-1])/2;
		System.out.println("Avg of max and min array is: " +c);
		
		
		// merging two arrays
		
		int d = a.length+b.length;
		int d1[] = new int[d];
		for(int i=0; i<a.length; i++) {
			d1[i] = a[i];
		}
		for(int i=0; i<b.length; i++) {
			d1[a.length+i] = b[i];
		}
		for(Object o:d1) {
			System.out.println(o);
		}
		

	}

}
