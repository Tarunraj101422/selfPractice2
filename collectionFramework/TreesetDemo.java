package collectionFramework;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreesetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             TreeSet ts = new TreeSet();  //will get ascending order
             ts.add(852);
             ts.add(123);
             ts.add(456);
             ts.add(789);
             //ts.add("Tarun");
             System.out.println(ts.descendingSet());
             for(Object obj:ts) {
            	 System.out.println(obj);
             }
             
             NavigableSet ns = ts.descendingSet();
             System.out.println(ns);
	}

}
