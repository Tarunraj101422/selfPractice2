package collectionFramework;

import java.util.HashSet;

public class HAshSet {

	public static void main(String[] args) throws InterruptedException, IllegalMonitorStateException {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet();   // Order is not preserved.
		hs.add("Tarun");
		hs.add(123);
		hs.add(25000);
		hs.add(123);
		
		System.out.println(hs);
		
		System.out.println(hs.add("Tarun"));   // if we put duplicate values, it will not give any error, return False.
		
		System.out.println(hs.size());
		
		for(int i=0; i<10; i++) {
			if(i%2 != 0) {
				System.out.println(i);
			}
		}

	}

}
