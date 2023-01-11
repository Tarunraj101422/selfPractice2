package arrays;

public class SmallNum {
	public int[] m1(int a[]) {
		
		int small = a[0];
		for(int i=0; i<a.length; i++) {
			if(a[i] < small) {
				small = a[i];
			}
		}
		System.out.println("Small num is " +small);
		System.out.println(a.length);
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmallNum sn = new SmallNum();
		int a1[] = {1,5,3,6,9,8,0};
		sn.m1(a1);
	}

}
