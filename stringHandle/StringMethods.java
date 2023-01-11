package stringHandle;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello World";
		String s2 = s1.substring(5); // it divides the string
		System.out.println(s2);
		System.out.println(s1.isEmpty()); // to check string empty or

		System.out.println(s1.length()); // checks the length of the string value

		System.out.println(s1.toUpperCase());

		System.out.println(s1.startsWith("Hello"));

		System.out.println(s1.charAt(4)); // prints the character in string

		int count = 0;
		for (int i = 0; i < s1.length(); i++) { // counts the letters
			if ('l' == s1.charAt(i)) {
				count++;
			}
		}
		System.out.println(count);
		
		
		System.out.println(s1.contains("Hello"));    // checks the content and returns true/false.
		
	
	}
}
