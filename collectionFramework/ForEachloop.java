package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ForEachloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList a = new ArrayList();

		for (int i = 0; i <= 10; i++) {
			a.add(i);
		}
		System.out.println(a);

		for (Object obj : a) {
			System.out.println(obj);
		}

		Iterator itr = a.iterator();
		while (itr.hasNext()) {
			//System.out.println(itr.next());
			Integer number = (Integer)itr.next();
			if (number.equals(5)) {
				itr.remove();
				System.out.println(a);
			}
			for(Object obj:a) {
				System.out.println(obj);
			}
		}
	}

}
