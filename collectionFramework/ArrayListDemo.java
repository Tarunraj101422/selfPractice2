package collectionFramework;

import java.util.ArrayList;

public class ArrayListDemo {	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("Tarun");
		al.add("20000");
		
		ArrayList a2 = new ArrayList();
		a2.add(10);
		a2.add("Raj");
		a2.add(52222);
		
		
		
		System.out.println(al);
		al.addAll(a2);   // is used to merge the two array lists
		//al.retainAll(a2);   // is used to print common elements
		al.removeAll(a2);   // is used to print unique elements
		System.out.println(al);
		
		if(al.contains("Tarun")) {
			System.out.println("It is there");
		}
		
		
		
		
		
	}

}
