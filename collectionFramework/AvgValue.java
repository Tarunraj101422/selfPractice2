package collectionFramework;

import java.util.Arrays;

public class AvgValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {8,6,9,5,4,2};

			Arrays.sort(a);
			for(int i=0; i<a.length; i++) {
				System.out.println(a[i]);
			}
			int b = a[0];
			int c = a[a.length-1];
			
			float d = (b+c)/2;
			System.out.println(d);
		}
	}

