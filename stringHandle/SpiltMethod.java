package stringHandle;

public class SpiltMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hi Tarun, Good morning";
		String s1[] = s.split(" ");            // given space in split method, so it will split the string text after each space.
		for(int i=0; i<s1.length; i++) {
			System.out.println(s1[i]);
		}

	}

}
