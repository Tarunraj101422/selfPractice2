package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> li = new ArrayList<>();
		li.add(123);
		li.add(789);
		li.add(456);
		li.add(666);
		/*
		 * Collections.sort(li);
		 * 
		 * for (Object obj : li) { System.out.println(obj); }
		 */

		List<Integer> li2 = new ArrayList<>();
		li2.add(147);
		li2.add(258);
		li2.add(555);
		Collections.copy(li, li2);
		
		Iterator itr = li.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
