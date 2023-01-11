package collectionFramework;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a1 = new ArrayList();
		a1.add(123);
		a1.add("Tarun");
		a1.add(25000);
		a1.add("Ram");
		
		System.out.println("All elements:: "+a1);
		
		ListIterator li = a1.listIterator();
		while(li.hasNext()) {
			System.out.println(li.next());
		String name = (String)li.next();
		
		
		if(name.equals("Tarun")) {
			li.add("Raj");
			System.out.println("if condition");
		}
		if(name.equals("Ram")) {
			li.set("Hanuman");
		}
		
		System.out.println("After updating: " +a1);
		}
	while(li.hasPrevious()) {    // to read elements in reverse order
		System.out.println(li.previous());
	}
	}

}
