package neetcodeProgs;

import java.util.HashMap;

public class Anagram {
	
	public boolean isAnagramor(String s, String t) {
		int a[] = new int[26];
		for(int i=0; i<a.length; i++) {
			a[s.charAt(i) - 'a']++;
			a[t.charAt(i) - 'a']--;
		}
		for(int n:a) {
			if(n != 0) {
				return false;
			}
		}
		return true;
	}

	public boolean isAnagram(String s, String t) {
		if(s.length()!=t.length()) {
			return false;
		}
		
		HashMap<Character, Integer> h = new HashMap<>();
		for(int i=0; i<s.length();i++) {
			h.put(s.charAt(i), h.getOrDefault(s.charAt(i), 0)+1);
			System.out.println(h);
		}
		return false;
	}


	 /* for(Character ch : h.keySet()) { 
		  int val1 =
	  }
	  h.get(ch); 
	  int val2 = h2.getOrDefault(ch, 0); 
	  if(val1!=val2) { 
		  return false;
	  }

	return true;

	}*/

	public static void main(String[] args) {
		Anagram a = new Anagram();
		//a.isAnagram("Tarunn", "nuraTn");
		a.isAnagramor("car", "rac");

	}

}
