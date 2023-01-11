package collectionFramework;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList li = new LinkedList();
		li.add(123);
		li.add("Tarun");
		li.add(50000);
		
		li.addFirst("Ram");		
		System.out.println(li);
		
		li.removeLast();
		System.out.println(li);
		
		LinkedList li2 = new LinkedList();
		li2.add("Raj");
        li2.addAll(li);
        System.out.println(li2);
        
        for(Object obj:li2) {
        	System.out.println(obj);
        }
	}

}
