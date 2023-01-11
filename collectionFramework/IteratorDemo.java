package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1 = new ArrayList();
		a1.add("Tarun");
		a1.add('r');
		a1.add(123);
		
		System.out.println(a1);
		
		Iterator itr = a1.iterator();  // Universal cursor
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		itr.remove();   // This method removes the last element which is written by itr.next
		System.out.println(a1);
		
		

	}

}
