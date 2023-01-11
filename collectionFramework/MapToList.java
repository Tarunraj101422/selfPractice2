package collectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MapToList {
	Map<Integer, String> map;

	public MapToList(Map<Integer, String> map) {
	this.map = map;
}
	public List<Integer> keysToList(){
		return new ArrayList(map.keySet());
	}
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<>();
		m.put(123, "Tarun");
		m.put(456, "Raj");
		m.put(222, "Ram");
		
		MapToList ml = new MapToList(m);
		System.out.println(ml.keysToList());
		
	}
}