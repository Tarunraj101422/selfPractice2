package vectorIterator;

import java.util.ListIterator;
import java.util.Vector;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		v.add("Chiru");
		v.add("Tarun");
		v.add("Balu");

		System.out.println(v);

		ListIterator li = v.listIterator();

		while (li.hasNext()) {
			String name = (String) li.next();
			if (name.equals("Tarun")) {
				li.set("Raj");
			}
			if (name.equals("Chiru")) {
				li.add("Charan");
			}
			if (name.equals("Balu")) {
				li.remove();
			}

		}
		System.out.println(v);
		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}

	}
}
