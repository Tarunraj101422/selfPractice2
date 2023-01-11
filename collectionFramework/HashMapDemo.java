package collectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm = new HashMap<>();
		hm.put(001, "Tarun");
		hm.put(002, "Raj");
		hm.put(003, "Ram");
		hm.put("Han", 004);
		// hm.put(003, "Mah"); // if we provide dup value in key, it will update value
		// for the same. Will not get any error.
		/*
		 * Iterator itr = hm.iterator(); while(itr.hasNext()) { // Iterator is not
		 * allowed for Map System.out.println(itr.next()); }
		 */

		System.out.println(hm);

		Set s = hm.entrySet();
		Iterator itr = s.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		Set s2 = hm.keySet();
		Iterator itr2 = s2.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

	}

}
