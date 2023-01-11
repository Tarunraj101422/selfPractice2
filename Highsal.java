import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Highsal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {55,23,64,85};
		int b[] = {55,23,3,6,9,8};
		
		List<Integer> li = new ArrayList<>();
		List<Integer> li2 = new ArrayList<>();
		for(int i=0; i<a.length; i++) {
			li.add(a[i]);
		}
		for(int i=0; i<b.length; i++) {
			li2.add(b[i]);
		}
		
		li.retainAll(li2);
		for(Integer c : li) {
			System.out.println(c);
		}
		
		
		
		
	}

}
