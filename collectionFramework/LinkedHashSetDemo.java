package collectionFramework;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet lh = new LinkedHashSet(); // Order is preserved.
		lh.add(123);
		lh.add("Tarun");
		lh.add(3000);
		
		System.out.println(lh);
		
		/*
		 * for(int i=0; i<lh.size(); i++) { System.out.println(lh); }
		 */

		for(Object obj:lh) {
			System.out.println(obj);
		}
	}

}
