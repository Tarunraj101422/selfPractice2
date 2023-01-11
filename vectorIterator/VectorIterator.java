package vectorIterator;

import java.util.Iterator;
import java.util.Vector;

public class VectorIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Vector v = new Vector();
         for (int i=0; i<10; i++) {
        	 v.add(i);
         }
         System.out.println(v);
         
         Iterator itr = v.iterator();
         while(itr.hasNext()) {
        	 System.out.println(itr.next());
         }
         itr.remove();
         System.out.println(v);
	}

}
