package interviewQues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;



public class HashMapAscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(123, "Tarun");
		hm.put(456, "Raj");
		hm.put(789, "Ram");
		
		Set s = hm.keySet();
		for(Object o:s) {
			System.out.println(o);
		}
		
		ArrayList al = new ArrayList(s);
		Collections.sort(al);
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		

	}

}
