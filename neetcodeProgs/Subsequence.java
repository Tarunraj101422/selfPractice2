package neetcodeProgs;

public class Subsequence {
	
	public boolean isSubsequence(String s, String t) {
		
		  if(s.length()>t.length()) { 
			  System.out.println("false"); 
			  return false; 
			  }
		 
		int i=0,j =0;
		while(i<s.length() && j<t.length()) {
			if(s.charAt(i)==t.charAt(j)) {
				i++;
			} j++;
		}
		if(i == s.length()) {
			System.out.println("true");
			return true;
		} else {
			System.out.println("false");
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Subsequence ss = new Subsequence();
		ss.isSubsequence("adc", "asdffc");

	}

}
