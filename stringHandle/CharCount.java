package stringHandle;

public class CharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Tarunaj Nadakuduru";
		System.out.println(s.length());
		
		int count =0;
		for(int i=0; i<s.length(); i++) {
			if ('a' == s.charAt(i)) {
				count++;
			}
		}
		System.out.println(count);

	}

}
