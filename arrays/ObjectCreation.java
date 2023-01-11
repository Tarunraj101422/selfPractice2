package arrays;

public class ObjectCreation {
	public void m1(int a[]) {
		System.out.println("Array length " +a.length);
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	public void m2(int x) {
		
		System.out.println("X value is: "+x);
	}
	public static void main(String[] args) {
		ObjectCreation oc = new ObjectCreation();
		int a[] = {4,2,3,6,8,7,9};
		oc.m1(a);
		oc.m2(10);
		System.out.println(a.length);
		

}
}
