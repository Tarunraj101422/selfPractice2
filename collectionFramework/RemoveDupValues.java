package collectionFramework;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDupValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(123);
		al.add("Tarun");
		al.add(123);
		al.add(456);
		
		System.out.println(al);

		Set s = new HashSet(al);  // converting array list to set to remove dup values.
		System.out.println(s);
	}

}
