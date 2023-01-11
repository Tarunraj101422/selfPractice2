package collectionFramework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();
		hs.add("Tarun");
		hs.add("Raj");
		hs.add("Ram");
		hs.add("Tarun");
		
		System.out.println(hs);
		
		ArrayList a = new ArrayList(hs);
		System.out.println(a);
		
		ArrayList al = new ArrayList();
		al.add(123);
		al.add(456);
		al.add(123);
		
		System.out.println(al);
		
		Set s = new HashSet(al);
		System.out.println(s);
		
		

	}

}
