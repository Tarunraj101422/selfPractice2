package genericsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class GenericsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();       // Generics are used for TypeSafety and to avoid Type Casting.
		al.add(12);
		al.add(85);
		al.add(41);
		al.add(45);
		Collections.sort(al);
		
		Iterator<Integer> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(111, "a");
		hm.put(222, "b");
		hm.put(333, "c");
		
		Set<Integer> s = hm.keySet();
		
		System.out.println(s);
		Iterator<Integer> itr2 = s.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		ArrayList<Integer> al2 = new ArrayList<>(s);
		Collections.sort(al2);
		for(Object o: al2) {
			System.out.println(o);
		}
		

	}

}
