package interviewQues;

import java.util.ArrayList;
import java.util.List;

public class SumOfComElemntOfTwoArrays {
	public int mergeArray(int a[], int b[]) {
		int d=0;
		List<Integer> l1 = new ArrayList<>();  // converting array to list
		for(int i=0; i<a.length; i++) {
			l1.add(a[i]);
		}
		List<Integer> l2 = new ArrayList<>();   // converting array to list
		for(int i=0; i<b.length; i++) {
			l2.add(b[i]);
		}
		l1.retainAll(l2);                    // getting common elements
		for(int i=0; i<l1.size(); i++) {     // retrieving common elements from list
			System.out.println(l1.get(i));
			d+= l1.get(i);                    // adding them
		}
		return d;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,5,3,6,8};
		int b[] = {5,3,9,7,2};
		SumOfComElemntOfTwoArrays s = new SumOfComElemntOfTwoArrays();
		System.out.println(s.mergeArray(a, b));

	}

}
