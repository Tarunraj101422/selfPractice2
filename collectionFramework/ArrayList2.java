package collectionFramework;

import java.util.ArrayList;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1 = new ArrayList();
		a1.add(123);
		a1.add("Tarun");
		a1.add(25000);
		
		System.out.println("All elements of a1: "+a1);
		
		ArrayList a2 = new ArrayList();
		a2.add(123);
		a2.add("Tarun");
		a2.add(50000);
		
		a1.addAll(a2);
		System.out.println("All elements in a1 now: " +a1);
		
		a1.removeAll(a2);
		System.out.println("Unique elements:: "+a1);

	}

}
