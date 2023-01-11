package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

public class AllMapsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();
		lhm.put(123, "Tarun");
		lhm.put(002, "Raj");
		lhm.put(789, "Ram");
		System.out.println(lhm);
		
		Set s = lhm.entrySet();
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		List<Integer> li = new ArrayList<>();
		li.addAll(lhm.keySet());
		System.out.println(li);
		for(Object o:li) {
			System.out.println(o);
		}

	}

}
