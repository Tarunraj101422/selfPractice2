package interviewQues;

import java.util.Arrays;

public class AvgValueofArrayMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {5,8,9,3,1,3};
		Arrays.sort(a);
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		int b = a[0]+a[a.length-1];
		
		System.out.println("Avg:: " +b/2);

	}

}
